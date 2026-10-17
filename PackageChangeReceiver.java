package com.polestar.domultiple.components.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.polestar.clone.client.core.VirtualCore;
import io.ki6;
import io.pj4;
import io.rq0;

/* JADX INFO: loaded from: classes2.dex */
public class PackageChangeReceiver extends BroadcastReceiver {

    public class a implements Runnable {
        public final /* synthetic */ String a;

        public a(String str) {
            this.a = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            String str = this.a;
            try {
                VirtualCore virtualCore = VirtualCore.p;
                if (virtualCore == null || !virtualCore.m(str)) {
                    return;
                }
                rq0.o(str);
            } catch (Exception e) {
                pj4.d(Log.getStackTraceString(e));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0033  */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        boolean z;
        if (intent == null || intent.getAction() == null) {
            return;
        }
        String dataString = intent.getDataString();
        if (dataString != null && dataString.startsWith("package:")) {
            dataString = dataString.replaceFirst("package:", ki6.m);
        }
        if (!intent.getAction().equals("android.intent.action.PACKAGE_REPLACED")) {
            z = intent.getBooleanExtra("android.intent.extra.REPLACING", false);
        }
        pj4.a("PackageChange: " + intent.getAction() + " packageName = " + dataString + " replacing: " + z);
        if (intent.getAction().equals("android.intent.action.PACKAGE_REMOVED") && !z) {
            FirebaseCrashlytics.getInstance().log("package remove " + dataString);
            rq0.f(context).d(context, dataString);
        }
        if (intent.getAction().equals("android.intent.action.PACKAGE_ADDED") && z) {
            new Thread(new a(dataString), "upgrade-app").start();
        }
    }
}
