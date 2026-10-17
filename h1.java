package com.polestar.domultiple.components.ui;

import io.co2;
import io.mn2;
import io.up8;
import io.xc6;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class h1 implements co2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ o1 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ h1(Object obj, o1 o1Var, Object obj2, int i, int i2) {
        this.a = i2;
        this.d = obj;
        this.b = o1Var;
        this.e = obj2;
        this.c = i;
    }

    @Override // io.co2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        androidx.compose.runtime.f fVar = (androidx.compose.runtime.f) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                int iA = xc6.a(this.c | 1);
                m1.a((n1) this.d, this.b, (androidx.compose.ui.l) this.e, fVar, iA);
                break;
            default:
                int iA2 = xc6.a(this.c | 1);
                m1.e((String) this.d, this.b, (mn2) this.e, fVar, iA2);
                break;
        }
        return up8.a;
    }
}
