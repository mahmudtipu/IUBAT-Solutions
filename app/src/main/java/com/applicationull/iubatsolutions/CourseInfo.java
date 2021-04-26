package com.applicationull.iubatsolutions;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class CourseInfo extends AppCompatActivity implements TextWatcher {
    EditText e1;
    ListView l1;

    String[] courseinfo;
    int bookicon=R.drawable.bookicon;

    ArrayList<SingleRow> list;

    CustomAdapter customAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_info);

        courseinfo=getResources().getStringArray(R.array.course_info);

        e1= (EditText) findViewById(R.id.edittextid2);

        l1= (ListView) findViewById(R.id.listViewId2);
        e1.addTextChangedListener(this);

        list=new ArrayList<>();
        SingleRow singleRow;


        for(int i=0; i<courseinfo.length; i++)
        {
            singleRow=new SingleRow(courseinfo[i],bookicon);
            list.add(singleRow);
        }

        customAdapter=new CustomAdapter(this,list);
        l1.setAdapter(customAdapter);
    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
        this.customAdapter.getFilter().filter(s);
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void afterTextChanged(Editable s) {

    }
    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }
}
