package hu.bme.aut.cykkop.moblab.areachat.interactor;

import android.app.Notification;
import android.os.AsyncTask;
import android.util.JsonReader;
import android.util.Log;
import android.widget.Toast;

import com.google.gson.Gson;

import java.io.IOException;

import javax.inject.Inject;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import hu.bme.aut.cykkop.moblab.areachat.presenter.AuthPresenter;
import hu.bme.aut.cykkop.moblab.areachat.presenter.RegisterPresenter;
import io.swagger.client.api.UserApi;
import io.swagger.client.model.MyString;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.GsonConverterFactory;
import retrofit2.ScalarsConverterFactory;

/**
 * Created by mobsoft on 2016. 04. 08..
 */
@Module
public class AuthInteractor {

    private Retrofit retrofit;
    private UserApi userApi;

    @Inject
    public AuthInteractor() {
        retrofit = new Retrofit.Builder()
                .baseUrl("http://192.168.1.106:5000/v1/")
                .addConverterFactory(ScalarsConverterFactory.create())
                .addConverterFactory(GsonConverterFactory.create(new Gson()))
                .build();
        userApi = retrofit.create(UserApi.class);
    }

    public void authenticate(final AuthPresenter presenter, String username, String password){
        Call<MyString> loginRequest = userApi.loginUserPost(username, password);
        loginRequest.enqueue(new Callback<MyString>() {
            @Override
            public void onResponse(Response<MyString> response) {
                Log.i("Cica", new Integer(response.code()).toString());
                if (response.code() == 200) {
                    presenter.showMap();
                }
            }

            @Override
            public void onFailure(Throwable t) {
                Log.e("Error", t.getMessage());
            }
        });
    }

    public void logout(final AuthPresenter presenter, String username){
        Call<MyString> logoutRequest = userApi.logoutUserPost(username);
        logoutRequest.enqueue(new Callback<MyString>() {
            @Override
            public void onResponse(Response<MyString> response) {
                presenter.showLogin();
            }

            @Override
            public void onFailure(Throwable t) {

            }
        });
    }

    public void register(final RegisterPresenter presenter, String username, String password, String email, String gender){
        Call<MyString> registerRequest = userApi.registerUserPost(username, password, email, gender);
        registerRequest.enqueue(new Callback<MyString>() {
            @Override
            public void onResponse(Response<MyString> response) {
                presenter.showLogin();
            }

            @Override
            public void onFailure(Throwable t) {

            }
        });
    }

}
