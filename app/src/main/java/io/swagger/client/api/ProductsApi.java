package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import io.swagger.client.model.ProductHeader;
import io.swagger.client.model.Error;
import java.math.BigDecimal;
import io.swagger.client.model.ProductBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ProductsApi {
  
  /**
   * List of products
   * The products endpoint returns our current product list, with product names and prices
   * @param userId Unique identifier representing a specific user.
   * @param start Starting index of products, default 0.
   * @param limit Number of products to return default 25.
   * @return Call<List<ProductHeader>>
   */
  
  @GET("products")
  Call<List<ProductHeader>> productsGet(
          @Query("userId") String userId, @Query("start") BigDecimal start, @Query("limit") BigDecimal limit
  );

  
  /**
   * A single product
   * The products/{id} endpoint returns a single product&#39;s body
   * @param userId Unique identifier representing a specific user.
   * @param id Unique identifier representing a specific product.
   * @return Call<ProductBody>
   */
  
  @GET("products/{id}")
  Call<ProductBody> productsIdGet(
          @Query("userId") String userId, @Path("id") String id
  );

  
}
