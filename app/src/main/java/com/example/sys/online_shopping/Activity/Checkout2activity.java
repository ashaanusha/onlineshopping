package com.example.sys.online_shopping.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.sys.online_shopping.R;

public class Checkout2activity extends AppCompatActivity

{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.checkout2 );
        Button paypal=findViewById(R.id.radiopYPAL);
        paypal.setOnClickListener(new View.OnClickListener()
        {  @Override
        public void onClick(View v) {
            Intent i=new Intent(Checkout2activity.this,Paypalactivity.class);
            startActivity(i);
        }
        });
        getSupportActionBar().setTitle( "CheckOut" );
    }
}
