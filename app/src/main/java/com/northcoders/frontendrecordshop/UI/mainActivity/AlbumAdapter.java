package com.northcoders.frontendrecordshop.UI.mainActivity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.northcoders.frontendrecordshop.R;
import com.northcoders.frontendrecordshop.databinding.AlbumLayoutBinding;
import com.northcoders.frontendrecordshop.model.AlbumData;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class AlbumAdapter extends RecyclerView.Adapter<AlbumAdapter.AlbumViewHolder> {

    private List<AlbumData> albumList;
    private Context context;

    public AlbumAdapter(Context context, List<AlbumData> albumList) {
        this.context = context;
        this.albumList = albumList;
    }

    @NonNull
    @NotNull
    @Override
    public AlbumViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup viewGroup, int position) {
        AlbumLayoutBinding binding = DataBindingUtil.inflate(
                LayoutInflater.from(viewGroup.getContext()),
                R.layout.album_layout,
                viewGroup,
                false
        );
        return new AlbumViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull AlbumViewHolder albumViewHolder, int position) {
        AlbumData albumData = albumList.get(position);
        albumViewHolder.albumLayoutBinding.setAlbumData(albumData);

    }

    @Override
    public int getItemCount() {
        return albumList.size();
    }

    public static class AlbumViewHolder extends RecyclerView.ViewHolder{

        private AlbumLayoutBinding albumLayoutBinding;
        
        public AlbumViewHolder(AlbumLayoutBinding albumLayoutBinding) {
            super(albumLayoutBinding.getRoot());
            this.albumLayoutBinding = albumLayoutBinding;
        }


    }

}
