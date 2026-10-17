package com.polestar.domultiple.components.ui;

import com.polestar.domultiple.widget.PackageSwitchListAdapter;
import io.uq0;

/* JADX INFO: compiled from: LockSettingsActivity.java */
/* JADX INFO: loaded from: classes2.dex */
class j0 implements PackageSwitchListAdapter.c {
    public final /* synthetic */ LockSettingsActivity a;

    public j0(LockSettingsActivity lockSettingsActivity) {
        this.a = lockSettingsActivity;
    }

    @Override // com.polestar.domultiple.widget.PackageSwitchListAdapter.c
    public final void a(uq0 uq0Var, boolean z) {
        if (z) {
            uq0Var.i = 1;
        } else {
            uq0Var.i = 0;
        }
        com.polestar.domultiple.db.a.a(this.a.C).a.update(uq0Var);
    }
}
