package com.example.task3;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface  GetDataService {
    @GET("/photos")
    abstract Call<List<RetroPhoto>> getAllPhotos();
}
