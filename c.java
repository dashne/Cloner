package com.polestar.domultiple.db;

import android.util.Log;
import io.rb1;
import org.greenrobot.greendao.AbstractDaoMaster;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseOpenHelper;
import org.greenrobot.greendao.identityscope.IdentityScopeType;

/* JADX INFO: compiled from: DaoMaster.java */
/* JADX INFO: loaded from: classes2.dex */
public class c extends AbstractDaoMaster {

    /* JADX INFO: compiled from: DaoMaster.java */
    public static class a extends b {
        @Override // org.greenrobot.greendao.database.DatabaseOpenHelper
        public void onUpgrade(Database database, int i, int i2) {
            Log.i("greenDAO", "Upgrading schema from version " + i + " to " + i2 + " by dropping all tables");
            CloneModelDao.dropTable(database, true);
            onCreate(database);
        }
    }

    /* JADX INFO: compiled from: DaoMaster.java */
    public static abstract class b extends DatabaseOpenHelper {
        @Override // org.greenrobot.greendao.database.DatabaseOpenHelper
        public final void onCreate(Database database) {
            Log.i("greenDAO", "Creating tables for schema version 2");
            CloneModelDao.createTable(database, false);
        }
    }

    @Override // org.greenrobot.greendao.AbstractDaoMaster
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final rb1 newSession() {
        return new rb1(this.db, IdentityScopeType.Session, this.daoConfigMap);
    }

    @Override // org.greenrobot.greendao.AbstractDaoMaster
    public final AbstractDaoSession newSession(IdentityScopeType identityScopeType) {
        return new rb1(this.db, identityScopeType, this.daoConfigMap);
    }
}
