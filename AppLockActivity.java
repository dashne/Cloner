package com.polestar.domultiple.components.ui;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.hardware.fingerprint.FingerprintManager;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.polestar.clone.CustomizeAppData;
import com.polestar.clone.client.core.VirtualCore;
import com.polestar.domultiple.PolestarApp;
import com.polestar.domultiple.components.AppMonitorService;
import com.polestar.domultiple.widget.locker.BlurBackground;
import com.polestar.domultiple.widget.locker.LockIconImageView;
import com.polestar.domultiple.widget.locker.LockPatternView;
import io.bg6;
import io.ki6;
import io.ko1;
import io.ky5;
import io.qg4;
import io.rq0;
import io.u22;
import io.uo2;
import io.uq0;
import io.y5;
import io.z5;

/* JADX INFO: loaded from: classes2.dex */
public class AppLockActivity extends BaseActivity {
    public static final /* synthetic */ int P = 0;
    public BlurBackground C;
    public String D;
    public int E;
    public Handler F;
    public LockIconImageView G;
    public LinearLayout H;
    public ImageView I;
    public TextView J;
    public TextView K;
    public com.polestar.domultiple.widget.locker.b L = null;
    public FingerprintManager M;
    public CancellationSignal N;
    public boolean O;

    public class a extends FingerprintManager.AuthenticationCallback {

        /* JADX INFO: renamed from: com.polestar.domultiple.components.ui.AppLockActivity$a$a, reason: collision with other inner class name */
        public class RunnableC0227a implements Runnable {
            public RunnableC0227a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                AppLockActivity.this.finish();
            }
        }

        public a() {
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public final void onAuthenticationError(int i, CharSequence charSequence) {
            if (i != 5) {
                Toast.makeText(AppLockActivity.this, ki6.m + ((Object) charSequence), 0).show();
            }
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public final void onAuthenticationFailed() {
            AppLockActivity appLockActivity = AppLockActivity.this;
            appLockActivity.C.a(appLockActivity.H);
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public final void onAuthenticationHelp(int i, CharSequence charSequence) {
            Toast.makeText(AppLockActivity.this, ki6.m + ((Object) charSequence), 0).show();
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public final void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
            AppLockActivity appLockActivity = AppLockActivity.this;
            appLockActivity.F.postDelayed(new RunnableC0227a(), 200L);
            String str = appLockActivity.D;
            int i = appLockActivity.E;
            String str2 = AppMonitorService.c;
            AppMonitorService.c = rq0.g(i, str);
        }
    }

    @Override // com.polestar.domultiple.components.ui.BaseActivity
    public final boolean D() {
        return false;
    }

    public final void E() {
        if (this.F == null) {
            this.F = new Handler(Looper.getMainLooper());
        }
        this.D = getIntent().getStringExtra("android.intent.extra.PACKAGE_NAME");
        this.E = getIntent().getIntExtra("extra_clone_userid", 0);
        this.O = false;
    }

    public final void F() {
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
        setContentView(p000do.multiple.cloner.R.layout.applock_window_layout);
        this.C = (BlurBackground) findViewById(p000do.multiple.cloner.R.id.applock_window);
        com.polestar.domultiple.widget.locker.b bVar = new com.polestar.domultiple.widget.locker.b(this.C, new k(this));
        this.L = bVar;
        bVar.a();
        this.I = (ImageView) findViewById(p000do.multiple.cloner.R.id.lock_bar_icon);
        this.J = (TextView) findViewById(p000do.multiple.cloner.R.id.lock_bar_text);
        this.H = (LinearLayout) findViewById(p000do.multiple.cloner.R.id.layout_appinfo_container);
        this.G = (LockIconImageView) findViewById(p000do.multiple.cloner.R.id.window_applock_icon);
        this.K = (TextView) findViewById(p000do.multiple.cloner.R.id.window_applock_name);
        CustomizeAppData customizeAppDataB = CustomizeAppData.b(this.E, this.D);
        this.G.setImageBitmap(customizeAppDataB.a());
        if (customizeAppDataB.g) {
            this.K.setText(customizeAppDataB.e);
        } else {
            TextView textView = this.K;
            uq0 uq0VarE = rq0.f(PolestarApp.b).e(this.E, this.D);
            textView.setText(uq0VarE != null ? uq0VarE.d : null);
        }
        BlurBackground blurBackground = this.C;
        qg4 qg4Var = new qg4(blurBackground.getContext(), blurBackground);
        blurBackground.b = qg4Var;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) qg4Var.c.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        if (i < i2) {
            qg4Var.i = i2;
            qg4Var.h = i;
        } else {
            qg4Var.h = i2;
            qg4Var.i = i;
        }
        qg4Var.b();
        qg4 qg4Var2 = blurBackground.b;
        qg4Var2.v = true;
        qg4Var2.b();
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, -1157627904, 1426063360, Shader.TileMode.CLAMP);
        Paint paint = new Paint();
        qg4Var2.u = paint;
        paint.setDither(true);
        qg4Var2.u.setShader(linearGradient);
        this.C.b(this.E, this.D);
        com.polestar.domultiple.widget.locker.b bVar2 = this.L;
        bVar2.a.h();
        bVar2.a.setVisibility(0);
        LockPatternView lockPatternView = bVar2.a;
        if (lockPatternView != null) {
            lockPatternView.setInStealthMode(ky5.a(PolestarApp.b, "app_lock_invisible_pattern_path", false));
        }
    }

    @Override // com.polestar.domultiple.components.ui.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        this.C.a(this.H);
    }

    public void onGiftClick(View view) {
        Intent intent = new Intent(this, (Class<?>) NativeInterstitialActivity.class);
        intent.putExtra("extra_ad_slot", "slot_app_lock_lucky");
        startActivity(intent);
        ky5.i(this, "last_icon_ad_click", System.currentTimeMillis());
        u22.c("lock_icon_click");
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        E();
        F();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        super.onPause();
        CancellationSignal cancellationSignal = this.N;
        if (cancellationSignal != null && this.M != null) {
            cancellationSignal.cancel();
        }
        if (this.O) {
            System.currentTimeMillis();
        }
        finish();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        AppLockActivity appLockActivity;
        FingerprintManager fingerprintManager;
        super.onResume();
        E();
        F();
        if (ky5.e()) {
            appLockActivity = this;
        } else {
            uo2 uo2VarE = uo2.e(PolestarApp.b, "slot_app_lock");
            Context context = VirtualCore.p.e;
            uo2VarE.g = new z5(Math.max(280, (ko1.c(context, ko1.b(context)) * 9) / 10), y5.q);
            appLockActivity = this;
            uo2VarE.l(appLockActivity, 2, bg6.b("slot_app_lock_protect_time"), new j(this, uo2VarE));
        }
        ImageView imageView = (ImageView) findViewById(p000do.multiple.cloner.R.id.fingerprint_icon);
        imageView.setVisibility(8);
        appLockActivity.M = (FingerprintManager) getSystemService("fingerprint");
        appLockActivity.N = new CancellationSignal();
        if (ky5.a(PolestarApp.b, "use_fingerprint", true) && (fingerprintManager = appLockActivity.M) != null && fingerprintManager.isHardwareDetected() && appLockActivity.M.hasEnrolledFingerprints()) {
            imageView.setVisibility(0);
            appLockActivity.M.authenticate(null, appLockActivity.N, 0, new a(), null);
        }
    }
}
