package com.polestar.domultiple.components.ui;

import android.widget.Toast;
import io.rq0;
import io.uq0;
import p000do.multiple.cloner.R;

/* JADX INFO: compiled from: AppLoadingActivity.java */
/* JADX INFO: loaded from: classes2.dex */
class g implements Runnable {
    public final /* synthetic */ AppLoadingActivity a;

    /* JADX INFO: compiled from: AppLoadingActivity.java */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            AppLoadingActivity appLoadingActivity = g.this.a;
            Toast.makeText(appLoadingActivity, appLoadingActivity.getString(R.string.start_with_arm64), 0).show();
        }
    }

    public g(AppLoadingActivity appLoadingActivity) {
        this.a = appLoadingActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zIsNeedUpgrade;
        AppLoadingActivity appLoadingActivity = this.a;
        com.polestar.clone.a aVar = new com.polestar.clone.a(appLoadingActivity);
        try {
            if (aVar.b() != null) {
                uq0 uq0Var = appLoadingActivity.I;
                if (aVar.c(uq0Var.b, uq0Var.c())) {
                    try {
                        zIsNeedUpgrade = aVar.b() != null ? aVar.b().isNeedUpgrade(appLoadingActivity.I.b) : false;
                    } catch (Exception unused) {
                    }
                    if (zIsNeedUpgrade) {
                        String str = appLoadingActivity.I.b;
                        try {
                            if (aVar.b() != null) {
                                aVar.b().upgradeApp(str);
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
