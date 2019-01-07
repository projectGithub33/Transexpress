package com.example.pc.transexpress;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.HashMap;

public class SignActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign);

        final InsertData insert = new InsertData();

        final Button btn = (Button)findViewById(R.id.id_butt);
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    EditText nom = (EditText)findViewById(R.id.id_nom);
                    EditText prenom = (EditText)findViewById(R.id.id_prenom);
                    EditText login = (EditText)findViewById(R.id.id_login);
                    EditText pass = (EditText)findViewById(R.id.id_pass);
                    EditText pass2= (EditText)findViewById(R.id.id_conf);

                    String n = nom.getText().toString();
                    String p = prenom.getText().toString();
                    String l = login.getText().toString();
                    String pa = pass.getText().toString();
                    String pa2 = pass2.getText().toString();

                    GetData data = new GetData();
                    data.execute("");
                    HashMap<String,String> map = data.getListe();
                    if (!map.containsKey(l)) {
                        if (pa.equals(pa2)) {

                            insert.execute(l, pa, n, p);
                            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                            startActivity(intent);
                        } else {
                            Context context = getApplicationContext();
                            CharSequence text = "Please confirm your password";
                            int duration = Toast.LENGTH_SHORT;
                            Toast toast = Toast.makeText(context, text, duration);
                            toast.show();
                        }
                    }
                    else{
                        System.out.println("deja existe");
                    }
                }
            });
    }
}
