package com.example.sys.online_shopping.Recycleradapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.sys.online_shopping.R;

public class Recycleradapter_seller  extends RecyclerView.Adapter<Recycleradapter_seller.ViewHolderClass> {
    Context context;
    int[] images;
    String[] arr1;
    String[] arr2;

    public Recycleradapter_seller(Context page5fragment1, int[] images, String[] arr1, String[] arr2) {
        context = page5fragment1;
        this.images = images;
        this.arr1=arr1;
        this.arr2=arr2;

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
        viewHolderClass.txtview.setText( arr1[i]);
        viewHolderClass.txtview1.setText( arr2[i]);


    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    public class ViewHolderClass extends RecyclerView.ViewHolder {
        ImageView imageView;
      TextView txtview;
      TextView txtview1;

        public ViewHolderClass(@NonNull View itemView) {
            super( itemView );
            imageView = itemView.findViewById( R.id.img );
            txtview=itemView.findViewById(R.id.txt1);
            txtview1=itemView.findViewById( R.id.txt2 );
        }
    }
}