package com.shahjahan.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class nested_loop extends AppCompatActivity {

    TextInputEditText ed_icon,ed_namber,ed_prime,ed_prime_koto,ed_prime_two_koto;
    TextView button_namber,tv_Display,button_prime,tv_Display_prime,button_prime_koto,tv_Display_prime_koto;
    ImageView delete_namber,delete_prime,delete_prime_koto;


    LinearLayout home_layout_home,home_layout_one,home_layout_two;
    ImageView home,home_two,home_ses;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nested_loop);

        ed_icon =findViewById(R.id.ed_icon);
        ed_namber =findViewById(R.id.ed_namber);
        button_namber =findViewById(R.id.button_namber);
        tv_Display =findViewById(R.id.tv_Display);
        delete_namber =findViewById(R.id.delete_namber);


        //prime namber
        ed_prime =findViewById(R.id.ed_prime);
        button_prime =findViewById(R.id.button_prime);
        tv_Display_prime =findViewById(R.id.tv_Display_prime);
        delete_prime =findViewById(R.id.delete_prime);


        //prime namber koto koto
        ed_prime_koto =findViewById(R.id.ed_prime_koto);
        ed_prime_two_koto =findViewById(R.id.ed_prime_two_koto);
        button_prime_koto =findViewById(R.id.button_prime_koto);
        tv_Display_prime_koto =findViewById(R.id.tv_Display_prime_koto);
        delete_prime_koto =findViewById(R.id.delete_prime_koto);



        //gone vigibilety
        home_layout_home =findViewById(R.id.home_layout_home);
        home_layout_one =findViewById(R.id.home_layout_one);
        home_layout_two =findViewById(R.id.home_layout_two);

        home =findViewById(R.id.home);
        home_two =findViewById(R.id.home_two);
        home_ses =findViewById(R.id.home_ses);



        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                home_layout_home.setVisibility(View.VISIBLE);
                home_layout_one.setVisibility(View.GONE);
                home_layout_two.setVisibility(View.GONE);
            }
        });


        home_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                home_layout_home.setVisibility(View.GONE);
                home_layout_one.setVisibility(View.VISIBLE);
                home_layout_two.setVisibility(View.GONE);
            }
        });

        home_ses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                home_layout_home.setVisibility(View.GONE);
                home_layout_one.setVisibility(View.GONE);
                home_layout_two.setVisibility(View.VISIBLE);
            }
        });





        //*****************************************************
        button_namber .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ed_icon.length()>0 && ed_namber.length()>0){

                    String stri_icon=ed_icon.getText().toString();
                    String stri_namber=ed_namber.getText().toString();

                    int int_icon=Integer.parseInt(stri_icon);
                    int int_namber=Integer.parseInt(stri_namber);


                   String a="1";
                   String b="2";
                    String c="3";
                    String d="4";
                    String e="5";
                    String f="6";
                    String g="7";
                    String h="8";



                    tv_Display.setText("");
                    if (stri_icon.contains(a)&& a.contains(stri_icon)) {

                        loop(int_namber,"\uD83D\uDE0D");

                    }else if (stri_icon.contains(b)&& b.contains(stri_icon)){

                       loop(int_namber,"\uD83E\uDD23");
                    }else if (stri_icon.contains(c)&& c.contains(stri_icon)){

                        loop(int_namber,"\uD83D\uDE01");
                    }else if (stri_icon.contains(d)&& d.contains(stri_icon)){

                        loop(int_namber,"\uD83D\uDE0A");
                    }else if (stri_icon.contains(e)&& e.contains(stri_icon)){

                        loop(int_namber,"\uD83D\uDC96");
                    }else if (stri_icon.contains(f)&& f.contains(stri_icon)){

                        loop(int_namber,"\uD83C\uDF39");
                    }else if (stri_icon.contains(g)&& g.contains(stri_icon)){

                        loop(int_namber,"\uD83D\uDFE5");
                    }else if (stri_icon.contains(h)&& h.contains(stri_icon)){

                        loop(int_namber,"\uD83D\uDD3A");
                    }


                }else {
                    ed_icon.setError("fail");
                    ed_namber.setError("fail");
                }
            }
        });
        //*****************************************************

        delete_namber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed_namber.setText("");
                ed_icon.setText("");
                tv_Display.setText("");
            }
        });











        //prime namber //prime namber //prime namber//prime namber//prime namber//prime namber//prime namber
        button_prime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ed_prime.length()>0){

                   String stri_prime=ed_prime.getText().toString();

                   int int_prime=Integer.parseInt(stri_prime);

                   for (int x=2; x<int_prime; x++){
                       if (int_prime%x==0){
                           tv_Display_prime.setText(int_prime+" is not a prime namber");
                           break;
                       }else {
                           tv_Display_prime.setText(int_prime+" is a prime namber ");
                       }
                   }


                }else {
                    ed_prime.setError("fail");
                }
            }
        });


        delete_prime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed_prime.setText("");
                tv_Display_prime.setText("");
            }
        });
        //prime namber//prime namber//prime namber//prime namber//prime namber//prime namber//prime namber//prime namber





        //prime namber koto koto  //prime namber koto koto  //prime namber koto koto  //prime namber koto koto  //prime namber koto koto
        button_prime_koto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ed_prime_koto.length()>0 && ed_prime_two_koto.length()>0){

                    String stri_ed_prime_koto=ed_prime_koto.getText().toString();
                    String stri_ed_prime_two_koto=ed_prime_two_koto.getText().toString();

                    int int_ed_prime_koto=Integer.parseInt(stri_ed_prime_koto);
                    int int_ed_prime_two_koto=Integer.parseInt(stri_ed_prime_two_koto);

                    tv_Display_prime_koto.setText("");
                    for (int suru=int_ed_prime_koto; suru<=int_ed_prime_two_koto; suru++){

                        int con=0;
                       for (int i=1; i<=suru; i++){
                           if (suru%i==0){
                               con++;
                           }
                       }

                       if (con==2){
                           tv_Display_prime_koto.append(suru+" ");
                       }
                    }






                }else {
                    ed_prime_koto.setError("fail");
                    ed_prime_two_koto.setError("fail");
                }
            }
        });


        delete_prime_koto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed_prime_koto.setText("");
                ed_prime_two_koto.setText("");
                tv_Display_prime_koto.setText("");
            }
        });





    }//maim>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>









    private void loop(int j,String o){
        for (int x = 1; x <= j; x++) {

            for (int y = 1; y <= x; y++) {
                tv_Display.append(o);
            }
            tv_Display.append(" \n");
        }
    }







}