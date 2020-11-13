package com.apps.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Info extends AppCompatActivity {

    TextView textView,textView2,textView3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
textView = findViewById(R.id.NameView);
        textView3 = findViewById(R.id.AgeView);
        textView2 = findViewById(R.id.DescriptionView);
        Bundle Data = getIntent().getExtras();
if(!Data.isEmpty()){
      textView.setText("Name: "+Data.getString("name"));
        textView2.setText("Description: "+Data.getString("Description"));
          textView3.setText("Age: "+Data.getString("Age"));
}


    }
}