package com.example.sys.online_shopping.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.sys.online_shopping.R;

public class Creditcardactivity extends AppCompatActivity

{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.paywith_creditcard );

        Button placeordernow=findViewById(R.id.placeordernow);
        placeordernow.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Creditcardactivity.this,OrderConfirmation.class);
                startActivity(i);
            }
        });
   getSupportActionBar().setTitle( "Pay With CreditCard" );
        }
    }