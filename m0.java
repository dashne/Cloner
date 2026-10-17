package com.polestar.domultiple.components.ui;

import android.view.View;
import android.widget.AdapterView;
import com.polestar.domultiple.PolestarApp;
import io.ky5;

/* JADX INFO: compiled from: LockSettingsActivity.java */
/* JADX INFO: loaded from: classes2.dex */
class m0 implements AdapterView.OnItemSelectedListener {
    public final /* synthetic */ LockSettingsActivity a;

    public m0(LockSettingsActivity lockSettingsActivity) {
        this.a = lockSettingsActivity;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        ky5.i(PolestarApp.b, "relock_interval", this.a.L[i]);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView<?> adapterView) {
    }
}
