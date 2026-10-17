package com.polestar.domultiple.components.ui;

import android.view.View;
import io.x40;

/* JADX INFO: compiled from: LockSettingsActivity.java */
/* JADX INFO: loaded from: classes2.dex */
class l0 implements View.OnClickListener {
    public final /* synthetic */ LockSettingsActivity a;

    public l0(LockSettingsActivity lockSettingsActivity) {
        this.a = lockSettingsActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        x40.a().getClass();
        boolean zB = x40.b();
        LockSettingsActivity lockSettingsActivity = this.a;
        if (zB) {
            lockSettingsActivity.E(lockSettingsActivity.D.c);
            return;
        }
        lockSettingsActivity.K = true;
        VipActivity.K(lockSettingsActivity, "lock");
        lockSettingsActivity.D.setChecked(false);
    }
}
