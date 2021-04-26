package com.applicationull.iubatsolutions;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class BookBuyer extends AppCompatActivity {
    DatabaseReference databaseDetail;

    ListView listViewDetails;

    List<Detail> detailList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_buyer);

        listViewDetails = (ListView) findViewById(R.id.listBuyerViewId);

        databaseDetail = FirebaseDatabase.getInstance().getReference("detail");

        detailList = new ArrayList<>();
    }

    @Override
    protected void onStart() {
        super.onStart();

        databaseDetail.addValueEventListener(new ValueEventListener() {

            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                detailList.clear();

                for(DataSnapshot detailSnapshot: dataSnapshot.getChildren()){
                    Detail detail = detailSnapshot.getValue(Detail.class);

                    detailList.add(detail);
                }

                DetailList adapter = new DetailList(BookBuyer.this, detailList);

                listViewDetails.setAdapter(adapter);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }
}
