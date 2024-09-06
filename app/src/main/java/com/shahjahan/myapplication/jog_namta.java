package com.shahjahan.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class jog_namta extends AppCompatActivity {

    TextInputEditText ed_jog_namta;

    TextView button_jog_namta,tv_Display_jog_namta;

    ImageView delete_jog_namta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jog_namta);

        ed_jog_namta =findViewById(R.id.ed_jog_namta);
        button_jog_namta =findViewById(R.id.button_jog_namta);
        tv_Display_jog_namta =findViewById(R.id.tv_Display_jog_namta);
        delete_jog_namta =findViewById(R.id.delete_jog_namta);



        button_jog_namta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (ed_jog_namta.length()>0){

                    String stri_jog_namta = ed_jog_namta.getText().toString();

                    int int_jor_namta=Integer.parseInt(stri_jog_namta);


                    tv_Display_jog_namta.setText("");
                    for (int jog=1; jog<=10; jog++){

                       int go=int_jor_namta+jog;

                        tv_Display_jog_namta.append(int_jor_namta+"+"+jog+"="+go+"\n");
                    }

                }else {
                    ed_jog_namta.setError("fail");
                }

            }
        });


        delete_jog_namta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed_jog_namta.setText("");
                tv_Display_jog_namta.setText("");
            }
        });

    }
}