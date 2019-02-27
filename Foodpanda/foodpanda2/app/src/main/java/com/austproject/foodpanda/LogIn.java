package com.austproject.foodpanda;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.austproject.foodpanda.database.DatabaseHandler;
import com.austproject.foodpanda.model.Contact;

import java.util.List;

public class LogIn extends AppCompatActivity {


    TextView mail, pass;
    Button login;


    boolean check(String email, String pass){


        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        mail = findViewById(R.id.logemail);
        pass = findViewById(R.id.pass);
        login = findViewById(R.id.loginbtn);

        final DatabaseHandler db=new DatabaseHandler(this);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = mail.getText().toString();
                String password = pass.getText().toString();

                List<Contact> myContactList=db.getAllContact();
                String resultEmail = "";
                String resultPass="";
                Boolean notMatched=false;
                for(Contact myContact : myContactList)
                {
                    resultEmail = myContact.getContactNumber();
                    resultPass = myContact.getPassword();
                    if(resultEmail.equals(email) && resultPass.equals(password)) {

                        Intent intent = new Intent(LogIn.this, FoodPandaActivity.class);
                        startActivity(intent);
                        break;

                    }
                    else
                        notMatched=true;


                }
                if(notMatched)
                    Toast.makeText (getApplicationContext(),"Username or password invalid",Toast.LENGTH_SHORT).show();

                // Check if match

                if (check(email, password)){
                    // Go to target activity



                }





            }



        });


    }
}
