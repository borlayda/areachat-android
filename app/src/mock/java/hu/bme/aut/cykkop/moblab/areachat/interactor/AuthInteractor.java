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

    @Inject
    public AuthInteractor() {
    }

    public void authenticate(final AuthPresenter presenter, String username, String password){
        presenter.showMap();
    }

    public void logout(final AuthPresenter presenter, String username){
        presenter.showLogin();
    }

    public void register(final RegisterPresenter presenter, String username, String password, String email, String gender){
        presenter.showLogin();
    }

}
