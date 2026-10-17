package com.polestar.domultiple.components.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ShortcutManager;
import android.graphics.Canvas;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.BounceInterpolator;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.view.SupportMenuInflater;
import com.polestar.clone.CustomizeAppData;
import com.polestar.clone.client.core.VirtualCore;
import com.polestar.domultiple.PolestarApp;
import com.polestar.domultiple.widget.DropableLinearLayout;
import com.polestar.domultiple.widget.ExitDialog;
import com.polestar.domultiple.widget.ExplosionField;
import com.polestar.domultiple.widget.HomeGridAdapter;
import com.polestar.domultiple.widget.dragdrop.DragController;
import com.polestar.domultiple.widget.dragdrop.DragImageView;
import com.polestar.domultiple.widget.dragdrop.DragLayer;
import io.ab6;
import io.bg6;
import io.c76;
import io.cp1;
import io.d75;
import io.ew5;
import io.f6;
import io.h23;
import io.i73;
import io.ie4;
import io.in;
import io.j23;
import io.ki6;
import io.ko1;
import io.ky5;
import io.mr8;
import io.nu5;
import io.pj4;
import io.qu5;
import io.r50;
import io.rm;
import io.rq0;
import io.st0;
import io.u22;
import io.uo2;
import io.uq0;
import io.uz8;
import io.x40;
import io.z5;
import java.io.File;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import p000do.multiple.cloner.R;

/* JADX INFO: loaded from: classes2.dex */
public class HomeActivity extends BaseActivity implements rq0.b, DragController.a {
    public static final /* synthetic */ int k0 = 0;
    public List<uq0> C;
    public rq0 D;

    /* JADX INFO: renamed from: E */
    public GridView GridView;
    public HomeGridAdapter F;
    public boolean G;
    public DragLayer H;
    public DragController I;
    public RelativeLayout J;
    public LinearLayout K;
    public DropableLinearLayout L;
    public DropableLinearLayout M;
    public LinearLayout N;
    public LinearLayout O;
    public TextView P;
    public TextView Q;
    public ExplosionField R;
    public ew5 S;
    public View T;
    public ImageView U;
    public ImageView V;
    public uo2 X;
    public LinearLayout Y;
    public String Z;
    public uq0 a0;
    public Handler b0;
    public boolean c0;
    public boolean d0;
    public boolean e0;
    public boolean f0;
    public h23 g0;
    public boolean h0;
    public boolean W = false;
    public h23 i0 = null;
    public long j0 = 0;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            HomeActivity homeActivity = HomeActivity.this;
            homeActivity.T.setVisibility(8);
            List<uq0> listI = HomeActivity.I(homeActivity.D.a);
            homeActivity.C = listI;
            homeActivity.F.c(listI);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            HomeActivity.G(HomeActivity.this, !ky5.e());
        }
    }

    public class c implements x40.b {
        public c() {
        }

        @Override // io.x40.b
        public final void g() {
            HomeGridAdapter homeGridAdapter;
            x40.a().getClass();
            if (x40.b()) {
                int i = HomeActivity.k0;
                HomeActivity homeActivity = HomeActivity.this;
                if (bg6.a("go_direct_purchase")) {
                    u22.f(null, "ad_free_home_direct_done");
                } else {
                    u22.f(null, "ad_free_home_dialog_done");
                }
                ky5.k(true);
                homeActivity.Y.setVisibility(8);
                homeActivity.G = false;
                List<uq0> list = homeActivity.C;
                if (list == null || (homeGridAdapter = homeActivity.F) == null) {
                    return;
                }
                homeGridAdapter.b = false;
                homeGridAdapter.c(list);
                HomeActivity.G(homeActivity, false);
            }
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i = HomeActivity.k0;
            HomeActivity homeActivity = HomeActivity.this;
            u22.a("update_dialog");
            mr8.a(homeActivity, homeActivity.getResources().getString(R.string.update_dialog_title), homeActivity.getResources().getString(R.string.update_dialog_content, ki6.m + bg6.b("current_version")), homeActivity.getResources().getString(R.string.update_dialog_left), homeActivity.getResources().getString(R.string.update_dialog_right), -1, new h0(homeActivity)).setOnCancelListener(new g0());
        }
    }

    public class e implements ew5.b {
        public e() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x00c7, code lost:
        
            if (new java.io.File(android.os.Environment.getExternalStorageDirectory().getPath() + java.io.File.separator + "polestarunlocktest").exists() != false) goto L18;
         */
        @Override // io.ew5.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void onMenuItemClick(android.view.MenuItem r5) {
            /*
                Method dump skipped, instruction units count: 310
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.polestar.domultiple.components.ui.HomeActivity.e.onMenuItemClick(android.view.MenuItem):void");
        }
    }

    public class f implements DialogInterface.OnCancelListener {
        @Override // android.content.DialogInterface.OnCancelListener
        public final void onCancel(DialogInterface dialogInterface) {
            ky5.h(PolestarApp.b, "love_app", -1);
        }
    }

    public class g implements ExitDialog.e {
        public g() {
        }

        @Override // com.polestar.domultiple.widget.ExitDialog.e
        public final void a() {
            HomeActivity.super.onBackPressed();
        }
    }

    public static void E(HomeActivity homeActivity, DragImageView dragImageView, uq0 uq0Var) {
        homeActivity.getClass();
        if (dragImageView != null) {
            Canvas canvas = ExplosionField.c;
            ViewGroup viewGroup = (ViewGroup) homeActivity.findViewById(android.R.id.content);
            ExplosionField explosionField = new ExplosionField(homeActivity);
            viewGroup.addView(explosionField, new ViewGroup.LayoutParams(-1, -1));
            homeActivity.R = explosionField;
            explosionField.b(new b0(), dragImageView);
            dragImageView.postDelayed(new c0(homeActivity, uq0Var), 1500L);
        }
    }

    public static void G(HomeActivity homeActivity, boolean z) {
        if (!z) {
            homeActivity.U.setVisibility(8);
            homeActivity.V.setVisibility(8);
            return;
        }
        homeActivity.U.setVisibility(0);
        homeActivity.V.setVisibility(4);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(homeActivity.U, "scaleX", 0.7f, 1.4f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(homeActivity.U, "scaleY", 0.7f, 1.4f, 1.0f);
        objectAnimatorOfFloat.addListener(new t(homeActivity));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2);
        animatorSet.setInterpolator(new BounceInterpolator());
        animatorSet.setDuration(800L).start();
    }

    public static z5 H() {
        if (bg6.a("conf_home_rect_banner")) {
            return z5.j;
        }
        PolestarApp polestarApp = PolestarApp.b;
        int iC = ko1.c(polestarApp, ko1.b(polestarApp));
        return new z5(iC, (iC * 100) / 320);
    }

    public static List I(ArrayList arrayList) {
        if (!bg6.a("conf_sort_home_icon")) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        HashMap map = new HashMap();
        ArrayList arrayList3 = new ArrayList();
        int i = 0;
        if (arrayList != null) {
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                uq0 uq0Var = (uq0) obj;
                ArrayList arrayList4 = (ArrayList) map.get(uq0Var.b);
                if (arrayList4 == null) {
                    arrayList4 = new ArrayList();
                    arrayList3.add(uq0Var.b);
                }
                arrayList4.add(uq0Var);
                map.put(uq0Var.b, arrayList4);
            }
        }
        int size2 = arrayList3.size();
        while (i < size2) {
            Object obj2 = arrayList3.get(i);
            i++;
            ArrayList arrayList5 = (ArrayList) map.get((String) obj2);
            if (arrayList5 != null) {
                arrayList2.addAll(arrayList5);
            }
        }
        return arrayList2;
    }

    @Override // com.polestar.domultiple.components.ui.BaseActivity
    public final boolean D() {
        return false;
    }

    public final void J(String str) {
        String str2;
        String[] strArrSplit;
        String strC = bg6.c("conf_hint_package");
        if (!TextUtils.isEmpty(strC) && (strArrSplit = strC.split(";")) != null && strArrSplit.length > 0) {
            int length = strArrSplit.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    String[] strArrSplit2 = strArrSplit[i].split(":");
                    if (strArrSplit2 != null && strArrSplit2.length == 2 && strArrSplit2[0].equals(str)) {
                        str2 = strArrSplit2[1];
                        break;
                    }
                    i++;
                } else {
                    str2 = null;
                    break;
                }
            }
        } else {
            str2 = null;
            break;
        }
        if (str2 != null) {
            ie4 ie4Var = new ie4();
            ie4Var.e = str2;
            ie4Var.b = 1L;
            uo2.e(this, "slot_start_dialog").m(this, ie4Var, new h());
        }
    }

    public final void K(DragImageView dragImageView, HomeGridAdapter.CloneItem cloneItem) {
        this.J.setVisibility(0);
        this.K.setVisibility(4);
        if (this.L.b) {
            int i = cloneItem.index;
            if (i == 1) {
                if (checkCallingOrSelfPermission("com.android.launcher.permission.INSTALL_SHORTCUT") != 0) {
                    requestPermissions(new String[]{"com.android.launcher.permission.INSTALL_SHORTCUT"}, 101);
                } else {
                    st0.a(this, (uq0) cloneItem.b);
                    this.K.postDelayed(new z(this), 500L);
                }
            } else if (i == 3) {
                StartApp(cloneItem);
            }
        } else if (this.M.b) {
            this.K.postDelayed(new a0(this, cloneItem, dragImageView), 500L);
        }
        LinearLayout linearLayout = this.K;
        int height = linearLayout.getHeight();
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        float f2 = (layoutParams instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : 0) + height;
        boolean z = rm.n;
        if (z) {
            rm.h(linearLayout).f(f2);
        } else {
            linearLayout.setTranslationY(f2);
        }
        this.K.setVisibility(8);
        RelativeLayout relativeLayout = this.J;
        int height2 = relativeLayout.getHeight();
        ViewGroup.LayoutParams layoutParams2 = relativeLayout.getLayoutParams();
        float f3 = (layoutParams2 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin : 0) + height2;
        if (z) {
            rm.h(relativeLayout).f(f3);
        } else {
            relativeLayout.setTranslationY(f3);
        }
        uz8.a(relativeLayout).d().f();
        this.J.setVisibility(0);
        this.I.l.remove(this.L);
        this.I.l.remove(this.M);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0094  */
    public final void L(uq0 uq0Var, boolean z) {
        this.C = I(this.D.a);
        if (z && ky5.a(this, "key_auto_create_shortcut", false)) {
            st0.a(this, uq0Var);
        }
        if (rq0.f(this).f.size() <= 0) {
            this.T.setVisibility(8);
            rq0.n();
            boolean z2 = this.G || (((long) this.C.size()) >= bg6.b("home_show_lucky_gate") && !ky5.e());
            this.G = z2;
            this.F.b = z2;
            if (this.h0) {
                this.h0 = false;
                if (z) {
                    Toast.makeText(this, R.string.toast_clone_finished, 0).show();
                    if (!AddCloneActivity.X) {
                        f6.a("slot_clone_finish_ad");
                        h23 h23VarH = uo2.e(this, "slot_clone_finish_ad").h();
                        if (h23VarH == null) {
                            h23VarH = uo2.e(this, "slot_clone_finish_ad").g();
                        }
                        if (h23VarH != null) {
                            h23VarH.show(this);
                            ky5.i(PolestarApp.b, "clone_finish_ad_time", System.currentTimeMillis());
                        } else if (!this.c0 && !ky5.e() && bg6.a("conf_after_first_clone_paywall_enabled") && !ky5.a(PolestarApp.b, "shown_after_first_clone_paywall", false)) {
                            this.c0 = true;
                            new Handler(Looper.getMainLooper()).postDelayed(new y(this), Math.max(0L, bg6.b("conf_after_first_clone_paywall_delay_sec")) * 1000);
                        }
                    } else if (!this.c0) {
                        this.c0 = true;
                        new Handler(Looper.getMainLooper()).postDelayed(new y(this), Math.max(0L, bg6.b("conf_after_first_clone_paywall_delay_sec")) * 1000);
                    }
                } else {
                    u22.a("clone_install_failed");
                }
            }
        }
        this.F.c(this.C);
    }

    /* JADX INFO: renamed from: M */
    public final void StartApp(HomeGridAdapter.CloneItem item) {
        String[] strArrSplit;
        HomeActivity homeActivity;
        int i;
        View view;
        if (item == null) {
            return;
        }
        int index = item.index;
        if (index == 0) {
            this.h0 = true;
            startActivity(new Intent(this, (Class<?>) AddCloneActivity.class));
            cp1.a().getClass();
            if (cp1.c()) {
                uo2.e(this, "slot_clone_finish_ad").l(this, 2, 1500L, null);
                return;
            }
            return;
        }
        if (index != 1) {
            if (index == 2) {
                startActivity(new Intent(this, (Class<?>) NativeInterstitialActivity.class));
                u22.c("item_click");
                return;
            } else {
                if (index == 3 && (view = item.c) != null) {
                    view.performClick();
                    return;
                }
                return;
            }
        }
        uq0 uq0Var = (uq0) item.b;
        String strC = bg6.c("force_requested_permission");
        if (!TextUtils.isEmpty(strC) && (strArrSplit = strC.split(";")) != null && strArrSplit.length != 0) {
            ArrayList arrayList = new ArrayList();
            for (String str : strArrSplit) {
                String strTrim = str.trim();
                if (!TextUtils.isEmpty(strTrim) && (((i = Build.VERSION.SDK_INT) < 30 || !"android.permission.WRITE_EXTERNAL_STORAGE".equals(strTrim)) && ((i < 33 || !"android.permission.READ_EXTERNAL_STORAGE".equals(strTrim)) && checkCallingOrSelfPermission(strTrim) != 0))) {
                    arrayList.add(strTrim);
                }
            }
            if (arrayList.size() != 0) {
                u22.j("granted_permission", "not_granted");
                String[] strArr = (String[]) arrayList.toArray(new String[0]);
                boolean z = false;
                for (String str2 : strArr) {
                    if (shouldShowRequestPermissionRationale(str2)) {
                        z = true;
                    }
                }
                if (z || !ky5.a(PolestarApp.b, "shown_permission_guide", false)) {
                    u22.a("show_permission_guide");
                    ky5.g(PolestarApp.b, "shown_permission_guide", true);
                    homeActivity = this;
                    mr8.a(homeActivity, getString(R.string.dialog_permission_title), getString(R.string.dialog_permission_content), null, getString(R.string.ok), R.drawable.dialog_tag_comment, new f0(this, strArr)).setOnCancelListener(new e0(this, strArr));
                } else {
                    requestPermissions(strArr, 101);
                    homeActivity = this;
                }
                homeActivity.a0 = uq0Var;
                return;
            }
            u22.j("granted_permission", "granted");
        }
        AppLoadingActivity.O(this, uq0Var);
        String str3 = uq0Var.b;
        this.Z = str3;
        J(str3);
        if (uq0Var.a().intValue() == 0) {
            uq0Var.j = 1;
            com.polestar.domultiple.db.a.a(this).a.update(uq0Var);
            this.F.notifyDataSetChanged();
        }
    }

    public final boolean N(HomeGridAdapter.CloneItem cloneItem, View view) {
        if (cloneItem == null) {
            return false;
        }
        DragImageView dragImageView = (DragImageView) view.findViewById(R.id.app_icon);
        int i = cloneItem.index;
        if (i == 1) {
            this.Q.setText(R.string.create_shortcut);
            this.I.d(dragImageView, dragImageView, cloneItem);
            return true;
        }
        if (i == 2) {
            startActivity(new Intent(this, (Class<?>) NativeInterstitialActivity.class));
            u22.c("item_click_long");
            return true;
        }
        if (i != 3) {
            return false;
        }
        this.Q.setText(R.string.install);
        this.I.d(dragImageView, dragImageView, cloneItem);
        return true;
    }

    public final void O(uq0 uq0Var, boolean z) {
        this.C = I(this.D.a);
        if (z) {
            HashSet<String> hashSet = st0.a;
            String str = uq0Var.d;
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setClassName(getPackageName(), AppLoadingActivity.class.getName());
            intent.putExtra("app_packagename", uq0Var.b);
            intent.putExtra("From where", "From shortcut");
            intent.putExtra("app_userid", uq0Var.c());
            intent.setFlags(402653184);
            String str2 = uq0Var.b;
            int iC = uq0Var.c();
            Intent intent2 = new Intent("com.android.launcher.action.UNINSTALL_SHORTCUT");
            intent2.putExtra("android.intent.extra.shortcut.NAME", str);
            intent2.putExtra("duplicate", false);
            intent2.putExtra("android.intent.extra.shortcut.INTENT", intent);
            sendBroadcast(intent2);
            if (Build.VERSION.SDK_INT >= 26) {
                ShortcutManager shortcutManagerJ = in.j(getSystemService(in.l()));
                if (shortcutManagerJ.isRequestPinShortcutSupported()) {
                    try {
                        shortcutManagerJ.disableShortcuts(Arrays.asList(st0.b(iC, str2)));
                    } catch (Exception e2) {
                        pj4.d(e2.getMessage());
                    }
                }
            }
            String str3 = uq0Var.b;
            int iC2 = uq0Var.c();
            Parcelable.Creator<CustomizeAppData> creator = CustomizeAppData.CREATOR;
            String strB = VirtualCore.b(iC2, "app_custom_" + str3);
            VirtualCore virtualCore = VirtualCore.p;
            virtualCore.e.getSharedPreferences(strB, 0).edit().clear().commit();
            new File(r50.e(virtualCore.e, str3, iC2)).delete();
            if (c76.f()) {
                c76.b();
                c76.c();
            }
        }
        this.F.c(this.C);
    }

    public final void P() {
        if (this.d0 && !isFinishing() && this.e0 && this.a0 == null && !ky5.e() && bg6.a("conf_after_first_clone_paywall_enabled") && !ky5.a(PolestarApp.b, "shown_after_first_clone_paywall", false)) {
            this.d0 = false;
            ky5.g(PolestarApp.b, "shown_after_first_clone_paywall", true);
            VipActivity.K(this, "after_first_clone");
            u22.a("after_first_clone_paywall");
        }
    }

    public final void Q(String str, String str2) {
        if ("clone".equals(str) || "quit".equals(str)) {
            if (this.W) {
                return;
            } else {
                this.W = true;
            }
        }
        ky5.i(this, "last_rate_dialog", System.currentTimeMillis());
        new ab6(this, str + "_" + str2).a().setOnCancelListener(new f());
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 100 && i2 == -1) {
            LockSettingsActivity.F(this, "home");
        }
    }

    @Override // com.polestar.domultiple.components.ui.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        h23 h23VarH;
        h23 h23Var = null;
        if (!ky5.a(PolestarApp.b, "is_rated", false)) {
            bg6.b("quit_rating_interval");
            bg6.b("quit_rating_random");
            bg6.b("quit_rating_cloned_app_gate");
            long jB = bg6.b("quit_rating_interval") * 3600000;
            long jC = ky5.c(this, "last_rate_dialog", -1L);
            if (jC == -1) {
                jC = st0.c(this, getPackageName());
            }
            if (ky5.b(PolestarApp.b, "love_app", 0) != -1) {
                int iNextInt = new Random().nextInt(100);
                List<uq0> list = this.C;
                int size = list == null ? 0 : list.size();
                if ((ky5.b(PolestarApp.b, "love_app", 0) == 1 || (iNextInt < bg6.b("quit_rating_random") && size >= bg6.b("quit_rating_cloned_app_gate"))) && System.currentTimeMillis() - jC > jB) {
                    Q("quit", null);
                    return;
                }
            }
        }
        h23 h23VarH2 = uo2.e(this, "slot_exit_new").h();
        if (h23VarH2 == null) {
            uo2 uo2VarE = uo2.e(this, "slot_exit_new");
            if (uo2.A) {
                uo2.c cVar = uo2.s;
                String str = uo2VarE.f;
                if (!cVar.a()) {
                    for (uo2 uo2Var : uo2.z.values()) {
                        if (!str.equals(uo2Var.f) && (h23VarH = uo2Var.h()) != null && uo2.C.contains(h23VarH.f())) {
                            h23VarH.k(str);
                            h23Var = h23VarH;
                            break;
                        }
                    }
                }
            }
            h23VarH2 = h23Var;
        }
        cp1.a().getClass();
        if (!cp1.d() || h23VarH2 == null) {
            super.onBackPressed();
            return;
        }
        f6.a("slot_exit_new");
        ExitDialog exitDialog = new ExitDialog(this);
        exitDialog.l = new g();
        exitDialog.show();
    }

    @Override // com.polestar.domultiple.components.ui.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@d75 Bundle bundle) {
        super.onCreate(bundle);
        this.f0 = false;
        this.b0 = new Handler();
        new i73();
        setContentView(R.layout.home_activity_layout);
        this.GridView = (GridView) findViewById(R.id.clone_grid_view);
        this.U = (ImageView) findViewById(R.id.gift_ad);
        this.V = (ImageView) findViewById(R.id.newtip_dot);
        this.T = findViewById(R.id.progressBar);
        HomeGridAdapter homeGridAdapter = new HomeGridAdapter(this);
        this.F = homeGridAdapter;
        this.GridView.setAdapter((ListAdapter) homeGridAdapter);
        this.GridView.setOnItemClickListener(new OnCloneGridItemClicker(this));
        this.GridView.setOnItemLongClickListener(new v(this));
        this.K = (LinearLayout) findViewById(R.id.action_bar);
        this.J = (RelativeLayout) findViewById(R.id.title_bar);
        this.H = (DragLayer) findViewById(R.id.drag_layer);
        DragController dragController = new DragController(this);
        this.I = dragController;
        dragController.n = this.H.getWindowToken();
        DragController dragController2 = this.I;
        dragController2.m = this;
        this.H.setDragController(dragController2);
        this.L = (DropableLinearLayout) findViewById(R.id.create_shortcut_area);
        this.N = (LinearLayout) findViewById(R.id.shortcut_drop_button);
        this.O = (LinearLayout) findViewById(R.id.delete_drop_button);
        this.P = (TextView) findViewById(R.id.delete_drop_text);
        this.Q = (TextView) findViewById(R.id.shortcut_drop_text);
        this.L.setOnEnterListener(new w(this));
        DropableLinearLayout dropableLinearLayout = (DropableLinearLayout) findViewById(R.id.delete_app_area);
        this.M = dropableLinearLayout;
        dropableLinearLayout.setOnEnterListener(new x(this));
        this.Y = (LinearLayout) findViewById(R.id.ad_container);
        rq0 rq0VarF = rq0.f(this);
        this.D = rq0VarF;
        rq0VarF.m(this, this);
        u22.f(null, "home_show");
        if (getIntent().getBooleanExtra("extra_need_update", false)) {
            this.b0.postDelayed(new d(), 1000L);
            return;
        }
        if (!ky5.a(PolestarApp.b, "spc_ever_cloned", false)) {
            startActivity(new Intent(this, (Class<?>) AddCloneActivity.class));
            return;
        }
        cp1.a().getClass();
        if (cp1.e() && "splash".equals(getIntent().getStringExtra("From where"))) {
            f6.a("slot_home_enter_ad_new");
            h23 h23VarH = uo2.e(this, "slot_home_enter_ad_new").h();
            if (h23VarH == null) {
                h23VarH = uo2.e(this, "slot_home_enter_ad_new").g();
            }
            if (h23VarH != null) {
                h23VarH.show(this);
                ky5.i(PolestarApp.b, "enter_ad_time", System.currentTimeMillis());
            }
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        h23 h23Var = this.i0;
        if (h23Var != null) {
            h23Var.destroy();
        }
        super.onDestroy();
    }

    public void onGiftClick(View view) {
        VipActivity.K(this, "home");
        this.f0 = true;
        u22.c("home_icon_click");
    }

    @Override // com.polestar.domultiple.components.ui.BaseActivity
    public void onMenuClick(View view) {
        View viewFindViewById = findViewById(R.id.menu_more);
        if (this.S == null) {
            this.S = new ew5(this, viewFindViewById);
            if (bg6.a("show_rate_menu")) {
                ew5 ew5Var = this.S;
                ew5Var.getClass();
                new SupportMenuInflater(ew5Var.a).inflate(R.menu.home_menu_popup, ew5Var.b);
            } else {
                ew5 ew5Var2 = this.S;
                ew5Var2.getClass();
                new SupportMenuInflater(ew5Var2.a).inflate(R.menu.home_menu_popup_norate, ew5Var2.b);
            }
        }
        ew5 ew5Var3 = this.S;
        ew5Var3.c = new e();
        try {
            androidx.appcompat.view.menu.l lVar = new androidx.appcompat.view.menu.l(androidx.appcompat.R.attr.popupMenuStyle, this, viewFindViewById, ew5Var3.b, false);
            lVar.d(true);
            if (lVar.b()) {
                return;
            }
            if (lVar.e == null) {
                throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
            }
            lVar.e(0, 0, false, false);
        } catch (Exception e2) {
            pj4.d(Log.getStackTraceString(e2));
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        this.e0 = false;
        super.onPause();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i != 101) {
            return;
        }
        int length = strArr.length;
        boolean z = true;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            String str = strArr[i2];
            int i4 = i3 + 1;
            if (iArr[i3] != 0) {
                u22.a("fail_" + str);
                z = false;
            }
            i2++;
            i3 = i4;
        }
        u22.a("apply_permission_" + z);
    }

    /* JADX WARN: Code duplicated, block: B:117:0x0164 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:53:0x0145  */
    /* JADX WARN: Code duplicated, block: B:61:0x015c  */
    /* JADX WARN: Code duplicated, block: B:64:0x0166 A[LOOP:0: B:60:0x015a->B:64:0x0166, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:66:0x016b  */
    /* JADX WARN: Code duplicated, block: B:70:0x0183  */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        boolean z;
        boolean z2;
        boolean zEquals;
        String[] strArrSplit;
        int i;
        HomeGridAdapter homeGridAdapter;
        try {
            try {
                super.onResume();
                this.e0 = true;
            } catch (IllegalAccessException | NoSuchFieldException unused) {
            }
        } catch (Exception unused2) {
            Field declaredField = Activity.class.getDeclaredField("mCalled");
            declaredField.setAccessible(true);
            declaredField.setBoolean(this, true);
        }
        ((LinearLayout) findViewById(R.id.narrow_function_bar)).setVisibility(8);
        uq0 uq0Var = this.a0;
        if (uq0Var != null) {
            AppLoadingActivity.O(this, uq0Var);
            String str = this.a0.b;
            this.Z = str;
            J(str);
            if (this.a0.a().intValue() == 0) {
                this.a0.j = 1;
                com.polestar.domultiple.db.a.a(this).a.update(this.a0);
                this.F.notifyDataSetChanged();
            }
            this.a0 = null;
            return;
        }
        P();
        if (!ky5.e() && ky5.a(PolestarApp.b, "spc_ever_cloned", false) && System.currentTimeMillis() - this.j0 > bg6.b("home_ad_refresh_interval_s") * 1000 && !ky5.e()) {
            if (this.X == null) {
                this.X = uo2.e(this, "slot_home_new");
            }
            f6.a("slot_home_new");
            if (this.X.i()) {
                this.X.g = H();
                this.X.l(this, 2, 1200L, new i0(this));
            }
            AppLoadingActivity.K(this);
        }
        if (rq0.f(this).f.size() > 0) {
            this.T.setVisibility(0);
            this.T.postDelayed(new a(), 13000L);
            if (!AddCloneActivity.X) {
                uo2.e(this, "slot_clone_finish_ad").l(this, 2, 0L, null);
            }
        } else {
            String str2 = this.Z;
            if (str2 == null || ky5.a(PolestarApp.b, "is_rated", false)) {
                z = false;
            } else {
                String strC = bg6.c("clone_rate_package");
                if ("off".equalsIgnoreCase(strC)) {
                    z = false;
                } else if (ky5.b(PolestarApp.b, "love_app", 0) == -1) {
                    long jB = bg6.b("clone_rate_interval") * 3600000;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    long jC = ky5.c(this, "last_rate_dialog", -1L);
                    if (jC == -1) {
                        jC = st0.c(this, getPackageName());
                    }
                    if (jCurrentTimeMillis - jC < jB) {
                        z = false;
                    } else {
                        zEquals = "*".equals(strC);
                        if (!zEquals && (strArrSplit = strC.split(":")) != null && strArrSplit.length > 0) {
                            for (String str3 : strArrSplit) {
                                if (str3.equalsIgnoreCase(str2)) {
                                    zEquals = true;
                                    break;
                                }
                            }
                        }
                        if (zEquals) {
                            new Handler(Looper.getMainLooper()).postDelayed(new p(this, str2), 800L);
                            z = true;
                        } else {
                            z = false;
                        }
                    }
                } else {
                    zEquals = "*".equals(strC);
                    if (!zEquals) {
                        while (i < r7) {
                            if (str3.equalsIgnoreCase(str2)) {
                                zEquals = true;
                                break;
                            }
                        }
                    }
                    if (zEquals) {
                        new Handler(Looper.getMainLooper()).postDelayed(new p(this, str2), 800L);
                        z = true;
                    } else {
                        z = false;
                    }
                }
            }
            if (!z) {
                if (this.Z == null || c76.f()) {
                    z2 = false;
                } else {
                    long jB2 = bg6.b("guide_quick_switch_times");
                    int iB = ky5.b(PolestarApp.b, "guide_quick_switch_times", 0);
                    if (iB >= jB2) {
                        z2 = false;
                    } else if (System.currentTimeMillis() - ky5.c(PolestarApp.b, "guide_quick_switch_last", 0L) < bg6.b("guide_quick_switch_interval_s") * ((long) (iB * 1000))) {
                        z2 = false;
                    } else {
                        new Handler(Looper.getMainLooper()).postDelayed(new q(this, iB), 800L);
                        z2 = true;
                    }
                }
                if (!z2) {
                    h23 h23Var = this.g0;
                    if (h23Var != null) {
                        nu5.a(this, (qu5) h23Var);
                        this.g0 = null;
                    }
                    if (this.h0) {
                        cp1.a().getClass();
                        if (cp1.c() && !AddCloneActivity.X) {
                            f6.a("slot_clone_finish_ad");
                            h23 h23VarH = uo2.e(this, "slot_clone_finish_ad").h();
                            if (h23VarH == null) {
                                h23VarH = uo2.e(this, "slot_clone_finish_ad").g();
                            }
                            if (h23VarH != null) {
                                h23VarH.show(this);
                                ky5.i(PolestarApp.b, "clone_finish_ad_time", System.currentTimeMillis());
                            }
                        }
                    }
                }
            }
            this.Z = null;
            this.h0 = false;
        }
        cp1.a().getClass();
        if (cp1.d()) {
            ExitDialog.h();
        }
        List<uq0> list = this.C;
        if (list != null && (homeGridAdapter = this.F) != null) {
            homeGridAdapter.c(list);
        }
        this.T.postDelayed(new b(), 500L);
        if (ky5.e()) {
            this.Y.setVisibility(8);
        } else if (this.f0) {
            this.f0 = false;
            x40.a().c(new c());
        }
    }

    public class h implements j23 {
        public h() {
        }

        @Override // io.j23
        public final void e(h23 h23Var) {
            HomeActivity.this.g0 = h23Var;
        }

        @Override // io.j23
        public final void a(h23 h23Var) {
        }

        @Override // io.j23
        public final void b(h23 h23Var) {
        }

        @Override // io.j23
        public final void c(h23 h23Var) {
        }

        @Override // io.j23
        public final void d(String str) {
        }
    }
}
