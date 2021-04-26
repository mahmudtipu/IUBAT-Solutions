package com.applicationull.iubatsolutions;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class FinancialHome extends AppCompatActivity {
    private RadioGroup radioGroupFinancialButton;
    private Button nextButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_financial_home);

        radioGroupFinancialButton= (RadioGroup) findViewById(R.id.genderRadioGroupId);

        nextButton= (Button) findViewById(R.id.nextButtonId);


        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int selectedId=radioGroupFinancialButton.getCheckedRadioButtonId();
                if(selectedId==R.id.radioLoanButtonId)
                {
                    Intent intent=new Intent(FinancialHome.this,LoanSystem.class);
                    startActivity(intent);
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                }

                if(selectedId==R.id.radioWaiverButtonId)
                {
                    Intent intent=new Intent(FinancialHome.this,Scholarship.class);
                    startActivity(intent);
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                }
            }
        });
    }
    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }
}
