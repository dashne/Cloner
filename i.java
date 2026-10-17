package com.polestar.domultiple.components.ui;

/* JADX INFO: compiled from: AppLoadingActivity.java */
/* JADX INFO: loaded from: classes2.dex */
class i implements Runnable {
    public final /* synthetic */ AppLoadingActivity a;

    /* JADX INFO: compiled from: AppLoadingActivity.java */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            i iVar = i.this;
            iVar.a.G.setVisibility(8);
            iVar.a.H.setVisibility(0);
        }
    }

    public i(AppLoadingActivity appLoadingActivity) {
        this.a = appLoadingActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AppLoadingActivity appLoadingActivity = this.a;
        if (appLoadingActivity.M) {
            return;
        }
        appLoadingActivity.P = true;
        if (!appLoadingActivity.n0) {
            appLoadingActivity.N(0L);
        }
        appLoadingActivity.runOnUiThread(new a());
    }
}
