package com.example.pc.transexpress;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class AdminSuiviServiceActivity extends AppCompatActivity {

    @BindView(R.id.service_list)
    ListView listServices;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_suivi_service);
        ButterKnife.bind(this);

        ArrayList<SuiviService> suiviServices = new ArrayList<SuiviService>();
        suiviServices.add(new SuiviService("kenitra","rabat","meuble","en cour"));
        suiviServices.add(new SuiviService("kenitra1","rabat","meuble","arrivee"));
        suiviServices.add(new SuiviService("kenitra2","rabat","meuble","non arrivee"));

        SuiviServiceAdapter adapter = new SuiviServiceAdapter(getApplicationContext(),R.layout.admin_list_suivi_servcie,suiviServices);
        listServices.setAdapter(adapter);
    }
}
