package hu.bme.aut.cykkop.moblab.areachat.interactor;

import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by badmin on 2016.05.16..
 */
public interface BackendApi {
    @GET("/login/user")
    public String authPerson(@Query("username")String username,
                             @Query("password")String password);
}
