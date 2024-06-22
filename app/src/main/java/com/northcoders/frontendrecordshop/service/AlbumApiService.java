package com.northcoders.frontendrecordshop.service;

import com.northcoders.frontendrecordshop.model.AlbumData;
import retrofit2.Call;
import retrofit2.http.GET;

import java.util.List;

public interface AlbumApiService {

    @GET("recordShop")
    Call<List<AlbumData>> getAllAlbums();


}
