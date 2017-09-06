package com.example.smallning.freego;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;

/**
 * Created by Smallning on 2017/9/6.
 */

public class myAdapter extends RecyclerView.Adapter<myAdapter.ViewHolder> {

    private List<Item> itemList;

    class ViewHolder extends RecyclerView.ViewHolder {
        View view;
        ImageView imageView;
        TextView textView;

        public ViewHolder(View view) {
            super(view);
            this.view=view;
            imageView=view.findViewById(R.id.imageView);
            textView=view.findViewById(R.id.textView);
        }
    }

    public myAdapter(List<Item> items) {
        itemList=items;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_layout,parent,false);
        ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final Item item=itemList.get(position);
        holder.imageView.setImageResource(item.getImageId());
        holder.textView.setText(item.getName());
        holder.view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=null;
                switch (item.getName()) {
                    case "功能1":
                        intent=new Intent(view.getContext(),function1.class);
                        break;
                    case "功能2":
                        intent=new Intent(view.getContext(),function2.class);
                        break;
                    case "功能3":
                        intent=new Intent(view.getContext(),function3.class);
                        break;
                    case "功能4":
                        intent=new Intent(view.getContext(),function4.class);
                        break;
                    default:
                        break;
                }
                view.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }
}
