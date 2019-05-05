package com.unikom.armannugraha.armannugrahaapps;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Nama: Arman Nugraha
 * Nim: 10116916
 * Kelas: AKB 14K
 * Created_at: 20-04-2019
 */

public class GalleryFragment extends Fragment{

    private TextView mTextViewEmpty;
    private ProgressBar mProgressBarLoading;
    private ImageView mImageViewEmpty;
    private RecyclerView mRecyclerView;
    private ListAdapter mListadapter;

    private RecyclerView rvCategory;
    private ArrayList<Gallery> list = new ArrayList<>();

    public GalleryFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_gallery, container, false);
//        Button btnCategory = view.findViewById(R.id.btn_category);
//        btnCategory.setOnClickListener(this);

//        final Button make_move = (Button) view.findViewById(R.id.buttonToMove);

        //passing listener object to button

//        make_move.setOnClickListener(btnClick);
//        mRecyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);
//        mTextViewEmpty = (TextView)view.findViewById(R.id.textViewEmpty);
//        mImageViewEmpty = (ImageView)view.findViewById(R.id.imageViewEmpty);
//        mProgressBarLoading = (ProgressBar)view.findViewById(R.id.progressBarLoading);
//
//        final LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
//        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
//        mRecyclerView.setLayoutManager(layoutManager);
//
//        ArrayList data = new ArrayList<GalleryDataNote>();
//        for (int i = 0; i < GalleryData.id.length; i++)
//        {
//            data.add(
//                    new GalleryDataNote
//                            (
//                                    GalleryData.id[i],
//                                    GalleryData.textArray[i],
//                                    GalleryData.dateArray[i]
//                            ));
//        }
//
//        mListadapter = new ListAdapter(data);
//        mRecyclerView.setAdapter(mListadapter);

//        rvCategory = view.findViewById(R.id.rv_category);
//        rvCategory.setHasFixedSize(true);

//        rvCategory.setLayoutManager(new GridLayoutManager(this, 2));
//        GridGalleryAdapter gridGalleryAdapter = new GridGalleryAdapter(this);
//        gridGalleryAdapter.setListGallery(list);
//        rvCategory.setAdapter(gridGalleryAdapter);

        return view;
    }

//    @Override
//    public void onClick(View v) {
//        if (v.getId() == R.id.btn_category) {
//            CategoryFragment fragment = new CategoryFragment();
//
//            if (getActivity() instanceof MainActivity) {
//                MainActivity mainActivity = (MainActivity) getActivity();
//                mainActivity.replaceFragment(fragment, CategoryFragment.class.getSimpleName());
//            }
//        }
//    }

//    public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder>
//    {
//        private ArrayList<GalleryDataNote> dataList;
//
//        public ListAdapter(ArrayList<GalleryDataNote> data)
//        {
//            this.dataList = data;
//        }
//
//        public class ViewHolder extends RecyclerView.ViewHolder
//        {
//            TextView textViewText;
//            TextView textViewComment;
//            TextView textViewDate;
//
//            public ViewHolder(View itemView)
//            {
//                super(itemView);
//                this.textViewText = (TextView) itemView.findViewById(R.id.text);
//                this.textViewComment = (TextView) itemView.findViewById(R.id.comment);
//                this.textViewDate = (TextView) itemView.findViewById(R.id.date);
//            }
//        }
//
//        @Override
//        public ListAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
//        {
//            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_gallery, parent, false);
//
//            ViewHolder viewHolder = new ViewHolder(view);
//            return viewHolder;
//        }
//
//        @Override
//        public void onBindViewHolder(ListAdapter.ViewHolder holder, final int position)
//        {
//            holder.textViewText.setText(dataList.get(position).getText());
//            holder.textViewComment.setText(dataList.get(position).getComment());
//            holder.textViewDate.setText(dataList.get(position).getDate());
//
//            holder.itemView.setOnClickListener(new View.OnClickListener()
//            {
//                @Override
//                public void onClick(View v)
//                {
//                    Toast.makeText(getActivity(), "Item " + position + " is clicked.", Toast.LENGTH_SHORT).show();
//                }
//            });
//        }
//
//        @Override
//        public int getItemCount()
//        {
//            return dataList.size();
//        }
//    }
}