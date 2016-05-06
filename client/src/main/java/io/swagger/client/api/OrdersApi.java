package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import io.swagger.client.model.Order;
import io.swagger.client.model.Error;
import io.swagger.client.model.OrderHeader;
import java.math.BigDecimal;
import io.swagger.client.model.OrderBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface OrdersApi {
  
  /**
   * Create a new order
   * The orders endpoint with PUT operation creates a new Order instance
   * @param userId Unique identifier representing a specific user.
   * @param order The order body.
   * @return Call<String>
   */
  
  @PUT("orders")
  Call<String> ordersPut(
    @Query("userId") String userId, @Body Order order
  );

  
  /**
   * Update an existing order
   * The orders endpoint with POST operation updates an existing Order instance
   * @param userId Unique identifier representing a specific user.
   * @param order The order body.
   * @return Call<Order>
   */
  
  @POST("orders")
  Call<Order> ordersPost(
    @Query("userId") String userId, @Body Order order
  );

  
  /**
   * Delete an existing order
   * The orders endpoint with DELETE operation deletes an existing Order instance
   * @param userId Unique identifier representing a specific user.
   * @param orderId Unique identifier representing a specific user.
   * @return Call<Order>
   */
  
  @DELETE("orders")
  Call<Order> ordersDelete(
    @Query("userId") String userId, @Query("orderId") String orderId
  );

  
  /**
   * List of current orders, that are still modifiable.
   * The orders/current endpoint returns the list of modifiable orders belonging to a user
   * @param userId Unique identifier representing a specific user.
   * @param start Starting index of products, default 0.
   * @param limit Number of products to return default 25.
   * @return Call<List<OrderHeader>>
   */
  
  @GET("orders/current")
  Call<List<OrderHeader>> ordersCurrentGet(
    @Query("userId") String userId, @Query("start") BigDecimal start, @Query("limit") BigDecimal limit
  );

  
  /**
   * List of previous orders.
   * The orders/previous endpoint returns the list of previous orders belonging to a user
   * @param userId Unique identifier representing a specific user.
   * @param start Starting index of products, default 0.
   * @param limit Number of products to return default 25.
   * @return Call<List<OrderHeader>>
   */
  
  @GET("orders/previous")
  Call<List<OrderHeader>> ordersPreviousGet(
    @Query("userId") String userId, @Query("start") BigDecimal start, @Query("limit") BigDecimal limit
  );

  
  /**
   * A single order
   * The orders/{id} endpoint returns a single order&#39;s body
   * @param userId Unique identifier representing a specific user.
   * @param id Unique identifier representing a specific order.
   * @return Call<OrderBody>
   */
  
  @GET("orders/{id}")
  Call<OrderBody> ordersIdGet(
    @Query("userId") String userId, @Path("id") String id
  );

  
}
