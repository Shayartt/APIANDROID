package com.example.usersapi;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiInterface {
    @GET("users/{id}") // get the user with id n
    public Call<JsonData> getUsers(@Path("id") int userId);
    @GET("users/")
    public Call<JsonDataAll> getAll();
}
