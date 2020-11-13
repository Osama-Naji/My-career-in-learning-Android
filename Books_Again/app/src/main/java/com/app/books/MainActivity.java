package com.app.books;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import Adapter.Books_Adapter;
import Model.ListItem;


public class MainActivity extends AppCompatActivity {


    private RecyclerView recyclerView;
    List<ListItem> listItems;
    private RecyclerView.Adapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.RecyclerViewID);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        listItems = new ArrayList<>();

        ListItem listitem0 = new ListItem("تذكرة لمن يخشى","2017","زاد الواعظ / الدروس الثقافية",R.drawable.a8);
        ListItem listitem1 = new ListItem("حلية الصالحين","2018","زاد الواعظ/الدروس الثقافية",R.drawable.a1);
        ListItem listitem2 = new ListItem("قد أفلح المؤمنون","2018","زاد الواعظ/الدروس الثقافية",R.drawable.a2);
        ListItem listitem3 = new ListItem("كن صادقًا","2018","زاد الواعظ/الدروس الثقافية",R.drawable.a3);
        ListItem listitem4= new ListItem("إنَّ معي لبصيرتي","2019","زاد الواعظ/الدروس الثقافية",R.drawable.a4);
        ListItem listitem5 = new ListItem("ذلك الدين القيِّم","2019","زاد الواعظ/الدروس الثقافية",R.drawable.a5);
        ListItem listitem6 = new ListItem("اﻹنسان والمجتبع","2019","زاد الواعظ/الدروس الثقافية",R.drawable.a6);
        ListItem listitem7 = new ListItem("وأعدُّ","2020","زاد الواعظ/الدروس الثقافية",R.drawable.a7);

        listItems.add(listitem1);
        listItems.add(listitem2);
        listItems.add(listitem3);
        listItems.add(listitem4);
        listItems.add(listitem5);
        listItems.add(listitem6);
        listItems.add(listitem7);

        adapter  = new Books_Adapter(this,listItems);
        recyclerView.setAdapter(adapter);
    }
}