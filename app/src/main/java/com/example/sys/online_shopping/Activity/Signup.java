package com.example.sys.online_shopping.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.sys.online_shopping.R;

public class Signup  extends AppCompatActivity {
    private DataBaseClass dataBaseClass;
    boolean value=false;
    String name,email,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        dataBaseClass = new DataBaseClass(Signup.this);
        final EditText email = findViewById(R.id.email);
        final EditText password = findViewById(R.id.password);

        Button login = findViewById( R.id.signin );
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email_str = email.getText().toString().trim();
                String password_str = password.getText().toString().trim();
                if (!email_str.equals( "" ) && !password_str.equals( "" )) {

                    value = true;

                    dataBaseClass.insertValues( email_str, password_str );
                    Intent i = new Intent( Signup.this, MainActivity.class );
                    startActivity( i );
                    Toast.makeText( Signup.this, "successfully saved", Toast.LENGTH_SHORT ).show();
                } else {
                    Toast.makeText( Signup.this, "Plz fill the details", Toast.LENGTH_SHORT ).show();

                }
            }
        });
    }
}


