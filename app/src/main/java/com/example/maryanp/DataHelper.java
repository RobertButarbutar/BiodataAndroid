package com.example.maryanp;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import android.content.Context;

public class DataHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME ="biodatadiri.db";
    private static final int DATABASE_VERSION = 1;
    public DataHelper(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db){
        String sql ="create table biodata(id integer primary key, nik text null, nama text null, jabatan text null, departemen text null, jk text null, tgl_lahir text null, t_lahir text null, alamat text null);";
        Log.d("Data","onCreate" +sql);
        db.execSQL(sql);
        sql = "INSERT INTO biodata(id,nik,nama,jabatan,departemen,jk,tgl_lahir,t_lahir,alamat)  VALUES ('1', '5520', 'Marya', 'CEO', 'Pusat Penelitian', 'perempuan', '1997-01-02', 'Jakarta', 'Jln.Sudirman' );";
        db.execSQL(sql);
   }

    @Override
    public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2){

    }
}
