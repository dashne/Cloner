package com.polestar.domultiple.components.ui;

import android.R;
import android.graphics.Canvas;
import android.view.ViewGroup;
import com.polestar.domultiple.PolestarApp;
import com.polestar.domultiple.widget.ExplosionField;
import io.ky5;
import io.rq0;
import io.uq0;

/* JADX INFO: compiled from: HomeActivity.java */
/* JADX INFO: loaded from: classes2.dex */
class c0 implements Runnable {
    public final /* synthetic */ uq0 a;
    public final /* synthetic */ HomeActivity b;

    /* JADX INFO: compiled from: HomeActivity.java */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            c0 c0Var = c0.this;
            com.polestar.clone.a aVar = new com.polestar.clone.a(c0Var.b);
            try {
                if (aVar.b() != null) {
                    uq0 uq0Var = c0Var.a;
                    if (aVar.c(uq0Var.b, uq0Var.c())) {
                        String str = uq0Var.b;
                        int iC = uq0Var.c();
                        if (aVar.b() != null) {
                            aVar.b().deleteClone(str, iC);
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    public c0(HomeActivity homeActivity, uq0 uq0Var) {
        this.b = homeActivity;
        this.a = uq0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        uq0 uq0Var = this.a;
        String str = uq0Var.d;
        ky5.i(PolestarApp.b, str + "_first_start", -1L);
        HomeActivity homeActivity = this.b;
        rq0.f(homeActivity).c(homeActivity, uq0Var);
        new Thread(new a(), "agent-delete-clone").start();
        ExplosionField explosionField = homeActivity.R;
        Canvas canvas = ExplosionField.c;
        if (explosionField != null) {
            try {
                ((ViewGroup) homeActivity.findViewById(R.id.content)).removeView(explosionField);
            } catch (Exception unused) {
            }
        }
    }
}
