package com.example.kinopoiskapp.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.kinopoiskapp.ImageAdapter;
import com.example.kinopoiskapp.MainActivity;
import com.example.kinopoiskapp.R;


public class HomeFragment extends Fragment {
    GridView gridView;


    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
//        view.setBackgroundResource(R.drawable.tile);


        gridView = (GridView) view.findViewById(R.id.gridView1);
        gridView.setAdapter(new ImageAdapter(getContext()));
        gridView.setOnItemClickListener(gridViewOnclickListener);

        return view;
    }
    GridView.OnItemClickListener gridViewOnclickListener = new GridView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            //Переход на страницу фильма
        }
    };
}