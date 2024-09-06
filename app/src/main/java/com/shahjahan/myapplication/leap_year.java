package com.shahjahan.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class leap_year extends AppCompatActivity {


    TextInputEditText ed_leap_year,ed_leap_years;
    TextView button_leap,tv_Display_leap;
    ImageView delete_leap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leap_year);

        ed_leap_year =findViewById(R.id.ed_leap_year);
        ed_leap_years =findViewById(R.id.ed_leap_years);
        button_leap =findViewById(R.id.button_leap);
        tv_Display_leap =findViewById(R.id.tv_Display_leap);
        delete_leap =findViewById(R.id.delete_leap);




        button_leap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                tv_Display_leap.setText("");
                if (ed_leap_year.length()>0 && ed_leap_years.length()>0){
                    String stri_leap1 = ed_leap_year .getText().toString();
                    String stri_leap2 = ed_leap_years .getText().toString();

                    int int_leap1 = Integer.parseInt(stri_leap1);
                    int int_leap2 =Integer.parseInt(stri_leap2);



                    for (int x=int_leap1; x<=int_leap2; x++){
                        if (x%4==0 && x%100!=0 || x%400==0){
                            tv_Display_leap.append(" "+x);
                        }
                    }


                }else {
                    ed_leap_year.setError("fail");
                    ed_leap_years.setError("fail");
                }
            }
        });




        delete_leap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed_leap_year.setText("");
                ed_leap_years.setText("");
                tv_Display_leap.setText("");
            }
        });

    }
}