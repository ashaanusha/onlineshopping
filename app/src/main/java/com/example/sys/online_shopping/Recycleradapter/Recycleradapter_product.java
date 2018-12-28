package com.example.sys.online_shopping.Recycleradapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.example.sys.online_shopping.R;

public class Recycleradapter_product extends RecyclerView.Adapter<Recycleradapter_product.ViewHolderClass> {
    Context context;
    int[] images;
  String[] button;


         public Recycleradapter_product( Context page5fragment1, int[] images,String[] button){
        context = page5fragment1;
        this.images = images;
        this.button = button;
    }


    @NonNull
    @Override
    public ViewHolderClass onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from( context ).inflate( R.layout.product_recycler, viewGroup, false );
      ViewHolderClass viewHolderClass=new ViewHolderClass(view);
        return viewHolderClass;
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolderClass viewHolderClass, int i) {
        viewHolderClass.imageView.setImageResource( images[i] );
        viewHolderClass.button.setText( button[i] );
    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    public class ViewHolderClass  extends RecyclerView.ViewHolder{
        ImageView imageView;
        Button button;

        public ViewHolderClass(@NonNull View itemView) {
            super( itemView );
            imageView = itemView.findViewById( R.id.img );
            button = itemView.findViewById( R.id.btn );

        }
    }
}
