package com.polestar.domultiple.components.ui;

import android.content.DialogInterface;
import com.polestar.domultiple.PolestarApp;
import io.bg6;
import io.ky5;

/* JADX INFO: compiled from: HomeActivity.java */
/* JADX INFO: loaded from: classes2.dex */
class g0 implements DialogInterface.OnCancelListener {
    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        ky5.i(PolestarApp.b, "ignore_version", bg6.b("current_version"));
    }
}
