package hu.bme.aut.cykkop.moblab.areachat.interactor;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by mobsoft on 2016. 04. 08..
 */
@Module
public class MessageInteractor {

    @Provides
    MessageInteractor providesMessageInteractor() {
        return new MessageInteractor();
    }
}
