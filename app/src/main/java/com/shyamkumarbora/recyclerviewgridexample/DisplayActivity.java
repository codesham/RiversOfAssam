package com.shyamkumarbora.recyclerviewgridexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class DisplayActivity extends AppCompatActivity {
    private ImageView mRiverImageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        mRiverImageView = findViewById(R.id.river_display);
        mRiverImageView.setImageResource(getIntent().getIntExtra("IMAGE_ID",0));
    }
}
