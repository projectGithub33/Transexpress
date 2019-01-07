package com.example.pc.transexpress;
import android.os.AsyncTask;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;

import static java.sql.DriverManager.getConnection;

public class InsertData extends AsyncTask<String,String,String> {
    HashMap<String,String> liste = new HashMap<>();

    public ArrayList<Users> getArray() {
        return array;
    }

    ArrayList<Users> array = new ArrayList<>();

    String msg ="";
    static final String JDBC_DRIVER="com.mysql.jdbc.Driver";
    static final String DB_URL="jdbc:mysql://10.0.2.2:3306/?useUnicode=yes&characterEncoding=UTF-8";
//+DbStrings.DATABASE_URL+"/"+DbStrings.DATABASE_NAME
    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        System.out.println("onPreExecute");
    }

    @Override
    protected String doInBackground(String... strings) {
        System.out.println("doInBackgrounf");
        Connection conn=null;
        Statement stm = null;

        String login=strings[0];
        String pass=strings[1];
        String nom=strings[2];
        String prenom=strings[3];
        try {
            Class.forName(JDBC_DRIVER);
            conn= getConnection(DB_URL, DbStrings.USERNAME, DbStrings.PASSWORD);
            stm=conn.createStatement();
           // String sql ="insert into mhs_example.Users (login,password,nom,prenom) VALUES ("+login+","+pass+","+nom+","+prenom+")";
            String sql ="insert into mhs_example.Users (login,password,nom,prenom) VALUES ('"+login+"','"+pass+"','"+nom+"','"+prenom+"')";

            stm.execute(sql);
            System.out.println("Insert Invoked");


            stm.close();
            conn.close();
        } catch (ClassNotFoundException e) {
            msg="an exception for classNotFound";
            e.printStackTrace();
        } catch (SQLException e) {
            msg="an exception for JDBC";
            e.printStackTrace();
        }
        return null;
    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);

    }

    public HashMap<String, String> getListe() {
        return liste;
    }




}
