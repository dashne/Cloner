package com.polestar.domultiple.components.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import io.ki6;
import io.pj4;
import io.u09;
import io.u22;

/* JADX INFO: loaded from: classes2.dex */
public class CrashReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String stringExtra;
        boolean booleanExtra;
        if (intent == null || intent.getAction() == null || !"appclone.intent.action.SHOW_CRASH_DIALOG".equals(intent.getAction())) {
            return;
        }
        try {
            try {
                stringExtra = intent.getStringExtra("package");
            } catch (LinkageError | RuntimeException unused) {
                stringExtra = null;
            }
            try {
                booleanExtra = intent.getBooleanExtra("forground", false);
            } catch (LinkageError | RuntimeException unused2) {
                booleanExtra = false;
            }
            try {
                intent.getIntExtra("tag", 0);
            } catch (LinkageError | RuntimeException unused3) {
            }
            try {
                pj4.d("CrashReceiver onReceive crash: " + stringExtra + " forground: " + booleanExtra);
                FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
                firebaseCrashlytics.setCustomKey("package", stringExtra);
                firebaseCrashlytics.setCustomKey("forground", ki6.m + booleanExtra);
                String strE = u09.e(intent);
                if (strE != null) {
                    firebaseCrashlytics.log("Virtual process original stack:\n".concat(strE));
                }
                Throwable thD = u09.d(intent);
                u22.e(stringExtra, booleanExtra);
                firebaseCrashlytics.recordException(thD);
            } catch (LinkageError e) {
                pj4.d("Linkage error in CrashReceiver " + Log.getStackTraceString(e));
            }
        } catch (Exception e2) {
            pj4.d("Error in CrashReceiver " + Log.getStackTraceString(e2));
        }
    }
}
