package com.example.sys.online_shopping.Recycleradapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.sys.online_shopping.R;
import com.example.sys.online_shopping.fragment.Page7activityfragment;

public class RecyclerAdapter6activity extends RecyclerView.Adapter<RecyclerAdapter6activity.ViewHolderClass> {
    Context context;
    int[] images;

    public RecyclerAdapter6activity(Context mainActivity, int[] images) {
        context = mainActivity;
        this.images=images;
    }
    @NonNull
    @Override
    public ViewHolderClass onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(context).inflate( R.layout.recycle,viewGroup,false );
        ViewHolderClass viewHolderClass=new ViewHolderClass(view);
        return viewHolderClass;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderClass viewHolderClass, int i) {
        viewHolderClass.imageView.setImageResource( images[i] );
        viewHolderClass.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*Intent in = new Intent(context, NewPage.class);
                context.startActivity(in);*/
                Intent i=new Intent(context,Page7activityfragment.class);
                context.startActivity( i );
            }
        });
    }



    @Override
    public int getItemCount() {
        return images.length;
    }

    class ViewHolderClass extends RecyclerView.ViewHolder {
        ImageView imageView;

        public ViewHolderClass(@NonNull View itemView) {
            super( itemView );
            imageView = itemView.findViewById( R.id.img );

        }
    }}