package com.shahjahan.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class jog extends AppCompatActivity {


    TextInputEditText ed_prothom,ed_detio;
    TextView button_jog,tv_Display;
    ImageView delete_jog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jog);

        ed_prothom = findViewById(R.id.ed_prothom);
        ed_detio = findViewById(R.id.ed_detio);
        button_jog = findViewById(R.id.button_jog);
        tv_Display = findViewById(R.id.tv_Display);
        delete_jog = findViewById(R.id.delete_jog);


        button_jog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (ed_detio.length()>0 && ed_prothom.length()>0){
                    String stri_pro=ed_prothom.getText().toString();
                    String stri_detio=ed_detio.getText().toString();
                    int int_pro=Integer.parseInt(stri_pro);
                    int int_detio=Integer.parseInt(stri_detio);

                    int sum=0;

                    for (int x=int_pro; x<=int_detio; x++){
                         sum =x+sum;

                         tv_Display.setText("1+2+3+4+5+___________+"+int_detio+"="+sum);

                    }



                }else {
                    ed_detio.setError("fall");
                    ed_prothom.setError("fall");
                }


            }
        });


        delete_jog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed_detio.setText("");
                ed_prothom.setText("");
                tv_Display.setText("");
            }
        });

    }
}