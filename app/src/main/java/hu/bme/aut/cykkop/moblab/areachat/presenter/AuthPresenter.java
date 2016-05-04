package hu.bme.aut.cykkop.moblab.areachat.presenter;

import javax.inject.Inject;

import dagger.Module;
import hu.bme.aut.cykkop.moblab.areachat.interactor.AuthInteractor;
import hu.bme.aut.cykkop.moblab.areachat.screen.AuthScreen;

/**
 * Created by mobsoft on 2016. 04. 08..
 */
@Module
public class AuthPresenter extends Presenter<AuthScreen> {

    @Inject
    protected AuthInteractor authInteractor;

    @Inject
    public AuthPresenter(AuthInteractor authInteractor) {
        this.authInteractor = authInteractor;
    }

    @Override
    public void attachScreen(AuthScreen screen) {
        super.attachScreen(screen);
    }

    @Override
    public void detachScreen() {
        super.detachScreen();
    }

    public void showMap(String username, String password){
        screen.navigateToMap();
    }

    public void showRegister() {
        screen.navigateToRegister();
    }
}
