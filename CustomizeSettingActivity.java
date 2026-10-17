package com.polestar.domultiple.components.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.polestar.clone.CustomizeAppData;
import io.d75;
import io.rq0;
import io.uq0;
import java.util.ArrayList;
import java.util.Objects;
import p000do.multiple.cloner.R;

/* JADX INFO: loaded from: classes2.dex */
public class CustomizeSettingActivity extends BaseActivity {
    public ListView C;
    public ArrayList D;
    public BaseAdapter E;

    public class a extends BaseAdapter {
        public a() {
        }

        @Override // android.widget.Adapter
        public final int getCount() {
            return CustomizeSettingActivity.this.D.size();
        }

        @Override // android.widget.Adapter
        public final Object getItem(int i) {
            return CustomizeSettingActivity.this.D.get(i);
        }

        @Override // android.widget.Adapter
        public final long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public final View getView(int i, View view, ViewGroup viewGroup) {
            CustomizeSettingActivity customizeSettingActivity = CustomizeSettingActivity.this;
            uq0 uq0Var = (uq0) customizeSettingActivity.D.get(i);
            if (uq0Var == null) {
                return null;
            }
            if (view == null) {
                view = customizeSettingActivity.getLayoutInflater().inflate(R.layout.custom_app_list_item, viewGroup, false);
            }
            if (view != null) {
                ImageView imageView = (ImageView) view.findViewById(R.id.item_icon);
                TextView textView = (TextView) view.findViewById(R.id.item_name);
                CustomizeAppData customizeAppDataB = CustomizeAppData.b(uq0Var.c(), uq0Var.b);
                imageView.setImageBitmap(customizeAppDataB.a());
                textView.setText(customizeAppDataB.g ? customizeAppDataB.e : uq0Var.d);
            }
            Objects.toString(view);
            return view;
        }
    }

    public class b implements AdapterView.OnItemClickListener {
        public b() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            CustomizeSettingActivity customizeSettingActivity = CustomizeSettingActivity.this;
            uq0 uq0Var = (uq0) customizeSettingActivity.D.get(i);
            if (uq0Var == null) {
                return;
            }
            String str = uq0Var.b;
            int iC = uq0Var.c();
            int i2 = CustomizeIconActivity.m;
            Intent intent = new Intent(customizeSettingActivity, (Class<?>) CustomizeIconActivity.class);
            intent.putExtra("app_packagename", str);
            intent.putExtra("app_userid", iC);
            customizeSettingActivity.startActivity(intent);
            customizeSettingActivity.overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
        }
    }

    @Override // com.polestar.domultiple.components.ui.BaseActivity
    public final boolean D() {
        return true;
    }

    @Override // com.polestar.domultiple.components.ui.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@d75 Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.customize_setting_activity_layout);
        C(getString(R.string.customize_title));
        TextView textView = (TextView) findViewById(R.id.text_customize_hint);
        this.C = (ListView) findViewById(R.id.customize_apps);
        ArrayList arrayList = rq0.f(this).a;
        this.D = arrayList;
        if (arrayList.size() == 0) {
            textView.setText(getString(R.string.customize_setting_no_clone));
        }
        a aVar = new a();
        this.E = aVar;
        this.C.setAdapter((ListAdapter) aVar);
        this.C.setOnItemClickListener(new b());
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        this.E.notifyDataSetChanged();
    }
}
