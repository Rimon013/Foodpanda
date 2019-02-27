package com.austproject.foodpanda;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PaymentActivity extends AppCompatActivity {

    Button credit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
        credit =  findViewById(R.id.credit);

        credit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Go to Profile activity
                Intent intent = new Intent(PaymentActivity.this, CreditCardActivity.class);
                startActivity(intent);
            }
        });
    }
}
