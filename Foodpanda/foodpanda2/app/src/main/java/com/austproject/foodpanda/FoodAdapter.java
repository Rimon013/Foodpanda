package com.austproject.foodpanda;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.ViewHolder> {

    private Context mContext;

    private ArrayList<ModelFood> mlist;

    FoodAdapter(Context context, ArrayList<ModelFood>list){
        mContext=context;
        mlist=list;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(mContext);

        View view = layoutInflater.inflate(R.layout.all_category_menu,parent,false);

        ViewHolder viewHolder= new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        ModelFood foodItem = mlist.get(position);

        ImageView image = holder.item_image;

        TextView name,price;

        name=holder.item_name;

        price=holder.item_price;

        image.setImageResource(foodItem.getImage());

        name.setText(foodItem.getName());

        price.setText(foodItem.getPrice());

    }

    @Override
    public int getItemCount() {
        return mlist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView item_image;
        TextView item_name, item_price;

        public ViewHolder(View itemView) {
            super(itemView);

            item_image= itemView.findViewById(R.id.item_image);

            item_name= itemView.findViewById(R.id.item_name);

            item_price= itemView.findViewById(R.id.item_price);


        }
    }
}
