package com.example.sys.online_shopping;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main3 );
        {
            Button login=findViewById(R.id.signin);
            login.setOnClickListener(new View.OnClickListener()
            {  @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity3.this,Main6Activity.class);
                startActivity(i);
            }
            });
            Button signup=findViewById(R.id.signup);
            signup.setOnClickListener(new View.OnClickListener()
            {  @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity3.this,MainActivity4.class);
                startActivity(i);
            }
            });

        }
        }
    }