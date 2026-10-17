package com.polestar.domultiple.components.ui;

/* JADX INFO: compiled from: HomeActivity.java */
/* JADX INFO: loaded from: classes2.dex */
class p implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ HomeActivity b;

    public p(HomeActivity homeActivity, String str) {
        this.b = homeActivity;
        this.a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = HomeActivity.k0;
        this.b.Q("clone", this.a);
    }
}
