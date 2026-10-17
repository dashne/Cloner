package com.polestar.domultiple.components.ui;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import io.d75;
import io.dy3;
import p000do.multiple.cloner.R;

/* JADX INFO: loaded from: classes2.dex */
public class BaseActivity extends AppCompatActivity {
    public TextView B;

    public final View B(View view) {
        View viewInflate = LayoutInflater.from(this).inflate(R.layout.common_layout, (ViewGroup) null);
        FrameLayout frameLayout = (FrameLayout) viewInflate.findViewById(R.id.content_home);
        this.B = (TextView) viewInflate.findViewById(R.id.title);
        frameLayout.addView(view);
        View viewFindViewById = viewInflate.findViewById(R.id.title_bar_layout);
        getWindow().addFlags(67108864);
        Context baseContext = getBaseContext();
        int identifier = baseContext.getResources().getIdentifier("status_bar_height", "dimen", "android");
        viewFindViewById.setPadding(0, identifier > 0 ? baseContext.getResources().getDimensionPixelSize(identifier) : 0, 0, 0);
        return viewInflate;
    }

    public final void C(String str) {
        TextView textView = this.B;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public boolean D() {
        return !(this instanceof AppLoadingActivity);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        try {
            super.onBackPressed();
        } catch (Exception unused) {
            finish();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@d75 Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT != 26) {
            setRequestedOrientation(1);
        }
        getWindow().addFlags(67108864);
    }

    public void onNavigationClick(View view) {
        onBackPressed();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void setContentView(@dy3 int i) {
        if (D()) {
            super.setContentView(B(LayoutInflater.from(this).inflate(i, (ViewGroup) null)));
        } else {
            super.setContentView(i);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        if (D()) {
            super.setContentView(B(view));
        } else {
            super.setContentView(view);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        if (D()) {
            super.setContentView(B(view), layoutParams);
        } else {
            super.setContentView(view, layoutParams);
        }
    }

    public void onMenuClick(View view) {
    }
}
