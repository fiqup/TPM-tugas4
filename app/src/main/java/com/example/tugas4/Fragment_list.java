package com.example.tugas4;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tugas4.adapter.HomeAdapter;
import com.example.tugas4.model.AplikasiModel;
import com.example.tugas4.utils.DataDummy;

import java.util.ArrayList;

public class Fragment_list extends Fragment {
    private RecyclerView rv;
    private ArrayList<AplikasiModel> listAplikasi = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_list, container, false);
        rv = view.findViewById(R.id.rv_list);
        rv.setHasFixedSize(true);
        listAplikasi.addAll(DataDummy.getListData());
        showListAplikasi();
        return view;
    }

    private void showListAplikasi(){
        rv.setLayoutManager(new LinearLayoutManager(getContext()));
        HomeAdapter menuAdapter = new HomeAdapter(getContext());
        menuAdapter.setMenuModels(listAplikasi);
        rv.setAdapter(menuAdapter);
    }
}