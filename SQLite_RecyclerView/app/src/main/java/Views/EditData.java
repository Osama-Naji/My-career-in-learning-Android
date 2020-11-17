package Views;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import Controller.DatabaseHelper;
import Model.Data;
import com.apps.sqlite_recyclerview.MainActivity;
import com.apps.sqlite_recyclerview.R;

import java.util.List;

public class EditData extends AppCompatActivity {

    private EditText nameText , lnameText , ageText , descriptionText;
    private Button editButton;
    private DatabaseHelper databaseHelper;
    Data personInfo;
    int position;
    String str_position;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_data);


        nameText = findViewById(R.id.NameId1);
        lnameText = findViewById(R.id.Last_NameID1);
        ageText = findViewById(R.id.AgeID1);
        descriptionText   = findViewById(R.id.DescriptionID1);
        editButton = findViewById(R.id.EditId);


        Bundle bundle = getIntent().getExtras();
        str_position = bundle.getString("position");
        position = Integer.parseInt(str_position);
        databaseHelper = new DatabaseHelper(this);
        personInfo = databaseHelper.getData(position);

        if(personInfo != null){
            nameText.setText(personInfo.getName());
            lnameText.setText(personInfo.getLname());
            ageText.setText(personInfo.getAge());
            descriptionText.setText(personInfo.getDesrption());
        }



        editButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"its: "+ageText.getText().toString(),Toast.LENGTH_LONG).show();

                personInfo.setName(  nameText.getText().toString() );
                personInfo.setLname(  lnameText.getText().toString() );
                personInfo.setDesrption(  descriptionText.getText().toString() );
                personInfo.setAge(  ageText.getText().toString() );


                databaseHelper.updateData(personInfo);
                MainActivity.notifyAdapter();
                Intent intent = new Intent(EditData.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });


    }
}