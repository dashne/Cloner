package com.polestar.domultiple.components.ui;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.polestar.domultiple.widget.BlueSwitch;
import com.polestar.domultiple.widget.FixedListView;
import com.polestar.domultiple.widget.PackageSwitchListAdapter;
import io.ky5;
import io.rq0;
import java.util.ArrayList;
import p000do.multiple.cloner.R;

/* JADX INFO: loaded from: classes2.dex */
public class NotificationActivity extends BaseActivity {
    public BlueSwitch C;
    public FixedListView D;
    public PackageSwitchListAdapter E;
    public ArrayList F;
    public NotificationActivity G;
    public TextView H;

    @Override // com.polestar.domultiple.components.ui.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.notification_activity_layout);
        this.G = this;
        this.F = rq0.f(this).a;
        C(getString(R.string.notification));
        this.C = (BlueSwitch) findViewById(R.id.switch_notification);
        this.D = (FixedListView) findViewById(R.id.switch_notifications_apps);
        PackageSwitchListAdapter packageSwitchListAdapter = new PackageSwitchListAdapter(this.G);
        this.E = packageSwitchListAdapter;
        packageSwitchListAdapter.c = new q0(this);
        packageSwitchListAdapter.d = new r0();
        this.D.setAdapter((ListAdapter) packageSwitchListAdapter);
        this.E.b = this.F;
        this.C.setChecked(ky5.a(this.G, "notification_all", true));
        this.C.setOnClickListener(new s0(this));
        this.H = (TextView) findViewById(R.id.enable_per_app_txt);
        if (this.F.size() == 0) {
            this.H.setVisibility(4);
        }
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
