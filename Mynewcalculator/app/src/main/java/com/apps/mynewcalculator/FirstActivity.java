package com.apps.mynewcalculator;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity implements View.OnClickListener {
ImageView Image1,Image2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(getApplicationContext(), "onCreate", Toast.LENGTH_SHORT).show();

        setContentView(R.layout.activity_main);
        Image1 = findViewById(R.id.imageView);

        Image2 = findViewById(R.id.imageView2);

        Image1.setOnClickListener(this::onClick);
        Image2.setOnClickListener(this::onClick);

    }


    @Override
    public void onClick(View v) {


        if(v.getId() == R.id.imageView) {
            Intent intent = new Intent(FirstActivity.this, ScondActivity.class);
            intent.putExtra("First", "Osama");
            intent.putExtra("Scond", " Naji");
            intent.putExtra("Third", " Ali");
            intent.putExtra("key", "OSAMA");

            startActivity(intent);
        }






        if(v.getId() == R.id.imageView2) {

            Intent dintent = new Intent(FirstActivity.this, ScondActivity.class);
            dintent.putExtra("First", "Hassan");
            dintent.putExtra("Scond", " Ahmmed");
            dintent.putExtra("Third", " Muhammed");
            dintent.putExtra("key", "HASSAN");

            startActivity(dintent);
        }
    }
}