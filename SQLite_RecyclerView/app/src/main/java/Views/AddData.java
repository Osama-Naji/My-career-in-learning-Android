package Views;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.apps.sqlite_recyclerview.MainActivity;
import com.apps.sqlite_recyclerview.R;

import Controller.DatabaseHelper;
import Model.Data;

public class AddData extends AppCompatActivity {

    EditText Name,LName,Age,Dec;
    Button button;
    DatabaseHelper helper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_data);

helper = new DatabaseHelper(this);
        Name = findViewById(R.id.NameId);
        LName = findViewById(R.id.Last_NameID);
        Age = findViewById(R.id.AgeID);
        Dec = findViewById(R.id.DescriptionID);
        button = findViewById(R.id.AddID);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = Name.getText().toString();
                String lname = LName.getText().toString();
                String description = Dec.getText().toString();
                String age = Age.getText().toString();


helper.insertData(new Data(name,lname,age,description));

                Intent intent = new Intent(AddData.this, MainActivity.class);

                startActivity(intent);

                finish();

            }
        });

    }
}