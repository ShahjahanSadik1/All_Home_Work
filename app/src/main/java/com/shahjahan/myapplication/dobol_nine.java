package com.shahjahan.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class dobol_nine extends AppCompatActivity {


    TextInputEditText ed_dobol;
    TextView button_dobol,tv_Display_dobol,tv_Display_dobol_two;
    ImageView delete_dobol;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dobol_nine);

        ed_dobol = findViewById(R.id.ed_dobol);
        button_dobol = findViewById(R.id.button_dobol);
        tv_Display_dobol = findViewById(R.id.tv_Display_dobol);
        tv_Display_dobol_two = findViewById(R.id.tv_Display_dobol_two);
        delete_dobol = findViewById(R.id.delete_dobol);


        button_dobol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                tv_Display_dobol.setText("");
                if (ed_dobol.length()>0){
                  String stri_ed_dobol=ed_dobol.getText().toString();

                  int int_ed_dobol=Integer.parseInt(stri_ed_dobol);

                  int sum=0;
                  long d=9;
                  for (int x=1; x<=int_ed_dobol; x++){


                      sum+=d;
                      d=(d*10) + 9;

                      tv_Display_dobol.append(d+"  "+"\n");
                  }

                  tv_Display_dobol_two.setText("mot holo "+sum);


                }else {
                 ed_dobol.setError("fail");
                }





            }
        });





        delete_dobol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_Display_dobol.setText("");
                tv_Display_dobol_two.setText("");
                ed_dobol.setText("");
            }
        });
    }
}