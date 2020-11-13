package com.apps.mynewcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {
TextView vew ;
Button back ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        vew = findViewById(R.id.Third_View_Data);

        StringBuilder Come = new StringBuilder();
        Bundle Data = getIntent().getExtras();
        Come.append(Data.getString("First"));
        Come.append(" ");
        Come.append(Data.getString("Scond"));
        Come.append(" ");
        Come.append(Data.getString("Third"));

        String coming= Come.toString();

        vew.setText(coming);

        back = findViewById(R.id.Back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Backintent = getIntent();

                Backintent.putExtra("Weclome","Weclome Back (it's Data !)");

setResult(RESULT_OK,Backintent);
finish();
            }
        });



    }
}