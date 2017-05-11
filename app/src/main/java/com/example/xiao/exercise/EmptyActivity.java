package com.example.xiao.exercise;

import android.graphics.Color;
import android.support.annotation.FloatRange;
import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;

public class EmptyActivity extends AppCompatActivity {

    TextView totalTextview;
    EditText percentageTxt;
    EditText numberTxt;
    Integer num = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_empty);

        totalTextview = (TextView) findViewById(R.id.textView5);
        percentageTxt = (EditText) findViewById(R.id.editText);
        numberTxt = (EditText) findViewById(R.id.editText2);
//        Button calcBtn = (Button) findViewById(R.id.button_calc);
        Button button_for_page_1 = (Button) findViewById(R.id.button2);

//        calcBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if (num == 0)
//                { totalTextview.setTextColor(Color.BLUE);
//                num = 1;}
//                else {totalTextview.setTextColor(Color.BLACK);
//                num = 0;}
//                float a = Float.parseFloat(percentageTxt.getText().toString());
//                float b = a/100;
//                float c = b * Float.parseFloat(numberTxt.getText().toString());
//                c = (int) c;
//                totalTextview.setText(String.valueOf(c));
//            }
//        });

        button_for_page_1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent myintent = new Intent(v.getContext(), Activity2.class);
                        startActivity(myintent);
                    }
                }
        );

    }

    public void abc(View v) {
        if (num == 0) {
            totalTextview.setTextColor(Color.BLUE);
            num = 1;
        } else {
            totalTextview.setTextColor(Color.BLACK);
            num = 0;
        }
        float a = Float.parseFloat(percentageTxt.getText().toString());
        float b = a / 100;
        float c = b * Float.parseFloat(numberTxt.getText().toString());
        c = (int) c;
        totalTextview.setText(String.valueOf(c));
    }

}
