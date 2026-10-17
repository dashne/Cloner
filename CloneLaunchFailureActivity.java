package com.polestar.domultiple.components.ui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ProgressBar;
import com.polestar.domultiple.components.ui.CloneLaunchFailureActivity;
import com.polestar.domultiple.components.ui.FeedbackActivity;
import com.polestar.domultiple.components.ui.HomeActivity;
import io.ki6;
import io.mq0;
import io.pj4;
import p000do.multiple.cloner.R;

/* JADX INFO: loaded from: classes2.dex */
public class CloneLaunchFailureActivity extends BaseActivity {
    public static final /* synthetic */ int N = 0;
    public String C;
    public int D;
    public boolean E;
    public boolean F;
    public View G;
    public View H;
    public Button I;
    public ProgressBar J;
    public View K;
    public View L;
    public final BroadcastReceiver M = new a();

    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (intent == null) {
                return;
            }
            String action = intent.getAction();
            if ("do.multiple.cloner.action.DISMISS_CLONE_LAUNCH_FAILURE".equals(action) || "do.multiple.cloner.action.CLONE_LAUNCH_SUCCESS".equals(action)) {
                String stringExtra = intent.getStringExtra("extra_clone_launch_package");
                CloneLaunchFailureActivity cloneLaunchFailureActivity = CloneLaunchFailureActivity.this;
                int intExtra = intent.getIntExtra("extra_clone_launch_user_id", cloneLaunchFailureActivity.D);
                if (TextUtils.equals(cloneLaunchFailureActivity.C, stringExtra) && cloneLaunchFailureActivity.D == intExtra) {
                    cloneLaunchFailureActivity.finish();
                }
            }
        }
    }

    @Override // com.polestar.domultiple.components.ui.BaseActivity
    public final boolean D() {
        return false;
    }

    public final void E(boolean z) {
        this.F = z;
        Button button = this.I;
        if (button != null) {
            button.setEnabled(!z);
            this.I.setText(z ? ki6.m : getString(R.string.clone_launch_retry));
        }
        ProgressBar progressBar = this.J;
        if (progressBar != null) {
            progressBar.setVisibility(z ? 0 : 8);
        }
        View view = this.H;
        if (view != null) {
            view.setEnabled(!z);
        }
        View view2 = this.K;
        if (view2 != null) {
            view2.setEnabled(!z);
        }
        View view3 = this.L;
        if (view3 != null) {
            view3.setEnabled(!z);
        }
    }

    @Override // com.polestar.domultiple.components.ui.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent != null) {
            this.C = intent.getStringExtra("extra_clone_launch_package");
            this.D = intent.getIntExtra("extra_clone_launch_user_id", this.D);
        }
        if (TextUtils.isEmpty(this.C)) {
            finish();
            return;
        }
        setContentView(R.layout.activity_clone_launch_failure);
        Window window = getWindow();
        if (window != null) {
            window.setGravity(80);
            window.setLayout(-1, -1);
        }
        this.G = findViewById(R.id.clone_launch_failure_root);
        View viewFindViewById = findViewById(R.id.clone_launch_failure_sheet);
        this.H = findViewById(R.id.btn_launch_failure_close);
        this.I = (Button) findViewById(R.id.btn_launch_retry);
        this.J = (ProgressBar) findViewById(R.id.progress_launch_retry);
        this.K = findViewById(R.id.btn_launch_back_home);
        this.L = findViewById(R.id.btn_launch_feedback);
        final int i = 0;
        this.G.setOnClickListener(new View.OnClickListener(this) { // from class: io.lq0
            public final /* synthetic */ CloneLaunchFailureActivity b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = 0;
                CloneLaunchFailureActivity cloneLaunchFailureActivity = this.b;
                switch (i) {
                    case 0:
                        if (!cloneLaunchFailureActivity.F) {
                            cloneLaunchFailureActivity.finish();
                        }
                        break;
                    case 1:
                        if (!cloneLaunchFailureActivity.F) {
                            cloneLaunchFailureActivity.finish();
                        }
                        break;
                    case 2:
                        if (!cloneLaunchFailureActivity.F) {
                            cloneLaunchFailureActivity.E(true);
                            u22.a("clone_launch_retry");
                            new Thread(new nq0(cloneLaunchFailureActivity, i2), "clone-launch-retry").start();
                            break;
                        }
                        break;
                    case 3:
                        int i3 = CloneLaunchFailureActivity.N;
                        u22.a("clone_launch_back_home");
                        int i4 = HomeActivity.k0;
                        Intent intent2 = new Intent(cloneLaunchFailureActivity, (Class<?>) HomeActivity.class);
                        intent2.putExtra("extra_need_update", false);
                        intent2.putExtra("From where", "From home");
                        cloneLaunchFailureActivity.startActivity(intent2);
                        cloneLaunchFailureActivity.overridePendingTransition(android.R.anim.fade_in, -1);
                        cloneLaunchFailureActivity.finish();
                        break;
                    default:
                        int i5 = CloneLaunchFailureActivity.N;
                        u22.a("clone_launch_feedback");
                        int i6 = FeedbackActivity.H;
                        Intent intent3 = new Intent(cloneLaunchFailureActivity, (Class<?>) FeedbackActivity.class);
                        intent3.putExtra("extra_rating", 0);
                        cloneLaunchFailureActivity.startActivity(intent3);
                        cloneLaunchFailureActivity.finish();
                        break;
                }
            }
        });
        viewFindViewById.setOnClickListener(new mq0());
        final int i2 = 1;
        this.H.setOnClickListener(new View.OnClickListener(this) { // from class: io.lq0
            public final /* synthetic */ CloneLaunchFailureActivity b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = 0;
                CloneLaunchFailureActivity cloneLaunchFailureActivity = this.b;
                switch (i2) {
                    case 0:
                        if (!cloneLaunchFailureActivity.F) {
                            cloneLaunchFailureActivity.finish();
                        }
                        break;
                    case 1:
                        if (!cloneLaunchFailureActivity.F) {
                            cloneLaunchFailureActivity.finish();
                        }
                        break;
                    case 2:
                        if (!cloneLaunchFailureActivity.F) {
                            cloneLaunchFailureActivity.E(true);
                            u22.a("clone_launch_retry");
                            new Thread(new nq0(cloneLaunchFailureActivity, i3), "clone-launch-retry").start();
                            break;
                        }
                        break;
                    case 3:
                        int i4 = CloneLaunchFailureActivity.N;
                        u22.a("clone_launch_back_home");
                        int i5 = HomeActivity.k0;
                        Intent intent2 = new Intent(cloneLaunchFailureActivity, (Class<?>) HomeActivity.class);
                        intent2.putExtra("extra_need_update", false);
                        intent2.putExtra("From where", "From home");
                        cloneLaunchFailureActivity.startActivity(intent2);
                        cloneLaunchFailureActivity.overridePendingTransition(android.R.anim.fade_in, -1);
                        cloneLaunchFailureActivity.finish();
                        break;
                    default:
                        int i6 = CloneLaunchFailureActivity.N;
                        u22.a("clone_launch_feedback");
                        int i7 = FeedbackActivity.H;
                        Intent intent3 = new Intent(cloneLaunchFailureActivity, (Class<?>) FeedbackActivity.class);
                        intent3.putExtra("extra_rating", 0);
                        cloneLaunchFailureActivity.startActivity(intent3);
                        cloneLaunchFailureActivity.finish();
                        break;
                }
            }
        });
        final int i3 = 2;
        this.I.setOnClickListener(new View.OnClickListener(this) { // from class: io.lq0
            public final /* synthetic */ CloneLaunchFailureActivity b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i4 = 0;
                CloneLaunchFailureActivity cloneLaunchFailureActivity = this.b;
                switch (i3) {
                    case 0:
                        if (!cloneLaunchFailureActivity.F) {
                            cloneLaunchFailureActivity.finish();
                        }
                        break;
                    case 1:
                        if (!cloneLaunchFailureActivity.F) {
                            cloneLaunchFailureActivity.finish();
                        }
                        break;
                    case 2:
                        if (!cloneLaunchFailureActivity.F) {
                            cloneLaunchFailureActivity.E(true);
                            u22.a("clone_launch_retry");
                            new Thread(new nq0(cloneLaunchFailureActivity, i4), "clone-launch-retry").start();
                            break;
                        }
                        break;
                    case 3:
                        int i5 = CloneLaunchFailureActivity.N;
                        u22.a("clone_launch_back_home");
                        int i6 = HomeActivity.k0;
                        Intent intent2 = new Intent(cloneLaunchFailureActivity, (Class<?>) HomeActivity.class);
                        intent2.putExtra("extra_need_update", false);
                        intent2.putExtra("From where", "From home");
                        cloneLaunchFailureActivity.startActivity(intent2);
                        cloneLaunchFailureActivity.overridePendingTransition(android.R.anim.fade_in, -1);
                        cloneLaunchFailureActivity.finish();
                        break;
                    default:
                        int i7 = CloneLaunchFailureActivity.N;
                        u22.a("clone_launch_feedback");
                        int i8 = FeedbackActivity.H;
                        Intent intent3 = new Intent(cloneLaunchFailureActivity, (Class<?>) FeedbackActivity.class);
                        intent3.putExtra("extra_rating", 0);
                        cloneLaunchFailureActivity.startActivity(intent3);
                        cloneLaunchFailureActivity.finish();
                        break;
                }
            }
        });
        final int i4 = 3;
        this.K.setOnClickListener(new View.OnClickListener(this) { // from class: io.lq0
            public final /* synthetic */ CloneLaunchFailureActivity b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i5 = 0;
                CloneLaunchFailureActivity cloneLaunchFailureActivity = this.b;
                switch (i4) {
                    case 0:
                        if (!cloneLaunchFailureActivity.F) {
                            cloneLaunchFailureActivity.finish();
                        }
                        break;
                    case 1:
                        if (!cloneLaunchFailureActivity.F) {
                            cloneLaunchFailureActivity.finish();
                        }
                        break;
                    case 2:
                        if (!cloneLaunchFailureActivity.F) {
                            cloneLaunchFailureActivity.E(true);
                            u22.a("clone_launch_retry");
                            new Thread(new nq0(cloneLaunchFailureActivity, i5), "clone-launch-retry").start();
                            break;
                        }
                        break;
                    case 3:
                        int i6 = CloneLaunchFailureActivity.N;
                        u22.a("clone_launch_back_home");
                        int i7 = HomeActivity.k0;
                        Intent intent2 = new Intent(cloneLaunchFailureActivity, (Class<?>) HomeActivity.class);
                        intent2.putExtra("extra_need_update", false);
                        intent2.putExtra("From where", "From home");
                        cloneLaunchFailureActivity.startActivity(intent2);
                        cloneLaunchFailureActivity.overridePendingTransition(android.R.anim.fade_in, -1);
                        cloneLaunchFailureActivity.finish();
                        break;
                    default:
                        int i8 = CloneLaunchFailureActivity.N;
                        u22.a("clone_launch_feedback");
                        int i9 = FeedbackActivity.H;
                        Intent intent3 = new Intent(cloneLaunchFailureActivity, (Class<?>) FeedbackActivity.class);
                        intent3.putExtra("extra_rating", 0);
                        cloneLaunchFailureActivity.startActivity(intent3);
                        cloneLaunchFailureActivity.finish();
                        break;
                }
            }
        });
        final int i5 = 4;
        this.L.setOnClickListener(new View.OnClickListener(this) { // from class: io.lq0
            public final /* synthetic */ CloneLaunchFailureActivity b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i6 = 0;
                CloneLaunchFailureActivity cloneLaunchFailureActivity = this.b;
                switch (i5) {
                    case 0:
                        if (!cloneLaunchFailureActivity.F) {
                            cloneLaunchFailureActivity.finish();
                        }
                        break;
                    case 1:
                        if (!cloneLaunchFailureActivity.F) {
                            cloneLaunchFailureActivity.finish();
                        }
                        break;
                    case 2:
                        if (!cloneLaunchFailureActivity.F) {
                            cloneLaunchFailureActivity.E(true);
                            u22.a("clone_launch_retry");
                            new Thread(new nq0(cloneLaunchFailureActivity, i6), "clone-launch-retry").start();
                            break;
                        }
                        break;
                    case 3:
                        int i7 = CloneLaunchFailureActivity.N;
                        u22.a("clone_launch_back_home");
                        int i8 = HomeActivity.k0;
                        Intent intent2 = new Intent(cloneLaunchFailureActivity, (Class<?>) HomeActivity.class);
                        intent2.putExtra("extra_need_update", false);
                        intent2.putExtra("From where", "From home");
                        cloneLaunchFailureActivity.startActivity(intent2);
                        cloneLaunchFailureActivity.overridePendingTransition(android.R.anim.fade_in, -1);
                        cloneLaunchFailureActivity.finish();
                        break;
                    default:
                        int i9 = CloneLaunchFailureActivity.N;
                        u22.a("clone_launch_feedback");
                        int i10 = FeedbackActivity.H;
                        Intent intent3 = new Intent(cloneLaunchFailureActivity, (Class<?>) FeedbackActivity.class);
                        intent3.putExtra("extra_rating", 0);
                        cloneLaunchFailureActivity.startActivity(intent3);
                        cloneLaunchFailureActivity.finish();
                        break;
                }
            }
        });
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("do.multiple.cloner.action.DISMISS_CLONE_LAUNCH_FAILURE");
        intentFilter.addAction("do.multiple.cloner.action.CLONE_LAUNCH_SUCCESS");
        int i6 = Build.VERSION.SDK_INT;
        BroadcastReceiver broadcastReceiver = this.M;
        if (i6 >= 33) {
            registerReceiver(broadcastReceiver, intentFilter, 4);
        } else {
            registerReceiver(broadcastReceiver, intentFilter);
        }
        this.E = true;
        overridePendingTransition(R.anim.clone_launch_sheet_in, R.anim.clone_launch_sheet_out);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        if (this.E) {
            try {
                unregisterReceiver(this.M);
            } catch (Throwable th) {
                pj4.c(th);
            }
        }
        super.onDestroy();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        if (intent == null) {
            return;
        }
        this.C = intent.getStringExtra("extra_clone_launch_package");
        this.D = intent.getIntExtra("extra_clone_launch_user_id", this.D);
    }
}
