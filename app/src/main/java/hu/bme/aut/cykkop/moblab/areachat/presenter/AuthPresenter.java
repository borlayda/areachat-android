package hu.bme.aut.cykkop.moblab.areachat.presenter;

import javax.inject.Inject;
import javax.inject.Singleton;

import dagger.Module;
import hu.bme.aut.cykkop.moblab.areachat.interactor.AuthInteractor;
import hu.bme.aut.cykkop.moblab.areachat.interactor.MessageInteractor;
import hu.bme.aut.cykkop.moblab.areachat.interactor.PersonInteractor;
import hu.bme.aut.cykkop.moblab.areachat.interactor.PositionInteractor;

/**
 * Created by mobsoft on 2016. 04. 08..
 */
@Module
public class AuthPresenter {

    @Inject
    protected AuthInteractor authInteractor;

}
