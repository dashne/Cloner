package com.polestar.domultiple.components.ui;

import android.view.View;
import com.polestar.domultiple.PolestarApp;
import com.polestar.domultiple.widget.BlueSwitch;
import io.ky5;
import io.u22;

/* JADX INFO: compiled from: LockSettingsActivity.java */
/* JADX INFO: loaded from: classes2.dex */
class n0 implements View.OnClickListener {
    public final /* synthetic */ BlueSwitch a;

    public n0(BlueSwitch blueSwitch) {
        this.a = blueSwitch;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        BlueSwitch blueSwitch = this.a;
        boolean z = blueSwitch.c;
        blueSwitch.setChecked(z);
        ky5.g(PolestarApp.b, "use_fingerprint", z);
        u22.a("set_fingerprint_" + z);
    }
}
