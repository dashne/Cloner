package com.polestar.domultiple.components.ui;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import com.polestar.domultiple.PolestarApp;
import io.h23;
import io.h6;
import io.j23;
import io.ko1;
import io.ky5;
import java.util.HashSet;
import p000do.multiple.cloner.R;

/* JADX INFO: compiled from: AppLoadingActivity.java */
/* JADX INFO: loaded from: classes2.dex */
class d implements j23 {
    public final /* synthetic */ AppLoadingActivity a;

    public d(AppLoadingActivity appLoadingActivity) {
        this.a = appLoadingActivity;
    }

    @Override // io.j23
    public final void b(h23 h23Var) {
        AppLoadingActivity appLoadingActivity = this.a;
        appLoadingActivity.n0 = true;
        appLoadingActivity.Y.removeCallbacks(appLoadingActivity.k0);
        appLoadingActivity.Y.removeCallbacks(appLoadingActivity.l0);
        appLoadingActivity.Q = false;
    }

    @Override // io.j23
    public final void e(h23 h23Var) {
        HashSet<String> hashSet = AppLoadingActivity.o0;
        ky5.i(PolestarApp.b, "app_start_last_native", System.currentTimeMillis());
        AppLoadingActivity appLoadingActivity = this.a;
        appLoadingActivity.getClass();
        int iB = ko1.b(appLoadingActivity);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        if (ko1.a == null) {
            ko1.a = (WindowManager) appLoadingActivity.getSystemService("window");
        }
        ko1.a.getDefaultDisplay().getMetrics(displayMetrics);
        h6.b bVar = new h6.b(((double) (((float) displayMetrics.heightPixels) / ((float) iB))) >= 1.8d ? R.layout.native_ad_appload : R.layout.app_start_native_ad);
        bVar.b = R.id.ad_title;
        bVar.c = R.id.ad_subtitle_text;
        bVar.e = R.id.ad_cover_image;
        bVar.f = R.id.ad_adm_mediaview;
        bVar.g = R.id.ad_icon_image;
        bVar.d = R.id.ad_cta_text;
        View viewM = h23Var.m(appLoadingActivity, new h6(bVar));
        if (viewM != null) {
            viewM.setBackgroundColor(0);
            appLoadingActivity.V.removeAllViews();
            appLoadingActivity.V.addView(viewM);
            appLoadingActivity.V.setVisibility(0);
            h23 h23Var2 = appLoadingActivity.N;
            if (h23Var2 != null && h23Var2 != h23Var) {
                h23Var2.destroy();
            }
            appLoadingActivity.N = h23Var;
        }
        appLoadingActivity.m0 = true;
    }

    @Override // io.j23
    public final void a(h23 h23Var) {
    }

    @Override // io.j23
    public final void c(h23 h23Var) {
    }

    @Override // io.j23
    public final void d(String str) {
    }
}
