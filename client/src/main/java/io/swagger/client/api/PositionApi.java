package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import io.swagger.client.model.Error;
import io.swagger.client.model.Person;
import java.math.BigDecimal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface PositionApi {
  
  /**
   * Get users in area
   * Gives back the users in an area of your position
   * @param longitude Longitude of current position
   * @param latitude Latitude of current position
   * @return Call<List<Person>>
   */
  
  @GET("position")
  Call<List<Person>> positionGet(
    @Query("longitude") BigDecimal longitude, @Query("latitude") BigDecimal latitude
  );

  
  /**
   * Send user position to the server
   * Updates the user position in the backend&#39;s database
   * @param username The name of the user, who updates position
   * @param longitude Longitude of current position
   * @param latitude Latitude of current position
   * @return Call<String>
   */
  
  @POST("position")
  Call<String> positionPost(
    @Query("username") String username, @Query("longitude") BigDecimal longitude, @Query("latitude") BigDecimal latitude
  );

  
}
