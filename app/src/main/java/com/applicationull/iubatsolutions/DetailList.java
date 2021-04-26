package com.applicationull.iubatsolutions;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Tipu on 3/15/2018.
 */

public class DetailList extends ArrayAdapter<Detail> {
    private Activity context;
    private List<Detail> detailList;

    public DetailList(Activity context, List<Detail> detailList){
        super(context,R.layout.list_layout, detailList);
        this.context = context;
        this.detailList = detailList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();

        View listViewItem = inflater.inflate(R.layout.list_layout,null,true);

        TextView textView1 = (TextView) listViewItem.findViewById(R.id.textViewId1);
        TextView textView2 = (TextView) listViewItem.findViewById(R.id.textViewId2);
        TextView textView3 = (TextView) listViewItem.findViewById(R.id.textViewId3);
        TextView textView4 = (TextView) listViewItem.findViewById(R.id.textViewId4);
        TextView textView5 = (TextView) listViewItem.findViewById(R.id.textViewId5);

        Detail detail = detailList.get(position);

        textView1.setText(detail.getBookName());
        textView2.setText(detail.getWriter());
        textView3.setText(detail.getPrice());
        textView4.setText(detail.getYourName());
        textView5.setText(detail.getContact());

        return listViewItem;

    }
}
