package com.example.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME="Student.db";
    public static final String TABLE_NAME="student_table";
    public static final String COL_1="CID";
    public static final String COL_2="NAME";
    public static final String COL_3="EMAIL";
    public static final String COL_4="USERNAME";
    public static final String COL_5="PASSWORD";
    public static final String COL_6="ADDRESS";
    //public static final String COL_7="LONGITUDE_LATITUDE";
    public static final String COL_7="CUISINE";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
        SQLiteDatabase db=this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table "+TABLE_NAME+"(CID INTEGER PRIMARY KEY AUTOINCREMENT, NAME TEXT,EMAIL TEXT,USERNAME TEXT,PASSWORD TEXT,ADDRESS TEXT,CUISINE TEXT)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);
        onCreate(db);
    }
    public boolean insertData(String name,String email,String username,String password,String address, String cuisine) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_2,name);
        contentValues.put(COL_3,email);
        contentValues.put(COL_4,username);
        contentValues.put(COL_5,password);
        contentValues.put(COL_6,address);
        contentValues.put(COL_7,cuisine);
        contentValues.put(COL_7,cuisine);




        long result = db.insert(TABLE_NAME,null ,contentValues);
        if(result == -1)
            return false;
        else
            return true;
    }
}
