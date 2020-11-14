package Controller;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import Util.Utils;

public class DatabaseHelper extends SQLiteOpenHelper {
    public DatabaseHelper(@Nullable Context context) {
        super(context, Utils.DATABASE_NAME,null, Utils.DATABASE_VERSION);    }

    @Override
    public void onCreate(SQLiteDatabase db) {
db.execSQL("CREATE TABLE "+Utils.TABLE_NAME + " (" + Utils.COLOUMN_ID +" INTEGER PRIMARY KEY AUTOINCREMENT,"
+ Utils.COLOUMN_NAME + " Text,"
+ Utils.COLOUMN_LNAME + " Text,"
+ Utils.COLOUMN_AGE + " Text,"
+ Utils.COLOUMN_DESCRIPTION + " Text,"
+ Utils.COLOUMN_TIME_STAMP + " DATETIME DEFAULT CURRENT_TIMESTAMP"+ ") ");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS "+ Utils.TABLE_NAME);
        onCreate(db);

    }
}
