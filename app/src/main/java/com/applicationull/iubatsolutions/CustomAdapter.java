package com.applicationull.iubatsolutions;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class CustomAdapter extends BaseAdapter implements Filterable {

    Context c;
    ArrayList<SingleRow> originalArray,tempArray;
    CustomFilter cs;

    public CustomAdapter(Context c, ArrayList<SingleRow> originalArray) {
        this.c=c;
        this.originalArray=originalArray;
        this.tempArray=originalArray;
    }

    @Override
    public int getCount() {
        return originalArray.size();
    }

    @Override
    public Object getItem(int position) {
        return originalArray.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        LayoutInflater inflater= (LayoutInflater)c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if(view==null)
        {
            view=inflater.inflate(R.layout.custom_listview, null);
        }

        TextView t1=(TextView)view.findViewById(R.id.sampleViewTextId);
        ImageView il=(ImageView)view.findViewById(R.id.sampleViewImageId);
        t1.setText(originalArray.get(position).getName());
        il.setImageResource(originalArray.get(position).getImage());

        return view;
    }

    @Override
    public Filter getFilter() {
        if(cs==null)
        {
            cs = new CustomFilter();
        }

        return cs;
    }

    class CustomFilter extends Filter
    {
        @Override
        protected FilterResults performFiltering(CharSequence constraint) {
            FilterResults results=new FilterResults();
            if(constraint!=null && constraint.length()>0) {
                constraint = constraint.toString().toUpperCase();

                ArrayList<SingleRow> filters = new ArrayList<>();

                for (int i = 0; i < tempArray.size(); i++) {
                    if (tempArray.get(i).getName().toUpperCase().contains(constraint)) {
                        SingleRow singleRow = new SingleRow(tempArray.get(i).getName(), tempArray.get(i).getImage());
                        filters.add(singleRow);
                    }
                }
                results.count = filters.size();
                results.values = filters;
            }

            else
            {
                results.count = tempArray.size();
                results.values = tempArray;
            }

            return results;
        }

        @Override
        protected void publishResults(CharSequence constraint, FilterResults results) {
            originalArray = (ArrayList<SingleRow>)results.values;
            notifyDataSetChanged();
        }
    }
}
