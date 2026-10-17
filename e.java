package com.polestar.domultiple.components.ui;

import com.polestar.domultiple.PolestarApp;
import io.h23;
import io.ie4;
import io.j23;
import io.ky5;
import io.uo2;

/* JADX INFO: compiled from: AppLoadingActivity.java */
/* JADX INFO: loaded from: classes2.dex */
class e implements Runnable {
    public final /* synthetic */ uo2 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ AppLoadingActivity c;

    public e(AppLoadingActivity appLoadingActivity, uo2 uo2Var, long j) {
        this.c = appLoadingActivity;
        this.a = uo2Var;
        this.b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ie4 ie4Var = new ie4();
        ie4Var.b = 2L;
        ie4Var.a = 800L;
        ie4Var.c = 1500L;
        ie4Var.d = uo2.E;
        this.a.m(this.c, ie4Var, new a());
    }

    /* JADX INFO: compiled from: AppLoadingActivity.java */
    public class a implements j23 {

        /* JADX INFO: renamed from: com.polestar.domultiple.components.ui.e$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: AppLoadingActivity.java */
        public class RunnableC0228a implements Runnable {
            public final /* synthetic */ h23 a;

            public RunnableC0228a(h23 h23Var) {
                this.a = h23Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.show(e.this.c);
            }
        }

        public a() {
        }

        @Override // io.j23
        public final void c(h23 h23Var) {
            e eVar = e.this;
            eVar.c.G.setVisibility(8);
            eVar.c.H.setVisibility(0);
        }

        @Override // io.j23
        public final void d(String str) {
            e eVar = e.this;
            eVar.c.G.setVisibility(8);
            eVar.c.H.setVisibility(0);
        }

        @Override // io.j23
        public final void e(h23 h23Var) {
            e eVar = e.this;
            AppLoadingActivity appLoadingActivity = eVar.c;
            if (appLoadingActivity.P) {
                return;
            }
            appLoadingActivity.M = true;
            long jCurrentTimeMillis = System.currentTimeMillis() - eVar.b;
            if (jCurrentTimeMillis >= 300 || "From home".equals(appLoadingActivity.J)) {
                h23Var.show(appLoadingActivity);
            } else {
                appLoadingActivity.X.postDelayed(new RunnableC0228a(h23Var), 300 - jCurrentTimeMillis);
            }
            ky5.i(PolestarApp.b, "app_start_last", System.currentTimeMillis());
        }

        @Override // io.j23
        public final void a(h23 h23Var) {
        }

        @Override // io.j23
        public final void b(h23 h23Var) {
        }
    }
}
