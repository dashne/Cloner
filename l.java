package com.polestar.domultiple.components.ui;

import com.polestar.clone.CustomizeAppData;

/* JADX INFO: compiled from: CustomizeIconActivity.java */
/* JADX INFO: loaded from: classes2.dex */
class l implements Runnable {
    public final /* synthetic */ CustomizeIconActivity a;

    public l(CustomizeIconActivity customizeIconActivity) {
        this.a = customizeIconActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CustomizeIconActivity customizeIconActivity = this.a;
        com.polestar.clone.a aVar = new com.polestar.clone.a(customizeIconActivity);
        try {
            if (aVar.b() != null) {
                CustomizeAppData customizeAppData = customizeIconActivity.g;
                aVar.f(customizeAppData.f, customizeAppData.h, customizeAppData);
            }
        } catch (Exception unused) {
        }
    }
}
