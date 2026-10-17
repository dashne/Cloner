package com.polestar.domultiple.components.ui;

/* JADX INFO: compiled from: AppLoadingActivity.java */
/* JADX INFO: loaded from: classes2.dex */
class f implements Runnable {
    public final /* synthetic */ AppLoadingActivity a;

    public f(AppLoadingActivity appLoadingActivity) {
        this.a = appLoadingActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.finish();
    }
}
