package hu.bme.aut.cykkop.moblab.areachat.presenter;

import javax.inject.Inject;

import dagger.Module;
import hu.bme.aut.cykkop.moblab.areachat.interactor.AuthInteractor;
import hu.bme.aut.cykkop.moblab.areachat.screen.AuthScreen;
import hu.bme.aut.cykkop.moblab.areachat.screen.RegisterScreen;

/**
 * Created by badmin on 2016.05.17..
 */
@Module
public class RegisterPresenter extends Presenter<RegisterScreen> {

    @Inject
    protected AuthInteractor authInteractor;

    @Inject
    public RegisterPresenter(AuthInteractor authInteractor) {
        this.authInteractor = authInteractor;
    }

    @Override
    public void attachScreen(RegisterScreen screen) {
        super.attachScreen(screen);
    }

    @Override
    public void detachScreen() {
        super.detachScreen();
    }

    public void registerNewMember(String username, String password, String email, String gender) {
        authInteractor.register(this, username, password, email, gender);
    }

    public void showLogin() {
        screen.navigateToLogin();
    }

}
