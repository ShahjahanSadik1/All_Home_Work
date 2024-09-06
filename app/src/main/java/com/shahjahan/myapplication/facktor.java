package com.shahjahan.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class facktor extends AppCompatActivity {

    TextInputEditText ed_facktor;
    TextView button_facktor,tv_Display_f;
    ImageView delete_fack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facktor);

        ed_facktor = findViewById(R.id.ed_facktor);
        button_facktor = findViewById(R.id.button_facktor);
        tv_Display_f = findViewById(R.id.tv_Display_f);
        delete_fack = findViewById(R.id.delete_fack);




        button_facktor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ed_facktor.length()>0){
                 String stri_fack=ed_facktor.getText().toString();

                 int int_facktor=Integer.parseInt(stri_fack);

                    int summ=1;

                 for (int s=1; s<=int_facktor; s++){

                     summ=summ*s;

                     tv_Display_f.setText(int_facktor+" এর ফ্যাক্টরিয়াল হলো = "+summ);
                 }



                }else {
                    ed_facktor.setError("fail");
                }

            }
        });

        delete_fack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_Display_f.setText("");
                ed_facktor.setText("");
            }
        });

    }
}