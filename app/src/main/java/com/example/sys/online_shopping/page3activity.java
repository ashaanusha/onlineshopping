package com.example.sys.online_shopping;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class page3activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main3 );
        {
            Button login=findViewById(R.id.signin);
            login.setOnClickListener(new View.OnClickListener()
            {  @Override
            public void onClick(View v) {
                Intent i=new Intent(page3activity.this,page5activity.class);
                startActivity(i);
            }
            });
            Button signup=findViewById(R.id.signup);
            signup.setOnClickListener(new View.OnClickListener()
            {  @Override
            public void onClick(View v) {
                Intent i=new Intent(page3activity.this,page4activity.class);
                startActivity(i);
            }
            });

        }
        }
    }