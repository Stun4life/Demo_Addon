package com.example.demoaddon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv = findViewById(R.id.iv);

        String imageUrl = "https://static.wikia.nocookie.net/pokemon/images/b/bd/Celebi_M13.png/revision/latest?cb=20151118044038";
        Picasso.with(this).load(imageUrl).into(iv);

    }
}