package com.shahjahan.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class palindrome_layo extends AppCompatActivity {


    TextInputEditText ed_palindrome;
    TextView button_palindrome,tv_Display_palindrome;
    ImageView delete_palindrome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palindrome_layo);

        ed_palindrome = findViewById(R.id.ed_palindrome);
        button_palindrome = findViewById(R.id.button_palindrome);
        tv_Display_palindrome = findViewById(R.id.tv_Display_palindrome);
        delete_palindrome = findViewById(R.id.delete_palindrome);





        button_palindrome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (ed_palindrome.length()>0){
                  String stri_palindrime=ed_palindrome.getText().toString();
                  int int_palindrime=Integer.parseInt(stri_palindrime);

                    int r,sum=0,temp;


                    temp=int_palindrime;
                    while(int_palindrime>0){
                        r=int_palindrime%10;  //getting remainder
                        sum=(sum*10)+r;
                        int_palindrime=int_palindrime/10;
                    }
                    if(temp==sum){
                        tv_Display_palindrome.setText(stri_palindrime+" Palindrome Number ");
                    }

                    else{
                        tv_Display_palindrome.setText(stri_palindrime+" Not Palindrome");
                    }

            }else {
                    ed_palindrome.setError("fail");
                }

            }
        });


        delete_palindrome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed_palindrome.setText("");
                tv_Display_palindrome.setText("");
            }
        });
    }
}