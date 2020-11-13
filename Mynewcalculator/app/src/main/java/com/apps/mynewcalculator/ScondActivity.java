package com.apps.mynewcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ScondActivity extends AppCompatActivity {
    TextView vew ;
    ImageView Image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        vew = findViewById(R.id.Scond_View_Data);
        Image = findViewById(R.id.imageView3);

        StringBuilder Come = new StringBuilder();
        Bundle Data = getIntent().getExtras();
        Come.append(Data.getString("First"));
        Come.append(" ");
        Come.append(Data.getString("Scond"));
        Come.append(" ");
        Come.append(Data.getString("Third"));

        String Key =Data.getString("key");

        String coming= Come.toString();

        vew.setText(coming);

if(Key.equals("HASSAN")){
    Image.setImageDrawable(getResources().getDrawable(R.drawable.android));


}

else if(Key.equals("OSAMA")){
    Image.setImageDrawable(getResources().getDrawable(R.drawable.java));


}

    }
}