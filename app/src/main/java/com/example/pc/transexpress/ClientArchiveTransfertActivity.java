package com.example.pc.transexpress;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ClientArchiveTransfertActivity extends AppCompatActivity {

    @BindView(R.id.archive_list)
    ListView listServices;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_client_archive_transfert);

        ButterKnife.bind(this);

        ArrayList<ArchiveList> suiviServices = new ArrayList<ArchiveList>();
        suiviServices.add(new ArchiveList("kenitra","rabat","meuble",1));
        suiviServices.add(new ArchiveList("kenitra1","rabat","meuble",2));
        suiviServices.add(new ArchiveList("kenitra2","rabat","meuble",3));

        ArchiveAdapter adapter = new ArchiveAdapter(getApplicationContext(),R.layout.client_list_archive,suiviServices);
        listServices.setAdapter(adapter);
    }
}






