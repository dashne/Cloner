package com.polestar.domultiple.components.ui;

import android.R;
import android.app.Activity;
import android.content.Intent;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;
import com.polestar.domultiple.PolestarApp;
import com.polestar.domultiple.widget.BlueSwitch;
import com.polestar.domultiple.widget.PackageSwitchListAdapter;
import io.ki6;
import io.ko1;
import io.ky5;
import io.rq0;
import io.x40;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class LockSettingsActivity extends BaseActivity {
    public LockSettingsActivity C;
    public BlueSwitch D;
    public LinearLayout E;
    public ArrayList F;
    public ListView G;
    public Spinner H;
    public View I;
    public View J;
    public boolean K;
    public final long[] L = {5000, 15000, 30000, 60000, 900000, 1800000, 3600000};

    public static void F(Activity activity, String str) {
        Intent intent = new Intent(activity, (Class<?>) LockSettingsActivity.class);
        intent.putExtra("from", str);
        activity.startActivity(intent);
        activity.overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }

    public final void E(boolean z) {
        if (!z) {
            this.E.setVisibility(8);
            ky5.j(this, "encoded_pattern_pwd", ki6.m);
            ky5.g(this, "locker_feature_enabled", false);
        } else if (TextUtils.isEmpty(ky5.d(this.C, "encoded_pattern_pwd"))) {
            LockPasswordSettingActivity.E(this, true, null, 0);
            Toast.makeText(this, getString(p000do.multiple.cloner.R.string.no_password_set), 0).show();
        } else {
            this.E.setVisibility(0);
            ky5.g(this, "locker_feature_enabled", true);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 0) {
            return;
        }
        if (i2 == -1) {
            E(true);
            return;
        }
        if (i2 != 0) {
            return;
        }
        if (!ky5.a(this, "locker_feature_enabled", false) || TextUtils.isEmpty(ky5.d(this, "encoded_pattern_pwd"))) {
            E(false);
            this.D.setChecked(false);
        }
    }

    @Override // com.polestar.domultiple.components.ui.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(p000do.multiple.cloner.R.layout.activity_lock_settings);
        C(getResources().getString(p000do.multiple.cloner.R.string.lock_settings_title));
        this.C = this;
        this.E = (LinearLayout) findViewById(p000do.multiple.cloner.R.id.locker_detailed_settings);
        this.D = (BlueSwitch) findViewById(p000do.multiple.cloner.R.id.enable_lock_switch);
        this.H = (Spinner) findViewById(p000do.multiple.cloner.R.id.lock_interval_spinner);
        int i = 0;
        this.D.setChecked(ky5.a(this.C, "locker_feature_enabled", false));
        this.D.setOnClickListener(new l0(this));
        E(this.D.c);
        this.G = (ListView) findViewById(p000do.multiple.cloner.R.id.switch_lock_apps);
        Spinner spinner = this.H;
        long jC = ky5.c(PolestarApp.b, "relock_interval", 5000L);
        long[] jArr = this.L;
        int length = jArr.length;
        int i2 = 0;
        while (true) {
            if (i >= length) {
                i2 = -1;
                break;
            } else {
                if (jC == jArr[i]) {
                    break;
                }
                i2++;
                i++;
            }
        }
        spinner.setSelection(i2, true);
        this.H.setDropDownVerticalOffset(ko1.a(this, 15.0f));
        this.H.setOnItemSelectedListener(new m0(this));
        this.J = findViewById(p000do.multiple.cloner.R.id.fingerprint_settings);
        this.I = findViewById(p000do.multiple.cloner.R.id.fingerprint_line);
        FingerprintManager fingerprintManager = (FingerprintManager) getSystemService("fingerprint");
        if (fingerprintManager == null || !fingerprintManager.isHardwareDetected()) {
            this.I.setVisibility(8);
            this.J.setVisibility(8);
        }
        BlueSwitch blueSwitch = (BlueSwitch) this.J.findViewById(p000do.multiple.cloner.R.id.enable_fingerprint_switch);
        blueSwitch.setChecked(ky5.a(PolestarApp.b, "use_fingerprint", true));
        blueSwitch.setOnClickListener(new n0(blueSwitch));
        getIntent().getStringExtra("from");
        this.F = rq0.f(this).a;
        PackageSwitchListAdapter packageSwitchListAdapter = new PackageSwitchListAdapter(this);
        packageSwitchListAdapter.b = this.F;
        packageSwitchListAdapter.c = new j0(this);
        packageSwitchListAdapter.d = new k0();
        this.G.setAdapter((ListAdapter) packageSwitchListAdapter);
        ky5.g(PolestarApp.b, "has_enter_lock_settings", true);
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }

    public void onPasswordSettingClick(View view) {
        LockPasswordSettingActivity.E(this, true, null, 0);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        super.onPause();
        rq0.n();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (this.K) {
            this.K = false;
            x40.a().getClass();
            if (!x40.b()) {
                this.D.setChecked(false);
            } else {
                this.D.setChecked(true);
                E(true);
            }
        }
    }
}
