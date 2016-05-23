package hu.bme.aut.cykkop.moblab.areachat.interactor;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import io.swagger.client.api.LoginApi;
import io.swagger.client.api.PositionApi;
import io.swagger.client.api.UsersApi;
import io.swagger.client.model.Person;
import retrofit2.Call;
import retrofit2.GsonConverterFactory;
import retrofit2.Retrofit;

/**
 * Created by mobsoft on 2016. 04. 08..
 */
@Module
public class PersonInteractor {

    private Retrofit retrofit;
    private PositionApi positionApi;

    @Inject
    public PersonInteractor() {

        retrofit = new Retrofit.Builder()
                .baseUrl("http://192.168.1.106:5000/v1/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        positionApi = retrofit.create(PositionApi.class);
    }

    public List<Person> getPersons(BigDecimal longitude, BigDecimal latitude) {
        Call<List<Person>> positionsRequest = positionApi.positionGet(longitude, latitude);
        try {
            return positionsRequest.execute().body();
        } catch (IOException e) {
            e.printStackTrace();
            return new ArrayList<Person>();
        }
    }
}
