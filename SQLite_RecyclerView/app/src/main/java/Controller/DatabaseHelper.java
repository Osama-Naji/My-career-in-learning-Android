package Controller;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import Model.Data;
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

    public long InsertData (Data data){
        SQLiteDatabase database = this.getWritableDatabase();
        ContentValues values =new ContentValues();
        values.put(Utils.COLOUMN_NAME,data.getName());
        values.put(Utils.COLOUMN_LNAME,data.getLname());
        values.put(Utils.COLOUMN_AGE,data.getAge());
        values.put(Utils.COLOUMN_DESCRIPTION,data.getDesrption());
        Long id =database.insert(Utils.TABLE_NAME,null,values);
        database.close();
        return id;

    }
    public int UpdateData (Data data){
        SQLiteDatabase database = this.getWritableDatabase();
        ContentValues values =new ContentValues();
        values.put(Utils.COLOUMN_NAME,data.getName());
        values.put(Utils.COLOUMN_LNAME,data.getLname());
        values.put(Utils.COLOUMN_AGE,data.getAge());
        values.put(Utils.COLOUMN_DESCRIPTION,data.getDesrption());
        int id =database.update(Utils.TABLE_NAME,values,Utils.COLOUMN_ID +"=?",new String[]{Utils.COLOUMN_ID});
database.close();
        return id;
    }

    public void DeleteData (Data data){
        SQLiteDatabase database = this.getWritableDatabase();
        database.delete(Utils.TABLE_NAME,Utils.COLOUMN_ID +"=?",new String[]{Utils.COLOUMN_ID});
        database.close();

    }
}
