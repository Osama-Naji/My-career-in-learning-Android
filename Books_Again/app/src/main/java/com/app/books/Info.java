package com.app.books;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Info extends AppCompatActivity {

    TextView Title,Year,Gerne;
    ImageView Image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        Title = findViewById(R.id.tiltleID);
        Gerne = findViewById(R.id.gerneID);
        Year = findViewById(R.id.yearID);
        Image = findViewById(R.id.imageViewID);

        Bundle Extra = getIntent().getExtras();

        Title.setText(Extra.getString("title"));
      Year.setText(Extra.getString("gerne"));
     Gerne.setText(Extra.getString("year"));
    Image.setImageResource(Extra.getInt("image"));

    }
}