package com.example.android.javadevelopers.api;

import com.example.android.javadevelopers.model.itemResponse;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by ZAINAB on 9/14/2017.
 */

public interface Service {
    @GET("/search/users?q=language:java+location:lagos")
    Call<itemResponse> getItems();

}
