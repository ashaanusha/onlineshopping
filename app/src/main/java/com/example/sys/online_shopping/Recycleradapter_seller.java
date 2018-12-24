package com.example.sys.online_shopping;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

public class Recycleradapter_seller  extends RecyclerView.Adapter<Recycleradapter_seller.ViewHolderClass> {
    Context context;
    int[] images;

    public Recycleradapter_seller(Context page5fragment1, int[] images) {
        context = page5fragment1;
        this.images = images;

    }

    @NonNull
    @Override
    public ViewHolderClass onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from( context ).inflate( R.layout.bestsellers_recycler, viewGroup, false );
        ViewHolderClass viewHolderClass = new Recycleradapter_seller.ViewHolderClass( view );
        return viewHolderClass;
    }

    @Override
    public void onBindViewHolder(@NonNull Recycleradapter_seller.ViewHolderClass viewHolderClass, int i) {
        viewHolderClass.imageView.setImageResource( images[i] );

    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    public class ViewHolderClass extends RecyclerView.ViewHolder {
        ImageView imageView;
        Button button;

        public ViewHolderClass(@NonNull View itemView) {
            super( itemView );
            imageView = itemView.findViewById( R.id.img );
        }
    }
}