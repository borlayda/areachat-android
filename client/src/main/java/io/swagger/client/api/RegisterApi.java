package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import io.swagger.client.model.Error;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface RegisterApi {
  
  /**
   * New user
   * Registers a new user to the system with the data has been given\nto the application from the Graphical user interface.
   * @param username Name of the user
   * @param password Password of the user which could be used for authentication
   * @param email E-mail address of the user
   * @param gender Gender of the user
   * @return Call<String>
   */
  
  @POST("register/user")
  Call<String> registerUserPost(
    @Query("username") String username, @Query("password") String password, @Query("email") String email, @Query("Gender") String gender
  );

  
}
