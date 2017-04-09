package test.ya.translater.wgjuh.yaapitmvptest.model.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import static test.ya.translater.wgjuh.yaapitmvptest.model.db.Contractor.*;


/**
 * Created by wGJUH on 25.03.2017.
 */

public class DbOpenHelper extends SQLiteOpenHelper {

    private static final int DB_VERSION = 1;

    public DbOpenHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE " + DB_TABLE_LANGS + "(" +
                Contractor.Langs.ID + " INTEGER PRIMARY KEY, " +
                Contractor.Langs.CODE + " TEXT UNIQUE NOT NULL, " +
                Contractor.Langs.NAME + " TEXT UNIQUE NOT NULL" +
                ")");
        db.execSQL("CREATE TABLE " + DB_TABLE_HISTORY + "(" +
                Translate.ID + " INTEGER PRIMARY KEY, " +
                Translate.TARGET + " TEXT NOT NULL, "+
                Translate.LANGS + " TEXT NOT NULL, "+
                Translate.JSON + " TEXT NOT NULL, " +
                Translate.DATE + " INTEGER NOT NULL " + ")");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}