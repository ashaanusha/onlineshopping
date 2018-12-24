package com.example.sys.online_shopping;

import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class RecyclerAdapter_discountsales  extends RecyclerView.Adapter<RecyclerAdapter_discountsales.ViewHolderClass> {

    Context context;
    int[] images;
    String[] arr;
    String[] arr1;
    String[] arr2;
    String[] arr3;
    String[] arr4;
    String[] arr5;
    int[] images1;

    public RecyclerAdapter_discountsales(Context discountfragment, int[] images, String[] arr,String[] arr1,String[] arr2,String[] arr3,String[] arr4,String[] arr5,int[]images1) {
        context = discountfragment;
        this.images = images;
        this.arr = arr;
        this.arr1 = arr1;
        this.arr2 = arr2;
        this.arr3 = arr3;
        this.arr4 = arr4;
        this.arr5 = arr5;
        this.images1 = images1;



    }

    @NonNull
    @Override
    public RecyclerAdapter_discountsales.ViewHolderClass onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from( context ).inflate( R.layout.discountsales_recycler, viewGroup, false );
        ViewHolderClass viewHolderClass = new RecyclerAdapter_discountsales.ViewHolderClass( view );
        return viewHolderClass;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerAdapter_discountsales.ViewHolderClass viewHolderClass, int i) {
        viewHolderClass.imageView.setImageResource( images[i] );
        viewHolderClass.textView.setText( arr[i] );
        viewHolderClass.textView.setPaintFlags(viewHolderClass.textView.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        viewHolderClass.textView1.setText( arr1[i] );
        viewHolderClass.textView2.setText( arr2[i] );
        viewHolderClass.textView3.setText( arr3[i] );
        viewHolderClass.textView4.setText( arr4[i] );
        viewHolderClass.textView5.setText( arr5[i] );
        viewHolderClass.imageView1.setImageResource( images1[i] );

viewHolderClass.textView5.setOnClickListener( new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent i=new Intent(context,page5activity.class);
        context.startActivity( i );
    }
} );

    }







    @Override
    public int getItemCount() {
            return images.length;
    }



    public class ViewHolderClass extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;
        TextView textView1;
        TextView textView2;
        ImageView imageView1;
        TextView textView3;
        TextView textView4;
        TextView textView5;



        public ViewHolderClass(@NonNull View itemView) {
            super( itemView );
            imageView = itemView.findViewById( R.id.img );
            textView =itemView.findViewById( R.id.num );
            textView1=itemView.findViewById( R.id.num2 );
            textView2=itemView.findViewById( R.id.txt );
            imageView1=itemView.findViewById( R.id.img1 );
            textView3=itemView.findViewById( R.id.txt1 );
            textView4=itemView.findViewById( R.id.product);
            textView5=itemView.findViewById( R.id.txt2 );




        }


    }}
