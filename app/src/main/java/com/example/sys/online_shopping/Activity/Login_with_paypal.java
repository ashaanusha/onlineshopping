package com.example.sys.online_shopping.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.sys.online_shopping.R;

public class Login_with_paypal  extends AppCompatActivity

{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.paypal_method );
        Button paypal = findViewById( R.id.login );
        paypal.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent( Login_with_paypal.this, OrderConfirmation.class );
                startActivity( i );
            }
        } );
   getSupportActionBar().setTitle( "Log In With Paypal" );

    }
}