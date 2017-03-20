package com.izdo.weather.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

/**
 * Created by iZdo on 2017/3/20.
 */

public class MyDatabaseHelper extends SQLiteOpenHelper {

    public static final String CREATE_PROVINCE = "create table Province(id integer primary key,provinceName text,provinceCode integer);";
    public static final String CREATE_CITY = "create table City(id integer primary key,cityName text,provinceId integer)";
    public static final String CREATE_COUNTY = "create table County(id integer primary key,countyName text,weatherId text,cityId integer)";

    private Context mContext;

    public MyDatabaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
        mContext = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_PROVINCE);
        db.execSQL(CREATE_CITY);
        db.execSQL(CREATE_COUNTY);
        Toast.makeText(mContext, "Create succeeded", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
