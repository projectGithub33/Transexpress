package com.example.pc.transexpress;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    protected void onResume() {
        super.onResume();
         TextView sign = (TextView) findViewById(R.id.id_sign);
        sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),SignActivity.class);
                startActivity(intent);
            }
        });
        final GetData mDBhelper = new GetData();

        //mDBhelper.insert("title2","subtitle1");
        mDBhelper.execute("");
        Button btn = (Button)findViewById(R.id.button);
        final EditText login = (EditText)findViewById(R.id.editText);
        final EditText mdp = (EditText)findViewById(R.id.editText2);
        final HashMap<String,String> liste = mDBhelper.getListe();
        final ArrayList<Users> users = mDBhelper.getArray();
        if (mDBhelper.find(new Users("login","pass"))){
            System.out.print("Equal");
        }else{System.out.print("not Equal");}

            System.out.print(liste.get("login"));

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (liste.containsKey(login.getText().toString()) && liste.containsValue(mdp.getText().toString())) {

                        Intent intent = new Intent(getApplicationContext(), AcceuilActivity.class);
                        intent.putExtra("login",login.getText().toString());
                        intent.putExtra("mdp",mdp.getText().toString());

                        startActivity(intent);

                }
                else{
                    Context context = getApplicationContext();
                    CharSequence text = " Login/Password incorrect";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }

            }
        });

    }
}
