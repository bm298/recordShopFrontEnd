package com.northcoders.frontendrecordshop.model;

import android.app.Application;
import androidx.lifecycle.MutableLiveData;
import com.northcoders.frontendrecordshop.service.AlbumApiService;
import com.northcoders.frontendrecordshop.service.RetrofitInstance;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.util.List;

import static com.northcoders.frontendrecordshop.service.RetrofitInstance.getService;

public class AlbumRepository {

    private MutableLiveData <List<AlbumData>> mutableLiveData;
    private Application application;

    public AlbumRepository(Application application) {
        mutableLiveData = new MutableLiveData<>();
        this.application = application;
    }

    public MutableLiveData <List<AlbumData>> getMutableLiveData(){
        AlbumApiService albumApiService = getService();

// Bilals        Call<List<AlbumData>> call=albumApiService.getAllAlbums();
    Call call=albumApiService.getAllAlbums();

        call.enqueue(new Callback<List<AlbumData>>() {
            @Override
            public void onResponse(Call<List<AlbumData>> call, Response<List<AlbumData>> response) {
                List<AlbumData> albums= response.body();
                mutableLiveData.setValue(albums);
            }

            @Override
            public void onFailure(Call<List<AlbumData>> call, Throwable throwable) {

            }
        });
        return mutableLiveData;
    }

}
