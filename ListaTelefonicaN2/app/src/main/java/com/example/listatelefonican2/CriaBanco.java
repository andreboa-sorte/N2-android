package com.example.listatelefonican2;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.content.Context;

public class CriaBanco extends SQLiteOpenHelper {

    public static final String NOME_BANCO = "banco.db";
    //public static final String TABELA = "livros";
    public static final String TABELA = "contatos";
    public static final String ID = "_id";
    //public static final String TITULO = "titulo";
    public static final String NOME = "nome";
    //public static final String AUTOR = "autor";
    public static final String NUMERO = "numero";
    //public static final String EDITORA = "editora";
    public static final int VERSAO =3;

    public CriaBanco(Context context){
        super(context, NOME_BANCO,null,VERSAO);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = " CREATE TABLE " +TABELA+ "("
                + ID + " integer primary key autoincrement,"
                + NOME + " text,"
                + NUMERO + " text"
                // + EDITORA + " text"
                +" )";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABELA);
        onCreate(db);
    }

}
