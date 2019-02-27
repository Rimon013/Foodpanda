package com.austproject.foodpanda;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FoodPandaActivity extends AppCompatActivity {


    Button Snacks;
    Button cart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_panda);
        Snacks =  findViewById(R.id.Snacks);
        cart=findViewById(R.id.cart);

        Snacks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Go to Profile activity
                Intent intent = new Intent(FoodPandaActivity.this, ItemActivity.class);
                startActivity(intent);
            }


            });




        cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FoodPandaActivity.this, cart.class);
                startActivity(intent);
            }
        });

    }
}
