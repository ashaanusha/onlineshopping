package com.example.sys.online_shopping;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Cartactivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.cartpage );

        Button backtomenu=findViewById(R.id.backtomenu);
        backtomenu.setOnClickListener(new View.OnClickListener()
        {  @Override
        public void onClick(View v) {
            Intent i=new Intent(Cartactivity.this,page5activity.class);
            startActivity(i);
        }
        });
        Button checkout=findViewById(R.id.checkout);
        checkout.setOnClickListener(new View.OnClickListener()
        {  @Override
        public void onClick(View v) {
            Intent i=new Intent(Cartactivity.this,Checkoutactivity.class);
            startActivity(i);
        }
        });


    }

}