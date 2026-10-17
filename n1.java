package com.polestar.domultiple.components.ui;

import io.b75;
import io.gg;
import io.ht1;
import io.q55;
import io.sp7;
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
final class n1 {
    public final int a;
    public final int b;

    public n1(@ht1 int i, @sp7 int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(@b75 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n1)) {
            return false;
        }
        n1 n1Var = (n1) obj;
        return this.a == n1Var.a && this.b == n1Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    @q55
    public final String toString() {
        StringBuilder sb = new StringBuilder("VipBenefitUi(iconRes=");
        sb.append(this.a);
        sb.append(", textRes=");
        return gg.m(sb, this.b, ')');
    }
}
