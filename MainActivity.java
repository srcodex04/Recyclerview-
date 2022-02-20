package com.srcodex.msa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<ContactModel> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));

        list.add(new ContactModel(R.drawable.logo, "Rahul", "9876543210"));
        list.add(new ContactModel(R.drawable.logo, "Vikash", "96765445610"));
        list.add(new ContactModel(R.drawable.logo, "Prem", "7876543210"));
        list.add(new ContactModel(R.drawable.logo, "Akash", "9976543210"));
        list.add(new ContactModel(R.drawable.logo, "Priya", "9376543210"));
        list.add(new ContactModel(R.drawable.logo, "Vishnu", "9276543210"));
        list.add(new ContactModel(R.drawable.logo, "Kamal", "9976547210"));
        list.add(new ContactModel(R.drawable.logo, "Roshan", "9876549210"));
        list.add(new ContactModel(R.drawable.logo, "Firoz", "9276543450"));
        list.add(new ContactModel(R.drawable.logo, "Harsh", "9776543214"));
        list.add(new ContactModel(R.drawable.logo, "Nitesh", "9176543212"));

        ContactAdapter adapter = new ContactAdapter(MainActivity.this, list);
        recyclerView.setAdapter(adapter);

    }
}