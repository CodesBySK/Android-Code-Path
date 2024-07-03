package com.example.coffee_application.adapters;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.example.coffee_application.R;

import com.example.coffee_application.models.HomeHorModel;
import com.example.coffee_application.models.HomeVerModel;

import java.util.ArrayList;
import java.util.List;

public class HomeHorAdapter extends RecyclerView.Adapter<HomeHorAdapter.ViewHolder> {

    UpdateVerticalRec updateVerticalRec;
    Activity activity;
    ArrayList<HomeHorModel> list;

    boolean check = true;
    boolean select = true;
    int row_index = -1;


    public HomeHorAdapter(UpdateVerticalRec updateVerticalRec, Activity activity, ArrayList<HomeHorModel> list) {
        this.updateVerticalRec = updateVerticalRec;
        this.activity = activity;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.home_horizontal_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.imageView.setImageResource(list.get(position).getImage());
        holder.name.setText(list.get(position).getName());

        if (check) {
            ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
            homeVerModels.add(new HomeVerModel(R.drawable.ver_img1, "Coffee 1", "10 - 15", "4.9", "Min - Rs 100"));
            homeVerModels.add(new HomeVerModel(R.drawable.ver_img2, "Coffee 2", "10 - 15", "4.9", "Min - Rs 100"));
            homeVerModels.add(new HomeVerModel(R.drawable.ver_img3, "Coffee 3", "10 - 15", "4.9", "Min - Rs 100"));
            homeVerModels.add(new HomeVerModel(R.drawable.ver_img4, "Coffee 4", "10 - 15", "4.9", "Min - Rs 100"));
            homeVerModels.add(new HomeVerModel(R.drawable.ver_img5, "Coffee 5", "10 - 15", "4.9", "Min - Rs 100"));
            homeVerModels.add(new HomeVerModel(R.drawable.ver_img6, "Coffee 6", "10 - 15", "4.9", "Min - Rs 100"));

            updateVerticalRec.callBack(position, homeVerModels);
            check = false;
        }
            holder.cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    row_index = position;
                    notifyDataSetChanged();

                    if (position == 0) {
                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();

                        homeVerModels.add(new HomeVerModel(R.drawable.ver_img1, "Coffee 1", "10 - 15", "4.9", "Min - Rs 100"));
                        homeVerModels.add(new HomeVerModel(R.drawable.ver_img2, "Coffee 2", "10 - 15", "4.9", "Min - Rs 100"));
                        homeVerModels.add(new HomeVerModel(R.drawable.ver_img3, "Coffee 3", "10 - 15", "4.9", "Min - Rs 100"));
                        homeVerModels.add(new HomeVerModel(R.drawable.ver_img4, "Coffee 4", "10 - 15", "4.9", "Min - Rs 100"));
                        homeVerModels.add(new HomeVerModel(R.drawable.ver_img5, "Coffee 5", "10 - 15", "4.9", "Min - Rs 100"));
                        homeVerModels.add(new HomeVerModel(R.drawable.ver_img6, "Coffee 6", "10 - 15", "4.9", "Min - Rs 100"));

                        updateVerticalRec.callBack(position, homeVerModels);
                    } else if (position == 1) {
                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();

                        homeVerModels.add(new HomeVerModel(R.drawable.coldcoffee1, "Cold_Coffee", "10 - 15", "4.9", "Min - Rs 150"));
                        homeVerModels.add(new HomeVerModel(R.drawable.coldcoffe2, "Cold_Coffee", "10 - 15", "4.9", "Min - Rs 150"));
                        homeVerModels.add(new HomeVerModel(R.drawable.coldcoffee3, "Cold_Coffee", "10 - 15", "4.9", "Min - Rs 150"));
                        homeVerModels.add(new HomeVerModel(R.drawable.coldcoffee4, "Cold_Coffee", "10 - 15", "4.9", "Min - Rs 150"));

                        updateVerticalRec.callBack(position, homeVerModels);

                    } else if (position == 2) {
                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();

                        homeVerModels.add(new HomeVerModel(R.drawable.milk1, "Chocolate Shake", "10 - 15", "4.9", "Min - Rs 100"));
                        homeVerModels.add(new HomeVerModel(R.drawable.milk2, "Chocolate Shake", "10 - 15", "4.9", "Min - Rs 100"));
                        homeVerModels.add(new HomeVerModel(R.drawable.milk3, "Special Milk", "10 - 15", "4.9", "Min - Rs 100"));
                        homeVerModels.add(new HomeVerModel(R.drawable.milk4, "Special Milk", "10 - 15", "4.9", "Min - Rs 100"));

                        updateVerticalRec.callBack(position, homeVerModels);

                    } else if (position == 3) {
                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();

                        homeVerModels.add(new HomeVerModel(R.drawable.pastery, "Pastry ", "10 - 15", "4.9", "Min - Rs 90"));
                        homeVerModels.add(new HomeVerModel(R.drawable.pastery1, "Pastry 1", "10 - 15", "4.9", "Min - Rs 90"));
                        homeVerModels.add(new HomeVerModel(R.drawable.pastery2, "Pastry 2", "10 - 15", "4.9", "Min - Rs 90"));



                        updateVerticalRec.callBack(position, homeVerModels);

                    } else if (position == 4) {
                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();

                        homeVerModels.add(new HomeVerModel(R.drawable.cakes, "Cake", "10 - 15", "4.9", "Min - Rs 100"));
                        homeVerModels.add(new HomeVerModel(R.drawable.cake1, "Cake", "10 - 15", "4.9", "Min - Rs 100"));
                        homeVerModels.add(new HomeVerModel(R.drawable.cake2, "Cake", "10 - 15", "4.9", "Min - Rs 100"));

                        updateVerticalRec.callBack(position, homeVerModels);

                    } else if (position == 5) {
                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();

                        homeVerModels.add(new HomeVerModel(R.drawable.donates, "Donate", "10 - 15", "4.9", "Min - Rs 100"));
                        homeVerModels.add(new HomeVerModel(R.drawable.donate1, "Donate", "10 - 15", "4.9", "Min - Rs 100"));
                        homeVerModels.add(new HomeVerModel(R.drawable.donate2, "Donate", "10 - 15", "4.9", "Min - Rs 100"));


                        updateVerticalRec.callBack(position, homeVerModels);

                    }

                }
            });

            if (select) {
                if (position == 0) {
                    holder.cardView.setBackgroundResource(R.drawable.change_bg);
                    select = false;
                }
            } else {
                if (row_index == position) {
                    holder.cardView.setBackgroundResource(R.drawable.change_bg);
                } else {
                    holder.cardView.setBackgroundResource(R.drawable.default_bg);
                }
            }
    }

        @Override
        public int getItemCount () {
            return list.size();
        }

        public class ViewHolder extends RecyclerView.ViewHolder {
            ImageView imageView;
            TextView name;
            CardView cardView;

            public ViewHolder(@NonNull View itemView) {
                super(itemView);

                imageView = itemView.findViewById(R.id.hor_img1);
                name = itemView.findViewById(R.id.hor_text1);
                cardView = itemView.findViewById(R.id.cardView);
            }
        }
    }
