package com.jibran.asyntaskkoneksisharepreff.service;

import android.telecom.Call;

import com.jibran.asyntaskkoneksisharepreff.model.UserResponseItem;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Service {

    @GET("/users")
    Call<List<UserResponseItem>> getDataUser();

}
