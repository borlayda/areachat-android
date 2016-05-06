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

public interface LoginApi {
  
  /**
   * User login
   * User can log in to the application to use the functions and\ncommunicate with other users.
   * @param username Name of the user
   * @param password Authentication password
   * @return Call<String>
   */
  
  @POST("login/user")
  Call<String> loginUserPost(
    @Query("username") String username, @Query("password") String password
  );

  
}
