package com.polestar.domultiple.components.ui;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.InspectableValueKt;
import io.ab0;
import io.bx0;
import io.co2;
import io.do6;
import io.ds0;
import io.dx0;
import io.eo2;
import io.es0;
import io.ex6;
import io.ez0;
import io.fi7;
import io.fn7;
import io.fo6;
import io.fx0;
import io.gc5;
import io.gt0;
import io.ia6;
import io.is0;
import io.ja6;
import io.jd0;
import io.jp0;
import io.k07;
import io.k90;
import io.kb2;
import io.kd0;
import io.kk3;
import io.la6;
import io.ma6;
import io.mn2;
import io.nq1;
import io.o70;
import io.ob4;
import io.oi7;
import io.on2;
import io.p08;
import io.p90;
import io.po6;
import io.q78;
import io.qo6;
import io.qr8;
import io.r31;
import io.r90;
import io.s90;
import io.sc;
import io.sl4;
import io.t73;
import io.tp7;
import io.tv0;
import io.um4;
import io.up8;
import io.uv0;
import io.uv6;
import io.vg5;
import io.vi5;
import io.vs0;
import io.w68;
import io.wl4;
import io.ws0;
import io.x85;
import io.xa8;
import io.xb8;
import io.xc6;
import io.xh7;
import io.xn5;
import io.y69;
import io.y83;
import io.y88;
import io.z08;
import io.z26;
import io.z30;
import io.zv0;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import p000do.multiple.cloner.R;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    java.lang.IllegalArgumentException: Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.
    	at kotlin.metadata.jvm.internal.JvmReadUtils.checkMetadataVersionForRead(JvmReadUtils.kt:79)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:46)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:68)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:31)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    */
/* JADX INFO: compiled from: VipActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata
@fi7
public final class m1 {
    @tv0
    @dx0
    public static final void a(n1 n1Var, o1 o1Var, androidx.compose.ui.l lVar, androidx.compose.runtime.f fVar, int i) {
        int i2;
        androidx.compose.runtime.f fVarS = fVar.s(1214380135);
        if ((i & 6) == 0) {
            i2 = (fVarS.W(n1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fVarS.W(o1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fVarS.W(lVar) ? 256 : 128;
        }
        if (fVarS.L(i2 & 1, (i2 & 147) != 146)) {
            gc5 gc5Var = androidx.compose.runtime.g.a;
            String strA = tp7.a(n1Var.b, fVarS);
            nq1.a aVar = nq1.b;
            androidx.compose.ui.l lVarA = p08.a(vg5.g(SizeKt.e(lVar, o1Var.j), 2, 4), "vip_benefit");
            sc.a.getClass();
            z30.a aVar2 = sc.a.o;
            androidx.compose.foundation.layout.c.a.getClass();
            androidx.compose.foundation.layout.e eVarA = androidx.compose.foundation.layout.d.a(androidx.compose.foundation.layout.c.e, aVar2, fVarS, 54);
            int iHashCode = Long.hashCode(fVarS.E());
            xn5 xn5VarI = fVarS.I();
            androidx.compose.ui.l lVarC = ComposedModifierKt.c(fVarS, lVarA);
            ComposeUiNode.Qo.getClass();
            mn2<ComposeUiNode> mn2Var = ComposeUiNode.Companion.b;
            if (fVarS.z() == null) {
                fx0.a();
                throw null;
            }
            fVarS.v();
            if (fVarS.o()) {
                fVarS.O(mn2Var);
            } else {
                fVarS.K();
            }
            qr8.c(fVarS, ComposeUiNode.Companion.f, eVarA);
            qr8.c(fVarS, ComposeUiNode.Companion.e, xn5VarI);
            qr8.c(fVarS, ComposeUiNode.Companion.g, Integer.valueOf(iHashCode));
            qr8.b(fVarS, ComposeUiNode.Companion.h);
            qr8.c(fVarS, ComposeUiNode.Companion.d, lVarC);
            gt0 gt0Var = gt0.a;
            Painter painterA = vi5.a(n1Var.a, fVarS, 0);
            androidx.compose.ui.l.a aVar3 = androidx.compose.ui.l.Oo;
            androidx.compose.ui.l lVarM = SizeKt.m(aVar3, o1Var.k);
            r31.a.getClass();
            y83.a(painterA, strA, lVarM, null, r31.a.c, 0.0f, fVarS, 24584);
            oi7.a(fVarS, SizeKt.e(aVar3, 5));
            androidx.compose.foundation.layout.j jVar = SizeKt.a;
            ds0.b.getClass();
            long j = ds0.d;
            androidx.compose.ui.text.font.d0.b.getClass();
            androidx.compose.ui.text.font.d0 d0Var = androidx.compose.ui.text.font.d0.h;
            q78.a.getClass();
            int i3 = q78.c;
            z08.b.getClass();
            w68.b(strA, jVar, j, o1Var.l, d0Var, 0L, new z08(z08.e), o1Var.m, i3, false, 2, 0, null, fVarS, 1573296, 24960, 238504);
            fVarS = fVarS;
            fVarS.U();
        } else {
            fVarS.D();
        }
        androidx.compose.runtime.l0 l0VarA = fVarS.A();
        if (l0VarA != null) {
            l0VarA.d = new h1(n1Var, o1Var, lVar, i, 0);
        }
    }

    @tv0
    @dx0
    public static final void b(o1 o1Var, androidx.compose.runtime.f fVar, int i) {
        androidx.compose.runtime.f fVarS = fVar.s(1423609871);
        int i2 = (fVarS.W(o1Var) ? 4 : 2) | i;
        if (fVarS.L(i2 & 1, (i2 & 3) != 2)) {
            gc5 gc5Var = androidx.compose.runtime.g.a;
            List listF = kotlin.collections.i.F(new n1(R.drawable.vip_benefit_clones, R.string.vip_feature_unlimited_clones), new n1(R.drawable.vip_benefit_ads, R.string.vip_feature_remove_ads), new n1(R.drawable.vip_benefit_locker, R.string.vip_feature_privacy_lock));
            androidx.compose.ui.l.a aVar = androidx.compose.ui.l.Oo;
            androidx.compose.foundation.layout.j jVar = SizeKt.a;
            aVar.Z(jVar);
            nq1.a aVar2 = nq1.b;
            androidx.compose.ui.l lVarG = vg5.g(jVar, 24, o1Var.n);
            androidx.compose.foundation.layout.c.a.getClass();
            androidx.compose.foundation.layout.c.j jVarG = androidx.compose.foundation.layout.c.g(12);
            sc.a.getClass();
            androidx.compose.foundation.layout.y yVarA = androidx.compose.foundation.layout.x.a(jVarG, sc.a.k, fVarS, 6);
            int iHashCode = Long.hashCode(fVarS.E());
            xn5 xn5VarI = fVarS.I();
            androidx.compose.ui.l lVarC = ComposedModifierKt.c(fVarS, lVarG);
            ComposeUiNode.Qo.getClass();
            mn2<ComposeUiNode> mn2Var = ComposeUiNode.Companion.b;
            if (fVarS.z() == null) {
                fx0.a();
                throw null;
            }
            fVarS.v();
            if (fVarS.o()) {
                fVarS.O(mn2Var);
            } else {
                fVarS.K();
            }
            qr8.c(fVarS, ComposeUiNode.Companion.f, yVarA);
            qr8.c(fVarS, ComposeUiNode.Companion.e, xn5VarI);
            qr8.c(fVarS, ComposeUiNode.Companion.g, Integer.valueOf(iHashCode));
            qr8.b(fVarS, ComposeUiNode.Companion.h);
            qr8.c(fVarS, ComposeUiNode.Companion.d, lVarC);
            qo6 qo6Var = qo6.a;
            fVarS.X(470036435);
            Iterator it = listF.iterator();
            while (it.hasNext()) {
                a((n1) it.next(), o1Var, qo6Var.a(androidx.compose.ui.l.Oo, 1.0f), fVarS, (i2 << 3) & 112);
            }
            fVarS.M();
            fVarS.U();
            gc5 gc5Var2 = androidx.compose.runtime.g.a;
        } else {
            fVarS.D();
        }
        androidx.compose.runtime.l0 l0VarA = fVarS.A();
        if (l0VarA != null) {
            l0VarA.d = new f1(o1Var, i, 1);
        }
    }

    @tv0
    @dx0
    public static final void c(final q1 q1Var, final o1 o1Var, final mn2<up8> mn2Var, mn2<up8> mn2Var2, mn2<up8> mn2Var3, androidx.compose.runtime.f fVar, final int i) {
        final mn2<up8> mn2Var4 = mn2Var2;
        final mn2<up8> mn2Var5 = mn2Var3;
        androidx.compose.runtime.f fVarS = fVar.s(103622367);
        int i2 = i | (fVarS.n(q1Var) ? 4 : 2) | (fVarS.W(o1Var) ? 32 : 16) | (fVarS.n(mn2Var) ? 256 : 128) | (fVarS.n(mn2Var4) ? 2048 : 1024) | (fVarS.n(mn2Var5) ? 16384 : 8192);
        if (fVarS.L(1 & i2, (i2 & 9363) != 9362)) {
            gc5 gc5Var = androidx.compose.runtime.g.a;
            androidx.compose.ui.l.a aVar = androidx.compose.ui.l.Oo;
            androidx.compose.foundation.layout.j jVar = SizeKt.a;
            aVar.getClass();
            androidx.compose.ui.l lVarA = BackgroundKt.a(jVar, ab0.a.a(ab0.a, kotlin.collections.i.F(new ds0(is0.b(529173)), new ds0(is0.d(4060615445L)), new ds0(is0.d(4278719253L)))));
            float f = 24;
            nq1.a aVar2 = nq1.b;
            androidx.compose.ui.l lVarI = vg5.i(lVarA, f, o1Var.y, f, o1Var.z);
            androidx.compose.foundation.layout.c.a.getClass();
            androidx.compose.foundation.layout.c.m mVar = androidx.compose.foundation.layout.c.d;
            sc.a.getClass();
            androidx.compose.foundation.layout.e eVarA = androidx.compose.foundation.layout.d.a(mVar, sc.a.n, fVarS, 0);
            int iHashCode = Long.hashCode(fVarS.E());
            xn5 xn5VarI = fVarS.I();
            androidx.compose.ui.l lVarC = ComposedModifierKt.c(fVarS, lVarI);
            ComposeUiNode.Qo.getClass();
            mn2<ComposeUiNode> mn2Var6 = ComposeUiNode.Companion.b;
            if (fVarS.z() == null) {
                fx0.a();
                throw null;
            }
            fVarS.v();
            if (fVarS.o()) {
                fVarS.O(mn2Var6);
            } else {
                fVarS.K();
            }
            co2<ComposeUiNode, um4, up8> co2Var = ComposeUiNode.Companion.f;
            qr8.c(fVarS, co2Var, eVarA);
            co2<ComposeUiNode, ez0, up8> co2Var2 = ComposeUiNode.Companion.e;
            qr8.c(fVarS, co2Var2, xn5VarI);
            Integer numValueOf = Integer.valueOf(iHashCode);
            co2<ComposeUiNode, Integer, up8> co2Var3 = ComposeUiNode.Companion.g;
            qr8.c(fVarS, co2Var3, numValueOf);
            on2<ComposeUiNode, up8> on2Var = ComposeUiNode.Companion.h;
            qr8.b(fVarS, on2Var);
            co2<ComposeUiNode, androidx.compose.ui.l, up8> co2Var4 = ComposeUiNode.Companion.d;
            qr8.c(fVarS, co2Var4, lVarC);
            gt0 gt0Var = gt0.a;
            androidx.compose.ui.l lVarA2 = p08.a(SizeKt.e(jVar, o1Var.t), "vip_continue");
            do6 do6VarA = fo6.a(8);
            kd0 kd0Var = kd0.a;
            long jD = is0.d(4294956651L);
            long jD2 = is0.d(4279570442L);
            kd0Var.getClass();
            ds0.b.getClass();
            long j = ds0.h;
            sl4.a.getClass();
            vs0 vs0VarA = sl4.a(fVarS);
            jd0 jd0Var = vs0VarA.W;
            if (jd0Var == null) {
                kb2.a.getClass();
                jd0Var = new jd0(ws0.b(vs0VarA, kb2.b), ws0.b(vs0VarA, kb2.k), ds0.b(kb2.f, ws0.b(vs0VarA, kb2.d)), ds0.b(kb2.h, ws0.b(vs0VarA, kb2.g)));
                vs0VarA.W = jd0Var;
            }
            int i3 = i2 >> 6;
            androidx.compose.material3.f.a(mn2Var, lVarA2, false, do6VarA, jd0Var.a(jD, jD2, j, j), null, null, zv0.b(-2041376071, new eo2() { // from class: com.polestar.domultiple.components.ui.d1
                @Override // io.eo2
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i4;
                    androidx.compose.runtime.f fVar2 = (androidx.compose.runtime.f) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    kk3.f((po6) obj, "$this$Button");
                    if (fVar2.L(iIntValue & 1, (iIntValue & 17) != 16)) {
                        gc5 gc5Var2 = androidx.compose.runtime.g.a;
                        q1 q1Var2 = q1Var;
                        if (q1Var2.b) {
                            i4 = R.string.vip_retry;
                        } else {
                            i4 = q1Var2.e ? R.string.buy_now : R.string.vip_continue;
                        }
                        String strA = tp7.a(i4, fVar2);
                        long jC = y88.c(20);
                        androidx.compose.ui.text.font.d0.b.getClass();
                        w68.b(strA, null, 0L, jC, androidx.compose.ui.text.font.d0.i, 0L, null, 0L, 0, false, 0, 0, null, fVar2, 1597440, 0, 262062);
                    } else {
                        fVar2.D();
                    }
                    return up8.a;
                }
            }, fVarS), fVarS, (i3 & 14) | 805306368, 484);
            String strA = tp7.a(R.string.vip_subscription_terms_short, fVarS);
            androidx.compose.ui.l lVarA3 = p08.a(vg5.j(jVar, 0.0f, o1Var.w, 0.0f, 0.0f, 13), "vip_legal");
            long jD3 = is0.d(4290305515L);
            z08.b.getClass();
            w68.b(strA, lVarA3, jD3, o1Var.u, null, 0L, new z08(z08.e), o1Var.v, 0, false, 0, 0, null, fVarS, 384, 0, 259048);
            androidx.compose.ui.l lVarE = SizeKt.e(jVar, o1Var.x);
            androidx.compose.foundation.layout.y yVarA = androidx.compose.foundation.layout.x.a(androidx.compose.foundation.layout.c.e, sc.a.l, fVarS, 54);
            int iHashCode2 = Long.hashCode(fVarS.E());
            xn5 xn5VarI2 = fVarS.I();
            androidx.compose.ui.l lVarC2 = ComposedModifierKt.c(fVarS, lVarE);
            if (fVarS.z() == null) {
                fx0.a();
                throw null;
            }
            fVarS.v();
            if (fVarS.o()) {
                fVarS.O(mn2Var6);
            } else {
                fVarS.K();
            }
            qr8.c(fVarS, co2Var, yVarA);
            qr8.c(fVarS, co2Var2, xn5VarI2);
            qr8.c(fVarS, co2Var3, Integer.valueOf(iHashCode2));
            qr8.b(fVarS, on2Var);
            qr8.c(fVarS, co2Var4, lVarC2);
            qo6 qo6Var = qo6.a;
            int i4 = i2 & 112;
            mn2Var4 = mn2Var2;
            e(tp7.a(R.string.terms_of_service, fVarS), o1Var, mn2Var4, fVarS, ((i2 >> 3) & 896) | i4);
            w68.b("|", vg5.h(aVar, 16, 0.0f, 2), is0.d(4286556592L), y88.c(o1Var.a ? 12 : 13), null, 0L, null, 0L, 0, false, 0, 0, null, fVarS, 438, 0, 262120);
            fVarS = fVarS;
            mn2Var5 = mn2Var3;
            e(tp7.a(R.string.privacy_policy, fVarS), o1Var, mn2Var5, fVarS, i4 | (i3 & 896));
            fVarS.U();
            fVarS.U();
        } else {
            fVarS.D();
        }
        androidx.compose.runtime.l0 l0VarA = fVarS.A();
        if (l0VarA != null) {
            l0VarA.d = new co2(o1Var, mn2Var, mn2Var4, mn2Var5, i) { // from class: com.polestar.domultiple.components.ui.e1
                public final /* synthetic */ o1 b;
                public final /* synthetic */ mn2 c;
                public final /* synthetic */ mn2 d;
                public final /* synthetic */ mn2 e;

                @Override // io.co2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = xc6.a(1);
                    o1 o1Var2 = this.b;
                    mn2 mn2Var7 = this.d;
                    mn2 mn2Var8 = this.e;
                    m1.c(this.a, o1Var2, this.c, mn2Var7, mn2Var8, (androidx.compose.runtime.f) obj, iA);
                    return up8.a;
                }
            };
        }
    }

    @tv0
    @dx0
    public static final void d(final o1 o1Var, final mn2<up8> mn2Var, androidx.compose.runtime.f fVar, final int i) {
        androidx.compose.runtime.f fVar2;
        androidx.compose.runtime.f fVarS = fVar.s(778134127);
        int i2 = (fVarS.W(o1Var) ? 4 : 2) | i | (fVarS.n(mn2Var) ? 32 : 16);
        if (fVarS.L(i2 & 1, (i2 & 19) != 18)) {
            gc5 gc5Var = androidx.compose.runtime.g.a;
            androidx.compose.ui.l.a aVar = androidx.compose.ui.l.Oo;
            androidx.compose.foundation.layout.j jVar = SizeKt.a;
            aVar.getClass();
            androidx.compose.ui.l lVarE = SizeKt.e(jVar, o1Var.b);
            sc.a.getClass();
            z30 z30Var = sc.a.b;
            um4 um4VarD = k90.d(z30Var, false);
            int iHashCode = Long.hashCode(fVarS.E());
            xn5 xn5VarI = fVarS.I();
            androidx.compose.ui.l lVarC = ComposedModifierKt.c(fVarS, lVarE);
            ComposeUiNode.Qo.getClass();
            mn2<ComposeUiNode> mn2Var2 = ComposeUiNode.Companion.b;
            if (fVarS.z() == null) {
                fx0.a();
                throw null;
            }
            fVarS.v();
            if (fVarS.o()) {
                fVarS.O(mn2Var2);
            } else {
                fVarS.K();
            }
            qr8.c(fVarS, ComposeUiNode.Companion.f, um4VarD);
            qr8.c(fVarS, ComposeUiNode.Companion.e, xn5VarI);
            qr8.c(fVarS, ComposeUiNode.Companion.g, Integer.valueOf(iHashCode));
            qr8.b(fVarS, ComposeUiNode.Companion.h);
            qr8.c(fVarS, ComposeUiNode.Companion.d, lVarC);
            p90 p90Var = p90.a;
            Painter painterA = vi5.a(R.drawable.vip_hero_paywall, fVarS, 6);
            String strA = tp7.a(R.string.vip_hero_content_description, fVarS);
            androidx.compose.foundation.layout.j jVar2 = SizeKt.c;
            Object objH = fVarS.h();
            androidx.compose.runtime.f.a.getClass();
            androidx.compose.runtime.f.a.C0049a c0049a = androidx.compose.runtime.f.a.b;
            if (objH == c0049a) {
                objH = new xb8(23);
                fVarS.N(objH);
            }
            androidx.compose.ui.l lVarA = androidx.compose.ui.graphics.m.a(jVar2, (on2) objH);
            Object objH2 = fVarS.h();
            if (objH2 == c0049a) {
                objH2 = new xb8(24);
                fVarS.N(objH2);
            }
            androidx.compose.ui.l lVarD = androidx.compose.ui.draw.e.d(lVarA, (on2) objH2);
            r31.a.getClass();
            fVar2 = fVarS;
            y83.a(painterA, strA, lVarD, null, r31.a.b, 0.0f, fVar2, 24584);
            nq1.a aVar2 = nq1.b;
            androidx.compose.ui.l lVarM = SizeKt.m(vg5.f(p90Var.a(aVar, z30Var), 16), 40);
            do6 do6Var = fo6.a;
            androidx.compose.ui.l lVarA2 = p08.a(BackgroundKt.b(jp0.a(lVarM, do6Var), is0.b(536870912), androidx.compose.ui.graphics.y.a).Z(new o70(1, new xh7(is0.b(553648127)), do6Var)), "vip_close");
            bx0.a.getClass();
            t73.a(mn2Var, lVarA2, false, null, null, bx0.b, fVar2, ((i2 >> 3) & 14) | 1572864, 60);
            fVar2.U();
        } else {
            fVar2 = fVarS;
            fVar2.D();
        }
        androidx.compose.runtime.l0 l0VarA = fVar2.A();
        if (l0VarA != null) {
            l0VarA.d = new co2(mn2Var, i) { // from class: com.polestar.domultiple.components.ui.l1
                public final /* synthetic */ mn2 b;

                @Override // io.co2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = xc6.a(1);
                    m1.d(this.a, this.b, (androidx.compose.runtime.f) obj, iA);
                    return up8.a;
                }
            };
        }
    }

    @tv0
    @dx0
    public static final void e(String str, o1 o1Var, mn2<up8> mn2Var, androidx.compose.runtime.f fVar, int i) {
        androidx.compose.runtime.f fVar2;
        androidx.compose.runtime.f fVarS = fVar.s(1696958084);
        int i2 = (fVarS.W(str) ? 4 : 2) | i | (fVarS.W(o1Var) ? 32 : 16);
        if ((i & 384) == 0) {
            i2 |= fVarS.n(mn2Var) ? 256 : 128;
        }
        if (fVarS.L(1 & i2, (i2 & 147) != 146)) {
            gc5 gc5Var = androidx.compose.runtime.g.a;
            androidx.compose.ui.l lVarC = androidx.compose.foundation.o.c(SizeKt.e(androidx.compose.ui.l.Oo, o1Var.x), false, null, mn2Var, 15);
            float f = 4;
            nq1.a aVar = nq1.b;
            boolean z = o1Var.a;
            androidx.compose.ui.l lVarG = vg5.g(lVarC, f, z ? 6 : 8);
            long jD = is0.d(4282763504L);
            long jC = y88.c(z ? 12 : 13);
            androidx.compose.ui.text.font.d0.b.getClass();
            fVar2 = fVarS;
            w68.b(str, lVarG, jD, jC, androidx.compose.ui.text.font.d0.h, 0L, null, 0L, 0, false, 0, 0, null, fVar2, (i2 & 14) | 1573248, 0, 262056);
        } else {
            fVar2 = fVarS;
            fVar2.D();
        }
        androidx.compose.runtime.l0 l0VarA = fVar2.A();
        if (l0VarA != null) {
            l0VarA.d = new h1(str, o1Var, mn2Var, i, 1);
        }
    }

    @tv0
    @dx0
    public static final void f(o1 o1Var, androidx.compose.runtime.f fVar, int i) {
        androidx.compose.runtime.f fVar2;
        androidx.compose.runtime.f fVarS = fVar.s(1493012652);
        int i2 = (fVarS.W(o1Var) ? 4 : 2) | i;
        if (fVarS.L(i2 & 1, (i2 & 3) != 2)) {
            gc5 gc5Var = androidx.compose.runtime.g.a;
            String strA = tp7.a(R.string.vip_paywall_title_prefix, fVarS);
            String strA2 = tp7.a(R.string.vip_paywall_title_pro, fVarS);
            androidx.compose.ui.text.b.C0069b c0069b = new androidx.compose.ui.text.b.C0069b(0);
            StringBuilder sb = c0069b.a;
            sb.append(strA);
            sb.append(" ");
            int iD = c0069b.d(new androidx.compose.ui.text.z(is0.d(4294956651L), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
            try {
                sb.append(strA2);
                up8 up8Var = up8.a;
                c0069b.c(iD);
                androidx.compose.ui.text.b bVarE = c0069b.e();
                androidx.compose.ui.l.a aVar = androidx.compose.ui.l.Oo;
                androidx.compose.foundation.layout.j jVar = SizeKt.a;
                aVar.getClass();
                nq1.a aVar2 = nq1.b;
                androidx.compose.ui.l lVarA = p08.a(vg5.h(jVar, 24, 0.0f, 2), "vip_title");
                ds0.b.getClass();
                long j = ds0.d;
                androidx.compose.ui.text.font.d0.b.getClass();
                androidx.compose.ui.text.font.d0 d0Var = androidx.compose.ui.text.font.d0.i;
                z08.b.getClass();
                int i3 = z08.e;
                q78.a.getClass();
                fVar2 = fVarS;
                w68.c(bVarE, lVarA, j, o1Var.e, d0Var, 0L, new z08(i3), o1Var.f, q78.c, false, 2, 0, null, null, null, fVar2, 1573296);
            } catch (Throwable th) {
                c0069b.c(iD);
                throw th;
            }
        } else {
            fVar2 = fVarS;
            fVar2.D();
        }
        androidx.compose.runtime.l0 l0VarA = fVar2.A();
        if (l0VarA != null) {
            l0VarA.d = new f1(o1Var, i, 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:65:0x0220  */
    /* JADX WARN: Multi-variable type inference failed */
    @tv0
    @dx0
    public static final void g(final q1 q1Var, final o1 o1Var, final on2<? super Integer, up8> on2Var, androidx.compose.runtime.f fVar, final int i) {
        q1 q1Var2;
        on2<? super Integer, up8> on2Var2;
        int i2;
        androidx.compose.runtime.f fVarS = fVar.s(1628706035);
        int iD = fVarS.d();
        int i3 = i | (fVarS.n(q1Var) ? 4 : 2) | (fVarS.W(o1Var) ? 32 : 16) | (fVarS.n(on2Var) ? 256 : 128);
        if (fVarS.L(i3 & 1, (i3 & 147) != 146)) {
            gc5 gc5Var = androidx.compose.runtime.g.a;
            androidx.compose.ui.l.a aVar = androidx.compose.ui.l.Oo;
            androidx.compose.foundation.layout.j jVar = SizeKt.a;
            aVar.Z(jVar);
            nq1.a aVar2 = nq1.b;
            androidx.compose.ui.l lVarA = p08.a(vg5.g(jVar, 22, o1Var.o), "vip_plans");
            androidx.compose.foundation.layout.c.a.getClass();
            androidx.compose.foundation.layout.c.m mVar = androidx.compose.foundation.layout.c.d;
            sc.a.getClass();
            androidx.compose.foundation.layout.e eVarA = androidx.compose.foundation.layout.d.a(mVar, sc.a.n, fVarS, 0);
            int iHashCode = Long.hashCode(fVarS.E());
            xn5 xn5VarI = fVarS.I();
            androidx.compose.ui.l lVarC = ComposedModifierKt.c(fVarS, lVarA);
            ComposeUiNode.Qo.getClass();
            mn2<ComposeUiNode> mn2Var = ComposeUiNode.Companion.b;
            if (fVarS.z() == null) {
                fx0.a();
                throw null;
            }
            fVarS.v();
            if (fVarS.o()) {
                fVarS.O(mn2Var);
            } else {
                fVarS.K();
            }
            co2<ComposeUiNode, um4, up8> co2Var = ComposeUiNode.Companion.f;
            qr8.c(fVarS, co2Var, eVarA);
            co2<ComposeUiNode, ez0, up8> co2Var2 = ComposeUiNode.Companion.e;
            qr8.c(fVarS, co2Var2, xn5VarI);
            Integer numValueOf = Integer.valueOf(iHashCode);
            co2<ComposeUiNode, Integer, up8> co2Var3 = ComposeUiNode.Companion.g;
            qr8.c(fVarS, co2Var3, numValueOf);
            on2<ComposeUiNode, up8> on2Var3 = ComposeUiNode.Companion.h;
            qr8.b(fVarS, on2Var3);
            int i4 = 1;
            co2<ComposeUiNode, androidx.compose.ui.l, up8> co2Var4 = ComposeUiNode.Companion.d;
            qr8.c(fVarS, co2Var4, lVarC);
            gt0 gt0Var = gt0.a;
            fVarS.X(-1115954346);
            if (q1Var.a) {
                fVarS.X(-1115956238);
                androidx.compose.ui.l lVarE = SizeKt.e(jVar, 126);
                um4 um4VarD = k90.d(sc.a.f, false);
                int iHashCode2 = Long.hashCode(fVarS.E());
                xn5 xn5VarI2 = fVarS.I();
                androidx.compose.ui.l lVarC2 = ComposedModifierKt.c(fVarS, lVarE);
                if (fVarS.z() == null) {
                    fx0.a();
                    throw null;
                }
                fVarS.v();
                if (fVarS.o()) {
                    fVarS.O(mn2Var);
                } else {
                    fVarS.K();
                }
                qr8.c(fVarS, co2Var, um4VarD);
                qr8.c(fVarS, co2Var2, xn5VarI2);
                qr8.c(fVarS, co2Var3, Integer.valueOf(iHashCode2));
                qr8.b(fVarS, on2Var3);
                qr8.c(fVarS, co2Var4, lVarC2);
                p90 p90Var = p90.a;
                z26.a(null, is0.d(4294956651L), 0.0f, 0L, 0, 0.0f, fVarS, 48, 61);
                fVarS.U();
                fVarS.F(iD);
                androidx.compose.runtime.l0 l0VarA = fVarS.A();
                if (l0VarA != null) {
                    final int i5 = 1;
                    l0VarA.d = new co2(q1Var, o1Var, on2Var, i, i5) { // from class: com.polestar.domultiple.components.ui.c1
                        public final /* synthetic */ int a;
                        public final /* synthetic */ q1 b;
                        public final /* synthetic */ o1 c;
                        public final /* synthetic */ on2 d;

                        {
                            this.a = i5;
                        }

                        @Override // io.co2
                        public final Object invoke(Object obj, Object obj2) {
                            int i6 = this.a;
                            androidx.compose.runtime.f fVar2 = (androidx.compose.runtime.f) obj;
                            ((Integer) obj2).getClass();
                            switch (i6) {
                                case 0:
                                    int iA = xc6.a(1);
                                    m1.g(this.b, this.c, this.d, fVar2, iA);
                                    break;
                                case 1:
                                    int iA2 = xc6.a(1);
                                    m1.g(this.b, this.c, this.d, fVar2, iA2);
                                    break;
                                default:
                                    int iA3 = xc6.a(1);
                                    m1.g(this.b, this.c, this.d, fVar2, iA3);
                                    break;
                            }
                            return up8.a;
                        }
                    };
                    return;
                }
                return;
            }
            fVarS.X(-1145320027);
            fVarS.M();
            if (q1Var.b) {
                fVarS.X(-1115617935);
                String strA = tp7.a(R.string.vip_plan_load_failed, fVarS);
                androidx.compose.ui.l lVarJ = vg5.j(SizeKt.e(jVar, 74), 0.0f, 24, 0.0f, 0.0f, 13);
                long jD = is0.d(4290305515L);
                long jC = y88.c(14);
                z08.b.getClass();
                w68.b(strA, lVarJ, jD, jC, null, 0L, new z08(z08.e), 0L, 0, false, 0, 0, null, fVarS, 25008, 0, 261096);
                fVarS.F(iD);
                androidx.compose.runtime.l0 l0VarA2 = fVarS.A();
                if (l0VarA2 != null) {
                    final int i6 = 2;
                    l0VarA2.d = new co2(q1Var, o1Var, on2Var, i, i6) { // from class: com.polestar.domultiple.components.ui.c1
                        public final /* synthetic */ int a;
                        public final /* synthetic */ q1 b;
                        public final /* synthetic */ o1 c;
                        public final /* synthetic */ on2 d;

                        {
                            this.a = i6;
                        }

                        @Override // io.co2
                        public final Object invoke(Object obj, Object obj2) {
                            int i7 = this.a;
                            androidx.compose.runtime.f fVar2 = (androidx.compose.runtime.f) obj;
                            ((Integer) obj2).getClass();
                            switch (i7) {
                                case 0:
                                    int iA = xc6.a(1);
                                    m1.g(this.b, this.c, this.d, fVar2, iA);
                                    break;
                                case 1:
                                    int iA2 = xc6.a(1);
                                    m1.g(this.b, this.c, this.d, fVar2, iA2);
                                    break;
                                default:
                                    int iA3 = xc6.a(1);
                                    m1.g(this.b, this.c, this.d, fVar2, iA3);
                                    break;
                            }
                            return up8.a;
                        }
                    };
                    return;
                }
                return;
            }
            on2Var2 = on2Var;
            q1Var2 = q1Var;
            fVarS.X(-1145320027);
            fVarS.M();
            fVarS.X(379667773);
            int i7 = 0;
            for (Object obj : q1Var2.c) {
                int i8 = i7 + 1;
                if (i7 < 0) {
                    kotlin.collections.i.S();
                    throw null;
                }
                p1 p1Var = (p1) obj;
                boolean z = i7 == q1Var2.d ? i4 : 0;
                int i9 = ((i3 & 896) == 256 ? i4 : 0) | (fVarS.k(i7) ? 1 : 0);
                Object objH = fVarS.h();
                if (i9 == 0) {
                    androidx.compose.runtime.f.a.getClass();
                    if (objH == androidx.compose.runtime.f.a.b) {
                        i2 = i4;
                        objH = new k07(on2Var2, i7, i2);
                        fVarS.N(objH);
                    } else {
                        i2 = i4;
                    }
                } else {
                    i2 = i4;
                    objH = new k07(on2Var2, i7, i2);
                    fVarS.N(objH);
                }
                i(p1Var, o1Var, z, (mn2) objH, fVarS, i3 & 112);
                i7 = i8;
                i4 = i2;
            }
            fVarS.M();
            fVarS.M();
            fVarS.U();
            gc5 gc5Var2 = androidx.compose.runtime.g.a;
        } else {
            q1Var2 = q1Var;
            on2Var2 = on2Var;
            fVarS.D();
        }
        androidx.compose.runtime.l0 l0VarA3 = fVarS.A();
        if (l0VarA3 != null) {
            final int i10 = 0;
            final q1 q1Var3 = q1Var2;
            final on2<? super Integer, up8> on2Var4 = on2Var2;
            l0VarA3.d = new co2(q1Var3, o1Var, on2Var4, i, i10) { // from class: com.polestar.domultiple.components.ui.c1
                public final /* synthetic */ int a;
                public final /* synthetic */ q1 b;
                public final /* synthetic */ o1 c;
                public final /* synthetic */ on2 d;

                {
                    this.a = i10;
                }

                @Override // io.co2
                public final Object invoke(Object obj2, Object obj3) {
                    int i11 = this.a;
                    androidx.compose.runtime.f fVar2 = (androidx.compose.runtime.f) obj2;
                    ((Integer) obj3).getClass();
                    switch (i11) {
                        case 0:
                            int iA = xc6.a(1);
                            m1.g(this.b, this.c, this.d, fVar2, iA);
                            break;
                        case 1:
                            int iA2 = xc6.a(1);
                            m1.g(this.b, this.c, this.d, fVar2, iA2);
                            break;
                        default:
                            int iA3 = xc6.a(1);
                            m1.g(this.b, this.c, this.d, fVar2, iA3);
                            break;
                    }
                    return up8.a;
                }
            };
        }
    }

    @tv0
    @dx0
    public static final void h(final p1 p1Var, final boolean z, androidx.compose.runtime.f fVar, final int i) {
        androidx.compose.runtime.f fVar2;
        androidx.compose.runtime.f fVarS = fVar.s(-90287520);
        int i2 = (fVarS.W(p1Var) ? 4 : 2) | i | (fVarS.e(z) ? 32 : 16);
        if (fVarS.L(i2 & 1, (i2 & 19) != 18)) {
            gc5 gc5Var = androidx.compose.runtime.g.a;
            if (p1Var.d != null) {
                fVarS.X(-1105817714);
                androidx.compose.ui.l.a aVar = androidx.compose.ui.l.Oo;
                float f = z ? 92 : 100;
                nq1.a aVar2 = nq1.b;
                float f2 = 5;
                androidx.compose.ui.l lVarA = jp0.a(SizeKt.e(SizeKt.r(aVar, f), z ? 44 : 52), fo6.a(f2));
                ab0.a aVar3 = ab0.a;
                List listF = kotlin.collections.i.F(new ds0(is0.d(4294294575L)), new ds0(is0.d(4294963368L)), new ds0(is0.d(4291923991L)));
                xa8.a.getClass();
                aVar3.getClass();
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
                x85.a aVar4 = x85.b;
                androidx.compose.ui.l lVarA2 = BackgroundKt.a(lVarA, new ob4(listF, null, jFloatToRawIntBits, (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), 0));
                if (z) {
                    f2 = 4;
                }
                androidx.compose.ui.l lVarH = vg5.h(lVarA2, 0.0f, f2, 1);
                sc.a.getClass();
                z30.a aVar5 = sc.a.o;
                androidx.compose.foundation.layout.c.a.getClass();
                androidx.compose.foundation.layout.e eVarA = androidx.compose.foundation.layout.d.a(androidx.compose.foundation.layout.c.e, aVar5, fVarS, 54);
                int iHashCode = Long.hashCode(fVarS.E());
                xn5 xn5VarI = fVarS.I();
                androidx.compose.ui.l lVarC = ComposedModifierKt.c(fVarS, lVarH);
                ComposeUiNode.Qo.getClass();
                mn2<ComposeUiNode> mn2Var = ComposeUiNode.Companion.b;
                if (fVarS.z() == null) {
                    fx0.a();
                    throw null;
                }
                fVarS.v();
                if (fVarS.o()) {
                    fVarS.O(mn2Var);
                } else {
                    fVarS.K();
                }
                qr8.c(fVarS, ComposeUiNode.Companion.f, eVarA);
                qr8.c(fVarS, ComposeUiNode.Companion.e, xn5VarI);
                qr8.c(fVarS, ComposeUiNode.Companion.g, Integer.valueOf(iHashCode));
                qr8.b(fVarS, ComposeUiNode.Companion.h);
                qr8.c(fVarS, ComposeUiNode.Companion.d, lVarC);
                gt0 gt0Var = gt0.a;
                String strA = tp7.a(R.string.vip_best_value_caps, fVarS);
                long jD = is0.d(4279308561L);
                long jC = y88.c(z ? 8 : 9);
                long jC2 = z ? y88.c(10) : y88.c(11);
                androidx.compose.ui.text.font.d0.b.getClass();
                androidx.compose.ui.text.font.d0 d0Var = androidx.compose.ui.text.font.d0.i;
                q78.a.getClass();
                int i3 = q78.c;
                w68.b(strA, null, jD, jC, d0Var, 0L, null, jC2, i3, false, 1, 0, null, fVarS, 1573248, 24960, 239530);
                oi7.a(fVarS, SizeKt.e(aVar, 1));
                w68.b(p1Var.d, null, is0.d(4279308561L), z ? y88.c(11) : y88.c(12), d0Var, 0L, null, z ? y88.c(13) : y88.c(14), i3, false, 1, 0, null, fVarS, 1573248, 24960, 239530);
                fVar2 = fVarS;
                fVar2.U();
                fVar2.M();
            } else {
                fVar2 = fVarS;
                if (p1Var.c != null) {
                    fVar2.X(-1104270194);
                    androidx.compose.ui.l.a aVar6 = androidx.compose.ui.l.Oo;
                    float f3 = z ? 78 : 84;
                    nq1.a aVar7 = nq1.b;
                    androidx.compose.ui.l lVarB = BackgroundKt.b(jp0.a(SizeKt.e(SizeKt.r(aVar6, f3), z ? 32 : 36), fo6.a(4)), is0.d(4292472566L), androidx.compose.ui.graphics.y.a);
                    sc.a.getClass();
                    um4 um4VarD = k90.d(sc.a.f, false);
                    int iHashCode2 = Long.hashCode(fVar2.E());
                    xn5 xn5VarI2 = fVar2.I();
                    androidx.compose.ui.l lVarC2 = ComposedModifierKt.c(fVar2, lVarB);
                    ComposeUiNode.Qo.getClass();
                    mn2<ComposeUiNode> mn2Var2 = ComposeUiNode.Companion.b;
                    if (fVar2.z() == null) {
                        fx0.a();
                        throw null;
                    }
                    fVar2.v();
                    if (fVar2.o()) {
                        fVar2.O(mn2Var2);
                    } else {
                        fVar2.K();
                    }
                    qr8.c(fVar2, ComposeUiNode.Companion.f, um4VarD);
                    qr8.c(fVar2, ComposeUiNode.Companion.e, xn5VarI2);
                    qr8.c(fVar2, ComposeUiNode.Companion.g, Integer.valueOf(iHashCode2));
                    qr8.b(fVar2, ComposeUiNode.Companion.h);
                    qr8.c(fVar2, ComposeUiNode.Companion.d, lVarC2);
                    p90 p90Var = p90.a;
                    long jD2 = is0.d(4279208369L);
                    long jC3 = z ? y88.c(12) : y88.c(13);
                    androidx.compose.ui.text.font.d0.b.getClass();
                    androidx.compose.ui.text.font.d0 d0Var2 = androidx.compose.ui.text.font.d0.i;
                    q78.a.getClass();
                    w68.b(p1Var.c, null, jD2, jC3, d0Var2, 0L, null, 0L, q78.c, false, 1, 0, null, fVar2, 1573248, 24960, 241578);
                    fVar2 = fVar2;
                    fVar2.U();
                } else {
                    fVar2.X(-1140924222);
                }
                fVar2.M();
            }
        } else {
            fVar2 = fVarS;
            fVar2.D();
        }
        androidx.compose.runtime.l0 l0VarA = fVar2.A();
        if (l0VarA != null) {
            l0VarA.d = new co2(z, i) { // from class: com.polestar.domultiple.components.ui.i1
                public final /* synthetic */ boolean b;

                @Override // io.co2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = xc6.a(1);
                    m1.h(this.a, this.b, (androidx.compose.runtime.f) obj, iA);
                    return up8.a;
                }
            };
        }
    }

    @tv0
    @dx0
    public static final void i(final p1 p1Var, o1 o1Var, final boolean z, final mn2<up8> mn2Var, androidx.compose.runtime.f fVar, final int i) {
        final o1 o1Var2 = o1Var;
        androidx.compose.runtime.f fVarS = fVar.s(1631889475);
        int i2 = i | (fVarS.W(p1Var) ? 4 : 2) | (fVarS.W(o1Var2) ? 32 : 16) | (fVarS.e(z) ? 256 : 128) | (fVarS.n(mn2Var) ? 2048 : 1024);
        if (fVarS.L(1 & i2, (i2 & 1171) != 1170)) {
            gc5 gc5Var = androidx.compose.runtime.g.a;
            long jD = z ? is0.d(4294956651L) : is0.b(452984831);
            androidx.compose.ui.l.a aVar = androidx.compose.ui.l.Oo;
            androidx.compose.foundation.layout.j jVar = SizeKt.a;
            aVar.getClass();
            androidx.compose.ui.l lVarJ = vg5.j(SizeKt.e(jVar, o1Var2.p), 0.0f, 0.0f, 0.0f, o1Var2.q, 7);
            float f = 8;
            nq1.a aVar2 = nq1.b;
            androidx.compose.ui.l lVarA = p08.a(vg5.h(androidx.compose.foundation.o.c(BackgroundKt.b(jp0.a(lVarJ, fo6.a(f)), is0.d(z ? 4294573053L : 3942251517L), androidx.compose.ui.graphics.y.a).Z(new o70(2, new xh7(jD), fo6.a(f))), false, null, mn2Var, 15), 12, 0.0f, 2), "vip_plan_card");
            sc.a.getClass();
            z30.b bVar = sc.a.l;
            androidx.compose.foundation.layout.c.a.getClass();
            androidx.compose.foundation.layout.y yVarA = androidx.compose.foundation.layout.x.a(androidx.compose.foundation.layout.c.b, bVar, fVarS, 48);
            int iHashCode = Long.hashCode(fVarS.E());
            xn5 xn5VarI = fVarS.I();
            androidx.compose.ui.l lVarC = ComposedModifierKt.c(fVarS, lVarA);
            ComposeUiNode.Qo.getClass();
            mn2<ComposeUiNode> mn2Var2 = ComposeUiNode.Companion.b;
            if (fVarS.z() == null) {
                fx0.a();
                throw null;
            }
            fVarS.v();
            if (fVarS.o()) {
                fVarS.O(mn2Var2);
            } else {
                fVarS.K();
            }
            co2<ComposeUiNode, um4, up8> co2Var = ComposeUiNode.Companion.f;
            qr8.c(fVarS, co2Var, yVarA);
            co2<ComposeUiNode, ez0, up8> co2Var2 = ComposeUiNode.Companion.e;
            qr8.c(fVarS, co2Var2, xn5VarI);
            Integer numValueOf = Integer.valueOf(iHashCode);
            co2<ComposeUiNode, Integer, up8> co2Var3 = ComposeUiNode.Companion.g;
            qr8.c(fVarS, co2Var3, numValueOf);
            on2<ComposeUiNode, up8> on2Var = ComposeUiNode.Companion.h;
            qr8.b(fVarS, on2Var);
            co2<ComposeUiNode, androidx.compose.ui.l, up8> co2Var4 = ComposeUiNode.Companion.d;
            qr8.c(fVarS, co2Var4, lVarC);
            qo6 qo6Var = qo6.a;
            ja6 ja6Var = ja6.a;
            long jD2 = is0.d(4279208369L);
            long jD3 = is0.d(4286812828L);
            ja6Var.getClass();
            ds0.b.getClass();
            long j = ds0.h;
            sl4.a.getClass();
            vs0 vs0VarA = sl4.a(fVarS);
            ia6 ia6Var = vs0VarA.a0;
            if (ia6Var == null) {
                ma6.a.getClass();
                ia6Var = new ia6(ws0.b(vs0VarA, ma6.e), ws0.b(vs0VarA, ma6.g), ds0.b(0.38f, ws0.b(vs0VarA, ma6.b)), ds0.b(0.38f, ws0.b(vs0VarA, ma6.c)));
                vs0VarA.a0 = ia6Var;
            }
            la6.a(z, mn2Var, null, false, new ia6(jD2 != 16 ? jD2 : ia6Var.a, jD3 != r3 ? jD3 : ia6Var.b, j != 16 ? j : ia6Var.c, j != 16 ? j : ia6Var.d), fVarS, (i2 >> 6) & 126);
            androidx.compose.ui.l lVarH = vg5.h(qo6Var.a(aVar, 1.0f), 6, 0.0f, 2);
            androidx.compose.foundation.layout.e eVarA = androidx.compose.foundation.layout.d.a(androidx.compose.foundation.layout.c.e, sc.a.n, fVarS, 6);
            int iHashCode2 = Long.hashCode(fVarS.E());
            xn5 xn5VarI2 = fVarS.I();
            androidx.compose.ui.l lVarC2 = ComposedModifierKt.c(fVarS, lVarH);
            if (fVarS.z() == null) {
                fx0.a();
                throw null;
            }
            fVarS.v();
            if (fVarS.o()) {
                fVarS.O(mn2Var2);
            } else {
                fVarS.K();
            }
            qr8.c(fVarS, co2Var, eVarA);
            qr8.c(fVarS, co2Var2, xn5VarI2);
            qr8.c(fVarS, co2Var3, Integer.valueOf(iHashCode2));
            qr8.b(fVarS, on2Var);
            qr8.c(fVarS, co2Var4, lVarC2);
            gt0 gt0Var = gt0.a;
            String str = p1Var.a;
            long jD4 = is0.d(4278723386L);
            androidx.compose.ui.text.font.d0.b.getClass();
            androidx.compose.ui.text.font.d0 d0Var = androidx.compose.ui.text.font.d0.i;
            q78.a.getClass();
            int i3 = q78.c;
            o1Var2 = o1Var;
            w68.b(str, null, jD4, o1Var2.r, d0Var, 0L, null, 0L, i3, false, 1, 0, null, fVarS, 1573248, 24960, 241578);
            w68.b(p1Var.b, null, is0.d(4284179824L), o1Var2.s, null, 0L, null, 0L, i3, false, 1, 0, null, fVarS, 384, 24960, 241642);
            fVarS = fVarS;
            fVarS.U();
            h(p1Var, o1Var2.a, fVarS, i2 & 14);
            fVarS.U();
        } else {
            fVarS.D();
        }
        androidx.compose.runtime.l0 l0VarA = fVarS.A();
        if (l0VarA != null) {
            l0VarA.d = new co2(o1Var2, z, mn2Var, i) { // from class: com.polestar.domultiple.components.ui.g1
                public final /* synthetic */ o1 b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ mn2 d;

                @Override // io.co2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = xc6.a(1);
                    boolean z2 = this.c;
                    mn2 mn2Var3 = this.d;
                    m1.i(this.a, this.b, z2, mn2Var3, (androidx.compose.runtime.f) obj, iA);
                    return up8.a;
                }
            };
        }
    }

    @tv0
    @dx0
    public static final void j(o1 o1Var, androidx.compose.runtime.f fVar, int i) {
        androidx.compose.runtime.f fVar2;
        androidx.compose.runtime.f fVarS = fVar.s(-1634027779);
        int i2 = (fVarS.W(o1Var) ? 4 : 2) | i;
        if (fVarS.L(1 & i2, (i2 & 3) != 2)) {
            gc5 gc5Var = androidx.compose.runtime.g.a;
            androidx.compose.ui.l.a aVar = androidx.compose.ui.l.Oo;
            androidx.compose.foundation.layout.j jVar = SizeKt.a;
            aVar.Z(jVar);
            androidx.compose.ui.l lVarJ = vg5.j(jVar, 0.0f, o1Var.c, 0.0f, o1Var.d, 5);
            androidx.compose.foundation.layout.c.a.getClass();
            androidx.compose.foundation.layout.c.m mVar = androidx.compose.foundation.layout.c.d;
            sc.a.getClass();
            androidx.compose.foundation.layout.e eVarA = androidx.compose.foundation.layout.d.a(mVar, sc.a.n, fVarS, 0);
            int iHashCode = Long.hashCode(fVarS.E());
            xn5 xn5VarI = fVarS.I();
            androidx.compose.ui.l lVarC = ComposedModifierKt.c(fVarS, lVarJ);
            ComposeUiNode.Qo.getClass();
            mn2<ComposeUiNode> mn2Var = ComposeUiNode.Companion.b;
            if (fVarS.z() == null) {
                fx0.a();
                throw null;
            }
            fVarS.v();
            if (fVarS.o()) {
                fVarS.O(mn2Var);
            } else {
                fVarS.K();
            }
            qr8.c(fVarS, ComposeUiNode.Companion.f, eVarA);
            qr8.c(fVarS, ComposeUiNode.Companion.e, xn5VarI);
            qr8.c(fVarS, ComposeUiNode.Companion.g, Integer.valueOf(iHashCode));
            qr8.b(fVarS, ComposeUiNode.Companion.h);
            qr8.c(fVarS, ComposeUiNode.Companion.d, lVarC);
            gt0 gt0Var = gt0.a;
            f(o1Var, fVarS, i2 & 14);
            String strA = tp7.a(R.string.vip_paywall_subtitle, fVarS);
            nq1.a aVar2 = nq1.b;
            androidx.compose.ui.l lVarG = vg5.g(jVar, 28, o1Var.i);
            long jD = is0.d(4291290858L);
            androidx.compose.ui.text.font.d0.b.getClass();
            androidx.compose.ui.text.font.d0 d0Var = androidx.compose.ui.text.font.d0.g;
            z08.b.getClass();
            fVar2 = fVarS;
            w68.b(strA, lVarG, jD, o1Var.g, d0Var, 0L, new z08(z08.e), o1Var.h, 0, false, 0, 0, null, fVar2, 1573248, 0, 258984);
            fVar2.U();
        } else {
            fVar2 = fVarS;
            fVar2.D();
        }
        androidx.compose.runtime.l0 l0VarA = fVar2.A();
        if (l0VarA != null) {
            l0VarA.d = new f1(o1Var, i, 0);
        }
    }

    @tv0
    @dx0
    public static final void k(final q1 q1Var, final mn2<up8> mn2Var, final on2<? super Integer, up8> on2Var, final mn2<up8> mn2Var2, final mn2<up8> mn2Var3, final mn2<up8> mn2Var4, androidx.compose.runtime.f fVar, final int i) {
        androidx.compose.runtime.f fVarS = fVar.s(-295139324);
        int i2 = (fVarS.n(q1Var) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= fVarS.n(mn2Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fVarS.n(on2Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fVarS.n(mn2Var2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fVarS.n(mn2Var3) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fVarS.n(mn2Var4) ? 131072 : 65536;
        }
        if (fVarS.L(i2 & 1, (74899 & i2) != 74898)) {
            gc5 gc5Var = androidx.compose.runtime.g.a;
            androidx.compose.ui.l.a aVar = androidx.compose.ui.l.Oo;
            androidx.compose.foundation.layout.j jVar = SizeKt.a;
            aVar.getClass();
            r90.a(p08.a(BackgroundKt.a(SizeKt.c, ab0.a.a(ab0.a, kotlin.collections.i.F(new ds0(is0.d(4278720539L)), new ds0(is0.d(4279513910L)), new ds0(is0.d(4278719253L))))), "vip_paywall_root"), null, zv0.b(299313902, new eo2() { // from class: com.polestar.domultiple.components.ui.b1
                @Override // io.eo2
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    final o1 o1Var;
                    s90 s90Var = (s90) obj;
                    androidx.compose.runtime.f fVar2 = (androidx.compose.runtime.f) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    kk3.f(s90Var, "$this$BoxWithConstraints");
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= fVar2.W(s90Var) ? 4 : 2;
                    }
                    if (fVar2.L(iIntValue & 1, (iIntValue & 19) != 18)) {
                        gc5 gc5Var2 = androidx.compose.runtime.g.a;
                        if (nq1.a(s90Var.b(), 860) < 0) {
                            float f = 0;
                            float f2 = 8;
                            float f3 = 6;
                            o1Var = new o1(true, 156, f, f, y88.c(27), y88.c(31), y88.c(14), y88.c(18), 3, 76, 40, y88.c(12), y88.c(14), 1, 2, 68, f2, y88.c(17), y88.c(12), 52, y88.c(11), y88.c(15), f3, 28, f3, f3, 10, f2, f3);
                        } else {
                            float f4 = 2;
                            float f5 = 6;
                            float f6 = 4;
                            float f7 = 12;
                            float f8 = 8;
                            o1Var = new o1(false, 220, f4, f4, y88.c(31), y88.c(36), y88.c(16), y88.c(21), f5, 92, 56, y88.c(13), y88.c(16), f6, f4, 80, f7, y88.c(19), y88.c(14), 58, y88.c(12), y88.c(16), f8, 34, f8, f8, f7, f6, f5);
                        }
                        androidx.compose.ui.l.a aVar2 = androidx.compose.ui.l.Oo;
                        androidx.compose.foundation.layout.j jVar2 = SizeKt.a;
                        aVar2.getClass();
                        androidx.compose.ui.l lVarA = y69.a(SizeKt.c, InspectableValueKt.a, y69.a);
                        androidx.compose.foundation.layout.c.a.getClass();
                        androidx.compose.foundation.layout.c.m mVar = androidx.compose.foundation.layout.c.d;
                        sc.a.getClass();
                        androidx.compose.foundation.layout.e eVarA = androidx.compose.foundation.layout.d.a(mVar, sc.a.n, fVar2, 0);
                        int iHashCode = Long.hashCode(fVar2.E());
                        xn5 xn5VarI = fVar2.I();
                        androidx.compose.ui.l lVarC = ComposedModifierKt.c(fVar2, lVarA);
                        ComposeUiNode.Qo.getClass();
                        mn2<ComposeUiNode> mn2Var5 = ComposeUiNode.Companion.b;
                        if (fVar2.z() == null) {
                            fx0.a();
                            throw null;
                        }
                        fVar2.v();
                        if (fVar2.o()) {
                            fVar2.O(mn2Var5);
                        } else {
                            fVar2.K();
                        }
                        qr8.c(fVar2, ComposeUiNode.Companion.f, eVarA);
                        qr8.c(fVar2, ComposeUiNode.Companion.e, xn5VarI);
                        qr8.c(fVar2, ComposeUiNode.Companion.g, Integer.valueOf(iHashCode));
                        qr8.b(fVar2, ComposeUiNode.Companion.h);
                        qr8.c(fVar2, ComposeUiNode.Companion.d, lVarC);
                        androidx.compose.ui.l lVarA2 = gt0.a.a(aVar2, true);
                        final on2 on2Var2 = on2Var;
                        final mn2 mn2Var6 = mn2Var;
                        final q1 q1Var2 = q1Var;
                        r90.a(lVarA2, null, zv0.b(-1673030750, new eo2() { // from class: com.polestar.domultiple.components.ui.k1
                            @Override // io.eo2
                            public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                s90 s90Var2 = (s90) obj4;
                                androidx.compose.runtime.f fVar3 = (androidx.compose.runtime.f) obj5;
                                int iIntValue2 = ((Integer) obj6).intValue();
                                kk3.f(s90Var2, "$this$BoxWithConstraints");
                                if ((iIntValue2 & 6) == 0) {
                                    iIntValue2 |= fVar3.W(s90Var2) ? 4 : 2;
                                }
                                if (fVar3.L(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                    gc5 gc5Var3 = androidx.compose.runtime.g.a;
                                    androidx.compose.ui.l.a aVar3 = androidx.compose.ui.l.Oo;
                                    androidx.compose.foundation.layout.j jVar3 = SizeKt.a;
                                    aVar3.Z(jVar3);
                                    androidx.compose.ui.l lVarB = uv6.b(SizeKt.g(jVar3, s90Var2.b(), 0.0f, 2), uv6.a(fVar3), true);
                                    androidx.compose.foundation.layout.c.a.getClass();
                                    androidx.compose.foundation.layout.c.m mVar2 = androidx.compose.foundation.layout.c.d;
                                    sc.a.getClass();
                                    androidx.compose.foundation.layout.e eVarA2 = androidx.compose.foundation.layout.d.a(mVar2, sc.a.n, fVar3, 6);
                                    int iHashCode2 = Long.hashCode(fVar3.E());
                                    xn5 xn5VarI2 = fVar3.I();
                                    androidx.compose.ui.l lVarC2 = ComposedModifierKt.c(fVar3, lVarB);
                                    ComposeUiNode.Qo.getClass();
                                    mn2<ComposeUiNode> mn2Var7 = ComposeUiNode.Companion.b;
                                    if (fVar3.z() == null) {
                                        fx0.a();
                                        throw null;
                                    }
                                    fVar3.v();
                                    if (fVar3.o()) {
                                        fVar3.O(mn2Var7);
                                    } else {
                                        fVar3.K();
                                    }
                                    qr8.c(fVar3, ComposeUiNode.Companion.f, eVarA2);
                                    qr8.c(fVar3, ComposeUiNode.Companion.e, xn5VarI2);
                                    qr8.c(fVar3, ComposeUiNode.Companion.g, Integer.valueOf(iHashCode2));
                                    qr8.b(fVar3, ComposeUiNode.Companion.h);
                                    qr8.c(fVar3, ComposeUiNode.Companion.d, lVarC2);
                                    gt0 gt0Var = gt0.a;
                                    o1 o1Var2 = o1Var;
                                    m1.d(o1Var2, mn2Var6, fVar3, 0);
                                    oi7.a(fVar3, SizeKt.e(aVar3, o1Var2.A));
                                    m1.j(o1Var2, fVar3, 0);
                                    oi7.a(fVar3, SizeKt.e(aVar3, o1Var2.B));
                                    m1.b(o1Var2, fVar3, 0);
                                    oi7.a(fVar3, SizeKt.e(aVar3, o1Var2.C));
                                    m1.g(q1Var2, o1Var2, on2Var2, fVar3, 0);
                                    fVar3.U();
                                } else {
                                    fVar3.D();
                                }
                                return up8.a;
                            }
                        }, fVar2), fVar2, 3072);
                        m1.c(q1Var2, o1Var, mn2Var2, mn2Var3, mn2Var4, fVar2, 0);
                        fVar2.U();
                    } else {
                        fVar2.D();
                    }
                    return up8.a;
                }
            }, fVarS), fVarS, 3078);
        } else {
            fVarS.D();
        }
        androidx.compose.runtime.l0 l0VarA = fVarS.A();
        if (l0VarA != null) {
            l0VarA.d = new co2() { // from class: com.polestar.domultiple.components.ui.j1
                @Override // io.co2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = xc6.a(i | 1);
                    mn2 mn2Var5 = mn2Var3;
                    mn2 mn2Var6 = mn2Var4;
                    m1.k(q1Var, mn2Var, on2Var, mn2Var2, mn2Var5, mn2Var6, (androidx.compose.runtime.f) obj, iA);
                    return up8.a;
                }
            };
        }
    }

    @tv0
    @uv0
    public static final void l(ComposableLambdaImpl composableLambdaImpl, androidx.compose.runtime.f fVar, int i) {
        androidx.compose.runtime.f fVarS = fVar.s(-583365647);
        if (fVarS.L(1 & i, (i & 3) != 2)) {
            gc5 gc5Var = androidx.compose.runtime.g.a;
            long jD = is0.d(4294956651L);
            long jD2 = is0.d(4279247397L);
            ds0.b.getClass();
            long j = ds0.d;
            fn7 fn7Var = ws0.a;
            es0.a.getClass();
            wl4.b(new vs0(jD, es0.k, es0.z, es0.l, es0.f, es0.D, es0.o, es0.E, es0.p, es0.P, es0.t, es0.Q, es0.u, es0.b, es0.h, jD2, j, es0.O, es0.s, jD, es0.g, es0.e, es0.c, es0.i, es0.d, es0.j, es0.x, es0.y, es0.C, es0.H, es0.N, es0.I, es0.J, es0.K, es0.L, es0.M, es0.A, es0.B, es0.m, es0.n, es0.F, es0.G, es0.q, es0.r, es0.R, es0.S, es0.v, es0.w), null, null, composableLambdaImpl, fVarS, 3072);
        } else {
            fVarS.D();
        }
        androidx.compose.runtime.l0 l0VarA = fVarS.A();
        if (l0VarA != null) {
            l0VarA.d = new ex6(composableLambdaImpl, i, 2);
        }
    }
}
