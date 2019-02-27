package com.austproject.foodpanda;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class ItemActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    ArrayList<ModelFood> foodsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item);

        recyclerView = findViewById(R.id.recycler_view);

        foodsList = new ArrayList<>();

        foodsList.add(new ModelFood(R.drawable.burger,"Burger","100"));
        foodsList.add(new ModelFood(R.drawable.sandwich,"Sandwich","80"));
        foodsList.add(new ModelFood(R.drawable.pizza,"Pizza","90"));
        foodsList.add(new ModelFood(R.drawable.sub_sandwich,"Sub Sandwich","80"));


        LinearLayoutManager layoutManager = new LinearLayoutManager(this);

        RecyclerView.LayoutManager rvLiLayoutManager = layoutManager;

        recyclerView.setLayoutManager(rvLiLayoutManager);

        FoodAdapter adapter = new FoodAdapter(this,foodsList);

        recyclerView.setAdapter(adapter);

    }
}
