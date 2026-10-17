package com.polestar.domultiple.components.ui;

import android.os.Bundle;
import android.view.MenuItem;
import p000do.multiple.cloner.R;

/* JADX INFO: loaded from: classes2.dex */
public class FaqActivity extends BaseActivity {
    @Override // com.polestar.domultiple.components.ui.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.faq_activity_layout);
        C(getResources().getString(R.string.faq));
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
