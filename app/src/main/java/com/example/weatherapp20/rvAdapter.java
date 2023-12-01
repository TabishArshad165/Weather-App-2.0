package com.example.weatherapp20;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class rvAdapter extends RecyclerView.Adapter<rvAdapter.viewHolder> {
    Context context;
    ArrayList<rv_structure> items;

    public rvAdapter(Context context, ArrayList<rv_structure> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.rv_card, parent, false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        holder.hour.setText(items.get(position).getHour());
        holder.temp.setText(items.get(position).getTemp());

        int drawableResourceId = holder.itemView.getResources()
                .getIdentifier(items.get(position).getPicPath(), "drawable",
                        holder.itemView.getContext().getPackageName());

        Glide.with(context).load(drawableResourceId).into(holder.img);

    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        TextView hour, temp;
        ImageView img;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            hour = itemView.findViewById(R.id.txt_hour);
            temp = itemView.findViewById(R.id.txt_temp);
            img = itemView.findViewById(R.id.img_pic);
        }
    }
}
