package com.example.sys.online_shopping;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Page7activityfragment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main7 );

        Button cart=findViewById(R.id.addtocart);
        cart.setOnClickListener(new View.OnClickListener()
        {  @Override
        public void onClick(View v) {
            Intent i=new Intent(Page7activityfragment.this,Cartactivity.class);
            startActivity(i);
        }
        });




    }
}
