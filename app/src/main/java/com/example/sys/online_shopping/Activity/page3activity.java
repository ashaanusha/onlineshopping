package com.example.sys.online_shopping.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.sys.online_shopping.R;

import java.util.ArrayList;
import java.util.Map;

public class page3activity extends AppCompatActivity {
    ArrayList <Map <String, String>> data;
    DataBaseClass db;
    EditText email, password;
    String username, pswd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main3 );

        email = findViewById( R.id.email );
        password = findViewById( R.id.password );

        Button login = findViewById( R.id.signin );
        login.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                username = email.getText().toString().trim();
                pswd = password.getText().toString().trim();
                if (!username.equals( "" ) && !pswd.equals( "" )) {
                    data = new ArrayList <Map <String, String>>();
                    db = new DataBaseClass( getApplicationContext() );
                    data = db.getRetrive( username, pswd );
                    if (!data.isEmpty()) {
                        Intent i = new Intent( page3activity.this, page5activity.class );
                        startActivity( i );
                    } else {
                        Toast.makeText( page3activity.this, "invalid username and password", Toast.LENGTH_SHORT ).show();
                    }
                } else {
                    Toast.makeText( page3activity.this, "enter details", Toast.LENGTH_SHORT ).show();
                }

            }
        } );


        Button signup = findViewById( R.id.signup );
        signup.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent( page3activity.this, page4activity.class );
                startActivity( i );
            }
        } );

    }
}
