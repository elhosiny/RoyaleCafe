package com.example.work.caferoyale;

/**
 * Created by elhosiny on 11/12/2016.
 */
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by elhosiny on 11/12/2016.
 */

public class DBHelper extends SQLiteOpenHelper {

    private final static int DATABASE_VERSION = 1 ;
    private final static String DATABASE_NAME = "Services";
    private final static String TABLE_NAME = "Customer" ;

    private final static String KEY_PHONE = "phone";
    private final static String KEY_NAME = "name";
    private final static String KEY_DRINK = "drink";
    private final static String KEY_MEAL = "meal";
    private final static String KEY_OTHERS = "others";




    public DBHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DATABASE_NAME, factory, DATABASE_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {

        String     query_create =    "CREATE TABLE Customer (phone TEXT ,  name TEXT, drink TEXT, meal TEXT , others TEXT  ) ";
        db.execSQL(query_create);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        String upgrde = "DROP TABLE IF EXISTS" + TABLE_NAME ;
        db.execSQL(upgrde);
        onCreate(db);

    }


    public void addCustomer (Customer customer){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(KEY_PHONE , customer.getPhone());
        cv.put(KEY_NAME , customer.getName());
        cv.put(KEY_DRINK , customer.getDrink());
        cv.put(KEY_MEAL , customer.getMeal());
        cv.put(KEY_OTHERS , customer.getOthers());
        db.insert(TABLE_NAME ,null ,cv);
        db.close();
    }

    public void eraseCustomer(String phone){
        String delete = "DELETE FROM Customer WHERE phone=" + phone ;
        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL(delete);
        db.close();


    }
    public void updateCustomer (Customer customer){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(KEY_PHONE , customer.getPhone());
        cv.put(KEY_NAME , customer.getName());
        cv.put(KEY_DRINK , customer.getDrink());
        cv.put(KEY_MEAL , customer.getMeal());
        cv.put(KEY_OTHERS , customer.getOthers());


        db.update(TABLE_NAME,cv,KEY_PHONE  +"='"+customer.getPhone()+"'",null);
        db.close();

    }
    public String [] getCustomer (String phone){
        String phone1 = "";
        String drink = "";
        String meal = "";
        String others = "";
        SQLiteDatabase db = this.getReadableDatabase();
        String select = "SELECT * FROM Customer WHERE phone=" + phone ;
        Cursor c = db.rawQuery( select,null);
        c.moveToFirst();
        phone1 = c.getString(c.getColumnIndex("phone"));
        drink = c.getString(c.getColumnIndex("drink"));
        meal = c.getString(c.getColumnIndex("meal"));
        others = c.getString(c.getColumnIndex("others"));



        String [] all = {phone1 ,drink , meal , others};
        c.close();
        db.close();
        return all;
    }

}