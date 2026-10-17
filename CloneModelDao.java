package com.polestar.domultiple.db;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import io.ki6;
import io.rb1;
import io.uq0;
import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;
import org.greenrobot.greendao.internal.DaoConfig;

/* JADX INFO: loaded from: classes2.dex */
public class CloneModelDao extends AbstractDao<uq0, Long> {
    public static final String TABLENAME = "CLONE_MODEL";

    public static class Properties {
        public static final Property Id = new Property(0, Long.class, "id", true, "_id");
        public static final Property PackageName = new Property(1, String.class, "packageName", false, "PACKAGE_NAME");
        public static final Property Path = new Property(2, String.class, "path", false, "PATH");
        public static final Property Name = new Property(3, String.class, AppMeasurementSdk.a.b, false, "NAME");
        public static final Property Description = new Property(4, String.class, "description", false, "DESCRIPTION");
        public static final Property Index = new Property(5, Integer.TYPE, "index", false, "INDEX");
        public static final Property ClonedTime = new Property(6, Long.TYPE, "clonedTime", false, "CLONED_TIME");
        public static final Property NotificationEnable = new Property(7, Boolean.class, "notificationEnable", false, "NOTIFICATION_ENABLE");
        public static final Property LockerState = new Property(8, Integer.class, "lockerState", false, "LOCKER_STATE");
        public static final Property Launched = new Property(9, Integer.class, "launched", false, "LAUNCHED");
    }

    public CloneModelDao(DaoConfig daoConfig) {
        super(daoConfig);
    }

    public static void createTable(Database database, boolean z) {
        database.execSQL("CREATE TABLE " + (z ? "IF NOT EXISTS " : ki6.m) + "\"CLONE_MODEL\" (\"_id\" INTEGER PRIMARY KEY ,\"PACKAGE_NAME\" TEXT,\"PATH\" TEXT,\"NAME\" TEXT,\"DESCRIPTION\" TEXT,\"INDEX\" INTEGER NOT NULL ,\"CLONED_TIME\" INTEGER NOT NULL ,\"NOTIFICATION_ENABLE\" INTEGER,\"LOCKER_STATE\" INTEGER,\"LAUNCHED\" INTEGER);");
    }

    public static void dropTable(Database database, boolean z) {
        StringBuilder sb = new StringBuilder("DROP TABLE ");
        sb.append(z ? "IF EXISTS " : ki6.m);
        sb.append("\"CLONE_MODEL\"");
        database.execSQL(sb.toString());
    }

    public boolean hasKey(uq0 uq0Var) {
        return uq0Var.a != null;
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final boolean isEntityUpdateable() {
        return true;
    }

    public CloneModelDao(DaoConfig daoConfig, rb1 rb1Var) {
        super(daoConfig, rb1Var);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public Long getKey(uq0 uq0Var) {
        if (uq0Var != null) {
            return uq0Var.a;
        }
        return null;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.greenrobot.greendao.AbstractDao
    public Long readKey(Cursor cursor, int i) {
        if (cursor.isNull(i)) {
            return null;
        }
        return Long.valueOf(cursor.getLong(i));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final Long updateKeyAfterInsert(uq0 uq0Var, long j) {
        uq0Var.a = Long.valueOf(j);
        return Long.valueOf(j);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(DatabaseStatement databaseStatement, uq0 uq0Var) {
        databaseStatement.clearBindings();
        Long l = uq0Var.a;
        if (l != null) {
            databaseStatement.bindLong(1, l.longValue());
        }
        String str = uq0Var.b;
        if (str != null) {
            databaseStatement.bindString(2, str);
        }
        String str2 = uq0Var.c;
        if (str2 != null) {
            databaseStatement.bindString(3, str2);
        }
        String str3 = uq0Var.d;
        if (str3 != null) {
            databaseStatement.bindString(4, str3);
        }
        String str4 = uq0Var.e;
        if (str4 != null) {
            databaseStatement.bindString(5, str4);
        }
        databaseStatement.bindLong(6, uq0Var.f);
        databaseStatement.bindLong(7, uq0Var.g);
        Boolean bool = uq0Var.h;
        databaseStatement.bindLong(8, bool == null ? false : bool.booleanValue() ? 1L : 0L);
        databaseStatement.bindLong(9, uq0Var.b().intValue());
        databaseStatement.bindLong(10, uq0Var.a().intValue());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.greenrobot.greendao.AbstractDao
    public uq0 readEntity(Cursor cursor, int i) {
        Boolean boolValueOf;
        Long lValueOf = cursor.isNull(i) ? null : Long.valueOf(cursor.getLong(i));
        int i2 = i + 1;
        String string = cursor.isNull(i2) ? null : cursor.getString(i2);
        int i3 = i + 2;
        String string2 = cursor.isNull(i3) ? null : cursor.getString(i3);
        int i4 = i + 3;
        String string3 = cursor.isNull(i4) ? null : cursor.getString(i4);
        int i5 = i + 4;
        String string4 = cursor.isNull(i5) ? null : cursor.getString(i5);
        int i6 = cursor.getInt(i + 5);
        long j = cursor.getLong(i + 6);
        int i7 = i + 7;
        if (cursor.isNull(i7)) {
            boolValueOf = null;
        } else {
            boolValueOf = Boolean.valueOf(cursor.getShort(i7) != 0);
        }
        int i8 = i + 8;
        Integer numValueOf = cursor.isNull(i8) ? null : Integer.valueOf(cursor.getInt(i8));
        int i9 = i + 9;
        Integer numValueOf2 = cursor.isNull(i9) ? null : Integer.valueOf(cursor.getInt(i9));
        uq0 uq0Var = new uq0();
        uq0Var.a = lValueOf;
        uq0Var.b = string;
        uq0Var.c = string2;
        uq0Var.d = string3;
        uq0Var.e = string4;
        uq0Var.f = i6;
        uq0Var.g = j;
        uq0Var.h = boolValueOf;
        uq0Var.i = numValueOf;
        uq0Var.j = numValueOf2;
        return uq0Var;
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(SQLiteStatement sQLiteStatement, uq0 uq0Var) {
        sQLiteStatement.clearBindings();
        Long l = uq0Var.a;
        if (l != null) {
            sQLiteStatement.bindLong(1, l.longValue());
        }
        String str = uq0Var.b;
        if (str != null) {
            sQLiteStatement.bindString(2, str);
        }
        String str2 = uq0Var.c;
        if (str2 != null) {
            sQLiteStatement.bindString(3, str2);
        }
        String str3 = uq0Var.d;
        if (str3 != null) {
            sQLiteStatement.bindString(4, str3);
        }
        String str4 = uq0Var.e;
        if (str4 != null) {
            sQLiteStatement.bindString(5, str4);
        }
        sQLiteStatement.bindLong(6, uq0Var.f);
        sQLiteStatement.bindLong(7, uq0Var.g);
        Boolean bool = uq0Var.h;
        sQLiteStatement.bindLong(8, bool == null ? false : bool.booleanValue() ? 1L : 0L);
        sQLiteStatement.bindLong(9, uq0Var.b().intValue());
        sQLiteStatement.bindLong(10, uq0Var.a().intValue());
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public void readEntity(Cursor cursor, uq0 uq0Var, int i) {
        Boolean boolValueOf;
        uq0Var.a = cursor.isNull(i) ? null : Long.valueOf(cursor.getLong(i));
        int i2 = i + 1;
        uq0Var.b = cursor.isNull(i2) ? null : cursor.getString(i2);
        int i3 = i + 2;
        uq0Var.c = cursor.isNull(i3) ? null : cursor.getString(i3);
        int i4 = i + 3;
        uq0Var.d = cursor.isNull(i4) ? null : cursor.getString(i4);
        int i5 = i + 4;
        uq0Var.e = cursor.isNull(i5) ? null : cursor.getString(i5);
        uq0Var.f = cursor.getInt(i + 5);
        uq0Var.g = cursor.getLong(i + 6);
        int i6 = i + 7;
        if (cursor.isNull(i6)) {
            boolValueOf = null;
        } else {
            boolValueOf = Boolean.valueOf(cursor.getShort(i6) != 0);
        }
        uq0Var.h = boolValueOf;
        int i7 = i + 8;
        uq0Var.i = cursor.isNull(i7) ? null : Integer.valueOf(cursor.getInt(i7));
        int i8 = i + 9;
        uq0Var.j = cursor.isNull(i8) ? null : Integer.valueOf(cursor.getInt(i8));
    }
}
