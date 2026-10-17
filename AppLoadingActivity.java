package com.polestar.domultiple.components.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.BounceInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.polestar.clone.CustomizeAppData;
import com.polestar.clone.client.core.VirtualCore;
import com.polestar.clone.client.ipc.VActivityManager;
import com.polestar.clone.os.VUserHandle;
import com.polestar.domultiple.PolestarApp;
import com.polestar.domultiple.components.AppMonitorService;
import io.av8;
import io.bg6;
import io.cd2;
import io.f6;
import io.h23;
import io.ie4;
import io.j01;
import io.ki6;
import io.ko1;
import io.ky5;
import io.m01;
import io.pj4;
import io.rq0;
import io.st0;
import io.u22;
import io.uo2;
import io.uq0;
import io.xe9;
import io.z5;
import java.util.HashSet;
import p000do.multiple.cloner.R;

/* JADX INFO: loaded from: classes2.dex */
public class AppLoadingActivity extends BaseActivity {
    public static HashSet<String> o0;
    public ImageView C;
    public ImageView D;
    public TextView E;
    public TextView F;
    public RelativeLayout G;
    public RelativeLayout H;
    public uq0 I;
    public String J;
    public boolean K;
    public boolean L;
    public boolean M;
    public h23 N;
    public uo2 O;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public long U;
    public LinearLayout V;
    public boolean W;
    public Handler X;
    public Handler Y;
    public HandlerThread Z;
    public int a0;
    public boolean b0;
    public boolean c0;
    public boolean d0;
    public boolean e0;
    public boolean f0;
    public boolean g0;
    public long h0;
    public boolean P = false;
    public final Runnable i0 = new a();
    public final BroadcastReceiver j0 = new b();
    public final Runnable k0 = new d();
    public final Runnable l0 = new e();
    public boolean m0 = false;
    public boolean n0 = false;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            uq0 uq0Var;
            AppLoadingActivity appLoadingActivity = AppLoadingActivity.this;
            boolean z = appLoadingActivity.c0;
            if (z || !appLoadingActivity.Q || (uq0Var = appLoadingActivity.I) == null || z || appLoadingActivity.e0) {
                return;
            }
            appLoadingActivity.e0 = true;
            String str = uq0Var.b;
            int iC = uq0Var.c();
            Intent intent = new Intent(appLoadingActivity, (Class<?>) CloneLaunchFailureActivity.class);
            intent.addFlags(805306368);
            intent.putExtra("extra_clone_launch_package", str);
            intent.putExtra("extra_clone_launch_user_id", iC);
            try {
                appLoadingActivity.startActivity(intent);
            } catch (Throwable th) {
                pj4.c(th);
            }
            if (appLoadingActivity.f0 || appLoadingActivity.I == null) {
                return;
            }
            appLoadingActivity.f0 = true;
            long jCurrentTimeMillis = appLoadingActivity.h0 > 0 ? System.currentTimeMillis() - appLoadingActivity.h0 : -1L;
            uq0 uq0Var2 = appLoadingActivity.I;
            String str2 = uq0Var2.b;
            int iC2 = uq0Var2.c();
            if (!TextUtils.isEmpty(str2)) {
                String str3 = "clone_launch_timeout_count_" + str2 + "_" + iC2;
                ky5.h(appLoadingActivity, str3, appLoadingActivity.getSharedPreferences("DoMultiple-pref", 0).getInt(str3, 0) + 1);
            }
            u22.a("clone_launch_timeout");
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            firebaseCrashlytics.setCustomKey("clone_launch_pkg", appLoadingActivity.I.b);
            firebaseCrashlytics.setCustomKey("clone_launch_user_id", appLoadingActivity.I.c());
            firebaseCrashlytics.setCustomKey("clone_launch_attempt_ms", jCurrentTimeMillis);
            firebaseCrashlytics.recordException(new IllegalStateException("clone_launch_timeout"));
        }
    }

    public class b extends BroadcastReceiver {
        public b() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (intent != null) {
                AppLoadingActivity appLoadingActivity = AppLoadingActivity.this;
                if (appLoadingActivity.I == null || !"do.multiple.cloner.action.CLONE_LAUNCH_SUCCESS".equals(intent.getAction())) {
                    return;
                }
                String stringExtra = intent.getStringExtra("extra_clone_launch_package");
                int intExtra = intent.getIntExtra("extra_clone_launch_user_id", appLoadingActivity.I.c());
                if (TextUtils.equals(appLoadingActivity.I.b, stringExtra) && appLoadingActivity.I.c() == intExtra) {
                    appLoadingActivity.c0 = true;
                    appLoadingActivity.Q = false;
                    appLoadingActivity.X.removeCallbacks(appLoadingActivity.i0);
                    if (appLoadingActivity.e0) {
                        u22.a("clone_launch_late_success");
                    }
                    uq0 uq0Var = appLoadingActivity.I;
                    if (uq0Var != null) {
                        String str = uq0Var.b;
                        int iC = uq0Var.c();
                        Intent intent2 = new Intent("do.multiple.cloner.action.DISMISS_CLONE_LAUNCH_FAILURE");
                        intent2.setPackage(appLoadingActivity.getPackageName());
                        intent2.putExtra("extra_clone_launch_package", str);
                        intent2.putExtra("extra_clone_launch_user_id", iC);
                        appLoadingActivity.sendBroadcast(intent2);
                    }
                    appLoadingActivity.finish();
                }
            }
        }
    }

    public class c implements Runnable {
        public final /* synthetic */ String a;
        public final /* synthetic */ int b;
        public final /* synthetic */ int c;

        public class a implements Runnable {
            public final /* synthetic */ boolean a;
            public final /* synthetic */ boolean b;
            public final /* synthetic */ boolean c;

            public a(boolean z, boolean z2, boolean z3) {
                this.a = z;
                this.b = z2;
                this.c = z3;
            }

            /* JADX WARN: Code duplicated, block: B:60:0x02c3  */
            @Override // java.lang.Runnable
            public final void run() {
                uq0 uq0Var;
                boolean z;
                long j;
                boolean z2;
                uq0 uq0Var2;
                long j2;
                c cVar = c.this;
                AppLoadingActivity appLoadingActivity = AppLoadingActivity.this;
                if (cVar.c != appLoadingActivity.a0 || appLoadingActivity.isFinishing() || appLoadingActivity.isDestroyed() || (uq0Var = appLoadingActivity.I) == null) {
                    return;
                }
                if (cVar.a.equals(uq0Var.b)) {
                    if (cVar.b != appLoadingActivity.I.c()) {
                        return;
                    }
                    appLoadingActivity.W = this.a;
                    appLoadingActivity.K = this.b;
                    boolean z3 = this.c;
                    appLoadingActivity.b0 = z3;
                    boolean z4 = appLoadingActivity.I.b().intValue() != 0;
                    String str = appLoadingActivity.J;
                    uq0 uq0Var3 = appLoadingActivity.I;
                    String str2 = uq0Var3.b;
                    int iC = uq0Var3.c();
                    Bundle bundleJ = xe9.j("package", str2);
                    bundleJ.putString("coldStart", ki6.m + z3);
                    bundleJ.putString("locker", ki6.m + z4);
                    bundleJ.putString("from", str);
                    bundleJ.putString("userId", ki6.m + iC);
                    u22.f(bundleJ, "app_start");
                    int iB = ky5.b(PolestarApp.b, "clone_start_times", 0) + 1;
                    ky5.h(PolestarApp.b, "clone_start_times", iB);
                    if (iB < 30 || iB > 32) {
                        if (iB < 15 || iB > 17) {
                            if (iB >= 5 && !ky5.a(PolestarApp.b, "loyal_start_5", false)) {
                                u22.f(null, "loyal_start_5");
                                u22.j("loyal_start_times", "5");
                                ky5.g(PolestarApp.b, "loyal_start_5", true);
                            }
                        } else if (!ky5.a(PolestarApp.b, "loyal_start_15", false)) {
                            u22.f(null, "loyal_start_15");
                            u22.j("loyal_start_times", "15");
                            ky5.g(PolestarApp.b, "loyal_start_15", true);
                        }
                    } else if (!ky5.a(PolestarApp.b, "loyal_start_30", false)) {
                        u22.f(null, "loyal_start_30");
                        u22.j("loyal_start_times", "30");
                        ky5.g(PolestarApp.b, "loyal_start_30", true);
                    }
                    appLoadingActivity.C = (ImageView) appLoadingActivity.findViewById(R.id.img_success_bg2);
                    appLoadingActivity.D = (ImageView) appLoadingActivity.findViewById(R.id.img_app_icon);
                    appLoadingActivity.E = (TextView) appLoadingActivity.findViewById(R.id.txt_launch_tips);
                    appLoadingActivity.F = (TextView) appLoadingActivity.findViewById(R.id.txt_first_launch_tips);
                    appLoadingActivity.V = (LinearLayout) appLoadingActivity.findViewById(R.id.ad_container);
                    appLoadingActivity.G = (RelativeLayout) appLoadingActivity.findViewById(R.id.loading_layout);
                    appLoadingActivity.H = (RelativeLayout) appLoadingActivity.findViewById(R.id.starting_layout);
                    appLoadingActivity.G.setVisibility(0);
                    appLoadingActivity.H.setVisibility(8);
                    try {
                        uq0 uq0Var4 = appLoadingActivity.I;
                        CustomizeAppData customizeAppDataB = CustomizeAppData.b(uq0Var4.c(), uq0Var4.b);
                        appLoadingActivity.D.setImageBitmap(customizeAppDataB.a());
                        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(appLoadingActivity.D, "scaleX", 0.7f, 1.2f, 1.0f);
                        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(appLoadingActivity.D, "scaleY", 0.7f, 1.2f, 1.0f);
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2);
                        animatorSet.setInterpolator(new BounceInterpolator());
                        animatorSet.setDuration(500L).start();
                        animatorSet.addListener(new h());
                        appLoadingActivity.E.setText(String.format(appLoadingActivity.getString(R.string.app_starting_tips), customizeAppDataB.g ? customizeAppDataB.e : appLoadingActivity.I.d));
                        String str3 = appLoadingActivity.I.d;
                        PolestarApp polestarApp = PolestarApp.b;
                        StringBuilder sb = new StringBuilder();
                        sb.append(str3);
                        sb.append("_first_start");
                        if (ky5.c(polestarApp, sb.toString(), -1L) == -1) {
                            ky5.i(PolestarApp.b, appLoadingActivity.I.d + "_first_start", System.currentTimeMillis());
                            appLoadingActivity.F.setVisibility(0);
                            appLoadingActivity.F.setText(appLoadingActivity.getString(R.string.first_start_tips));
                        } else if (appLoadingActivity.K) {
                            appLoadingActivity.F.setVisibility(0);
                            appLoadingActivity.F.setText(appLoadingActivity.getString(R.string.upgrade_start_tips));
                        }
                        ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, 1, 0.5f);
                        scaleAnimation.setDuration(1000L);
                        scaleAnimation.setRepeatMode(1);
                        scaleAnimation.setRepeatCount(-1);
                        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                        alphaAnimation.setDuration(1000L);
                        alphaAnimation.setRepeatMode(1);
                        alphaAnimation.setRepeatCount(-1);
                        AnimationSet animationSet = new AnimationSet(true);
                        animationSet.addAnimation(scaleAnimation);
                        animationSet.addAnimation(alphaAnimation);
                        appLoadingActivity.C.startAnimation(animationSet);
                    } catch (Throwable unused) {
                    }
                    appLoadingActivity.getClass();
                    if (ky5.e() || (uq0Var2 = appLoadingActivity.I) == null) {
                        z = true;
                        j = 2;
                    } else {
                        String str4 = "app_start_paywall_launch_count_" + uq0Var2.b + "_" + uq0Var2.c();
                        int iB2 = ky5.b(PolestarApp.b, str4, 0) + 1;
                        ky5.h(PolestarApp.b, str4, iB2);
                        String str5 = appLoadingActivity.I.b;
                        if (bg6.a("conf_app_start_paywall_enabled")) {
                            long jB = bg6.b("conf_app_start_paywall_after_launch_count");
                            if (jB <= 0 || iB2 >= jB) {
                                PolestarApp polestarApp2 = PolestarApp.b;
                                long jC = st0.c(polestarApp2, polestarApp2.getPackageName());
                                long jB2 = bg6.b("conf_app_start_paywall_ramp_hour") * 3600000;
                                z = true;
                                long jB3 = bg6.b("conf_app_start_paywall_interval_hour");
                                if (jB3 <= 0) {
                                    j2 = 0;
                                    j = 2;
                                } else {
                                    j = 2;
                                    long jMin = Math.min(jB3, 336L);
                                    int iMax = Math.max(0, ky5.b(PolestarApp.b, "app_start_paywall_show_count", 0) - 1);
                                    for (int i = 0; i < iMax && jMin < 336; i++) {
                                        jMin = jMin > 168 ? 336L : jMin * 2;
                                    }
                                    j2 = jMin * 3600000;
                                }
                                long jCurrentTimeMillis = System.currentTimeMillis();
                                if (jCurrentTimeMillis - jC >= jB2) {
                                    long jC2 = ky5.c(PolestarApp.b, "app_start_paywall_time", 0L);
                                    z2 = j2 <= 0 || jC2 <= 0 || jCurrentTimeMillis - jC2 > j2;
                                }
                            } else {
                                z = true;
                                j = 2;
                            }
                        } else {
                            z = true;
                            j = 2;
                        }
                    }
                    appLoadingActivity.R = z2;
                    appLoadingActivity.L = (appLoadingActivity.b0 || z2 || !AppLoadingActivity.I(appLoadingActivity.I.b, false)) ? false : z;
                    if (!appLoadingActivity.b0 && !appLoadingActivity.R && AppLoadingActivity.J(appLoadingActivity.I.b, false)) {
                        f6.a("slot_start_new");
                        uo2 uo2VarE = uo2.e(appLoadingActivity, "slot_start_new");
                        appLoadingActivity.O = uo2VarE;
                        uo2VarE.g = AppLoadingActivity.F();
                        if (appLoadingActivity.O.i()) {
                            ie4 ie4Var = new ie4();
                            ie4Var.b = j;
                            ie4Var.a = 600L;
                            ie4Var.c = 1300L;
                            ie4Var.d = uo2.D;
                            appLoadingActivity.O.m(appLoadingActivity, ie4Var, new com.polestar.domultiple.components.ui.d(appLoadingActivity));
                        }
                    }
                    if (!appLoadingActivity.L) {
                        appLoadingActivity.G.setVisibility(8);
                        appLoadingActivity.H.setVisibility(0);
                        appLoadingActivity.N(appLoadingActivity.b0 ? 0L : bg6.b("cold_launch_delay"));
                    } else {
                        f6.a("slot_start_interstitial_new");
                        uo2 uo2VarE2 = uo2.e(VirtualCore.p.e, "slot_start_interstitial_new");
                        long jCurrentTimeMillis2 = System.currentTimeMillis();
                        if (uo2VarE2.i()) {
                            appLoadingActivity.X.post(new com.polestar.domultiple.components.ui.e(appLoadingActivity, uo2VarE2, jCurrentTimeMillis2));
                        }
                        appLoadingActivity.Y.postDelayed(new i(appLoadingActivity), bg6.b("cold_launch_delay") + 2500);
                    }
                }
            }
        }

        public c(String str, int i, int i2) {
            this.a = str;
            this.b = i;
            this.c = i2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z;
            boolean z2;
            boolean zE;
            int i = this.b;
            AppLoadingActivity appLoadingActivity = AppLoadingActivity.this;
            String str = this.a;
            boolean zK = false;
            try {
                zE = com.polestar.clone.a.e(appLoadingActivity, str);
                try {
                    rq0 rq0Var = rq0.j;
                    try {
                        PackageInfo packageInfoB = av8.b.b(str, 0, 0);
                        PackageInfo packageInfo = VirtualCore.p.b.getPackageInfo(str, 0);
                        z2 = (packageInfoB == null || packageInfo == null || (packageInfoB.versionCode == packageInfo.versionCode && packageInfoB.applicationInfo.sourceDir.equals(packageInfo.applicationInfo.sourceDir))) ? false : true;
                    } catch (Exception e) {
                        pj4.c(e);
                    } catch (Throwable unused) {
                    }
                    if (z2) {
                        try {
                            VirtualCore.p.getClass();
                            VActivityManager vActivityManager = VActivityManager.d;
                            vActivityManager.getClass();
                            try {
                                vActivityManager.f().killAppByPkg(str, -1);
                            } catch (RemoteException unused2) {
                            }
                        } catch (Throwable th) {
                            th = th;
                            z = zK;
                            zK = zE;
                            pj4.c(th);
                            zE = zK;
                            zK = z;
                        }
                    }
                    zK = rq0.k(i, str);
                    AppMonitorService.a(i, str);
                } catch (Throwable th2) {
                    th = th2;
                    z = false;
                    z2 = false;
                }
            } catch (Throwable th3) {
                th = th3;
                z = false;
                z2 = false;
            }
            appLoadingActivity.X.post(new a(zE, z2, zK));
        }
    }

    public class d implements Runnable {

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                AppLoadingActivity appLoadingActivity = AppLoadingActivity.this;
                Toast.makeText(appLoadingActivity, appLoadingActivity.getString(R.string.require_secure_env), 0).show();
            }
        }

        public d() {
        }

        /* JADX WARN: Code duplicated, block: B:18:0x003f  */
        @Override // java.lang.Runnable
        public final void run() {
            AppLoadingActivity appLoadingActivity = AppLoadingActivity.this;
            PackageManager packageManager = appLoadingActivity.getPackageManager();
            try {
                if (Build.VERSION.SDK_INT < 31) {
                    if (appLoadingActivity.K) {
                        rq0.o(appLoadingActivity.I.b);
                    }
                    uq0 uq0Var = appLoadingActivity.I;
                    rq0 rq0Var = rq0.j;
                    rq0.l(uq0Var.b, uq0Var.c());
                } else {
                    PackageManager.Property property = packageManager.getProperty("REQUIRE_SECURE_ENV", appLoadingActivity.I.b);
                    if (property == null || !(property.getInteger() == 1 || property.getBoolean())) {
                        String str = appLoadingActivity.I.b;
                        if (appLoadingActivity.K) {
                            rq0.o(appLoadingActivity.I.b);
                        }
                        uq0 uq0Var2 = appLoadingActivity.I;
                        rq0 rq0Var2 = rq0.j;
                        rq0.l(uq0Var2.b, uq0Var2.c());
                    } else {
                        String str2 = appLoadingActivity.I.b;
                        appLoadingActivity.X.post(new a());
                    }
                }
            } catch (Exception unused) {
                String str3 = appLoadingActivity.I.b;
            }
            AppLoadingActivity.E(appLoadingActivity);
        }
    }

    public class e implements Runnable {

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                AppLoadingActivity appLoadingActivity = AppLoadingActivity.this;
                Toast.makeText(appLoadingActivity, appLoadingActivity.getString(R.string.start_with_arm64), 0).show();
            }
        }

        public e() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            AppLoadingActivity appLoadingActivity = AppLoadingActivity.this;
            boolean zIsNeedUpgrade = false;
            appLoadingActivity.c0 = false;
            appLoadingActivity.e0 = false;
            appLoadingActivity.f0 = false;
            appLoadingActivity.h0 = System.currentTimeMillis();
            Handler handler = appLoadingActivity.X;
            Runnable runnable = appLoadingActivity.i0;
            handler.removeCallbacks(runnable);
            long jG = AppLoadingActivity.G();
            boolean z = jG > 0;
            appLoadingActivity.d0 = z;
            if (z) {
                appLoadingActivity.X.postDelayed(runnable, jG);
            }
            if (appLoadingActivity.W) {
                new Thread(new g(appLoadingActivity), "launch-app-loading").start();
                return;
            }
            com.polestar.clone.a aVar = new com.polestar.clone.a(appLoadingActivity);
            try {
                if (aVar.b() != null) {
                    uq0 uq0Var = appLoadingActivity.I;
                    if (aVar.c(uq0Var.b, uq0Var.c())) {
                        String str = appLoadingActivity.I.b;
                        try {
                            if (aVar.b() != null) {
                                zIsNeedUpgrade = aVar.b().isNeedUpgrade(str);
                            }
                        } catch (Exception unused) {
                        }
                        if (zIsNeedUpgrade) {
                            String str2 = appLoadingActivity.I.b;
                            try {
                                if (aVar.b() != null) {
                                    aVar.b().upgradeApp(str2);
                                }
                            } catch (Exception unused2) {
                            }
                        }
                        uq0 uq0Var2 = appLoadingActivity.I;
                        aVar.d(uq0Var2.b, uq0Var2.c());
                        uq0 uq0Var3 = appLoadingActivity.I;
                        rq0.l.put(rq0.g(uq0Var3.c(), uq0Var3.b), Long.valueOf(System.currentTimeMillis()));
                        AppLoadingActivity.E(appLoadingActivity);
                        appLoadingActivity.runOnUiThread(new a());
                        return;
                    }
                }
            } catch (Exception unused3) {
            }
            appLoadingActivity.Y.post(appLoadingActivity.k0);
        }
    }

    public static void E(AppLoadingActivity appLoadingActivity) {
        long jG = G();
        if (jG <= 0) {
            jG = 0;
        }
        appLoadingActivity.X.postDelayed(new f(appLoadingActivity), jG + 3000);
    }

    public static z5 F() {
        Context context = VirtualCore.p.e;
        return new z5(Math.max(320, (ko1.c(context, ko1.b(context)) * 9) / 10), 280);
    }

    public static long G() {
        cd2 cd2Var;
        long jLongValue;
        m01 m01Var = bg6.a.h;
        j01 j01Var = m01Var.c;
        String strB = m01.b(j01Var, "clone_launch_timeout_ms");
        String str = ki6.m;
        if (strB != null) {
            m01Var.a("clone_launch_timeout_ms", j01Var.c());
            cd2Var = new cd2(strB, 2);
        } else {
            String strB2 = m01.b(m01Var.d, "clone_launch_timeout_ms");
            if (strB2 != null) {
                cd2Var = new cd2(strB2, 1);
            } else {
                m01.c("clone_launch_timeout_ms", "FirebaseRemoteConfigValue");
                cd2Var = new cd2(ki6.m, 0);
            }
        }
        int i = cd2Var.b;
        if (i == 0 || i == 0) {
            jLongValue = 0;
        } else {
            if (i != 0) {
                str = cd2Var.a;
            }
            String strTrim = str.trim();
            try {
                jLongValue = Long.valueOf(strTrim).longValue();
            } catch (NumberFormatException e2) {
                throw new IllegalArgumentException(xe9.p("[Value: ", strTrim, "] cannot be converted to a long."), e2);
            }
        }
        if (jLongValue < 0) {
            return 0L;
        }
        return jLongValue;
    }

    public static boolean I(String str, boolean z) {
        if (!ky5.e() && !VirtualCore.p(str)) {
            long jB = bg6.b("slot_clone_start_interstitial_freq_hour") * 3600000;
            long jB2 = bg6.b("slot_clone_start_interstitial_ramp_hour") * 3600000;
            long jC = ky5.c(PolestarApp.b, "app_start_last", 0L);
            if (jC != 0 || !TextUtils.isEmpty(str)) {
                if (jC == 0) {
                    PolestarApp polestarApp = PolestarApp.b;
                    jC = st0.c(polestarApp, polestarApp.getPackageName());
                }
                long jCurrentTimeMillis = System.currentTimeMillis() - jC;
                if (z) {
                    jCurrentTimeMillis += 900000;
                }
                boolean z2 = jC != 0 ? jCurrentTimeMillis > jB : jCurrentTimeMillis > jB2;
                if (o0 == null) {
                    o0 = new HashSet<>();
                    String[] strArrSplit = bg6.c("slot_app_start_filter").split(":");
                    if (strArrSplit != null) {
                        for (String str2 : strArrSplit) {
                            o0.add(str2);
                        }
                    }
                }
                if (z2) {
                    return !o0.contains(str) || str == null;
                }
            }
        }
        return false;
    }

    public static boolean J(String str, boolean z) {
        if (!ky5.e()) {
            String strC = bg6.c("slot_app_start_style");
            if ("native".equals(strC) || "all".equals(strC)) {
                long jB = bg6.b("slot_app_start_native_freq_min") * 60000;
                long jB2 = bg6.b("slot_app_start_native_ramp_min") * 60000;
                long jC = ky5.c(PolestarApp.b, "app_start_last_native", 0L);
                if (jC != 0 || !TextUtils.isEmpty(str)) {
                    if (jC == 0) {
                        PolestarApp polestarApp = PolestarApp.b;
                        jC = st0.c(polestarApp, polestarApp.getPackageName());
                    }
                    long jCurrentTimeMillis = System.currentTimeMillis() - jC;
                    if (z) {
                        jCurrentTimeMillis += 900000;
                    }
                    boolean z2 = jC != 0 ? jCurrentTimeMillis > jB : jCurrentTimeMillis > jB2;
                    if (o0 == null) {
                        o0 = new HashSet<>();
                        String[] strArrSplit = bg6.c("slot_app_start_filter").split(":");
                        if (strArrSplit != null) {
                            for (String str2 : strArrSplit) {
                                o0.add(str2);
                            }
                        }
                    }
                    if (z2) {
                        return !o0.contains(str) || str == null;
                    }
                }
            }
        }
        return false;
    }

    public static void K(ContextWrapper contextWrapper) {
        if (J(null, true)) {
            uo2 uo2VarE = uo2.e(contextWrapper, "slot_start_new");
            uo2VarE.g = F();
            uo2VarE.o(contextWrapper);
        }
        if (I(null, true)) {
            uo2 uo2VarE2 = uo2.e(contextWrapper, "slot_start_interstitial_new");
            uo2VarE2.g = F();
            uo2VarE2.o(contextWrapper);
        }
    }

    public static void O(Activity activity, uq0 uq0Var) {
        String str = uq0Var.b;
        Intent intent = new Intent(activity, (Class<?>) AppLoadingActivity.class);
        intent.addFlags(268435456);
        intent.putExtra("app_packagename", str);
        intent.putExtra("From where", "From home");
        intent.putExtra("first_start", uq0Var.a().intValue() == 0);
        intent.putExtra("app_userid", uq0Var.c());
        activity.startActivity(intent);
        activity.overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
    }

    public final boolean H() {
        Intent intent = getIntent();
        if (intent != null) {
            String stringExtra = intent.getStringExtra("app_packagename");
            int intExtra = intent.getIntExtra("app_userid", VUserHandle.b());
            this.J = intent.getStringExtra("From where");
            this.I = rq0.f(this).e(intExtra, stringExtra);
            intent.getBooleanExtra("first_start", false);
        }
        if (this.I != null) {
            return true;
        }
        Toast.makeText(this, getString(R.string.toast_shortcut_invalid), 1).show();
        finish();
        return false;
    }

    public final void L() {
        uq0 uq0Var = this.I;
        if (uq0Var == null || this.Y == null) {
            return;
        }
        int i = this.a0 + 1;
        this.a0 = i;
        this.Y.post(new c(uq0Var.b, uq0Var.c(), i));
    }

    public final void M() {
        this.L = false;
        this.M = false;
        this.Q = false;
        this.P = false;
        this.m0 = false;
        this.n0 = false;
        this.c0 = false;
        this.d0 = false;
        this.e0 = false;
        this.f0 = false;
        this.h0 = 0L;
        this.X.removeCallbacks(this.i0);
        this.R = false;
        this.S = false;
        this.T = false;
        this.U = 0L;
    }

    public final void N(long j) {
        if (this.S || !this.R) {
            if (this.Q) {
                return;
            }
            this.Q = true;
            this.Y.postDelayed(this.l0, j);
            return;
        }
        this.S = true;
        this.U = j;
        this.T = true;
        ky5.i(PolestarApp.b, "app_start_paywall_time", System.currentTimeMillis());
        PolestarApp polestarApp = PolestarApp.b;
        ky5.h(polestarApp, "app_start_paywall_show_count", ky5.b(polestarApp, "app_start_paywall_show_count", 0) + 1);
        VipActivity.L(this, "app_start", 702);
        u22.a("app_start_paywall");
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 702) {
            this.T = false;
            N(this.U);
        }
    }

    @Override // com.polestar.domultiple.components.ui.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.X = new Handler(Looper.getMainLooper());
        HandlerThread handlerThread = new HandlerThread("launch-thread");
        this.Z = handlerThread;
        handlerThread.start();
        this.Y = new Handler(this.Z.getLooper());
        if (!this.g0) {
            IntentFilter intentFilter = new IntentFilter("do.multiple.cloner.action.CLONE_LAUNCH_SUCCESS");
            int i = Build.VERSION.SDK_INT;
            BroadcastReceiver broadcastReceiver = this.j0;
            if (i >= 33) {
                registerReceiver(broadcastReceiver, intentFilter, 4);
            } else {
                registerReceiver(broadcastReceiver, intentFilter);
            }
            this.g0 = true;
        }
        u22.h("app_shortcut");
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
        setContentView(R.layout.app_loading_activity);
        if (!H()) {
            finish();
        } else {
            M();
            L();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        if (this.g0) {
            try {
                unregisterReceiver(this.j0);
            } catch (Throwable th) {
                pj4.c(th);
            }
            this.g0 = false;
        }
        Handler handler = this.X;
        if (handler != null) {
            handler.removeCallbacks(this.i0);
            this.X.removeCallbacksAndMessages(null);
        }
        Handler handler2 = this.Y;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
        }
        HandlerThread handlerThread = this.Z;
        if (handlerThread != null) {
            handlerThread.quitSafely();
        }
        h23 h23Var = this.N;
        if (h23Var != null) {
            h23Var.destroy();
        }
        super.onDestroy();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        this.Y.removeCallbacks(this.k0);
        this.Y.removeCallbacks(this.l0);
        this.Q = false;
        if (H()) {
            M();
            L();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        super.onPause();
        if (this.M || this.n0 || this.T || this.e0) {
            return;
        }
        if (this.Q && !this.c0 && this.d0) {
            return;
        }
        finish();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        boolean z = this.M;
        boolean z2 = this.n0;
        if (z || z2) {
            this.G.setVisibility(8);
            this.H.setVisibility(0);
            this.M = false;
            N(this.m0 ? 1500L : 0L);
        }
    }
}
