package hu.bme.aut.cykkop.moblab.areachat.interactor;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by mobsoft on 2016. 04. 08..
 */
@Module
public class AuthInteractor {

    @Provides
    AuthInteractor providesAuthInteractor(){
        return new AuthInteractor();
    }
}
