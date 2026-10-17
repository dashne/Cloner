package com.polestar.domultiple.components.ui;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: renamed from: com.polestar.domultiple.components.ui.u */
/* JADX INFO: compiled from: HomeActivity.java */
/* JADX INFO: loaded from: classes2.dex */
class OnCloneGridItemClicker implements AdapterView.OnItemClickListener {
    public final /* synthetic */ HomeActivity a;

    public OnCloneGridItemClicker(HomeActivity homeActivity) {
        this.a = homeActivity;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        HomeActivity homeActivity = this.a;
        homeActivity.StartApp(homeActivity.F.getItem(i));
    }
}
