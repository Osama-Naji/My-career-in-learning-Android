package com.apps.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import Adapter.MyAdapter;
import Model.listitem;

public class MainActivity extends AppCompatActivity {

   private RecyclerView recyclerView;
    private List<listitem> listItems;
    private RecyclerView.Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.RecyclerViewID);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        listItems = new ArrayList<>();

        listitem listitem1 = new listitem("Osama","Naji","13");
        listitem listitem2 = new listitem("Muhammed","Naji","100");
        listitem listitem3 = new listitem("Sraj","Naji","50");
        listitem listitem4= new listitem("Ali","Ahmmed","34");
        listitem listitem5 = new listitem("Yusef","Yasser","24");
        listitem listitem6 = new listitem("Hussain","Jmeel","70");
        listitem listitem7 = new listitem("Hassan","Ahmmed","89");

        listItems.add(listitem1);
        listItems.add(listitem2);
        listItems.add(listitem3);
        listItems.add(listitem4);
        listItems.add(listitem5);
        listItems.add(listitem6);
        listItems.add(listitem7);

        adapter  = new MyAdapter(this,listItems);
recyclerView.setAdapter(adapter);


    }
}
//        for (int i =0; i<12;i++){
//
//            listitem listitem = new listitem(
//
//                   "osama" +(i+1),"egg"
//
//                    );
//
//            listItems.add(listitem);
//
//        }
