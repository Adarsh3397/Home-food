package com.example.database;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
DatabaseHelper myDb;
protected EditText name,email,username,password,address,cuisine;
protected TextView nameT,emailT,usernameT,passwordT,AddressT,cuisineT;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myDb=new DatabaseHelper(this);
        name=(EditText)findViewById(R.id.name);
        email=(EditText)findViewById(R.id.email);
        username=(EditText)findViewById(R.id.username);
        password=(EditText)findViewById(R.id.password);
        address=(EditText)findViewById(R.id.Address);
        cuisine=(EditText)findViewById(R.id.Cuisine);

    }
}
