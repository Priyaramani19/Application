package com.example.application;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomsheet.BottomSheetDialog;

public class select_activity extends AppCompatActivity {

    private CardView tp,p_mize,g_99,learn_c,stn,w3s;

    String tp_link = "https://www.tutorialspoint.com/cprogramming";
    String p_mize_link = "https://www.programiz.com/c-programming";
    String g_99_link = "https://www.guru99.com/c-programming";
    String learn_c_link = "https://www.learn-c.org/";
    String stn_link = "https://www.studytonight.com/c/";
    String w3s_link = "https://www.w3schools.com/c/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);
        binding();

        Intent intent = new Intent(select_activity.this,Home_Screen.class);
        tp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                intent.putExtra("n1",tp_link);
                startActivity(intent);

            }
        });

        p_mize.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                intent.putExtra("n1",p_mize_link);
                startActivity(intent);

            }
        });

        g_99.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                intent.putExtra("n1",g_99_link);
                startActivity(intent);

            }
        });

        learn_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                intent.putExtra("n1",learn_c_link);
                startActivity(intent);

            }
        });

        stn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                intent.putExtra("n1",stn_link);
                startActivity(intent);

            }
        });

        w3s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                intent.putExtra("n1",w3s_link);
                startActivity(intent);

            }
        });
    }

    private void binding()
    {
        tp = findViewById(R.id.tp);
        p_mize = findViewById(R.id.p_mize);
        g_99 = findViewById(R.id.g_99);
        learn_c = findViewById(R.id.learn_c);
        stn = findViewById(R.id.stn);
        w3s = findViewById(R.id.w3s);
    }


    @Override
    public void onBackPressed() {
//        Toast.makeText(select_activity.this, "Yes", Toast.LENGTH_SHORT).show();
        cus_dialog();
    }

    void cus_dialog() {
        BottomSheetDialog d1 = new BottomSheetDialog(select_activity.this);
        d1.setContentView(R.layout.custom_dialog);
        d1.setCancelable(false);

        TextView no_btn = d1.findViewById(R.id.no_btn);
        TextView yes_btn = d1.findViewById(R.id.yes_btn);

        yes_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        no_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                d1.dismiss();
            }
        });

        d1.show();
    }
}