package hu.bme.aut.cykkop.moblab.areachat.interactor;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by mobsoft on 2016. 04. 08..
 */
@Singleton
public class Presenter {

    @Inject
    private AuthInteractor authInteractor;
    @Inject
    private MessageInteractor messageInteractor;
    @Inject
    private PositionInteractor positionInteractor;
    @Inject
    private PersonInteractor personInteractor;
}
