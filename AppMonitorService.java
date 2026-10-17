package com.polestar.domultiple.components;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.polestar.clone.client.core.VirtualCore;
import com.polestar.domultiple.PolestarApp;
import com.polestar.domultiple.components.ui.AppLockActivity;
import io.c76;
import io.ki6;
import io.ky5;
import io.o23;
import io.rq0;
import io.u22;
import io.uo2;
import io.uq0;

/* JADX INFO: loaded from: classes2.dex */
public class AppMonitorService extends Service {
    public static String c;
    public b a;
    public final Handler b = new a(Looper.getMainLooper());

    public class a extends Handler {
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            if (message.what != 0) {
                return;
            }
            c76.d(VirtualCore.p.e).g((String) message.obj);
            String str = AppMonitorService.c;
            uo2.e(PolestarApp.b, "slot_app_lock").o(PolestarApp.b);
            AppMonitorService.c = null;
        }
    }

    public class b extends o23.b {
        public b() {
        }

        @Override // io.o23.b
        public void onAdsLaunch(String str, int i, String str2) {
            Bundle bundle = new Bundle();
            bundle.putString(AppMeasurementSdk.a.b, ki6.m + str2);
            u22.f(bundle, "ads_launch");
        }

        @Override // io.o23.b
        public void onAppLock(String str, int i) {
            AppMonitorService appMonitorService = AppMonitorService.this;
            int i2 = AppLockActivity.P;
            if (str == null) {
                return;
            }
            Intent intent = new Intent(appMonitorService, (Class<?>) AppLockActivity.class);
            intent.putExtra("android.intent.extra.PACKAGE_NAME", str);
            intent.putExtra("extra_clone_userid", i);
            intent.setFlags(1887436800);
            appMonitorService.startActivity(intent);
        }

        @Override // io.o23.b, io.o23
        public void onAppSwitchBackground(String str, int i) {
            String strG = rq0.g(i, str);
            long jC = ky5.c(PolestarApp.b, "relock_interval", 5000L);
            Handler handler = AppMonitorService.this.b;
            handler.sendMessageDelayed(handler.obtainMessage(0, strG), jC);
        }

        @Override // io.o23.b, io.o23
        public void onAppSwitchForeground(String str, int i) {
            AppMonitorService appMonitorService = AppMonitorService.this;
            if (!TextUtils.isEmpty(str)) {
                ky5.g(appMonitorService, "clone_launch_success_pkg_" + str + "_" + i, true);
                Intent intent = new Intent("do.multiple.cloner.action.CLONE_LAUNCH_SUCCESS");
                intent.setPackage(appMonitorService.getPackageName());
                intent.putExtra("extra_clone_launch_package", str);
                intent.putExtra("extra_clone_launch_user_id", i);
                appMonitorService.sendBroadcast(intent);
            }
            uq0 uq0VarE = rq0.f(appMonitorService).e(i, str);
            String strG = rq0.g(i, str);
            String str2 = AppMonitorService.c;
            if (uq0VarE == null || uq0VarE.b().intValue() == 0 || !ky5.a(appMonitorService, "locker_feature_enabled", false)) {
                return;
            }
            if (strG.equals(AppMonitorService.c)) {
                appMonitorService.b.removeMessages(0);
                return;
            }
            int i2 = AppLockActivity.P;
            if (str == null) {
                return;
            }
            Intent intent2 = new Intent(appMonitorService, (Class<?>) AppLockActivity.class);
            intent2.putExtra("android.intent.extra.PACKAGE_NAME", str);
            intent2.putExtra("extra_clone_userid", i);
            intent2.setFlags(1887436800);
            appMonitorService.startActivity(intent2);
        }
    }

    public static void a(int i, String str) {
        uq0 uq0VarE;
        if (ky5.e() || !ky5.a(PolestarApp.b, "locker_feature_enabled", false) || TextUtils.isEmpty(str) || (uq0VarE = rq0.f(PolestarApp.b).e(i, str)) == null || uq0VarE.b().intValue() == 0) {
            return;
        }
        uo2.e(PolestarApp.b, "slot_app_lock").o(PolestarApp.b);
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.a;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        rq0.f(this);
        this.a = new b();
    }
}
