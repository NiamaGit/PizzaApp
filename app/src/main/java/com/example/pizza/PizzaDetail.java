package com.example.pizza;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class PizzaDetail extends AppCompatActivity {
    private ImageView iv;
    private TextView title,description,ingred,prep;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza_detail);
        title = findViewById(R.id.title);
        description = findViewById(R.id.Description1);
        ingred = findViewById(R.id.ingred);
        prep = findViewById(R.id.prepa);
        iv = findViewById(R.id.imageView);

        Intent intent=this.getIntent();
        String title1=intent.getStringExtra("nom");
        int imageView1=Integer.valueOf(intent.getStringExtra("photo"));
        String ingred1=intent.getStringExtra("detail");
        String Description1=intent.getStringExtra("desc");
        String prepa1=intent.getStringExtra("pre");

        title.setText(title1);
        description.setText(Description1);
        ingred.setText(ingred1);
        prep.setText(prepa1);
        iv.setImageResource(imageView1);
    }
}