package com.example.pc.transexpress;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;



public class ArchiveAdapter extends ArrayAdapter<ArchiveList> {

    private ArrayList<ArchiveList> listes;

    public ArchiveAdapter(Context context, int resource, ArrayList<ArchiveList> listes) {
        super(context, resource, listes);
        this.listes = listes;
    }
    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.client_list_archive, parent, false);

        TextView txt1 = (TextView) convertView.findViewById(R.id.textView12);
        txt1.setText(listes.get(position).getAdressDepart());

        TextView txt2 = (TextView) convertView.findViewById(R.id.textView13);
        txt2.setText(listes.get(position).getAdressArrivee());

        TextView txt3 = (TextView) convertView.findViewById(R.id.textView14);
        txt3.setText(listes.get(position).getTypeArticle());

        TextView txt4 = (TextView) convertView.findViewById(R.id.textView15);
        txt4.setText(listes.get(position).getNum());


        return convertView;
    }

}

