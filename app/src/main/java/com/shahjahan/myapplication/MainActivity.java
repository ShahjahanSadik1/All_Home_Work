package com.shahjahan.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;


import com.bdtopcoder.smart_slider.SliderAdapter;
import com.bdtopcoder.smart_slider.SliderItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {



    TextView namta,jog,factor,lep,jog_namta,jor_koyta,dobol,g_borgo,s_palindrome;

    ImageView layouttwo,nested_image;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        namta =findViewById(R.id.namta);
        jog =findViewById(R.id.jog);
        factor =findViewById(R.id.factor);
        lep =findViewById(R.id.lep);
        jog_namta =findViewById(R.id.jog_namta);
        jor_koyta=findViewById(R.id.jor_koyta);
        dobol=findViewById(R.id.dobol);
        g_borgo=findViewById(R.id.g_borgo);
        s_palindrome=findViewById(R.id.s_palindrome);


        layouttwo =findViewById(R.id.layouttwo);
        nested_image=findViewById(R.id.nested_image);




        ViewPager2 viewPager2 = findViewById(R.id.smartSlider);

        List<SliderItem> sliderItems = new ArrayList<>();

        sliderItems.add(new SliderItem(R.drawable.silider_photo,"Image 3"));
        sliderItems.add(new SliderItem("https://imageio.forbes.com/specials-images/imageserve/5e78fffed8e1ae0007b74a9f/How-to-Work-From-Home-With-a-Laptop/960x0.jpg","Image from url"));

        sliderItems.add(new SliderItem("https://cdn.packhacker.com/2020/04/4e2426f9-tom-work-at-home-setup.jpg","Image from url"));
        viewPager2.setAdapter(new SliderAdapter(sliderItems,viewPager2,5000));

        new SliderAdapter((position, title, view) -> {
            Toast.makeText(this, "Position: "+position+" Title: "+title, Toast.LENGTH_SHORT).show();
        });
        //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>


        namta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mynamta=new Intent(MainActivity.this,namta_one.class);
                startActivity(mynamta);
            }
        });


        jog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mynamta=new Intent(MainActivity.this,jog.class);
                startActivity(mynamta);
            }
        });

        factor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mynamta=new Intent(MainActivity.this,facktor.class);
                startActivity(mynamta);
            }
        });

        lep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mynamta=new Intent(MainActivity.this,leap_year.class);
                startActivity(mynamta);
            }
        });

        jog_namta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mynamta=new Intent(MainActivity.this,jog_namta.class);
                startActivity(mynamta);
            }
        });


        layouttwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mynamta=new Intent(MainActivity.this,pdf_activity.class);
                startActivity(mynamta);
            }
        });


        jor_koyta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mynamta=new Intent(MainActivity.this,jor_nenoy.class);
                startActivity(mynamta);
            }
        });


        dobol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mynamta=new Intent(MainActivity.this,dobol_nine.class);
                startActivity(mynamta);
            }
        });


        g_borgo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mynamta=new Intent(MainActivity.this,borgo_lay.class);
                startActivity(mynamta);
            }
        });


        s_palindrome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mynamta=new Intent(MainActivity.this,palindrome_layo.class);
                startActivity(mynamta);
            }
        });


        nested_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mynamta=new Intent(MainActivity.this,nested_loop.class);
                startActivity(mynamta);
            }
        });











    }

    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(MainActivity.this)
                .setTitle("My app")
                .setMessage("Do you want to exit?")
                .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                     dialogInterface.dismiss();
                     finishAndRemoveTask();
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                      dialogInterface.dismiss();
                    }
                })
                .show();
    }
}