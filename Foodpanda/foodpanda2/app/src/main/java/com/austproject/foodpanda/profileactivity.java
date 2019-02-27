package com.austproject.foodpanda;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.austproject.foodpanda.database.DatabaseHandler;
import com.austproject.foodpanda.model.Contact;

import java.util.List;

public class profileactivity extends AppCompatActivity {

    EditText name, email, password;
    Button signup;
    Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profileactivity);


        name = findViewById(R.id.name);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        signup = findViewById(R.id.signupbutton);
        login = findViewById(R.id.login);

        final DatabaseHandler db=new DatabaseHandler(this);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = name.getText().toString();
                String useremail = email.getText().toString();
                String userpassword = password.getText().toString();


                if(name.equals("") || email.equals("") || password.equals(""))
                {
                    Toast.makeText (getApplicationContext(),"Information Missing",Toast.LENGTH_SHORT).show();
                }
                else{
                    db.addContact(new Contact(username,useremail,userpassword));
                    Toast.makeText (getApplicationContext(),"New Contact Is Added.",Toast.LENGTH_SHORT).show();
                }

                List<Contact> myContactList=db.getAllContact();
                String result = "";
                for(Contact myContact : myContactList)
                {
                    result +="Id: "+ myContact.getId()+" Name: "+myContact.getName()+" Email No.: "+ myContact.getContactNumber();
                    result +="\n";
                    Log.d("Result",result);
                }
                if(myContactList.size()  == 0)
                {
                    result = "No contact to display.";
                }

                // Write the info in database

                Toast.makeText(profileactivity.this, "Account added successfully. Please log in now", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(profileactivity.this,LogIn.class);
                startActivity(intent);

            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(profileactivity.this, LogIn.class);
                startActivity(intent);
            }
        });




    }
}