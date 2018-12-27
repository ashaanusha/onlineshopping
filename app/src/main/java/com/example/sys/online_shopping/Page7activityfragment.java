package com.example.sys.online_shopping;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.HorizontalScrollView;

public class Page7activityfragment extends AppCompatActivity {
    RecyclerView recyclerView;
    int[] images = {R.drawable.pf7, R.drawable.pf5, R.drawable.pf2};
    String[] arr={"$70","$80","$60"};
    ArrayAdapter<String> adapter;
    Recycleradapter_product recycler;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main7 );
recyclerView=findViewById( R.id.recyclerview );
        Button cart=findViewById(R.id.addtocart);
        cart.setOnClickListener(new View.OnClickListener()
        {  @Override
        public void onClick(View v) {
            Intent i=new Intent(Page7activityfragment.this,Cartactivity.class);
            getIntent().getExtras();
            startActivity(i);
        }
        });

        recyclerView.setLayoutManager( new LinearLayoutManager( this,LinearLayoutManager.HORIZONTAL,false ) );
        Page7Recycleradapter recyclerAdapter = new Page7Recycleradapter( this,images,arr );
        recyclerView.setAdapter( recyclerAdapter );


    }
}
