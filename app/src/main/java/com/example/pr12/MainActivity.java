package com.example.pr12;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements ListItemAdapter.OnItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<ListItem> items = new ArrayList<>();
        items.add(new ListItem("ПлюмБум", "что-то по химии(ну хрень короче)", R.drawable.i1));
        items.add(new ListItem("КХИНКАЛИ", "Вери вкусные большие пельмешки, кто их придумал просто молодцы", R.drawable.i2));
        items.add(new ListItem("КОСПЛЕЙ", "Люди переодеваются в любимых персонажей", R.drawable.i3));

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ListItemAdapter adapter = new ListItemAdapter(items, this);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onItemClick(ListItem item) {
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra("title", item.getTitle());
        intent.putExtra("description", item.getDescription());
        intent.putExtra("imageResource", item.getImageResource());
        startActivity(intent);
    }
}