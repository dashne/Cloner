package com.polestar.domultiple.components.ui;

import android.view.View;
import android.view.ViewGroup;
import io.h23;
import io.h6;
import io.j23;
import io.uo2;
import p000do.multiple.cloner.R;

/* JADX INFO: compiled from: AppLockActivity.java */
/* JADX INFO: loaded from: classes2.dex */
class j implements j23 {
    public final /* synthetic */ uo2 a;
    public final /* synthetic */ AppLockActivity b;

    public j(AppLockActivity appLockActivity, uo2 uo2Var) {
        this.b = appLockActivity;
        this.a = uo2Var;
    }

    @Override // io.j23
    public final void e(h23 h23Var) {
        int i = AppLockActivity.P;
        AppLockActivity appLockActivity = this.b;
        h23Var.f();
        h6.b bVar = new h6.b(R.layout.lock_window_native_ad);
        bVar.b = R.id.ad_title;
        bVar.c = R.id.ad_subtitle_text;
        bVar.e = R.id.ad_cover_image;
        bVar.f = R.id.ad_adm_mediaview;
        bVar.g = R.id.ad_icon_image;
        bVar.d = R.id.ad_cta_text;
        View viewM = h23Var.m(appLockActivity, new h6(bVar));
        if (viewM != null) {
            viewM.setBackgroundColor(0);
            ViewGroup viewGroup = (ViewGroup) viewM.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(viewM);
            }
            appLockActivity.H.removeAllViews();
            appLockActivity.H.addView(viewM);
            appLockActivity.O = true;
            appLockActivity.I.setImageDrawable(appLockActivity.G.getDrawable());
            appLockActivity.I.setBackground(null);
            appLockActivity.J.setText(appLockActivity.K.getText());
        }
        this.a.o(appLockActivity);
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

    @Override // io.j23
    public final void d(String str) {
    }
}
