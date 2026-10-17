package com.polestar.domultiple.components.ui;

import android.content.Intent;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: compiled from: FeedbackActivity.java */
/* JADX INFO: loaded from: classes2.dex */
class m extends ClickableSpan {
    public final /* synthetic */ FeedbackActivity a;

    public m(FeedbackActivity feedbackActivity) {
        this.a = feedbackActivity;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        FeedbackActivity feedbackActivity = this.a;
        feedbackActivity.startActivity(new Intent(feedbackActivity, (Class<?>) FaqActivity.class));
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setColor(-16776961);
        textPaint.setUnderlineText(true);
    }
}
