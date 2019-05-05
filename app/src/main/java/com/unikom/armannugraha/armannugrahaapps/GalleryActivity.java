package com.unikom.armannugraha.armannugrahaapps;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.GridView;
import android.widget.Toast;

/**
 * Nama: Arman Nugraha
 * Nim: 10116916
 * Kelas: AKB 14K
 * Created_at: 20-04-2019
 */

public class GalleryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_gallery);

//        GridView gridView = (GridView)findViewById(R.id.grid_view);
//        // Instance of ImageAdapter Class
//        gridView.setAdapter(new GridGalleryAdapter(this));
    }

//    public void showMe(View view) {
//        Intent userPage = new Intent(this, MoveActivity.class);
//        startActivity(userPage);
//    }
}
