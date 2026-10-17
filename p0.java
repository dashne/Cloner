package com.polestar.domultiple.components.ui;

import android.os.Handler;
import android.view.View;
import io.h23;
import io.h6;
import io.j23;
import io.pj4;
import p000do.multiple.cloner.R;

/* JADX INFO: compiled from: NativeInterstitialActivity.java */
/* JADX INFO: loaded from: classes2.dex */
class p0 implements j23 {
    public final /* synthetic */ NativeInterstitialActivity a;

    public p0(NativeInterstitialActivity nativeInterstitialActivity) {
        this.a = nativeInterstitialActivity;
    }

    @Override // io.j23
    public final void d(String str) {
        pj4.a("Lucky load native error " + str);
        NativeInterstitialActivity nativeInterstitialActivity = this.a;
        nativeInterstitialActivity.f.removeMessages(1);
        Handler handler = nativeInterstitialActivity.f;
        handler.sendMessage(handler.obtainMessage(1));
    }

    @Override // io.j23
    public final void e(h23 h23Var) {
        NativeInterstitialActivity nativeInterstitialActivity = this.a;
        nativeInterstitialActivity.b.setVisibility(8);
        if (h23Var == null || !h23Var.h()) {
            h6.b bVar = new h6.b(R.layout.native_interstitial_layout);
            bVar.b = R.id.ad_title;
            bVar.c = R.id.ad_subtitle_text;
            bVar.e = R.id.ad_cover_image;
            bVar.f = R.id.ad_adm_mediaview;
            bVar.g = R.id.ad_icon_image;
            bVar.d = R.id.ad_cta_text;
            bVar.h = R.id.star_level_layout;
            View viewM = h23Var.m(nativeInterstitialActivity, new h6(bVar));
            if (viewM != null) {
                nativeInterstitialActivity.d.addView(viewM);
                nativeInterstitialActivity.d.setVisibility(0);
            }
        } else if (!nativeInterstitialActivity.e) {
            h23Var.show(nativeInterstitialActivity);
        }
        nativeInterstitialActivity.c.o(nativeInterstitialActivity);
        nativeInterstitialActivity.f.removeMessages(1);
    }

    @Override // io.j23
    public final void a(h23 h23Var) {
    }

    @Override // io.j23
    public final void b(h23 h23Var) {
    }

    @Override // io.j23
    public final void c(h23 h23Var) {
    }
}
