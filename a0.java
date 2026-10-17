package com.polestar.domultiple.components.ui;

import android.graphics.Canvas;
import android.view.ViewGroup;
import com.polestar.domultiple.PolestarApp;
import com.polestar.domultiple.widget.ExplosionField;
import com.polestar.domultiple.widget.HomeGridAdapter;
import com.polestar.domultiple.widget.dragdrop.DragImageView;
import io.c6;
import io.h23;
import io.ky5;
import io.mr8;
import io.uq0;
import p000do.multiple.cloner.R;

/* JADX INFO: compiled from: HomeActivity.java */
/* JADX INFO: loaded from: classes2.dex */
class a0 implements Runnable {
    public final /* synthetic */ HomeGridAdapter.CloneItem a;
    public final /* synthetic */ DragImageView b;
    public final /* synthetic */ HomeActivity c;

    /* JADX INFO: compiled from: HomeActivity.java */
    public class a implements ExplosionField.a {
        public a() {
        }

        @Override // com.polestar.domultiple.widget.ExplosionField.a
        public final void a() {
            HomeGridAdapter homeGridAdapter = a0.this.c.F;
            h23 h23Var = homeGridAdapter.e;
            if (h23Var != null) {
                ((c6) h23Var.d()).b(homeGridAdapter.c, "slot_app_icon", homeGridAdapter.d.b);
                homeGridAdapter.e = null;
                homeGridAdapter.h = true;
                homeGridAdapter.notifyDataSetChanged();
            }
        }
    }

    public a0(HomeActivity homeActivity, HomeGridAdapter.CloneItem cloneItem, DragImageView dragImageView) {
        this.c = homeActivity;
        this.a = cloneItem;
        this.b = dragImageView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HomeGridAdapter.CloneItem cloneItem = this.a;
        int i = cloneItem.index;
        DragImageView dragImageView = this.b;
        HomeActivity homeActivity = this.c;
        if (i == 1) {
            if (ky5.a(PolestarApp.b, "shown_delete_guide", false)) {
                HomeActivity.E(homeActivity, dragImageView, (uq0) cloneItem.b);
                return;
            }
            uq0 uq0Var = (uq0) cloneItem.b;
            int i2 = HomeActivity.k0;
            mr8.a(homeActivity, homeActivity.getString(R.string.delete_dialog_title), homeActivity.getString(R.string.delete_dialog_content), homeActivity.getString(R.string.no_thanks), homeActivity.getString(R.string.yes), -1, new d0(homeActivity, dragImageView, uq0Var));
            ky5.g(PolestarApp.b, "shown_delete_guide", true);
            return;
        }
        if (i != 3 || dragImageView == null) {
            return;
        }
        Canvas canvas = ExplosionField.c;
        ViewGroup viewGroup = (ViewGroup) homeActivity.findViewById(android.R.id.content);
        ExplosionField explosionField = new ExplosionField(homeActivity);
        viewGroup.addView(explosionField, new ViewGroup.LayoutParams(-1, -1));
        homeActivity.R = explosionField;
        explosionField.b(new a(), dragImageView);
    }
}
