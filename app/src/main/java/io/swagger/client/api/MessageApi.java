package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;


import io.swagger.client.model.MyString;
import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import io.swagger.client.model.Error;
import io.swagger.client.model.MessageList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface MessageApi {
  
  /**
   * Get user messages
   * Gives back all the messages, which has the user as its\ndestination.
   * @param username Name of the user, who has related messages
   * @return Call<MessageList>
   */
  
  @GET("message")
  Call<MessageList> messageGet(
          @Query("username") String username
  );

  
  /**
   * Send message
   * The user can log out from the application
   * @param from Name of the user who sent the message
   * @param to Name of the user who got this message
   * @param message New message sent to someone
   * @return Call<String>
   */
  
  @POST("message")
  Call<MyString> messagePost(
          @Query("from") String from, @Query("to") String to, @Query("message") String message
  );

  
}
