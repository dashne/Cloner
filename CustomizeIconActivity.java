package com.polestar.domultiple.components.ui;

import android.app.Activity;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.SeekBar;
import com.polestar.clone.CustomizeAppData;
import com.polestar.clone.os.VUserHandle;
import io.d75;
import io.pj4;
import io.r50;
import io.rq0;
import io.u22;
import io.uq0;
import java.io.File;
import p000do.multiple.cloner.R;

/* JADX INFO: loaded from: classes2.dex */
public class CustomizeIconActivity extends Activity implements SeekBar.OnSeekBarChangeListener {
    public static final /* synthetic */ int m = 0;
    public SeekBar a;
    public SeekBar b;
    public SeekBar c;
    public EditText d;
    public CheckBox e;
    public String f;
    public CustomizeAppData g;
    public uq0 h;
    public Drawable i;
    public Bitmap j;
    public ImageView k;
    public int l;

    public class a implements CompoundButton.OnCheckedChangeListener {
        public a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            CustomizeIconActivity customizeIconActivity = CustomizeIconActivity.this;
            customizeIconActivity.g.d = z;
            customizeIconActivity.a();
        }
    }

    public final void a() {
        this.c.setProgress(this.g.c);
        this.b.setProgress(this.g.b);
        this.a.setProgress(this.g.a);
        this.e.setChecked(this.g.d);
        CustomizeAppData customizeAppData = this.g;
        float f = 127;
        this.j = r50.f(this, r50.c(this.i), (((customizeAppData.a - 127) * 1.0f) / f) * 180.0f, (customizeAppData.b * 1.0f) / f, (customizeAppData.c * 1.0f) / f);
        if (this.g.d) {
            this.j = r50.a(this, new BitmapDrawable(this.j), this.h.c());
        }
        this.k.setImageBitmap(this.j);
    }

    public void onCancel(View view) {
        finish();
    }

    public void onConfirm(View view) {
        String string = this.d.getText().toString();
        if (TextUtils.isEmpty(string)) {
            return;
        }
        u22.a("customize_icon_save");
        CustomizeAppData customizeAppData = this.g;
        customizeAppData.e = string;
        customizeAppData.c();
        try {
            File file = new File(getFilesDir() + "/icons");
            if (!file.exists()) {
                file.mkdirs();
            }
            r50.g(this.j, r50.e(this, this.f, this.l));
        } catch (Exception e) {
            pj4.d(Log.getStackTraceString(e));
        }
        new Thread(new l(this), "sync-settings").start();
        if (this.h.b().intValue() != 0) {
            rq0.n();
        }
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(@d75 Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.customize_dialog_layout);
        u22.a("customize_icon_enter");
        this.a = (SeekBar) findViewById(R.id.seek_bar_hue);
        this.b = (SeekBar) findViewById(R.id.seek_bar_sat);
        this.c = (SeekBar) findViewById(R.id.seek_bar_light);
        this.a.setOnSeekBarChangeListener(this);
        this.c.setOnSeekBarChangeListener(this);
        this.b.setOnSeekBarChangeListener(this);
        this.d = (EditText) findViewById(R.id.app_label);
        CheckBox checkBox = (CheckBox) findViewById(R.id.badge_checkbox);
        this.e = checkBox;
        checkBox.setOnCheckedChangeListener(new a());
        this.k = (ImageView) findViewById(R.id.app_icon);
        this.f = getIntent().getStringExtra("app_packagename");
        this.l = getIntent().getIntExtra("app_userid", VUserHandle.b());
        if (this.f != null) {
            this.h = rq0.f(this).e(this.l, this.f);
        }
        if (this.h == null) {
            finish();
            return;
        }
        try {
            this.i = getPackageManager().getApplicationIcon(this.f);
            CustomizeAppData customizeAppDataB = CustomizeAppData.b(this.l, this.f);
            this.g = customizeAppDataB;
            if (customizeAppDataB.e == null) {
                customizeAppDataB.e = String.format(getString(R.string.clone_label_tag), this.h.d);
            }
            this.d.setText(this.g.e);
            this.d.setSelection(Math.min(this.g.e.length(), 36));
            a();
        } catch (PackageManager.NameNotFoundException unused) {
            finish();
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        switch (seekBar.getId()) {
            case R.id.seek_bar_hue /* 2131296635 */:
                this.g.a = i;
                break;
            case R.id.seek_bar_light /* 2131296636 */:
                this.g.c = i;
                break;
            case R.id.seek_bar_sat /* 2131296637 */:
                this.g.b = i;
                break;
        }
        a();
    }

    public void onReset(View view) {
        CustomizeAppData customizeAppData = this.g;
        customizeAppData.d = true;
        customizeAppData.a = 127;
        customizeAppData.b = 127;
        customizeAppData.c = 127;
        customizeAppData.e = String.format(getString(R.string.clone_label_tag), this.h.d);
        a();
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
    }
}
