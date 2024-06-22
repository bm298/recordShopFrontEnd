package com.northcoders.frontendrecordshop.UI.mainActivity;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.northcoders.frontendrecordshop.R;
import com.northcoders.frontendrecordshop.databinding.ActivityMainBinding;
import com.northcoders.frontendrecordshop.model.AlbumData;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<AlbumData> albumList;
    private AlbumAdapter albumAdapter;
    private MainActivityViewModel mainActivityViewModel;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding= DataBindingUtil.setContentView(this, R.layout.activity_main);

        // initiliase viewmodel
        mainActivityViewModel = new ViewModelProvider(this).get(MainActivityViewModel.class);

        //call method Get all albums
        getAllAlbums();
    }

    private void getAllAlbums() {
        mainActivityViewModel.getAllAlbums().observe(this, new Observer<List<AlbumData>>() {

            @Override
            public void onChanged(List<AlbumData> albumData) {
                albumList = (ArrayList<AlbumData>) albumData;
                displayInRecyclerView();
            }
        });
    }

    private void displayInRecyclerView() {

        albumAdapter = new AlbumAdapter(this,albumList);

        binding.recyclerView.setAdapter(albumAdapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        binding.recyclerView.setLayoutManager(layoutManager);

        binding.recyclerView.setHasFixedSize(true);

        albumAdapter.notifyDataSetChanged();
    }

}