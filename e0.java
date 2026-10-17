package com.polestar.domultiple.components.ui;

import android.content.DialogInterface;
import io.u22;

/* JADX INFO: compiled from: HomeActivity.java */
/* JADX INFO: loaded from: classes2.dex */
class e0 implements DialogInterface.OnCancelListener {
    public final /* synthetic */ String[] a;
    public final /* synthetic */ HomeActivity b;

    public e0(HomeActivity homeActivity, String[] strArr) {
        this.b = homeActivity;
        this.a = strArr;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        u22.a("cancel_permission_guide");
        this.b.requestPermissions(this.a, 101);
    }
}
