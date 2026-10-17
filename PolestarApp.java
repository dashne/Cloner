package com.polestar.domultiple;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import androidx.multidex.MultiDexApplication;
import com.google.firebase.FirebaseApp;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.polestar.clone.client.NativeEngine;
import com.polestar.clone.client.core.VirtualCore;
import com.polestar.clone.client.stub.DaemonService;
import com.polestar.domultiple.components.AppMonitorService;
import com.polestar.domultiple.components.receiver.PackageChangeReceiver;
import com.polestar.domultiple.components.ui.AppLoadingActivity;
import io.bg6;
import io.bu8;
import io.c76;
import io.cp1;
import io.f6;
import io.g5;
import io.h81;
import io.hp7;
import io.hu8;
import io.iq0;
import io.jq0;
import io.ky5;
import io.l5;
import io.nq6;
import io.pj4;
import io.qu8;
import io.r50;
import io.s6;
import io.sj7;
import io.st0;
import io.t01;
import io.u09;
import io.u22;
import io.uo2;
import io.vc1;
import io.x40;
import java.io.File;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class PolestarApp extends MultiDexApplication {
    public static PolestarApp b;
    public boolean a;

    public class a implements qu8.a {
        @Override // io.qu8.a
        public final void a(String str, String str2) {
            Log.e(str, str2);
        }

        @Override // io.qu8.a
        public final void b(String str, String str2) {
            Log.e(str, str2);
        }
    }

    public class b extends VirtualCore.f {
        public final /* synthetic */ VirtualCore a;

        public b(VirtualCore virtualCore) {
            this.a = virtualCore;
        }
    }

    public class c implements h81 {
        public final /* synthetic */ e a;

        public c(e eVar) {
            this.a = eVar;
        }

        @Override // io.h81
        public final void a(Thread thread, Throwable th) {
            this.a.uncaughtException(thread, th);
        }
    }

    public class e implements Thread.UncaughtExceptionHandler {
        public final PolestarApp a;

        public e(PolestarApp polestarApp) {
            this.a = polestarApp;
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public final void uncaughtException(Thread thread, Throwable th) {
            String currentPackage;
            int i;
            boolean z;
            pj4.d("uncaughtException");
            VirtualCore virtualCore = VirtualCore.p;
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = null;
            if (virtualCore != null && virtualCore.o()) {
                pj4.d("DoMultiple main app exception, exit.");
                currentPackage = "main";
                i = 51815;
            } else if (virtualCore == null || !virtualCore.q()) {
                pj4.d("Client process crash!");
                currentPackage = hu8.get() == null ? null : hu8.get().getCurrentPackage();
                i = 51817;
            } else {
                pj4.d("Server process crash!");
                currentPackage = "server";
                i = 51816;
            }
            pj4.d(Log.getStackTraceString(th));
            HashSet<String> hashSet = st0.a;
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.a.getSystemService("activity")).getRunningAppProcesses();
            if (runningAppProcesses != null) {
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo2 : runningAppProcesses) {
                    if (runningAppProcessInfo2.importance == 100) {
                        runningAppProcessInfo = runningAppProcessInfo2;
                        break;
                    }
                }
            }
            if (runningAppProcessInfo == null || Process.myPid() != runningAppProcessInfo.pid) {
                z = false;
            } else {
                pj4.d("forground crash");
                z = true;
            }
            Intent intent = new Intent("appclone.intent.action.SHOW_CRASH_DIALOG");
            intent.putExtra("package", currentPackage);
            intent.putExtra("forground", z);
            u09.c(intent, th);
            intent.putExtra("tag", i);
            intent.setPackage("do.multiple.cloner");
            PolestarApp.this.sendBroadcast(intent);
            try {
                Thread.sleep(2000L);
            } catch (InterruptedException unused) {
            }
            Process.killProcess(Process.myPid());
            System.exit(0);
        }
    }

    static {
        r50.a = 4;
        r50.b = 3;
    }

    public static boolean a() {
        if (b.getPackageName().endsWith("arm64")) {
            return true;
        }
        try {
            return b.getPackageManager().getApplicationInfo("com.polestar.domultiple.arm64", 0) != null;
        } catch (Exception unused) {
        }
    }

    @Override // androidx.multidex.MultiDexApplication, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        Log.d("DoMultiple", "APP version: 4.40.01.0915 Type: release");
        Log.d("DoMultiple", "LIB version: 4.40.01.0915 Type: release");
        super.attachBaseContext(context);
        b = this;
        this.a = NativeEngine.nativeCheck(this) == 1;
        try {
            bu8.i = false;
            bu8.a = !ky5.f();
            Log.d("DoMultiple", "GMS state: " + bu8.a);
            VirtualCore.p.x(context);
        } catch (Throwable unused) {
        }
    }

    @Override // android.app.Application
    public final void onCreate() {
        String[] strArrSplit;
        String lowerCase;
        super.onCreate();
        qu8.a = new a();
        VirtualCore virtualCore = VirtualCore.p;
        PolestarApp polestarApp = b;
        b bVar = new b(virtualCore);
        if (!virtualCore.j) {
            try {
                virtualCore.x(polestarApp);
            } catch (Throwable unused) {
            }
        }
        if (virtualCore.h == null) {
            virtualCore.a();
        }
        int iOrdinal = virtualCore.h.ordinal();
        boolean zExists = false;
        if (iOrdinal == 0) {
            try {
                VirtualCore.p.w(new com.polestar.domultiple.d());
            } catch (Exception e2) {
                pj4.d(Log.getStackTraceString(e2));
            }
            FirebaseApp.f(b);
            FirebaseCrashlytics.getInstance().setCrashlyticsCollectionEnabled(true);
            DaemonService.e = 3600000L;
            cp1.a().getClass();
            String strD = ky5.d(b, "conf_br_start_white_list");
            if (strD != null && (strArrSplit = strD.split(";")) != null) {
                for (String str : strArrSplit) {
                    if (!TextUtils.isEmpty(str)) {
                        sj7.k.add(str);
                    }
                }
            }
            jq0 jq0Var = new jq0();
            jq0Var.f();
            VirtualCore.p.n = jq0Var;
            hp7.a();
        } else if (iOrdinal == 1) {
            cp1.a();
            NativeEngine.setCatchCloneCrash(ky5.a(b, "conf_catch_clone_crash", true));
            jq0 jq0Var2 = new jq0();
            jq0Var2.f();
            VirtualCore virtualCore2 = bVar.a;
            virtualCore2.n = jq0Var2;
            virtualCore2.o = new iq0();
        } else if (iOrdinal == 2) {
            FirebaseApp.f(b);
            FirebaseCrashlytics.getInstance().setCrashlyticsCollectionEnabled(true);
            bg6.d();
            PolestarApp.this.registerActivityLifecycleCallbacks(new d());
            u22.b(b);
            if (!PolestarApp.this.a) {
                u22.f(null, "app_invalid");
                throw new IllegalStateException("App Invalid");
            }
            cp1.a().getClass();
            cp1.b();
            x40.a();
            nq6.b bVar2 = new nq6.b();
            if (b.getPackageName().equals("do.multiple.cloner")) {
                bVar2.a.a = "ca-app-pub-5490912237269284~2442960626";
                String strC = bg6.c("conf_freq");
                bg6.b("conf_freq_control");
                bVar2.a.c = strC;
            } else {
                Bundle bundle = new Bundle();
                bundle.putString("pkg", b.getPackageName());
                u22.f(bundle, "app_error_pkg");
                FirebaseCrashlytics.getInstance().recordException(new IllegalStateException("App Error Pkg"));
                for (String str2 : uo2.B) {
                    if (!str2.equals("pl")) {
                        bVar2.a.b.remove(str2);
                    }
                }
            }
            com.polestar.domultiple.b bVar3 = new com.polestar.domultiple.b();
            PolestarApp polestarApp2 = b;
            nq6 nq6Var = bVar2.a;
            uo2.s = bVar3;
            uo2.t = nq6Var;
            if (nq6Var.a()) {
                Context applicationContext = polestarApp2.getApplicationContext();
                String str3 = nq6Var.a;
                synchronized (uo2.u) {
                    try {
                        if (!uo2.w) {
                            uo2.w = true;
                            new Thread(new s6(21, str3, applicationContext), "admob-init").start();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            l5.a().b(polestarApp2.getApplicationContext(), nq6Var.c);
            uo2.A = bg6.a("conf_ad_back_fill");
            f6.a = new com.polestar.domultiple.c();
            try {
                b.getPackageManager().getApplicationInfo("a.b", 0);
                u22.i("check_2");
            } catch (Exception e3) {
                StackTraceElement[] stackTrace = e3.getStackTrace();
                int length = stackTrace.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        lowerCase = null;
                        break;
                    }
                    lowerCase = stackTrace[i].getClassName().toLowerCase();
                    if (lowerCase.contains("vclient") || lowerCase.contains("hook") || lowerCase.contains("lody") || lowerCase.contains("lbe") || lowerCase.contains("mochat") || lowerCase.contains("dual") || lowerCase.contains("xpose") || !(lowerCase.startsWith("android.") || lowerCase.startsWith("com.polestar.") || lowerCase.startsWith("com.android.") || lowerCase.startsWith("dalvik.system.") || lowerCase.startsWith("java."))) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (lowerCase != null) {
                    u22.i("check_".concat(lowerCase));
                }
            }
            if (bg6.a("conf_reward_open")) {
                t01.a = bg6.c("config_task_server");
                vc1.a = false;
                com.polestar.domultiple.task.b.b().c();
                uo2.c cVar = uo2.s;
            }
            AppLoadingActivity.K(b);
            AppMonitorService.a(0, null);
            if (Build.VERSION.SDK_INT >= 26) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
                intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
                intentFilter.addAction("android.intent.action.PACKAGE_REPLACED");
                intentFilter.addDataScheme("package");
                b.registerReceiver(new PackageChangeReceiver(), intentFilter, 4);
            }
            if (c76.f()) {
                c76.d(b).e();
            }
            if (ky5.e()) {
                u22.f(null, "ad_free");
            }
            if (System.currentTimeMillis() <= ky5.c(b, "no_ad_expiration", 0L)) {
                u22.f(null, "ad_free_reward");
            }
        }
        sj7.n = AppLoadingActivity.class.getName();
        try {
            Thread.getDefaultUncaughtExceptionHandler();
            e eVar = new e(this);
            Thread.setDefaultUncaughtExceptionHandler(eVar);
            VirtualCore virtualCore3 = VirtualCore.p;
            c cVar2 = new c(eVar);
            virtualCore3.getClass();
            hu8.get().setCrashHandler(cVar2);
        } catch (Exception unused2) {
        }
        com.polestar.domultiple.a.a = !st0.d(b).equals("develop");
        pj4.a("IS_RELEASE_VERSION: " + com.polestar.domultiple.a.a);
        try {
            zExists = new File(Environment.getExternalStorageDirectory() + "/polelog").exists();
            if (zExists) {
                Log.d("DoMultiple", "log opened by file");
            }
        } catch (Exception unused3) {
        }
        if (zExists || !com.polestar.domultiple.a.a) {
            qu8.b = true;
            pj4.a = true;
            g5.a = true;
        }
    }

    public class d implements Application.ActivityLifecycleCallbacks {
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }
    }
}
