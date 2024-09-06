package com.shahjahan.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;


import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.textfield.TextInputEditText;
import com.squareup.picasso.Picasso;

public class pdf_activity extends AppCompatActivity {





    TextInputEditText ed,ed_a,ed_jor,ed_j,ed_bijor,ed_bij;

    TextView button,tvDisplay,button_2,tvDisplay_2,button_bijor,tvDisplay_b;

    ImageView delete,delete_j,delete_b;


    LinearLayout jor,bijor,home,home_layout_home,jor_layout_jor,bijor_layout_bijor;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf);

        //home1234
        ed =findViewById(R.id.ed);
        ed_a = findViewById(R.id.ed_a);
        button = findViewById(R.id.button);
        tvDisplay = findViewById(R.id.tvDisplay);
        delete = findViewById(R.id.delete);



        //jor
        ed_jor =findViewById(R.id.ed_jor);
        ed_j = findViewById(R.id.ed_j);
        button_2 = findViewById(R.id.button_2);
        tvDisplay_2 = findViewById(R.id.tvDisplay_2);
        delete_j = findViewById(R.id.delete_j);


        //bijor
        ed_bijor =findViewById(R.id.ed_bijor);
        ed_bij = findViewById(R.id.ed_bij);
        button_bijor = findViewById(R.id.button_bijor);
        tvDisplay_b = findViewById(R.id.tvDisplay_b);
        delete_b = findViewById(R.id.delete_b);






        //layout poriborton //layout poriborton //layout poriborton //layout poriborton //layout poriborton //layout poriborton //layout poriborton
        home = findViewById(R.id.home);
        jor = findViewById(R.id.jor);
        bijor = findViewById(R.id.bijor);


        home_layout_home = findViewById(R.id.home_layout_home);
        jor_layout_jor = findViewById(R.id.jor_layout_jor);
        bijor_layout_bijor = findViewById(R.id.bijor_layout_bijor);


        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                home_layout_home.setVisibility(View.VISIBLE);
                jor_layout_jor.setVisibility(View.GONE);
                bijor_layout_bijor.setVisibility(View.GONE);
            }
        });

        jor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                home_layout_home.setVisibility(View.GONE);
                jor_layout_jor.setVisibility(View.VISIBLE);
                bijor_layout_bijor.setVisibility(View.GONE);
            }
        });

        bijor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                home_layout_home.setVisibility(View.GONE);
                jor_layout_jor.setVisibility(View.GONE);
                bijor_layout_bijor.setVisibility(View.VISIBLE);
            }
        });
        //layout poriborton //layout poriborton //layout poriborton //layout poriborton //layout poriborton //layout poriborton //layout poriborton







        //home 123456789  //home 123456789  //home 123456789  //home 123456789  //home 123456789  //home 123456789
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ed1 =ed.getText().toString();
                String ed2 =ed_a.getText().toString();

                forin(ed1,ed2);
            }
        });
        //home 123456789  //home 123456789  //home 123456789  //home 123456789  //home 123456789  //home 123456789






        //d home  dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                settext();
            }
        });
        //d home dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd






        //246810 jor  //246810 jor  //246810 jor  //246810 jor  //246810 jor  //246810 jor  //246810 jor  //246810 jor  //246810 jor  //246810 jor
        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ed_jorr =ed_jor.getText().toString();
                String ed_jor2 =ed_j.getText().toString();

                jor(ed_jorr,ed_jor2);

            }
        });


        //246810 jor  //246810 jor  //246810 jor  //246810 jor  //246810 jor  //246810 jor  //246810 jor  //246810 jor  //246810 jor  //246810 jor



        


        //delete jor //delete jor //delete jor //delete jor //delete jor//delete jor//delete jor //delete jor //delete jor //delete jor
        delete_j.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                settext();
            }
        });
        //delete jor //delete jor //delete jor //delete jor //delete jor//delete jor//delete jor //delete jor //delete jor //delete jor



        //bijor 13579 //bijor 13579 //bijor 13579 //bijor 13579 //bijor 13579 //bijor 13579 //bijor 13579 //bijor 13579
        button_bijor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String bi1 =ed_bijor.getText().toString();
                String bi2=ed_bij.getText().toString();
                bijor(bi1,bi2);
            }
        });
        //bijor 13579 //bijor 13579 //bijor 13579 //bijor 13579 //bijor 13579 //bijor 13579 //bijor 13579 //bijor 13579




        //delete bijor //delete bijor //delete jor //delete jor //delete jor//delete jor//delete jor //delete jor //delete jor //delete jor
        delete_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                settext();
            }
        });
        //delete jor //delete jor //delete jor //delete jor //delete jor//delete jor//delete jor //delete jor //delete jor //delete jor







    }//onCreate onCreate onCreate onCreate onCreate>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>



    //delete //delete  //delete  //delete  //delete  //delete  //delete  //delete  //delete //delete  //delete  //delete //delete
    private void settext(){
        ed.setText("");
        ed_a.setText("");
        tvDisplay.setText("");

        ed_jor.setText("");
        ed_j.setText("");
        tvDisplay_2.setText("");

        ed_bijor.setText("");
        ed_bij.setText("");
        tvDisplay_b.setText("");
    }
    //delete //delete  //delete  //delete  //delete  //delete  //delete  //delete  //delete //delete  //delete  //delete //delete








    //home 123456789  //home 123456789  //home 123456789  //home 123456789  //home 123456789  //home 123456789
    private void forin(String ed1,String ed2){
        if (ed.length()>0 && ed_a.length()>0){

            int edint = Integer.parseInt(ed1);
            int edint2 = Integer.parseInt(ed2);

            for (int x=edint2; x<=edint; x++){

                tvDisplay.append("  "+x);

            }
        }else {
            ed.setError("fail");
            ed_a.setError("fail");
            Toast.makeText(pdf_activity.this, "fale", Toast.LENGTH_SHORT).show();
        }

    }
    //home 123456789  //home 123456789  //home 123456789  //home 123456789  //home 123456789  //home 123456789







    //bijor 13579 //bijor 13579 //bijor 13579 //bijor 13579 //bijor 13579 //bijor 13579 //bijor 13579 //bijor 13579
    private void jor(String jo1,String jor2){


        if (jo1.length()>0 && jor2.length()>0){
            int jor_int =Integer.parseInt(jo1);
            int jor_2_int =Integer.parseInt(jor2);

            for (int j=jor_int ; j<=jor_2_int; j++){

               if (j%2!=0)tvDisplay_2.append("  "+j);

            }

        }else {
            ed_jor.setError("fail");
            ed_j.setError("fail");
            Toast.makeText(pdf_activity.this, "fale", Toast.LENGTH_SHORT).show();
        }


    }
    //bijor 13579 //bijor 13579 //bijor 13579 //bijor 13579 //bijor 13579 //bijor 13579 //bijor 13579 //bijor 13579





    //jor 246810 jor 246810 jor 246810 jor 246810 jor 246810 jor 246810 jor 246810 jor 246810 jor 246810
    private void bijor(String bijor1,String bijor2){
        if (ed_bijor.length()>0 && ed_bij.length()>0){
            int bijor_int=Integer.parseInt(bijor1);
            int bijor_int2=Integer.parseInt(bijor2);

            for (int b=bijor_int; b<=bijor_int2; b++ ){
               if (b%2==0)tvDisplay_b.append("  "+b);

            }

        }else {
            ed_bijor.setError("fail");
            ed_bij.setError("fail");
            Toast.makeText(pdf_activity.this, "fale", Toast.LENGTH_SHORT).show();
        }
    }
    //jor 246810 jor 246810 jor 246810 jor 246810 jor 246810 jor 246810 jor 246810 jor 246810 jor 246810










    //onBackPressed onBackPressed onBackPressed onBackPressed onBackPressed
    @Override
    public void onBackPressed() {
        //super.onBackPressed();


        new AlertDialog.Builder(pdf_activity.this)
                .setTitle("My app")
                .setMessage("Do you want to exit?")
                .setIcon(R.drawable.alarmicon)
                .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                       dialogInterface.dismiss();
                       finishAndRemoveTask();
                    }
                })
                .setNegativeButton("no", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                      dialogInterface.dismiss();
                    }
                })
                .show();
    }
    //onBackPressed onBackPressed onBackPressed onBackPressed onBackPressed
}