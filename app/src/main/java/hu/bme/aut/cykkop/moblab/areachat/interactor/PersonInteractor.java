package hu.bme.aut.cykkop.moblab.areachat.interactor;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by mobsoft on 2016. 04. 08..
 */
@Module
public class PersonInteractor {

    @Provides
    PersonInteractor providesPersonInteractor() {
        return new PersonInteractor();
    }
}
