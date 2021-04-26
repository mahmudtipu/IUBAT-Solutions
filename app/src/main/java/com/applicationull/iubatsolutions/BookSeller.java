package com.applicationull.iubatsolutions;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class BookSeller extends AppCompatActivity {

    EditText editText1,editText2,editText3,editText4,editText5;
    Button post;
    String bookName;
    String writer;
    String price;
    String yourName;
    String contact;

    DatabaseReference databaseDetail;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_seller);

        databaseDetail = FirebaseDatabase.getInstance().getReference("detail");

        editText1 = (EditText) findViewById(R.id.bookNameId);
        editText2 = (EditText) findViewById(R.id.writerId);
        editText3 = (EditText) findViewById(R.id.priceId);
        editText4 = (EditText) findViewById(R.id.yourNameId);
        editText5 = (EditText) findViewById(R.id.contactId);



        post = (Button) findViewById(R.id.postButtonId);


        post.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                addDetail();

                editText1.setText("");
                editText2.setText("");
                editText3.setText("");
                editText4.setText("");
                editText5.setText("");
            }
        });
    }

    public void addDetail(){
        bookName = editText1.getText().toString().trim();
        writer = editText2.getText().toString().trim();
        price = editText3.getText().toString().trim();
        yourName = editText4.getText().toString().trim();
        contact = editText5.getText().toString().trim();

        if(!TextUtils.isEmpty(bookName) && !TextUtils.isEmpty(writer) && !TextUtils.isEmpty(price) && !TextUtils.isEmpty(yourName) && !TextUtils.isEmpty(contact))
        {
            String id = databaseDetail.push().getKey();

            Detail detail = new Detail(id,"Book Name: "+ bookName,"Writer: " + writer,"Price: " + price,"Seller: " + yourName,"Contact: " + contact);

            databaseDetail.child(id).setValue(detail);

            Toast.makeText(this,"Done successfully!",Toast.LENGTH_SHORT).show();

        }
        else
        {
            Toast.makeText(this,"Please fill up all the fields",Toast.LENGTH_SHORT).show();
        }
    }
    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }

}
