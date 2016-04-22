package hu.bme.aut.cykkop.moblab.areachat.presenter;

import javax.inject.Inject;
import javax.inject.Singleton;

import hu.bme.aut.cykkop.moblab.areachat.interactor.AuthInteractor;
import hu.bme.aut.cykkop.moblab.areachat.interactor.MessageInteractor;
import hu.bme.aut.cykkop.moblab.areachat.interactor.PersonInteractor;
import hu.bme.aut.cykkop.moblab.areachat.interactor.PositionInteractor;

/**
 * Created by mobsoft on 2016. 04. 08..
 */
@Singleton
public class PersonPresenter {

    @Inject
    protected AuthInteractor authInteractor;
    @Inject
    protected MessageInteractor messageInteractor;
    @Inject
    protected PositionInteractor positionInteractor;
    @Inject
    protected PersonInteractor personInteractor;
}
