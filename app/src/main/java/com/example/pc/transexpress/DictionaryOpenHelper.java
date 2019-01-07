package com.example.pc.transexpress;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.ArrayList;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;

public class DictionaryOpenHelper extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 1;
    private static final String TABLE_NAME="user";
    private static final String ID = "id";
    private static final String PSEUDO ="pseudo";
    private static final String MDP ="mdp";
    private static final String DATABASE_NAME="Trans.db";

    private static final String SQL_CREATE_DONNEE="CREATE TABLE "+TABLE_NAME+"(" +ID+ " INTEGER PRIMARY KEY ,"+PSEUDO+" TEXT ,"+MDP+" TEXT )";
    public DictionaryOpenHelper(Context context){
        super(context,DATABASE_NAME,null,DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_DONNEE);
        Log.d("ensak","database created");
    }
    public void onUpgrade(SQLiteDatabase sqLiteDatabase,int i,int i1){
        onUpgrade(sqLiteDatabase,i,i1);

    }
    public void insert(String title,String subtitle){
        Log.d("ensak","invok insert");
        SQLiteDatabase db = getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(PSEUDO,title);
        values.put(MDP,subtitle);
        db.insert(TABLE_NAME,null,values);
    }

    public ArrayList<String> read(){
        Log.d("ensak","invok read");
        SQLiteDatabase db = getReadableDatabase();
        Cursor cursor = db.query(
                TABLE_NAME,
                null,
                null,
                null,
                null,
                null,
                null
        );
        ArrayList<String> item = new ArrayList<String>();
        while (cursor.moveToNext()){
                String itemTitle = cursor.getString(cursor.getColumnIndexOrThrow(PSEUDO));
                item.add(itemTitle);
        }
        cursor.close();
        return  item;

    }
    public void delete(){
        SQLiteDatabase db = getReadableDatabase();
        Cursor cursor = db.query(
                TABLE_NAME,
                null,
                null,
                null,
                null,
                null,
                null
        );

    }
}
