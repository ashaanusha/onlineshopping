package com.example.sys.online_shopping;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class Page7Recycleradapter extends RecyclerView.Adapter<Page7Recycleradapter.ViewHolderClass> {
    Context context;
    int[] images;
    String[] arr;

    public Page7Recycleradapter(Context page7activityfragment, int[] images, String[] arr) {
        context = page7activityfragment;
        this.images = images;
        this.arr = arr;

    }
    @NonNull
    @Override
    public Page7Recycleradapter.ViewHolderClass onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from( context ).inflate( R.layout.activitymain7_recycler, viewGroup, false );
        ViewHolderClass viewHolderClass = new Page7Recycleradapter.ViewHolderClass(view);
        return viewHolderClass;
    }
    @Override
    public void onBindViewHolder(@NonNull ViewHolderClass viewHolderClass, int i) {
        viewHolderClass.imageView.setImageResource( images[i] );
        viewHolderClass.textView.setText( arr[i] );

    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    public class ViewHolderClass extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;

        public ViewHolderClass(@NonNull View itemView) {
            super( itemView );
            imageView = itemView.findViewById( R.id.img );
            textView =itemView.findViewById( R.id.num );
        }
    }
}
