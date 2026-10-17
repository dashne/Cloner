package com.polestar.domultiple.components.ui;

import io.co2;
import io.up8;
import io.xc6;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f1 implements co2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ o1 b;

    public /* synthetic */ f1(o1 o1Var, int i, int i2) {
        this.a = i2;
        this.b = o1Var;
    }

    @Override // io.co2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        androidx.compose.runtime.f fVar = (androidx.compose.runtime.f) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                m1.j(this.b, fVar, xc6.a(1));
                break;
            case 1:
                m1.b(this.b, fVar, xc6.a(1));
                break;
            default:
                m1.f(this.b, fVar, xc6.a(1));
                break;
        }
        return up8.a;
    }
}
