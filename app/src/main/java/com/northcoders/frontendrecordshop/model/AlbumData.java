package com.northcoders.frontendrecordshop.model;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import com.google.gson.annotations.SerializedName;
import com.northcoders.frontendrecordshop.BR;

public class AlbumData extends BaseObservable {

    @SerializedName("id")
    private Long id;

    @SerializedName("albumName")
    private String albumName;

    @SerializedName("artist")
    private String artist;

    @SerializedName("releaseYear")
    private String releaseYear;

    @SerializedName("stock")
    private String stock;

    @SerializedName("genre")
    private String genre;

    public AlbumData(String albumName, String artist, String releaseYear, String stock,String genre) {
        this.albumName = albumName;
        this.artist = artist;
        this.releaseYear = releaseYear;
        this.stock = stock;
        this.genre = genre;
    }

    public AlbumData() {}

    @Bindable
    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
        notifyPropertyChanged(BR.albumName);
    }

    @Bindable
    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
        notifyPropertyChanged(BR.artist);
    }

    @Bindable
    public String getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(String releaseYear) {
        this.releaseYear = releaseYear;
        notifyPropertyChanged(BR.releaseYear);
    }

    @Bindable
    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
        notifyPropertyChanged(BR.stock);
    }

    @Bindable
    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
        notifyPropertyChanged(BR.genre);
    }
}
