package com.example.coffee_application.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.coffee_application.DetailedDailyMenuActivity;
import com.example.coffee_application.R;
//import com.example.coffee_application.activities.DetailedDailyMenuActivity;
import com.example.coffee_application.models.DailyMenuModel;

import java.util.ArrayList;

public class DailyMenuAdapter extends RecyclerView.Adapter<DailyMenuAdapter.ViewHolder> {

    Context context;
    ArrayList<DailyMenuModel> list;

    public DailyMenuAdapter(Context context, ArrayList<DailyMenuModel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.daily_menu_items, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.imageview.setImageResource(list.get(position).getImage());
        holder.name.setText(list.get(position).getName());
        holder.discount.setText(list.get(position).getDiscount());
        holder.description.setText(list.get(position).getDescription());


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailedDailyMenuActivity.class);
                intent .putExtra("type",list.get(position).getType());
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }
   public static class ViewHolder extends RecyclerView.ViewHolder{
       ImageView imageview;
       TextView name,description,discount;
       public ViewHolder(@NonNull View itemView) {
           super(itemView);

           imageview=itemView.findViewById(R.id.I1);
           name=itemView.findViewById(R.id.d_text1);
           description=itemView.findViewById(R.id.d_text2);
           discount=itemView.findViewById(R.id.d_text3);

       }
   }

}
