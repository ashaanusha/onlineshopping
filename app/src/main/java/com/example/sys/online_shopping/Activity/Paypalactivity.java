package com.example.sys.online_shopping.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.sys.online_shopping.R;

public class Paypalactivity extends AppCompatActivity

{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.checkout2 );
        Button paypal = findViewById( R.id.radiopYPAL );
        paypal.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent( Paypalactivity.this, Login_with_paypal.class );
                startActivity( i );
            }
        } );
        Button placeordernow=findViewById(R.id.placeordernow);
        placeordernow.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Paypalactivity.this,Login_with_paypal.class);
                startActivity(i);
            }
        });
        Button paypal1 = findViewById( R.id.radiovisa );
        paypal1.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent( Paypalactivity.this, Creditcardactivity.class );
                startActivity( i );
            }
        } );
      getSupportActionBar().setTitle( "Check Out" );

    }
}