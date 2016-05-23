package hu.bme.aut.cykkop.moblab.areachat.interactor;

import java.math.BigDecimal;
import java.util.List;

import javax.inject.Inject;

import dagger.Module;
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
        retrofit = new Retrofit.Builder()
                .baseUrl("http://localhost:5000/v1/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        positionApi = retrofit.create(PositionApi.class);
    }

    public void updatePosition(String username, BigDecimal longitude, BigDecimal latitude){
        Call<MyString> updateRequest = positionApi.positionPost(username, longitude, latitude);
        updateRequest.enqueue(new Callback<MyString>() {
            @Override
            public void onResponse(Response<MyString> response) {

            }

            @Override
            public void onFailure(Throwable t) {

            }
        });
    }

    public void getPersons(BigDecimal longitude, BigDecimal latitude) {
        Call<List<Person>> positionsRequest = positionApi.positionGet(longitude, latitude);
        positionsRequest.enqueue(new Callback<List<Person>>() {
            @Override
            public void onResponse(Response<List<Person>> response) {

            }

            @Override
            public void onFailure(Throwable t) {

            }
        });
    }
}
