package com.example.covid_19;

import com.example.covid_19.Modell.Headlines;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;



public interface ApiInterface {


    @GET("top-headlines")
    Call<Headlines> getHeadlines(
            @Query("q") String query,
            @Query("country") String country,
            @Query("apiKey") String apiKey
    );

    @GET("everything")
    Call<Headlines> getSpecificData(
            @Query("q") String query,
            @Query("apiKey") String apiKey
    );



}
