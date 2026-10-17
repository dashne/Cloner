package com.polestar.domultiple.components.ui;

import android.view.View;

/* JADX INFO: compiled from: NativeInterstitialActivity.java */
/* JADX INFO: loaded from: classes2.dex */
class o0 implements View.OnClickListener {
    public final /* synthetic */ NativeInterstitialActivity a;

    public o0(NativeInterstitialActivity nativeInterstitialActivity) {
        this.a = nativeInterstitialActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        NativeInterstitialActivity nativeInterstitialActivity = this.a;
        nativeInterstitialActivity.e = true;
        nativeInterstitialActivity.finish();
    }
}
