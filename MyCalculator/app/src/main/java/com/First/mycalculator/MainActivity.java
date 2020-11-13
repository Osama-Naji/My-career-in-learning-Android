package com.First.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    Button sum;
    Button plus;
    Button Div;
    Button Mult;
    TextView Result;

    EditText First_number;
    EditText Scond_number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sum =findViewById(R.id.Sum);
        plus =findViewById(R.id.Plus);
        Div =findViewById(R.id.Divid);
        Mult =findViewById(R.id.multip);

        Result = findViewById(R.id.Result);

        First_number =findViewById(R.id.Num1);
        Scond_number =findViewById(R.id.num2);


    }


public void Sum (View view){




     if(TextUtils.isDigitsOnly(First_number.getText().toString()) && TextUtils.isDigitsOnly(Scond_number.getText().toString()) && !TextUtils.isEmpty(First_number.getText().toString()) && !TextUtils.isEmpty((Scond_number.getText().toString()))  ) {


        String numb1 = First_number.getText().toString();
        String numb2 = Scond_number.getText().toString();


        Double numD1 = Double.parseDouble(numb1);
        Double numD2 = Double.parseDouble(numb2);

        Double result = numD1 - numD2;

        Result.setText("Result: " + Double.toString(result));

        First_number.setText(null);
        Scond_number.setText(null);

    }

     else{
        Result.setText("Please enter number");
    }



}


    public void plus (View view){





         if(TextUtils.isDigitsOnly(First_number.getText().toString()) && TextUtils.isDigitsOnly(Scond_number.getText().toString()) && !TextUtils.isEmpty(First_number.getText().toString()) && !TextUtils.isEmpty((Scond_number.getText().toString())) ) {

            String numb1 = First_number.getText().toString();
            String numb2 = Scond_number.getText().toString();


            Double numD1 = Double.parseDouble(numb1);
            Double numD2 = Double.parseDouble(numb2);

            Double result = numD1 + numD2;

            Result.setText("Result: " + Double.toString(result));

            First_number.setText(null);
            Scond_number.setText(null);
        }
         else{
            Result.setText("Please enter number");
        }
    }


    public void Divi (View view){


        if(TextUtils.isDigitsOnly(First_number.getText().toString()) && TextUtils.isDigitsOnly(Scond_number.getText().toString()) && !TextUtils.isEmpty(First_number.getText().toString()) && !TextUtils.isEmpty((Scond_number.getText().toString())) ) {
            String numb1 = First_number.getText().toString();
            String numb2 = Scond_number.getText().toString();


            Double numD1 = Double.parseDouble(numb1);
            Double numD2 = Double.parseDouble(numb2);

            Double result = numD1 / numD2;

            Result.setText("Result: " + Double.toString(result));

            First_number.setText(null);
            Scond_number.setText(null);
        }
        else

    {
        Result.setText("Please enter number");
    }
    }


    public void mult (View view){



        if(TextUtils.isDigitsOnly(First_number.getText().toString()) && TextUtils.isDigitsOnly(Scond_number.getText().toString()) && !TextUtils.isEmpty(First_number.getText().toString()) && !TextUtils.isEmpty((Scond_number.getText().toString())) ) {


            String numb1 = First_number.getText().toString();
            String numb2 = Scond_number.getText().toString();


            Double numD1 = Double.parseDouble(numb1);
            Double numD2 = Double.parseDouble(numb2);

            Double result = numD1 * numD2;

            Result.setText("Result: " + Double.toString(result));

            First_number.setText(null);
            Scond_number.setText(null);
        }
        else{
            Result.setText("Please enter number");
        }

    }



}