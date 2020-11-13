package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class First_App extends AppCompatActivity {

    Button myButton;
    TextView myText;

    int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // how to Sipmle connected xml & java
        myButton = findViewById(R.id.my_button);
        myButton.setTextColor(Color.LTGRAY);
        myButton.setBackgroundColor(Color.BLACK);

myText = findViewById(R.id.my_textView);

        // how to make 1 String for 2* class
        myButton.setText(R.string.my_name);

// First method : how to set OnClickListener
//        myButton.setOnClickListener(this::Click_My_Button);



// scond method : how to set OnClickListener

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i++;
                myText.setText("Click number: "+ i);
                System.out.println(R.string.my_textview);

            }
        });


    }

    public void Click_My_Button(View view){

        i++;
        myText.setText("Click number: "+ i);
System.out.println(R.string.my_textview);

    }


}