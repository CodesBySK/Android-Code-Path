package com.example.coffee_application.ui.dailyMenu;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.coffee_application.R;
import com.example.coffee_application.adapters.DailyMenuAdapter;
import com.example.coffee_application.models.DailyMenuModel;

import java.util.ArrayList;


public class DailyMenuFragment extends Fragment {

   RecyclerView recyclerView;
   ArrayList<DailyMenuModel> dailyMenuModelList;
   DailyMenuAdapter dailyMenuAdapter;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        View root  =  inflater.inflate(R.layout.fragment_daily_menu, container, false);

        recyclerView=root.findViewById(R.id.daily_menu_rec);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        dailyMenuModelList = new ArrayList<>();

        dailyMenuModelList.add(new DailyMenuModel(R.drawable.dt1,"Donates","30% OFF","Description Description","donates"));
        dailyMenuModelList.add(new DailyMenuModel(R.drawable.dt2,"Coffee","15% OFF","Description ","coffee"));
        dailyMenuModelList.add(new DailyMenuModel(R.drawable.dt3,"Cake","10% OFF","Description Description","cake"));
        dailyMenuModelList.add(new DailyMenuModel(R.drawable.dt4,"Donate Deal","30% OFF","Description","donate Deal"));
        dailyMenuModelList.add(new DailyMenuModel(R.drawable.dt5,"Special Coffee","10% OFF","Description Description","offers"));

        dailyMenuAdapter = new DailyMenuAdapter(getContext(), dailyMenuModelList);
        recyclerView.setAdapter(dailyMenuAdapter);
        dailyMenuAdapter.notifyDataSetChanged();

        return root;
    }
}
