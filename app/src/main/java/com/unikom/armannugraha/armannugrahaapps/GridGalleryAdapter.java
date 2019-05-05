package com.unikom.armannugraha.armannugrahaapps;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

/**
 * Nama: Arman Nugraha
 * Nim: 10116916
 * Kelas: AKB 14K
 * Created_at: 20-04-2019
 */

public class GridGalleryAdapter extends BaseAdapter {

//    private Context context;
//    private ArrayList<Gallery> listGallery;
//
//    private ArrayList<Gallery> getListGallery() {
//        return listGallery;
//    }
//    public void setListGallery(ArrayList<Gallery> listGallery) {
//        this.listGallery = listGallery;
//    }
//    public GridGalleryAdapter(Context context) {
//        this.context = context;
//    }
//
//    @NonNull
//    @Override
//    public GridViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_gallery, parent, false);
//        return new GridViewHolder(view);
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull GridViewHolder holder, int position) {
//        Glide.with(context)
//                .load(getListGallery().get(position).getPhoto())
//                .apply(new RequestOptions().override(350, 550))
//                .into(holder.imgPhoto);
//    }
//
//    @Override
//    public int getItemCount() {
//        return getListGallery().size();
//    }
//
//    class GridViewHolder extends RecyclerView.ViewHolder {
//        ImageView imgPhoto;
//        GridViewHolder(View itemView) {
//            super(itemView);
//            imgPhoto = itemView.findViewById(R.id.img_item_photo);
//        }
//    }

    private Context mContext;

    // Keep all Images in array
    public Integer[] mThumbIds = {
            R.drawable.cuankie, R.drawable.nasgor,
            R.drawable.cuankie, R.drawable.nasgor,
            R.drawable.nasgor, R.drawable.cuankie,
            R.drawable.cuankie, R.drawable.nasgor,
            R.drawable.cuankie, R.drawable.cuankie,
            R.drawable.nasgor, R.drawable.cuankie,
            R.drawable.nasgor, R.drawable.cuankie,
            R.drawable.nasgor
    };

    // Constructor
    public GridGalleryAdapter(Context c){
        mContext = c;
    }

    @Override
    public int getCount() {
        return mThumbIds.length;
    }

    @Override
    public Object getItem(int position) {
        return mThumbIds[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView = new ImageView(mContext);
        imageView.setImageResource(mThumbIds[position]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(new GridView.LayoutParams(70, 70));
        return imageView;
    }
}