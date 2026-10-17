package com.polestar.domultiple.components.ui;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.AlertDialog;
import com.polestar.clone.client.core.VirtualCore;
import com.polestar.domultiple.PolestarApp;
import io.bg6;
import io.d75;
import io.f6;
import io.h23;
import io.h6;
import io.ie4;
import io.ki6;
import io.ko1;
import io.ky5;
import io.rq0;
import io.st0;
import io.sz6;
import io.u22;
import io.uo2;
import io.uq0;
import io.xe9;
import io.xz6;
import io.yq0;
import io.z5;
import java.util.ArrayList;
import java.util.HashSet;
import p000do.multiple.cloner.R;

/* JADX INFO: loaded from: classes2.dex */
public class AddCloneActivity extends BaseActivity implements AdapterView.OnItemClickListener {
    public static boolean X = false;
    public LinearLayout E;
    public LinearLayout F;
    public LinearLayout G;
    public GridView H;
    public GridView I;
    public TextView J;
    public int K;
    public ProgressBar L;
    public uo2 M;
    public h23 N;
    public h23 O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public final ArrayList C = new ArrayList();
    public final ArrayList D = new ArrayList();
    public final Handler W = new a(Looper.myLooper());

    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            if (message.what != 0) {
                return;
            }
            AddCloneActivity addCloneActivity = AddCloneActivity.this;
            addCloneActivity.K = 0;
            addCloneActivity.L.setVisibility(8);
            addCloneActivity.J.setVisibility(0);
            ArrayList arrayList = addCloneActivity.C;
            if (arrayList == null || arrayList.size() == 0) {
                addCloneActivity.E.setVisibility(8);
            } else {
                arrayList.size();
                addCloneActivity.E.setVisibility(0);
                xz6 xz6Var = new xz6(addCloneActivity, arrayList);
                addCloneActivity.H.setAdapter((ListAdapter) xz6Var);
                addCloneActivity.H.setOnItemClickListener(addCloneActivity);
                xz6Var.notifyDataSetChanged();
            }
            ArrayList arrayList2 = addCloneActivity.D;
            if (arrayList2 == null || arrayList2.size() == 0) {
                addCloneActivity.G.setVisibility(8);
            } else {
                arrayList2.size();
                addCloneActivity.G.setVisibility(0);
                xz6 xz6Var2 = new xz6(addCloneActivity, arrayList2);
                addCloneActivity.I.setAdapter((ListAdapter) xz6Var2);
                addCloneActivity.I.setOnItemClickListener(addCloneActivity);
                xz6Var2.notifyDataSetChanged();
            }
            addCloneActivity.P = true;
            if (addCloneActivity.N != null) {
                AddCloneActivity.E(addCloneActivity);
            }
        }
    }

    public class b implements DialogInterface.OnClickListener {
        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            ky5.h(PolestarApp.b, "add_clone_sort", i);
        }
    }

    public class c implements DialogInterface.OnDismissListener {
        public final /* synthetic */ int a;

        public c(int i) {
            this.a = i;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public final void onDismiss(DialogInterface dialogInterface) {
            if (ky5.b(PolestarApp.b, "add_clone_sort", 0) != this.a) {
                AddCloneActivity addCloneActivity = AddCloneActivity.this;
                addCloneActivity.J.setVisibility(4);
                addCloneActivity.L.setVisibility(0);
                addCloneActivity.P = false;
                new Thread(new com.polestar.domultiple.components.ui.b(addCloneActivity), "load-app").start();
            }
        }
    }

    public class d implements DialogInterface.OnClickListener {
        public d() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            AddCloneActivity addCloneActivity = AddCloneActivity.this;
            if (i == 1) {
                addCloneActivity.T = true;
                addCloneActivity.U = false;
                uo2.e(addCloneActivity, "slot_clone_limit_reward_video").o(addCloneActivity);
                u22.f(null, "add_reward_go_video");
                return;
            }
            if (i == 2) {
                u22.f(null, "add_reward_go_buy");
                boolean z = AddCloneActivity.X;
                addCloneActivity.G(false);
            } else {
                if (i != 3) {
                    if (i != 4) {
                        return;
                    }
                    addCloneActivity.U = true;
                    addCloneActivity.I();
                    return;
                }
                u22.f(null, "add_reward_video_done");
                if (addCloneActivity.R || addCloneActivity.S) {
                    return;
                }
                addCloneActivity.R = true;
                AddCloneActivity.X = true;
                addCloneActivity.runOnUiThread(new com.polestar.domultiple.components.ui.c(addCloneActivity));
            }
        }
    }

    public static void E(AddCloneActivity addCloneActivity) {
        if (addCloneActivity.N == null || !addCloneActivity.P) {
            return;
        }
        addCloneActivity.F = (LinearLayout) addCloneActivity.findViewById(R.id.ad_container_fixed_top);
        h6.b bVar = new h6.b(R.layout.home_native_ad_fbnative_banner);
        bVar.b = R.id.ad_title;
        bVar.c = R.id.ad_subtitle_text;
        bVar.g = R.id.ad_icon_image;
        bVar.d = R.id.ad_cta_text;
        View viewM = addCloneActivity.N.m(addCloneActivity, new h6(bVar));
        if (viewM != null) {
            try {
                addCloneActivity.F.removeAllViews();
                addCloneActivity.F.addView(viewM);
                addCloneActivity.F.setVisibility(0);
            } catch (Exception unused) {
            }
        }
    }

    public final void F() {
        rq0 rq0VarF = rq0.f(this);
        rq0VarF.f.clear();
        ArrayList arrayList = this.C;
        int size = arrayList.size();
        boolean z = false;
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            sz6 sz6Var = (sz6) obj;
            if (sz6Var.a) {
                uq0 uq0Var = new uq0(sz6Var.c, this);
                if (st0.a.contains(sz6Var.c)) {
                    uq0Var.i = 1;
                    uq0Var.h = Boolean.TRUE;
                }
                int iH = rq0VarF.h(sz6Var.c);
                PackageManager packageManager = getPackageManager();
                try {
                    uq0Var.d = VirtualCore.b(iH, ki6.m + ((Object) packageManager.getApplicationLabel(packageManager.getApplicationInfo(sz6Var.c, 0))));
                } catch (PackageManager.NameNotFoundException unused) {
                }
                rq0VarF.b(this, uq0Var, iH);
                z = true;
            }
        }
        ArrayList arrayList2 = this.D;
        int size2 = arrayList2.size();
        int i2 = 0;
        while (i2 < size2) {
            Object obj2 = arrayList2.get(i2);
            i2++;
            sz6 sz6Var2 = (sz6) obj2;
            if (sz6Var2.a) {
                uq0 uq0Var2 = new uq0(sz6Var2.c, this);
                if (st0.a.contains(sz6Var2.c)) {
                    uq0Var2.i = 1;
                }
                int iH2 = rq0VarF.h(sz6Var2.c);
                PackageManager packageManager2 = getPackageManager();
                try {
                    uq0Var2.d = VirtualCore.b(iH2, ki6.m + ((Object) packageManager2.getApplicationLabel(packageManager2.getApplicationInfo(sz6Var2.c, 0))));
                } catch (PackageManager.NameNotFoundException unused2) {
                }
                rq0VarF.b(this, uq0Var2, iH2);
                z = true;
            }
        }
        if (!z) {
            Toast.makeText(this, R.string.no_selection_for_clone, 1).show();
        } else {
            ky5.g(PolestarApp.b, "spc_ever_cloned", true);
            super.onBackPressed();
        }
    }

    public final void G(boolean z) {
        this.Q = z;
        VipActivity.L(this, "clone", 701);
        u22.a("clone_limit_paywall_".concat(z ? "first" : "hard"));
    }

    public final void H() {
        h23 h23VarH = uo2.e(this, "slot_clone_limit_reward_video").h();
        this.O = h23VarH;
        if (h23VarH == null) {
            String strC = bg6.c("conf_clone_limit_reward_fallback");
            if (!"hard_paywall".equals(strC) && !"soft_paywall".equals(strC) && !"reward_video".equals(strC)) {
                strC = "soft_paywall";
            }
            u22.a("add_reward_no_video_".concat(strC));
            if ("reward_video".equals(strC)) {
                F();
                return;
            } else {
                G(false);
                return;
            }
        }
        d dVar = new d();
        yq0 yq0Var = new yq0();
        yq0Var.a = this;
        yq0Var.g = h23VarH;
        yq0Var.b = dVar;
        View viewInflate = LayoutInflater.from(this).inflate(R.layout.clone_reward_dialog, (ViewGroup) null);
        yq0Var.c = viewInflate;
        Dialog dialog = new Dialog(this, R.style.CustomDialog);
        yq0Var.d = dialog;
        dialog.setContentView(viewInflate);
        dialog.getWindow().setLayout((ko1.b(this) * 9) / 10, -2);
        dialog.setCanceledOnTouchOutside(false);
        LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(R.id.watch_video_layout);
        yq0Var.e = linearLayout;
        yq0Var.f = (LinearLayout) viewInflate.findViewById(R.id.purchase_layout);
        linearLayout.setClickable(false);
        ((ProgressBar) viewInflate.findViewById(R.id.video_loading_progress)).setVisibility(4);
        yq0Var.a();
        u22.f(null, "add_reward_dialog_show");
    }

    public final void I() {
        if (this.R && !this.S && this.V && this.U && !isFinishing()) {
            this.R = false;
            this.S = true;
            F();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 701) {
            boolean z = this.Q;
            this.Q = false;
            if (i2 == 801) {
                F();
            } else if (z && i2 == 0) {
                H();
            }
        }
    }

    public void onCloneClick(View view) {
        int size = rq0.f(this).a.size();
        if (!ky5.e()) {
            long j = size;
            long jB = bg6.b("conf_clone_limit_threshold");
            if (jB <= 0) {
                jB = bg6.b("conf_clone_reward_gate");
            }
            if (jB <= 0) {
                jB = 4;
            }
            if (j >= jB) {
                String strC = bg6.c("conf_clone_limit_strategy");
                if (!("hard_paywall".equals(strC) || "soft_paywall".equals(strC) || "reward_video".equals(strC))) {
                    strC = "soft_paywall";
                }
                if (!"soft_paywall".equals(strC)) {
                    if ("reward_video".equals(strC)) {
                        H();
                        return;
                    } else {
                        G(false);
                        return;
                    }
                }
                long jMax = TextUtils.isEmpty(bg6.c("conf_clone_limit_paywall_first_count")) ? 3L : Math.max(0L, bg6.b("conf_clone_limit_paywall_first_count"));
                if (jMax <= 0 || ky5.b(PolestarApp.b, "clone_limit_paywall_first_count", 0) >= jMax) {
                    H();
                    return;
                }
                PolestarApp polestarApp = PolestarApp.b;
                ky5.h(polestarApp, "clone_limit_paywall_first_count", ky5.b(polestarApp, "clone_limit_paywall_first_count", 0) + 1);
                G(true);
                return;
            }
        }
        F();
    }

    @Override // com.polestar.domultiple.components.ui.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@d75 Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.add_clone_activity_layout);
        C(getString(R.string.add_clone_title));
        ImageView imageView = (ImageView) findViewById(R.id.menu_icon);
        if (imageView != null) {
            imageView.setVisibility(0);
            imageView.setImageResource(R.drawable.ic_baseline_sort_24);
        }
        this.E = (LinearLayout) findViewById(R.id.hot_clone_layout);
        this.H = (GridView) findViewById(R.id.hot_clone_grid);
        this.G = (LinearLayout) findViewById(R.id.other_clone_layout);
        this.I = (GridView) findViewById(R.id.other_clone_grid);
        TextView textView = (TextView) findViewById(R.id.clone_button);
        this.J = textView;
        textView.setText(String.format(getString(R.string.clone_action_txt), ki6.m));
        this.L = (ProgressBar) findViewById(R.id.progressBar);
        X = false;
        this.R = false;
        this.S = false;
        this.T = false;
        this.U = false;
        this.V = false;
        this.Q = false;
        this.P = false;
        new Thread(new com.polestar.domultiple.components.ui.b(this), "load-app").start();
        if (!ky5.e() && ky5.a(PolestarApp.b, "spc_ever_cloned", false)) {
            f6.a("slot_clone_new");
            if (this.M == null) {
                this.M = uo2.e(this, "slot_clone_new");
            }
            uo2 uo2Var = this.M;
            PolestarApp polestarApp = PolestarApp.b;
            uo2Var.g = new z5(ko1.c(polestarApp, ko1.b(polestarApp)), 140);
            if (this.M.i()) {
                this.N = null;
                ie4 ie4Var = new ie4();
                ie4Var.b = 2L;
                ie4Var.a = 500L;
                ie4Var.d = new HashSet();
                ie4Var.c = 1000L;
                this.M.m(this, ie4Var, new com.polestar.domultiple.components.ui.a(this));
            }
        }
        int size = rq0.f(this).a.size();
        if (ky5.e()) {
            return;
        }
        long j = size;
        long jB = bg6.b("conf_clone_limit_threshold");
        if (jB <= 0) {
            jB = bg6.b("conf_clone_reward_gate");
        }
        if (jB <= 0) {
            jB = 4;
        }
        if (j >= jB) {
            uo2.e(this, "slot_clone_limit_reward_video").o(this);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        h23 h23Var = this.N;
        if (h23Var != null) {
            h23Var.destroy();
        }
        super.onDestroy();
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        sz6 sz6Var = (sz6) view.getTag();
        if (sz6Var != null) {
            ImageView imageView = (ImageView) view.findViewById(R.id.select_cb_img);
            View viewFindViewById = view.findViewById(R.id.cover);
            if (imageView != null) {
                boolean z = sz6Var.a;
                sz6Var.a = !z;
                if (z) {
                    this.K--;
                    imageView.setImageResource(R.drawable.not_select);
                    viewFindViewById.setVisibility(0);
                } else {
                    this.K++;
                    imageView.setImageResource(R.drawable.selectd);
                    viewFindViewById.setVisibility(4);
                }
                if (this.K > 0) {
                    this.J.setText(String.format(getString(R.string.clone_action_txt), xe9.r(new StringBuilder("("), this.K, ")")));
                    this.J.setEnabled(true);
                } else {
                    this.J.setText(String.format(getString(R.string.clone_action_txt), ki6.m));
                    this.J.setEnabled(false);
                }
            }
        }
    }

    @Override // com.polestar.domultiple.components.ui.BaseActivity
    public void onMenuClick(View view) {
        super.onMenuClick(view);
        int iB = ky5.b(PolestarApp.b, "add_clone_sort", 0);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        String string = getString(R.string.sort_order);
        AlertController.AlertParams alertParams = builder.a;
        alertParams.d = string;
        String[] strArr = {getString(R.string.order_default), "A-Z", "Z-A"};
        b bVar = new b();
        alertParams.h = strArr;
        alertParams.j = bVar;
        alertParams.l = iB;
        alertParams.k = true;
        alertParams.f = new c(iB);
        builder.a().show();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        this.V = false;
        super.onPause();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        LinearLayout linearLayout;
        super.onResume();
        this.V = true;
        if (this.T) {
            this.U = true;
        }
        if (ky5.e() && (linearLayout = this.F) != null) {
            linearLayout.setVisibility(8);
        }
        I();
    }
}
