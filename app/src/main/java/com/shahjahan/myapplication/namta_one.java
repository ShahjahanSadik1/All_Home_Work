package com.shahjahan.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class namta_one extends AppCompatActivity {


    TextInputEditText ed_namta;
    TextView button_nam,tvDisplay;
    ImageView delete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_namta_one);

        ed_namta =findViewById(R.id.ed_namta);
        button_nam =findViewById(R.id.button_nam);
        tvDisplay =findViewById(R.id.tvDisplay);
        delete =findViewById(R.id.delete);



        button_nam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                tvDisplay.setText("");




                if (ed_namta.length()>0){
                    String sti_namta=ed_namta.getText().toString();

                    int int_namta=Integer.parseInt(sti_namta);

                    for (int namtao=1; namtao<=10; namtao++){

                        int gun=namtao*int_namta;
                        tvDisplay.append(int_namta+"*"+ namtao+"="+gun+"\n");


                    }
                }else {
                    ed_namta.setError("fail");
                }
            }
        });


        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvDisplay.setText("");
                ed_namta.setText("");
            }
        });
    }
}