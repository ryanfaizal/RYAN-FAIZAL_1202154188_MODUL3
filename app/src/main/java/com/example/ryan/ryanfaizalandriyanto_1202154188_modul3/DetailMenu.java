package com.example.ryan.ryanfaizalandriyanto_1202154188_modul3;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DetailMenu extends AppCompatActivity {
    private TextView head, subhead;
    private ImageView image;
    TextView jumlah;
    ImageView kapasitas;
    Button btn_plus, btn_min;

    private int x = 1;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_menu);

        //inisiasi id yang sesuai

        head = (TextView) findViewById(R.id.heading);
        subhead = (TextView) findViewById(R.id.sub_heading);
        jumlah = (TextView) findViewById(R.id.no);
        image = (ImageView) findViewById(R.id.gambar_tampilan);
        kapasitas = (ImageView) findViewById(R.id.capacity);
        btn_plus = (Button) findViewById(R.id.btnplus);
        btn_min = (Button) findViewById(R.id.btnminus);

       btn_plus.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               if (kapasitas.getDrawable().getLevel()+1<=5){
                   x= x +1 ;
                   jumlah.setText(x + "L");
                   kapasitas.setImageLevel(kapasitas.getDrawable().getLevel()+1);
               }else {
                   kapasitas.setImageLevel(5);
                   Toast.makeText(DetailMenu.this, "Sudah Terisi Penuh", Toast.LENGTH_SHORT).show();
               }

           }
       });
        btn_min.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (kapasitas.getDrawable().getLevel() - 1 >= 0) {
                    x = x - 1;
                    jumlah.setText(x + "L");
                    kapasitas.setImageLevel(kapasitas.getDrawable().getLevel() - 1);
                } else {
                    kapasitas.setImageLevel(0);
                    Toast.makeText(DetailMenu.this, "Isikan", Toast.LENGTH_SHORT).show();
                }
            }
        });
        Intent data = getIntent();
        String menu = data.getStringExtra("nama");
        String minuman = data.getStringExtra("pminuman");
        Integer img = data.getIntExtra("gambar", 0);

        head.setText(menu);
        subhead.setText(minuman);
        image.setImageResource(img);
    }
}
