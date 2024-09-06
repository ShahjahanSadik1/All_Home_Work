package com.shahjahan.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class jor_nenoy extends AppCompatActivity {

    TextInputEditText ed_jor_nenoy;
    TextView button_jor_nenoy,tv_Display_jor,tv_Display_sum;
    ImageView delete_jor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jor_nenoy);

        ed_jor_nenoy =findViewById(R.id.ed_jor_nenoy);
        button_jor_nenoy =findViewById(R.id.button_jor_nenoy);
        tv_Display_jor =findViewById(R.id.tv_Display_jor);
        tv_Display_sum =findViewById(R.id.tv_Display_sum);
        delete_jor =findViewById(R.id.delete_jor);


        button_jor_nenoy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (ed_jor_nenoy.length()>0){


                    

                    int sum=0;
                    tv_Display_jor.setText("2");

                    String stri_jor = ed_jor_nenoy.getText().toString();
                    int int_jor = Integer.parseInt(stri_jor);

                    for (int x=2; x<=int_jor; x++){
                         
                        int jor=x*2;

                        tv_Display_jor.append("+"+jor);
                        sum+=jor;

                    }

                    tv_Display_sum.setText(" = "+sum);
                }else {
                    ed_jor_nenoy.setError("fail");
                }


            }
        });


        delete_jor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed_jor_nenoy.setText("");
                tv_Display_jor.setText("");
                tv_Display_sum.setText("");
            }
        });


    }
}