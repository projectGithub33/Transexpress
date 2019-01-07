package com.example.pc.transexpress;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class SuiviServiceAdapter extends ArrayAdapter<SuiviService> {

    private ArrayList<SuiviService> lists;

    public SuiviServiceAdapter(Context context, int resource, ArrayList<SuiviService> lists) {
        super(context, resource, lists);
        this.lists = lists;
    }
    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
         LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
         convertView = inflater.inflate(R.layout.admin_list_suivi_servcie, parent, false);

        TextView txt1 = (TextView) convertView.findViewById(R.id.textView2);
        txt1.setText(lists.get(position).getAdressDepart());

        TextView txt2 = (TextView) convertView.findViewById(R.id.textView3);
        txt2.setText(lists.get(position).getAdressArrivee());

        TextView txt3 = (TextView) convertView.findViewById(R.id.textView4);
        txt3.setText(lists.get(position).getTypeArticle());

        TextView txt4 = (TextView) convertView.findViewById(R.id.textView5);
        txt4.setText(lists.get(position).getEtatTransfert());


         return convertView;
     }

}
