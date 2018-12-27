package com.example.sys.online_shopping;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class RecyclerAdapter_favourite  extends RecyclerView.Adapter<RecyclerAdapter_favourite.ViewHolderClass> {

    Context context;
    String[] title;
    String[] dollar;
    Integer[] images;
    Integer[] images1;

    public RecyclerAdapter_favourite(Context Favouritefragment, String[] title, Integer[] images, String[] dollar, Integer[] images1) {
        context = Favouritefragment;
        this.title=title;
        this.images=images;
        this.dollar=dollar;
        this.images1=images1;


    }

    @NonNull
    @Override
    public RecyclerAdapter_favourite.ViewHolderClass onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from( context ).inflate( R.layout.favourite_recycler, viewGroup, false );
        RecyclerAdapter_favourite.ViewHolderClass viewHolderClass = new RecyclerAdapter_favourite.ViewHolderClass( view );
        return viewHolderClass;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerAdapter_favourite.ViewHolderClass viewHolderClass, int i) {
        viewHolderClass.imageView.setImageResource(images[i]);
        viewHolderClass.textView.setText(title[i]);
        viewHolderClass.textView1.setText(dollar[i]);
        viewHolderClass.imageView1.setImageResource(images1[i]);
        viewHolderClass.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*Intent in = new Intent(context, NewPage.class);
                context.startActivity(in);*/
                Intent i=new Intent(context,Page7activityfragment.class);
                i.putExtra( "image",images.toString() );
                context.startActivity( i );
            }
        });
      }


    @Override
    public int getItemCount() {
        return images.length;
    }



    public class ViewHolderClass extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;
        TextView textView1;
        ImageView imageView1;


        public ViewHolderClass(@NonNull View itemView) {
            super( itemView );
            imageView = itemView.findViewById( R.id.img );
            textView =itemView.findViewById( R.id.txt );
            textView1=itemView.findViewById( R.id.dollar);
            imageView1=itemView.findViewById( R.id.image );




        }


    }}
