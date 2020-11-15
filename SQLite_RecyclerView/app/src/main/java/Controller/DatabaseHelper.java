package Controller;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

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
    public Data GetData (int id){
        SQLiteDatabase database = this.getReadableDatabase();
        Cursor cursor = database.query(Utils.TABLE_NAME,new String[]{
                Utils.COLOUMN_ID,Utils.COLOUMN_NAME,Utils.COLOUMN_LNAME,
                Utils.COLOUMN_AGE,Utils.COLOUMN_DESCRIPTION,Utils.COLOUMN_TIME_STAMP}
        ,null,null,null,null,null,null);

        Data data = new Data();
        if(cursor !=null){
cursor.moveToFirst();
            data.setId(cursor.getInt(cursor.getColumnIndex(Utils.COLOUMN_ID)));
            data.setName(cursor.getString(cursor.getColumnIndex(Utils.COLOUMN_NAME)));
            data.setLname(cursor.getString(cursor.getColumnIndex(Utils.COLOUMN_LNAME)));
            data.setDesrption(cursor.getString(cursor.getColumnIndex(Utils.COLOUMN_DESCRIPTION)));
            data.setTimeStamp(cursor.getString(cursor.getColumnIndex(Utils.COLOUMN_TIME_STAMP)));
cursor.close();


        }
        return data;
    }

    public List <Data> GetAllData (int id){
        SQLiteDatabase database = this.getReadableDatabase();
       List <Data> ListAllData = new ArrayList<Data>();
       String quary = "SELECT * FROM "+ Utils.TABLE_NAME;
        Cursor cursor = database.rawQuery(quary,null);

        Data data = new Data();
        if(cursor != null) {

            do {

                data.setId(cursor.getInt(cursor.getColumnIndex(Utils.COLOUMN_ID)));
                data.setName(cursor.getString(cursor.getColumnIndex(Utils.COLOUMN_NAME)));
                data.setLname(cursor.getString(cursor.getColumnIndex(Utils.COLOUMN_LNAME)));
                data.setDesrption(cursor.getString(cursor.getColumnIndex(Utils.COLOUMN_DESCRIPTION)));
                data.setTimeStamp(cursor.getString(cursor.getColumnIndex(Utils.COLOUMN_TIME_STAMP)));
                cursor.close();
                ListAllData.add(data);
            } while (cursor.moveToFirst());
        }
database.close();
return ListAllData;






    }
}
