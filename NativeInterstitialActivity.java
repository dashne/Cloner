package com.polestar.domultiple.components.ui;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.Toast;
import io.bg6;
import io.f6;
import io.ie4;
import io.ko1;
import io.uo2;
import io.z5;
import p000do.multiple.cloner.R;

/* JADX INFO: loaded from: classes2.dex */
public class NativeInterstitialActivity extends Activity {
    public RelativeLayout a;
    public ProgressBar b;
    public uo2 c;
    public LinearLayout d;
    public boolean e = false;
    public final Handler f = new a(Looper.getMainLooper());

    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what != 1) {
                return;
            }
            NativeInterstitialActivity nativeInterstitialActivity = NativeInterstitialActivity.this;
            nativeInterstitialActivity.e = true;
            Toast.makeText(nativeInterstitialActivity, nativeInterstitialActivity.getString(R.string.toast_no_lucky), 0).show();
            nativeInterstitialActivity.b.setVisibility(8);
            nativeInterstitialActivity.finish();
        }
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        this.e = true;
        super.onBackPressed();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("extra_ad_slot");
        if (stringExtra == null) {
            stringExtra = "slot_home_lucky";
        }
        f6.a(stringExtra);
        setContentView(R.layout.mobvista_native_interstitial);
        this.a = (RelativeLayout) findViewById(R.id.mobvista_interstitial_rl_close);
        this.b = (ProgressBar) findViewById(R.id.mobvista_interstitial_progress);
        this.d = (LinearLayout) findViewById(R.id.ad_container);
        this.b.setVisibility(0);
        long jB = bg6.b("config_lucky_timeout");
        Handler handler = this.f;
        Message messageObtainMessage = handler.obtainMessage(1);
        if (jB == 0) {
            jB = 30000;
        }
        handler.sendMessageDelayed(messageObtainMessage, jB);
        this.a.setOnClickListener(new o0(this));
        uo2 uo2VarE = uo2.e(this, stringExtra);
        this.c = uo2VarE;
        uo2VarE.g = new z5(Math.max(280, (ko1.c(this, ko1.b(this)) * 9) / 10), 320);
        ie4 ie4Var = new ie4();
        ie4Var.b = 2L;
        ie4Var.a = 2000L;
        ie4Var.c = 5000L;
        ie4Var.d = uo2.B;
        this.c.l(this, 2, 2000L, new p0(this));
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        finish();
    }
}
