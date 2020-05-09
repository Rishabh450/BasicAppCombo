package com.example.rishabh.shopping;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class Adapt extends RecyclerView.Adapter<Adapt.ViewHolder> {

 Context context;
    private int[] id;
    private String[] name;
    public Adapt(String[] name ,int [] id,Context context) {
        this.name = name;
        this.id = id;
        this.context = context;


    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater=LayoutInflater.from(viewGroup.getContext());
        View view=inflater.inflate(R.layout.lister,viewGroup,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder,final int i) {

        String title=id[i];

        viewHolder.t.setText(title);






    }

    @Override
    public int getItemCount() {
        return id.length;
    }


    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView t;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            t=itemView.findViewById(R.id.text);


        }




    }

}
