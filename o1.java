package com.polestar.domultiple.components.ui;

import io.b75;
import io.gg;
import io.nq1;
import io.q55;
import io.x88;
import io.xe9;
import kotlin.Metadata;

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
final class o1 {
    public final float A;
    public final float B;
    public final float C;
    public final boolean a;
    public final float b;
    public final float c;
    public final float d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final float i;
    public final float j;
    public final float k;
    public final long l;
    public final long m;
    public final float n;
    public final float o;
    public final float p;
    public final float q;
    public final long r;
    public final long s;
    public final float t;
    public final long u;
    public final long v;
    public final float w;
    public final float x;
    public final float y;
    public final float z;

    public o1(boolean z, float f, float f2, float f3, long j, long j2, long j3, long j4, float f4, float f5, float f6, long j5, long j6, float f7, float f8, float f9, float f10, long j7, long j8, float f11, long j9, long j10, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
        this.a = z;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = j4;
        this.i = f4;
        this.j = f5;
        this.k = f6;
        this.l = j5;
        this.m = j6;
        this.n = f7;
        this.o = f8;
        this.p = f9;
        this.q = f10;
        this.r = j7;
        this.s = j8;
        this.t = f11;
        this.u = j9;
        this.v = j10;
        this.w = f12;
        this.x = f13;
        this.y = f14;
        this.z = f15;
        this.A = f16;
        this.B = f17;
        this.C = f18;
    }

    public final boolean equals(@b75 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o1)) {
            return false;
        }
        o1 o1Var = (o1) obj;
        return this.a == o1Var.a && nq1.b(this.b, o1Var.b) && nq1.b(this.c, o1Var.c) && nq1.b(this.d, o1Var.d) && x88.a(this.e, o1Var.e) && x88.a(this.f, o1Var.f) && x88.a(this.g, o1Var.g) && x88.a(this.h, o1Var.h) && nq1.b(this.i, o1Var.i) && nq1.b(this.j, o1Var.j) && nq1.b(this.k, o1Var.k) && x88.a(this.l, o1Var.l) && x88.a(this.m, o1Var.m) && nq1.b(this.n, o1Var.n) && nq1.b(this.o, o1Var.o) && nq1.b(this.p, o1Var.p) && nq1.b(this.q, o1Var.q) && x88.a(this.r, o1Var.r) && x88.a(this.s, o1Var.s) && nq1.b(this.t, o1Var.t) && x88.a(this.u, o1Var.u) && x88.a(this.v, o1Var.v) && nq1.b(this.w, o1Var.w) && nq1.b(this.x, o1Var.x) && nq1.b(this.y, o1Var.y) && nq1.b(this.z, o1Var.z) && nq1.b(this.A, o1Var.A) && nq1.b(this.B, o1Var.B) && nq1.b(this.C, o1Var.C);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        nq1.a aVar = nq1.b;
        int iA = xe9.a(this.d, xe9.a(this.c, xe9.a(this.b, iHashCode, 31), 31), 31);
        x88.a aVar2 = x88.b;
        return Float.hashCode(this.C) + xe9.a(this.B, xe9.a(this.A, xe9.a(this.z, (Float.hashCode(this.y) + xe9.a(this.x, xe9.a(this.w, xe9.e(xe9.e(xe9.a(this.t, xe9.e(xe9.e(xe9.a(this.q, xe9.a(this.p, xe9.a(this.o, xe9.a(this.n, xe9.e(xe9.e(xe9.a(this.k, xe9.a(this.j, xe9.a(this.i, xe9.e(xe9.e(xe9.e(xe9.e(iA, 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31), 31), 31), 31, this.l), 31, this.m), 31), 31), 31), 31), 31, this.r), 31, this.s), 31), 31, this.u), 31, this.v), 31), 31)) * 31, 31), 31), 31);
    }

    @q55
    public final String toString() {
        StringBuilder sb = new StringBuilder("VipLayoutSpec(compact=");
        sb.append(this.a);
        sb.append(", heroHeight=");
        gg.o(this.b, sb, ", titleTopPadding=");
        gg.o(this.c, sb, ", titleBottomPadding=");
        gg.o(this.d, sb, ", titleFontSize=");
        gg.p(this.e, ", titleLineHeight=", sb);
        gg.p(this.f, ", subtitleFontSize=", sb);
        gg.p(this.g, ", subtitleLineHeight=", sb);
        gg.p(this.h, ", subtitleVerticalPadding=", sb);
        gg.o(this.i, sb, ", benefitHeight=");
        gg.o(this.j, sb, ", benefitIconSize=");
        gg.o(this.k, sb, ", benefitFontSize=");
        gg.p(this.l, ", benefitLineHeight=", sb);
        gg.p(this.m, ", benefitVerticalPadding=", sb);
        gg.o(this.n, sb, ", planAreaVerticalPadding=");
        gg.o(this.o, sb, ", planCardHeight=");
        gg.o(this.p, sb, ", planCardGap=");
        gg.o(this.q, sb, ", planPriceFontSize=");
        gg.p(this.r, ", planSubtitleFontSize=", sb);
        gg.p(this.s, ", ctaHeight=", sb);
        gg.o(this.t, sb, ", legalFontSize=");
        gg.p(this.u, ", legalLineHeight=", sb);
        gg.p(this.v, ", legalTopPadding=", sb);
        gg.o(this.w, sb, ", legalLinkHeight=");
        gg.o(this.x, sb, ", bottomTopPadding=");
        gg.o(this.y, sb, ", bottomBottomPadding=");
        gg.o(this.z, sb, ", gapAfterHero=");
        gg.o(this.A, sb, ", gapAfterTitle=");
        gg.o(this.B, sb, ", gapAfterBenefits=");
        sb.append((Object) nq1.c(this.C));
        sb.append(')');
        return sb.toString();
    }
}
