package com.austproject.foodpanda;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        start =  findViewById(R.id.startbutton);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Go to Profile activity
                Intent intent = new Intent(MainActivity.this, profileactivity.class);
                startActivity(intent);
            }
        });

    }
}
