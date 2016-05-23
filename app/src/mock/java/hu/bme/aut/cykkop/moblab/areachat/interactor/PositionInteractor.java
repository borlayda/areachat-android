package hu.bme.aut.cykkop.moblab.areachat.interactor;

import android.support.design.widget.TabLayout;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import io.swagger.client.api.LoginApi;
import io.swagger.client.api.PositionApi;
import io.swagger.client.model.MyString;
import io.swagger.client.model.Person;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.GsonConverterFactory;
import retrofit2.Response;
import retrofit2.Retrofit;

/**
 * Created by mobsoft on 2016. 04. 08..
 */
@Module
public class PositionInteractor {

    private Retrofit retrofit;
    private PositionApi positionApi;

    @Inject
    public PositionInteractor() {
    }

    public void updatePosition(String username, BigDecimal longitude, BigDecimal latitude){

    }

    public void getPersons(BigDecimal longitude, BigDecimal latitude) {

    }
}
