package com.example.sys.online_shopping;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolderClass> {
    Context context;
    int[] images;

    public RecyclerAdapter(Context mainActivity, int[] images) {
        context = mainActivity;
        this.images=images;
    }
    @NonNull
    @Override
    public ViewHolderClass onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(context).inflate(R.layout.recycle,viewGroup,false );
        ViewHolderClass viewHolderClass=new ViewHolderClass(view);
        return viewHolderClass;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderClass viewHolderClass, int i) {
        viewHolderClass.imageView.setImageResource( images[i] );

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