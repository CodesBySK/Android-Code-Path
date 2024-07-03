package com.example.coffee_application.ui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.coffee_application.R;
import com.example.coffee_application.adapters.CartAdapter;
import com.example.coffee_application.models.CartModel;

import java.util.ArrayList;
import java.util.List;

public class MyCartFragment extends Fragment {

    List<CartModel> list;
    CartAdapter cartAdapter;
    RecyclerView recyclerView;

     public MyCartFragment(){
         //Required empty public Constructor
     }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_my_cart, container, false);

        recyclerView = view.findViewById(R.id.cart_rec);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        list = new ArrayList<>();
        list.add(new CartModel(R.drawable.coldcoffee1,"Order 1","$50","4.3"));
        list.add(new CartModel(R.drawable.donates,"Order 1","$80","4.8"));
        list.add(new CartModel(R.drawable.coldcoffee4,"Order 1","$50","4.5"));

        cartAdapter = new CartAdapter(list);
        recyclerView.setAdapter(cartAdapter);
        return view;
     }
}