package com.example.app_gaseta.database;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Gaseta_DB extends SQLiteOpenHelper {

    public static final String DB_NAME = "Gaseta_DB";
    public static final int DB_VERSION =1;

    Cursor cursor;

    SQLiteDatabase db;

    public Gaseta_DB(Context context) {
        super(context, DB_NAME, null, DB_VERSION);

        db = getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        String sqlTableCombustivel =
                "CREATE TABLE Combustivel (id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "nomeComnustivel TEXT, " +
                "precoCombustivel REAL, " +
                "resultado TEXT)";

        db.execSQL(sqlTableCombustivel);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}

//TODO: criar metodos para implementar um CRUD
//c = Create criar o banco de dados e as tabelas