package com.polestar.domultiple.components.ui;

import android.app.Activity;
import android.content.Intent;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import com.polestar.domultiple.PolestarApp;
import com.polestar.domultiple.widget.locker.LockerView;
import io.ki6;
import io.ky5;
import p000do.multiple.cloner.R;

/* JADX INFO: loaded from: classes2.dex */
public class LockPasswordSettingActivity extends BaseActivity implements View.OnClickListener {
    public LockerView C;
    public ImageView E;
    public boolean D = false;
    public final LockerView.c F = new a();

    public class a implements LockerView.c {
        public a() {
        }

        @Override // com.polestar.domultiple.widget.locker.LockerView.c
        public final void a() {
            LockPasswordSettingActivity lockPasswordSettingActivity = LockPasswordSettingActivity.this;
            if (lockPasswordSettingActivity.D) {
                Toast.makeText(lockPasswordSettingActivity, R.string.password_set_complete, 0).show();
            }
            lockPasswordSettingActivity.setResult(-1);
            lockPasswordSettingActivity.finish();
        }
    }

    public class b extends FingerprintManager.AuthenticationCallback {
        public b() {
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public final void onAuthenticationError(int i, CharSequence charSequence) {
            if (i != 5) {
                Toast.makeText(LockPasswordSettingActivity.this, ki6.m + ((Object) charSequence), 0).show();
            }
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public final void onAuthenticationHelp(int i, CharSequence charSequence) {
            Toast.makeText(LockPasswordSettingActivity.this, ki6.m + ((Object) charSequence), 0).show();
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public final void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
            LockPasswordSettingActivity lockPasswordSettingActivity = LockPasswordSettingActivity.this;
            lockPasswordSettingActivity.setResult(-1);
            lockPasswordSettingActivity.finish();
        }
    }

    public static void E(Activity activity, boolean z, String str, int i) {
        Intent intent = new Intent(activity, (Class<?>) LockPasswordSettingActivity.class);
        intent.putExtra("launch_mode", z);
        if (str != null) {
            intent.putExtra("extra_title", str);
        }
        activity.startActivityForResult(intent, i);
        activity.overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
    }

    @Override // com.polestar.domultiple.components.ui.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        super.onBackPressed();
        setResult(0);
        finish();
    }

    @Override // com.polestar.domultiple.components.ui.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_applock_password);
        String stringExtra = getIntent().getStringExtra("extra_title");
        if (stringExtra == null) {
            stringExtra = getResources().getString(R.string.password_setting_title);
        }
        C(stringExtra);
        LockerView lockerView = (LockerView) findViewById(R.id.appLockScreenView);
        this.C = lockerView;
        lockerView.setOnUnlockListener(this.F);
        this.C.m.sendEmptyMessage(3);
        if (TextUtils.isEmpty(ky5.d(this, "encoded_pattern_pwd"))) {
            this.C.setResetStatus(true);
        } else {
            this.C.setIsWhiteBackground(true);
            this.C.setResetStatus(false);
        }
        this.C.a();
        this.E = (ImageView) findViewById(R.id.fingerprint_icon);
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        super.onPause();
        this.C.m.removeMessages(3);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        Intent intent = getIntent();
        if (intent != null) {
            if (intent.hasExtra("launch_mode")) {
                boolean booleanExtra = intent.getBooleanExtra("launch_mode", false);
                this.D = booleanExtra;
                this.C.setResetStatus(booleanExtra);
                if (this.D) {
                    this.E.setVisibility(4);
                }
            }
            if (intent.hasExtra("password_background")) {
                this.C.setIsWhiteBackground(intent.getBooleanExtra("password_background", true));
            }
            this.C.a();
            if (!ky5.a(PolestarApp.b, "use_fingerprint", true)) {
                this.E.setVisibility(4);
                return;
            }
            FingerprintManager fingerprintManager = (FingerprintManager) getSystemService("fingerprint");
            if (fingerprintManager != null && fingerprintManager.isHardwareDetected() && fingerprintManager.hasEnrolledFingerprints()) {
                fingerprintManager.authenticate(null, new CancellationSignal(), 0, new b(), null);
            } else {
                this.E.setVisibility(4);
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }
}
