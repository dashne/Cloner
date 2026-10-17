package com.polestar.domultiple.components.ui;

import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import p000do.multiple.cloner.R;

/* JADX INFO: loaded from: classes2.dex */
public class FeedbackActivity extends BaseActivity {
    public static final /* synthetic */ int H = 0;
    public FeedbackActivity C;
    public EditText D;
    public Button E;
    public TextView F;
    public int G;

    @Override // com.polestar.domultiple.components.ui.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_feedback);
        this.G = getIntent().getIntExtra("extra_rating", 0);
        this.C = this;
        C(getString(R.string.feedback));
        this.D = (EditText) findViewById(R.id.et_feedback);
        this.E = (Button) findViewById(R.id.bt_submit);
        this.F = (TextView) findViewById(R.id.tv_go_faq);
        this.E.setEnabled(false);
        SpannableString spannableString = new SpannableString(getString(R.string.feedback_go_faq));
        spannableString.setSpan(new m(this), spannableString.length() - 4, spannableString.length() - 1, 33);
        this.F.setText(spannableString);
        this.F.setHighlightColor(0);
        this.F.setMovementMethod(LinkMovementMethod.getInstance());
        this.D.addTextChangedListener(new n(this));
        this.E.setOnClickListener(new o(this));
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }
}
