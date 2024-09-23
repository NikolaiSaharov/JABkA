package com.example.pr12;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        String title = getIntent().getStringExtra("title");
        String description = getIntent().getStringExtra("description");
        int imageResource = getIntent().getIntExtra("imageResource", R.drawable.i1);

        TextView titleTextView = findViewById(R.id.detailTitle);
        TextView descriptionTextView = findViewById(R.id.detailDescription);
        ImageView imageView = findViewById(R.id.detailImage);

        titleTextView.setText(title);
        descriptionTextView.setText(description);
        imageView.setImageResource(imageResource);
    }
}