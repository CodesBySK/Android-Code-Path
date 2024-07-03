package com.example.coffee_application.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.coffee_application.R;
import com.example.coffee_application.adapters.HomeHorAdapter;
import com.example.coffee_application.adapters.HomeVerAdapter;
import com.example.coffee_application.adapters.UpdateVerticalRec;
import com.example.coffee_application.models.HomeHorModel;
import com.example.coffee_application.models.HomeVerModel;

import java.util.ArrayList;
import java.util.List;
//import androidx.lifecycle.ViewModelProvider;

//import com.example.coffee_application.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment implements UpdateVerticalRec {

    /////////////////////////Horizontal view content//////////////////
   RecyclerView homeHorizontalRec,homeVerticalRec;
   ArrayList<HomeHorModel> homeHorModelList;
   HomeHorAdapter homeHorAdapter;

   //////////////////////Vertical view content//////////////////////
   ArrayList<HomeVerModel> homeVerModelList;
    HomeVerAdapter homeVerAdapter;

/////////////////////////Horizontal view content//////////////////
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        View root  =  inflater.inflate(R.layout.fragment_home, container, false);
        homeHorizontalRec= root.findViewById(R.id.home_hor_rec);
        homeVerticalRec = root.findViewById(R.id.home_ver_rec);

        homeHorModelList = new ArrayList<>();
        //homeHorModelList.add(new HomeHorModel(R.drawable.coffee1,"Coffee"));
        homeHorModelList.add(new HomeHorModel(R.drawable.hotcoffee,"Hot Coffee"));
        homeHorModelList.add(new HomeHorModel(R.drawable.cold_coffee,"Cold Coffee"));
        homeHorModelList.add(new HomeHorModel(R.drawable.milk,"Milk"));
        homeHorModelList.add(new HomeHorModel(R.drawable.pastery,"Pastry"));
        homeHorModelList.add(new HomeHorModel(R.drawable.cakes,"Cakes"));
        homeHorModelList.add(new HomeHorModel(R.drawable.donates,"Donates"));

        homeHorAdapter=new HomeHorAdapter(this,getActivity(),homeHorModelList);
        homeHorizontalRec.setAdapter(homeHorAdapter);
        homeHorizontalRec.setLayoutManager(new LinearLayoutManager(getActivity(),RecyclerView.HORIZONTAL,false));
        homeHorizontalRec.setHasFixedSize(true);
        homeHorizontalRec.setNestedScrollingEnabled(false);


        //////////////////////Vertical view content//////////////////////

        homeVerModelList = new ArrayList<HomeVerModel>();

        homeVerAdapter=new HomeVerAdapter(getActivity(),homeVerModelList);
        homeVerticalRec.setAdapter(homeVerAdapter);
        homeVerticalRec.setLayoutManager(new LinearLayoutManager(getActivity(),RecyclerView.VERTICAL,false));

        return root;
    }

    @Override
    public void callBack(int position, ArrayList<HomeVerModel> list) {

        homeVerAdapter = new HomeVerAdapter(getContext(),list);
        homeVerAdapter.notifyDataSetChanged();
        homeVerticalRec.setAdapter(homeVerAdapter);
    }
}