package com.polestar.domultiple.components.ui;

import android.view.View;
import io.h23;
import io.h6;
import io.j23;
import io.pj4;
import p000do.multiple.cloner.R;

/* JADX INFO: compiled from: HomeActivity.java */
/* JADX INFO: loaded from: classes2.dex */
class i0 implements j23 {
    public final /* synthetic */ HomeActivity a;

    public i0(HomeActivity homeActivity) {
        this.a = homeActivity;
    }

    @Override // io.j23
    public final void d(String str) {
        pj4.a("slot_home_new load error: " + str);
    }

    @Override // io.j23
    public final void e(h23 h23Var) {
        int i = HomeActivity.k0;
        HomeActivity homeActivity = this.a;
        if (h23Var == null) {
            return;
        }
        h6.b bVar = new h6.b(R.layout.home_native_ad_default);
        bVar.b = R.id.ad_title;
        bVar.c = R.id.ad_subtitle_text;
        bVar.e = R.id.ad_cover_image;
        bVar.f = R.id.ad_adm_mediaview;
        bVar.g = R.id.ad_icon_image;
        bVar.d = R.id.ad_cta_text;
        View viewM = h23Var.m(homeActivity, new h6(bVar));
        if (viewM != null) {
            homeActivity.Y.removeAllViews();
            homeActivity.Y.addView(viewM);
            homeActivity.Y.setVisibility(0);
            homeActivity.j0 = System.currentTimeMillis();
            h23 h23Var2 = homeActivity.i0;
            if (h23Var2 != h23Var && h23Var2 != null) {
                h23Var2.destroy();
            }
            homeActivity.i0 = h23Var;
        }
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
