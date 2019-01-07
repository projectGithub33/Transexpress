package com.example.pc.transexpress;
import android.os.AsyncTask;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;

import static java.sql.DriverManager.getConnection;

public class GetData extends AsyncTask<String,String,String> {
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
        try {
            Class.forName(JDBC_DRIVER);
            conn= getConnection(DB_URL, DbStrings.USERNAME, DbStrings.PASSWORD);
            stm=conn.createStatement();
            String sql ="select * from mhs_example.Users";
            ResultSet rs = stm.executeQuery(sql);
            System.out.print("query executed");

            while (rs.next()){
                String nom = rs.getString("login");
                String solde = rs.getString("password");
                liste.put(nom,solde);
                array.add(new Users(nom,solde));
                System.out.print("User added to array");

            }
            rs.close();
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
public boolean find(Users u){
        array.add(new Users("login","pass"));
        boolean var = false;
        if (this.array.contains(new Users(u.login,u.mdp)))
            var = true;
        return var;
}
    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);

    }

    public HashMap<String, String> getListe() {
        return liste;
    }




}
