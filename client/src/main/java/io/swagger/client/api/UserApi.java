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

public interface UserApi {
  
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
