package com.unikom.armannugraha.armannugrahaapps;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Nama: Arman Nugraha
 * Nim: 10116916
 * Kelas: AKB 14K
 * Created_at: 20-04-2019
 */

public class ProfileFragment extends Fragment{

    private RecyclerView rvCategory;
    private ArrayList<Gallery> list = new ArrayList<>();

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);

//        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
////        setSupportActionBar(toolbar);
//        toolbar.setTitle("Profile");
//        ((AppCompatActivity)view).setSupportActionBar(toolbar);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_profile, container, false);

//        Toolbar mToolbar = (Toolbar) view.findViewById(R.id.toolbar);
//        if (mToolbar != null) {
//            ((AppCompatActivity)getActivity()).setSupportActionBar(mToolbar);
//        }
//        mToolbar.setTitle(null);

//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);

        return view;

    }

//    @Override
//    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
//        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
//        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
//    }


//    private void showRecyclerGrid(){
//        rvCategory.setLayoutManager(new GridLayoutManager(this, 2));
//        GridGalleryAdapter gridGalleryAdapter = new GridGalleryAdapter(this);
//        gridGalleryAdapter.setListPresident(list);
//        rvCategory.setAdapter(gridGalleryAdapter);
//    }
}