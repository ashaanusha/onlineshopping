package com.example.sys.online_shopping.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.sys.online_shopping.R;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.profile );
        getSupportActionBar().setTitle( "PROFILE" );
    }
}
