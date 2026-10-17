package com.polestar.domultiple.components.ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import io.bg6;
import io.d75;
import io.st0;
import io.u22;
import p000do.multiple.cloner.R;

/* JADX INFO: loaded from: classes2.dex */
public class AboutActivity extends BaseActivity {
    public TextView C;

    public class a extends ClickableSpan {
        public a() {
        }

        @Override // android.text.style.ClickableSpan
        public final void onClick(View view) {
            AboutActivity.this.onTermsClick(view);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public final void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setColor(AboutActivity.this.getResources().getColor(R.color.about_text_light));
            textPaint.setUnderlineText(true);
        }
    }

    public class b extends ClickableSpan {
        public b() {
        }

        @Override // android.text.style.ClickableSpan
        public final void onClick(View view) {
            AboutActivity.this.onPrivacyPolicyClick(view);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public final void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setColor(AboutActivity.this.getResources().getColor(R.color.about_text_light));
            textPaint.setUnderlineText(true);
        }
    }

    public void onCheckUpdateClick(View view) {
        String strC = bg6.c("force_update_to");
        if (TextUtils.isEmpty(strC)) {
            st0.e(this, getPackageName());
        } else {
            st0.f(this, strC);
        }
    }

    @Override // com.polestar.domultiple.components.ui.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@d75 Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_about);
        C(getString(R.string.about));
        this.C = (TextView) findViewById(R.id.terms_txt);
        ((TextView) findViewById(R.id.version_info)).setText("Version 4.40.01.0915");
        SpannableString spannableString = new SpannableString(getString(R.string.settings_terms_text));
        spannableString.setSpan(new a(), 0, 16, 33);
        spannableString.setSpan(new b(), 21, spannableString.length(), 33);
        this.C.setText(spannableString);
        this.C.setHighlightColor(0);
        this.C.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public void onJoinUsClick(View view) {
        try {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://plus.google.com/communities/104830818454731991305")));
            u22.a("join_us_click");
        } catch (Exception unused) {
        }
    }

    public void onPrivacyPolicyClick(View view) {
        Intent intent = new Intent(this, (Class<?>) WebViewActivity.class);
        intent.putExtra("extra_title", getString(R.string.privacy_policy));
        intent.putExtra("extra_url", "file:///android_asset/privacy_policy.html");
        startActivity(intent);
    }

    public void onTermsClick(View view) {
        Intent intent = new Intent(this, (Class<?>) WebViewActivity.class);
        intent.putExtra("extra_title", getString(R.string.terms_of_service));
        intent.putExtra("extra_url", "file:///android_asset/term_of_service.html");
        startActivity(intent);
    }
}
