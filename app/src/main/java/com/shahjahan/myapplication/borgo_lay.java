package com.shahjahan.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class borgo_lay extends AppCompatActivity {


    TextInputEditText ed_borgo_coro;

    TextView button_borgo,tv_Display_borgo;
    ImageView delete_borgo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_borgo_lay);

        ed_borgo_coro =findViewById(R.id.ed_borgo_coro);
        button_borgo =findViewById(R.id.button_borgo);
        tv_Display_borgo =findViewById(R.id.tv_Display_borgo);
        delete_borgo =findViewById(R.id.delete_borgo);



        button_borgo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (ed_borgo_coro.length()>0){

                    int sum=0;

                    String stri_ed_borgo=ed_borgo_coro.getText().toString();

                    int int_ed_dorgo=Integer.parseInt(stri_ed_borgo);

                    tv_Display_borgo.setText("");
                    for (int go=1; go<=int_ed_dorgo; go++){

                        sum=go*go;

                        tv_Display_borgo.append(go+"*"+go+"="+sum+"\n");

                    }



                }else {
                    ed_borgo_coro.setError("fail");
                }
            }
        });


        delete_borgo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed_borgo_coro.setText("");
                tv_Display_borgo.setText("");
            }
        });

    }
}