package com.polestar.domultiple.components.ui;

import android.content.DialogInterface;
import com.polestar.domultiple.widget.dragdrop.DragImageView;
import io.uq0;

/* JADX INFO: compiled from: HomeActivity.java */
/* JADX INFO: loaded from: classes2.dex */
class d0 implements DialogInterface.OnClickListener {
    public final /* synthetic */ DragImageView a;
    public final /* synthetic */ uq0 b;
    public final /* synthetic */ HomeActivity c;

    public d0(HomeActivity homeActivity, DragImageView dragImageView, uq0 uq0Var) {
        this.c = homeActivity;
        this.a = dragImageView;
        this.b = uq0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (i != 2) {
            return;
        }
        HomeActivity.E(this.c, this.a, this.b);
    }
}
