package com.cursoandroid.sqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SQLiteDatabase bdSQLite = openOrCreateDatabase("app", MODE_PRIVATE, null);

        //TABLS
        bdSQLite.execSQL("CREATE TABLE IF NOT EXISTS pessoas(nome VARCHAR, idade INT(3))");

       //INSERIR DADOS NA TABELA
        bdSQLite.execSQL("INSERT INTO pessoas(nome, idade) VALUES('Jaqueline', 20)");
        bdSQLite.execSQL("INSERT INTO pessoas(nome, idade) VALUES('Ana', 19)");
        bdSQLite.execSQL("INSERT INTO pessoas(nome, idade) VALUES('Maria', 20)");

        //RECUPERAR DADOS
        Cursor cursor
    }
}
