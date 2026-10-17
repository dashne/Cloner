package com.polestar.domultiple.components.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import io.pj4;
import io.u22;

/* JADX INFO: loaded from: classes2.dex */
public class ReferReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("com.android.vending.INSTALL_REFERRER")) {
            String stringExtra = intent.getStringExtra("referrer");
            if (stringExtra == null) {
                pj4.d("Install referrer extras are null");
                return;
            }
            Uri.parse(stringExtra);
            String[] strArrSplit = stringExtra.split("&");
            if (strArrSplit == null || strArrSplit.length == 0) {
                return;
            }
            for (String str : strArrSplit) {
                String[] strArrSplit2 = str.split("=");
                if (strArrSplit2 != null && strArrSplit2.length == 2) {
                    String str2 = strArrSplit2[0];
                    String str3 = strArrSplit2[1];
                    str2.getClass();
                    switch (str2) {
                        case "utm_content":
                            String str4 = strArrSplit2[1];
                            break;
                        case "utm_campaign":
                            String str5 = strArrSplit2[1];
                            break;
                        case "gclid":
                            String str6 = strArrSplit2[1];
                            break;
                        case "utm_term":
                            String str7 = strArrSplit2[1];
                            break;
                        case "utm_medium":
                            String str8 = strArrSplit2[1];
                            break;
                        case "utm_source":
                            String str9 = strArrSplit2[1];
                            break;
                    }
                }
            }
            u22.g(0L, 0L, "br", stringExtra);
        }
    }
}
