package com.example.app_gaseta.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Gaseta_DB extends SQLiteOpenHelper {

    private static final String DB_NAME = "Gaseta_DB";
    private static final int DB_VERSION = 1;

    Cursor cursor;

    SQLiteDatabase db;

    public Gaseta_DB(Context context) {
        super(context, DB_NAME, null, DB_VERSION);

        db = getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String sqlTableCombustivel =
                "CREATE TABLE Combustivel (id INTEGER PRIMARY KEY AUTOINCREMENT," +
                        "Gasolina TEXT, " +
                        "Etanol TEXT, " +
                        "Resultado TEXT)";

        db.execSQL(sqlTableCombustivel);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    public void salvarObjeto(String tabela, ContentValues dados){

        db.insert(tabela, null, dados);

    }
}

//TODO: criar metodos para implementar um CRUD
//c = Create criar o banco de dados e as tabelas