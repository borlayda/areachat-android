package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import io.swagger.client.model.UserProfile;
import io.swagger.client.model.Error;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface UsersApi {
  
  /**
   * Check the user&#39;s login data
   * The users/login endpoint checks the login data entered by the user
   * @param userProfile The login data.
   * @return Call<UserProfile>
   */
  
  @POST("users/login")
  Call<UserProfile> usersLoginPost(
          @Body UserProfile userProfile
  );

  
  /**
   * Creates a new user
   * The users/register endpoint creates a new User instance
   * @param userProfile The user data.
   * @return Call<UserProfile>
   */
  
  @PUT("users/register")
  Call<UserProfile> usersRegisterPut(
          @Body UserProfile userProfile
  );

  
}
