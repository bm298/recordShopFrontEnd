package com.northcoders.frontendrecordshop.UI.mainActivity;

import android.app.Application;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;
import com.northcoders.frontendrecordshop.model.AlbumData;
import com.northcoders.frontendrecordshop.model.AlbumRepository;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class MainActivityViewModel extends AndroidViewModel {

    private final AlbumRepository albumRepository;

    public MainActivityViewModel(@NotNull Application application) {
        super(application);
        this.albumRepository = new AlbumRepository(application);

    }

    public MutableLiveData<List<AlbumData>> getAllAlbums() {
        return albumRepository.getMutableLiveData();
    }
}
