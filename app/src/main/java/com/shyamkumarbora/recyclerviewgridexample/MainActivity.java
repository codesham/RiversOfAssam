package com.shyamkumarbora.recyclerviewgridexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private int [] images = {
      R.drawable.barak,
      R.drawable.beki,
      R.drawable.bhogdoi,
      R.drawable.brahmaputra,
      R.drawable.dhansiri,
      R.drawable.dibang,
      R.drawable.dihing,
      R.drawable.kameng,
      R.drawable.kopili,
      R.drawable.kulsi,
      R.drawable.kushiyara,
      R.drawable.lohit,
      R.drawable.longai,
      R.drawable.manas,
      R.drawable.sankosh,
      R.drawable.subansiri,
      R.drawable.surma
    };
    private String [] riverAssamNames = {
      "Barak",
      "Beki",
      "Bhogdoi",
      "Brahmaputra",
      "Dhansiri",
      "Dibang",
      "Dihing",
      "Kameng",
      "Kopili",
      "Kulsi",
      "Kushiyara",
      "Lohit",
      "Longai",
      "Manas",
      "Sankosh",
      "Subansiri",
      "Surma"
    };
    private RecyclerView.LayoutManager mLayoutManager;
    private RecyclerAdapter mRecyclerAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView = findViewById(R.id.recycler_view);
        mLayoutManager = new GridLayoutManager(this,2);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerAdapter = new RecyclerAdapter(images,riverAssamNames,this);
        mRecyclerView.setAdapter(mRecyclerAdapter);
    }
}
