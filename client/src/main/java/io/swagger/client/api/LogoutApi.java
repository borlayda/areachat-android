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

public interface LogoutApi {
  
  /**
   * User logout
   * The user can log out from the application
   * @param username Name of the user, who logs out
   * @return Call<String>
   */
  
  @POST("logout/user")
  Call<String> logoutUserPost(
    @Query("username") String username
  );

  
}
