package com.polestar.domultiple.components.ui;

import android.content.DialogInterface;
import io.u22;

/* JADX INFO: compiled from: HomeActivity.java */
/* JADX INFO: loaded from: classes2.dex */
class f0 implements DialogInterface.OnClickListener {
    public final /* synthetic */ String[] a;
    public final /* synthetic */ HomeActivity b;

    public f0(HomeActivity homeActivity, String[] strArr) {
        this.b = homeActivity;
        this.a = strArr;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        u22.a("ok_permission_guide");
        this.b.requestPermissions(this.a, 101);
    }
}
