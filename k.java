package com.polestar.domultiple.components.ui;

import com.polestar.domultiple.components.AppMonitorService;
import io.rq0;

/* JADX INFO: compiled from: AppLockActivity.java */
/* JADX INFO: loaded from: classes2.dex */
class k implements com.polestar.domultiple.widget.locker.b.InterfaceC0234b {
    public final /* synthetic */ AppLockActivity a;

    /* JADX INFO: compiled from: AppLockActivity.java */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            k.this.a.finish();
        }
    }

    public k(AppLockActivity appLockActivity) {
        this.a = appLockActivity;
    }

    @Override // com.polestar.domultiple.widget.locker.b.InterfaceC0234b
    public final void a() {
        AppLockActivity appLockActivity = this.a;
        appLockActivity.F.postDelayed(new a(), 200L);
        String str = appLockActivity.D;
        int i = appLockActivity.E;
        String str2 = AppMonitorService.c;
        AppMonitorService.c = rq0.g(i, str);
    }

    @Override // com.polestar.domultiple.widget.locker.b.InterfaceC0234b
    public final void b() {
        AppLockActivity appLockActivity = this.a;
        appLockActivity.C.a(appLockActivity.H);
    }

    @Override // com.polestar.domultiple.widget.locker.b.InterfaceC0234b
    public final void onCancel() {
        AppLockActivity appLockActivity = this.a;
        appLockActivity.C.a(appLockActivity.H);
    }
}
