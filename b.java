package com.polestar.domultiple.task;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.polestar.domultiple.PolestarApp;
import com.polestar.domultiple.task.TaskExecutor.a;
import com.polestar.domultiple.task.TaskExecutor.b;
import com.polestar.task.network.datamodels.User;
import io.am6;
import io.c5;
import io.c6;
import io.i;
import io.k23;
import io.ki6;
import io.mz7;
import io.uc1;
import io.uo2;
import io.vc1;
import io.xe9;
import java.security.MessageDigest;
import java.util.HashSet;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: compiled from: AppUser.java */
/* JADX INFO: loaded from: classes2.dex */
public class b implements k23 {
    public static b c;
    public final String a;
    public final String b;

    /* JADX INFO: compiled from: AppUser.java */
    public class a implements RewardInfoFetcher.a {
    }

    /* JADX INFO: renamed from: com.polestar.domultiple.task.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AppUser.java */
    public interface InterfaceC0231b {
    }

    public b() {
        uc1 uc1VarA = vc1.a(PolestarApp.b);
        new Handler(Looper.getMainLooper());
        new HashSet();
        this.b = c();
        User user = uc1VarA.c;
        if (user != null) {
            this.a = user.mReferralCode;
        }
        RewardInfoFetcher rewardInfoFetcherA = RewardInfoFetcher.a(PolestarApp.b);
        a aVar = new a();
        synchronized (rewardInfoFetcherA) {
            rewardInfoFetcherA.d.add(aVar);
        }
        Handler handler = RewardInfoFetcher.a(PolestarApp.b).a;
        handler.removeMessages(1);
        handler.sendMessage(handler.obtainMessage(1));
        uo2.c cVar = uo2.s;
        synchronized (uo2.class) {
            try {
                if (uo2.y == null) {
                    uo2.y = new HashSet<>();
                }
                uo2.y.add(this);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized b b() {
        try {
            if (c == null) {
                c = new b();
            }
        } catch (Throwable th) {
            throw th;
        }
        return c;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0046  */
    /* JADX WARN: Code duplicated, block: B:17:0x0051  */
    /* JADX WARN: Code duplicated, block: B:19:0x0058  */
    /* JADX WARN: Code duplicated, block: B:21:0x005b  */
    /* JADX WARN: Code duplicated, block: B:23:0x005e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0062 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x0066  */
    /* JADX WARN: Code duplicated, block: B:30:0x0072  */
    /* JADX WARN: Code duplicated, block: B:32:0x007a  */
    /* JADX WARN: Code duplicated, block: B:34:0x0087  */
    /* JADX WARN: Code duplicated, block: B:36:0x0093  */
    /* JADX WARN: Code duplicated, block: B:40:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:44:0x00db  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:50:0x0108  */
    /* JADX WARN: Code duplicated, block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.k23
    public final void a(c6 c6Var) {
        int i;
        int i2;
        TaskExecutor.b bVar;
        int i3;
        b bVar2;
        int iIntValue;
        c6 adTask;
        String str;
        TaskExecutor taskExecutor = new TaskExecutor(PolestarApp.b);
        TaskExecutor.a aVar = taskExecutor.new a();
        Object[] objArr = {0};
        if (c6Var != 0) {
            if (mz7.c(c6Var.mId, false) >= c6Var.mLimitPerDay || mz7.b(c6Var.mId).getInt("task_count", 0) >= c6Var.mLimitTotal) {
                i = 2001;
            } else {
                i = 2000;
                i2 = 2000;
            }
            bVar = taskExecutor.new b(aVar);
            if (i != i2) {
                taskExecutor.c.post(new e(bVar, c6Var, i));
                return;
            }
            i3 = c6Var.mTaskType;
            bVar2 = taskExecutor.b;
            if (i3 != 1) {
                iIntValue = ((Integer) objArr[0]).intValue();
                adTask = c6Var.getAdTask();
                if (iIntValue != 0) {
                    if ("cpc".equals(adTask.e)) {
                        bVar2.getClass();
                        c5.a(bVar2.b, c6Var.mId, null, bVar);
                        return;
                    } else {
                        if ("cpi".equals(adTask.e)) {
                            mz7.a().edit().putLong(xe9.n(adTask.mId, "pending_task_"), System.currentTimeMillis()).commit();
                            return;
                        }
                        return;
                    }
                }
                if (iIntValue == 1 || !"cpi".equals(adTask.e)) {
                    return;
                }
                bVar2.getClass();
                c5.a(bVar2.b, c6Var.mId, null, bVar);
                long j = adTask.mId;
                mz7.a().edit().remove("pending_task_" + j).commit();
                return;
            }
            if (i3 != 2) {
                if (i3 != 3) {
                    am6 am6Var = (am6) c6Var;
                    Activity activity = (Activity) objArr[0];
                    uo2 uo2VarE = uo2.e(taskExecutor.a, am6Var.a);
                    f fVar = new f(taskExecutor, activity, uo2VarE, bVar, am6Var);
                    Objects.toString(fVar);
                    uo2VarE.l(activity, 2, 1000L, fVar);
                    return;
                }
                if (i3 != 4) {
                    str = (String) objArr[0];
                    if (TextUtils.isEmpty(str)) {
                        return;
                    }
                    if (str.equals(bVar2.a)) {
                        bVar.a(c6Var.mId, new i(7, ki6.m));
                        return;
                    } else {
                        c5.a(bVar2.b, c6Var.mId, (String) objArr[0], bVar);
                        return;
                    }
                }
                if (i3 != 7) {
                    return;
                }
            }
            bVar2.getClass();
            c5.a(bVar2.b, c6Var.mId, null, bVar);
        }
        i = 2003;
        i2 = 2000;
        bVar = taskExecutor.new b(aVar);
        if (i != i2) {
            taskExecutor.c.post(new e(bVar, c6Var, i));
            return;
        }
        i3 = c6Var.mTaskType;
        bVar2 = taskExecutor.b;
        if (i3 != 1) {
            iIntValue = ((Integer) objArr[0]).intValue();
            adTask = c6Var.getAdTask();
            if (iIntValue != 0) {
                if (iIntValue == 1) {
                    return;
                } else {
                    return;
                }
            } else if ("cpc".equals(adTask.e)) {
                bVar2.getClass();
                c5.a(bVar2.b, c6Var.mId, null, bVar);
                return;
            } else {
                if ("cpi".equals(adTask.e)) {
                    mz7.a().edit().putLong(xe9.n(adTask.mId, "pending_task_"), System.currentTimeMillis()).commit();
                    return;
                }
                return;
            }
        }
        if (i3 != 2) {
            if (i3 != 3) {
                am6 am6Var2 = (am6) c6Var;
                Activity activity2 = (Activity) objArr[0];
                uo2 uo2VarE2 = uo2.e(taskExecutor.a, am6Var2.a);
                f fVar2 = new f(taskExecutor, activity2, uo2VarE2, bVar, am6Var2);
                Objects.toString(fVar2);
                uo2VarE2.l(activity2, 2, 1000L, fVar2);
                return;
            }
            if (i3 != 4) {
                str = (String) objArr[0];
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                if (str.equals(bVar2.a)) {
                    bVar.a(c6Var.mId, new i(7, ki6.m));
                    return;
                } else {
                    c5.a(bVar2.b, c6Var.mId, (String) objArr[0], bVar);
                    return;
                }
            }
            if (i3 != 7) {
                return;
            }
        }
        bVar2.getClass();
        c5.a(bVar2.b, c6Var.mId, null, bVar);
    }

    public final String c() {
        String str = this.b;
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String string = null;
        String string2 = mz7.a().getString("my_user_id", null);
        if (!TextUtils.isEmpty(string2)) {
            return string2;
        }
        if (TextUtils.isEmpty(string2)) {
            PolestarApp polestarApp = PolestarApp.b;
            if (polestarApp.checkCallingOrSelfPermission("android.permission.READ_PHONE_STATE") == 0) {
                try {
                    string2 = ((TelephonyManager) polestarApp.getSystemService("phone")).getDeviceId();
                } catch (Exception unused) {
                    string2 = null;
                }
            } else {
                string2 = null;
            }
        }
        if (TextUtils.isEmpty(string2)) {
            try {
                string2 = Settings.Secure.getString(PolestarApp.b.getContentResolver(), "android_id");
            } catch (Exception unused2) {
                string2 = null;
            }
        }
        if (TextUtils.isEmpty(string2)) {
            string2 = UUID.randomUUID().toString();
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(string2.getBytes());
            byte[] bArrDigest = messageDigest.digest();
            if (bArrDigest != null) {
                int length = bArrDigest.length;
                StringBuilder sb = new StringBuilder(length * 2);
                for (int i = 0; i < length; i++) {
                    sb.append("0123456789abcdef".charAt((bArrDigest[i] & 240) >>> 4));
                    sb.append("0123456789abcdef".charAt(bArrDigest[i] & 15));
                }
                string = sb.toString();
            }
        } catch (Exception unused3) {
        }
        mz7.a().edit().putString("my_user_id", string).commit();
        return string;
    }
}
