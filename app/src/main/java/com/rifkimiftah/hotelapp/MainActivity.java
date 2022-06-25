package com.rifkimiftah.hotelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    private ImageView _imageView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _imageView1 = (ImageView) findViewById(R.id.imageView1);

        String imageUrl = "https://media-cdn.tripadvisor.com/media/photo-s/11/cb/07/0f/20180116-181231-01-largejpg.jpg";
        Picasso.with(this).load(imageUrl).into(_imageView1);
    }
}