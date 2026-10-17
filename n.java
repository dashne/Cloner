package com.polestar.domultiple.components.ui;

import android.text.Editable;
import android.text.TextWatcher;

/* JADX INFO: compiled from: FeedbackActivity.java */
/* JADX INFO: loaded from: classes2.dex */
class n implements TextWatcher {
    public final /* synthetic */ FeedbackActivity a;

    public n(FeedbackActivity feedbackActivity) {
        this.a = feedbackActivity;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int length = editable.toString().length();
        FeedbackActivity feedbackActivity = this.a;
        if (length > 0) {
            feedbackActivity.E.setEnabled(true);
        } else {
            feedbackActivity.E.setEnabled(false);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
