package com.polestar.domultiple.components.ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import android.widget.Toast;
import com.polestar.clone.client.core.VirtualCore;
import com.polestar.clone.remote.InstalledAppInfo;
import io.ky5;
import io.pj4;
import io.zp6;
import p000do.multiple.cloner.R;

/* JADX INFO: compiled from: FeedbackActivity.java */
/* JADX INFO: loaded from: classes2.dex */
class o implements View.OnClickListener {
    public final /* synthetic */ FeedbackActivity a;

    public o(FeedbackActivity feedbackActivity) {
        this.a = feedbackActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        FeedbackActivity feedbackActivity = this.a;
        String string = feedbackActivity.D.getText().toString();
        if (string == null) {
            Toast.makeText(feedbackActivity.C, feedbackActivity.getResources().getString(R.string.feedback_no_description), 0).show();
            return;
        }
        Intent intent = new Intent("android.intent.action.SENDTO");
        intent.setData(Uri.parse("mailto:riverstone.app@gmail.com"));
        intent.putExtra("android.intent.extra.SUBJECT", "Feedback about DO Multiple Space");
        String strP = string + "\n\n\n\nAdditional Info for Debug: \nRating: " + feedbackActivity.G + "\nApp version: 4.40.01.0915\nModel info: " + Build.FINGERPRINT + "\nOS Version: " + Build.VERSION.SDK_INT + "\nLite Mode: " + ky5.f() + "\n";
        for (InstalledAppInfo installedAppInfo : VirtualCore.p.f()) {
            try {
                str = feedbackActivity.getPackageManager().getPackageInfo(installedAppInfo.a, 0).versionName;
            } catch (Exception unused) {
                str = "unknown";
            }
            strP = zp6.p(strP, "\n Clone: " + installedAppInfo.a + " version: " + str);
        }
        intent.putExtra("android.intent.extra.TEXT", strP);
        try {
            feedbackActivity.startActivity(intent);
        } catch (Exception unused2) {
            pj4.a("Start email activity fail!");
            Toast.makeText(feedbackActivity, feedbackActivity.getResources().getString(R.string.submit_success), 0).show();
        }
    }
}
