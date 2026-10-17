package com.polestar.domultiple.components.ui;

import android.content.DialogInterface;
import android.text.TextUtils;
import com.polestar.domultiple.PolestarApp;
import io.bg6;
import io.ky5;
import io.st0;
import io.u22;

/* JADX INFO: compiled from: HomeActivity.java */
/* JADX INFO: loaded from: classes2.dex */
class h0 implements DialogInterface.OnClickListener {
    public final /* synthetic */ HomeActivity a;

    public h0(HomeActivity homeActivity) {
        this.a = homeActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (i == 1) {
            dialogInterface.dismiss();
            ky5.i(PolestarApp.b, "ignore_version", bg6.b("current_version"));
        } else {
            if (i != 2) {
                return;
            }
            dialogInterface.dismiss();
            String strC = bg6.c("force_update_to");
            boolean zIsEmpty = TextUtils.isEmpty(strC);
            HomeActivity homeActivity = this.a;
            if (zIsEmpty) {
                st0.e(homeActivity, homeActivity.getPackageName());
            } else {
                st0.f(homeActivity, strC);
            }
            u22.a("update_go");
        }
    }
}
