package hu.bme.aut.cykkop.moblab.areachat.interactor;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by mobsoft on 2016. 04. 08..
 */
@Singleton
public class Presenter {

    @Inject
    protected AuthInteractor authInteractor;
    @Inject
    protected MessageInteractor messageInteractor;
    @Inject
    protected PositionInteractor positionInteractor;
    @Inject
    protected PersonInteractor personInteractor;
}
