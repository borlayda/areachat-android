package hu.bme.aut.cykkop.moblab.areachat.interactor;

import android.support.design.widget.TabLayout;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by mobsoft on 2016. 04. 08..
 */
@Module
public class PositionInteractor {

    @Provides
    PositionInteractor providesPositionInteractor(){
        return new PositionInteractor();
    }
}
