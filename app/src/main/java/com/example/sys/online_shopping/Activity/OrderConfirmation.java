package com.example.sys.online_shopping.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.sys.online_shopping.R;

public class OrderConfirmation extends AppCompatActivity

{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.order_confirmation);
        Button backtomenu=findViewById(R.id.continueshopping);
        backtomenu.setOnClickListener(new View.OnClickListener()
        {  @Override
        public void onClick(View v) {
            Intent i=new Intent(OrderConfirmation.this,page5activity.class);
            startActivity(i);
        }
        });

        getSupportActionBar().setTitle( "Order Confirmation" );

        }
    }