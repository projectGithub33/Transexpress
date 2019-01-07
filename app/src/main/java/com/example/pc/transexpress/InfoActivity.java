package com.example.pc.transexpress;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class InfoActivity extends AppCompatActivity {
    TextView t1;
    TextView t2;
    TextView t3;
@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        Bundle extras = getIntent().getExtras();

         t1=(TextView)findViewById(R.id.textView4) ;
         t2=(TextView)findViewById(R.id.textView5) ;
         t3=(TextView)findViewById(R.id.textView6) ;


        String nom = new String(extras.getString("title"));
        String solde = new String(extras.getString("solde"));
        String date = new String(extras.getString("date"));

        t1.setText(nom);
        t2.setText(solde);
        t3.setText(date);
    }
}
