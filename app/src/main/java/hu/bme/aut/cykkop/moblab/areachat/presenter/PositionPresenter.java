package hu.bme.aut.cykkop.moblab.areachat.presenter;

import javax.inject.Inject;
import javax.inject.Singleton;

import dagger.Module;
import hu.bme.aut.cykkop.moblab.areachat.interactor.AuthInteractor;
import hu.bme.aut.cykkop.moblab.areachat.interactor.MessageInteractor;
import hu.bme.aut.cykkop.moblab.areachat.interactor.PersonInteractor;
import hu.bme.aut.cykkop.moblab.areachat.interactor.PositionInteractor;
import hu.bme.aut.cykkop.moblab.areachat.screen.PositionScreen;

/**
 * Created by mobsoft on 2016. 04. 08..
 */
@Module
public class PositionPresenter extends Presenter<PositionScreen> {

    @Inject
    protected PositionInteractor positionInteractor;

    @Inject
    public PositionPresenter(PositionInteractor positionInteractor) {
        this.positionInteractor = positionInteractor;
    }

    @Override
    public void attachScreen(PositionScreen screen) {
        super.attachScreen(screen);
    }

    @Override
    public void detachScreen() {
        super.detachScreen();
    }
}
