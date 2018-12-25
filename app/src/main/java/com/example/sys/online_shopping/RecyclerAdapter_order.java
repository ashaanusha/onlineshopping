package com.example.sys.online_shopping;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class RecyclerAdapter_order extends RecyclerView.Adapter<RecyclerAdapter_order.ViewHolderClass> {

        Context context;
        String[] arr;
        String[] arr1;
        String[] arr2;
        Integer[] images;
    public RecyclerAdapter_order(Context mainActivity, String[] arr, Integer[] images, String[] arr1, String[] arr2)
        {
            context = mainActivity;
            this.arr=arr;
            this.images=images;
            this.arr1=arr1;
            this.arr2=arr2;
            }
        @NonNull
        @Override
        public RecyclerAdapter_order.ViewHolderClass onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.recycler_order, viewGroup, false);
        ViewHolderClass viewHolderClass = new ViewHolderClass(view);
        return viewHolderClass;
    }
        @Override
        public void onBindViewHolder(@NonNull ViewHolderClass viewHolderClass, int i) {
        viewHolderClass.process.setText(arr[i]);
        viewHolderClass.images.setImageResource(images[i]);
        viewHolderClass.order.setText(arr1[i]);
        viewHolderClass.date.setText(arr2[i]);


    }

        @Override
        public int getItemCount() {
        return arr.length;
    }


        public class ViewHolderClass extends RecyclerView.ViewHolder{
            TextView process;
            ImageView images;
            TextView order;
            TextView date;


            public ViewHolderClass(@NonNull View itemView) {
                super(itemView);
               process  = itemView.findViewById(R.id.txt);
                images = itemView.findViewById(R.id.img);
                order = itemView.findViewById(R.id.txt1);
                date =itemView.findViewById(R.id.txt2);

            }
        }
    }


