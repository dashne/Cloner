package com.polestar.domultiple.components.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.polestar.domultiple.PolestarApp;
import io.pj4;
import io.q47;
import io.u22;

/* JADX INFO: loaded from: classes2.dex */
public class WakeReceiver extends BroadcastReceiver {

    public class a implements Runnable {
        public final /* synthetic */ BroadcastReceiver.PendingResult a;
        public final /* synthetic */ Intent b;

        public a(BroadcastReceiver.PendingResult pendingResult, Intent intent) {
            this.a = pendingResult;
            this.b = intent;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                this.a.finish();
                q47.b("app");
            } catch (Exception e) {
                pj4.c(e);
                FirebaseCrashlytics.getInstance().setCustomKey("intent", this.b.toString());
                FirebaseCrashlytics.getInstance().recordException(e);
            }
        }
    }

    public static final class b {
        public static final Handler a;

        static {
            HandlerThread handlerThread = new HandlerThread("AsyncHandler-wake");
            handlerThread.start();
            a = new Handler(handlerThread.getLooper());
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        pj4.d("Awake for " + intent);
        PolestarApp polestarApp = PolestarApp.b;
        u22.h(intent.getAction());
        BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
        if (pendingResultGoAsync != null) {
            b.a.post(new a(pendingResultGoAsync, intent));
        }
    }
}
