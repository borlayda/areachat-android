package hu.bme.aut.cykkop.moblab.areachat;

import javax.inject.Singleton;

import dagger.Component;
import hu.bme.aut.cykkop.moblab.areachat.interactor.AuthInteractor;
import hu.bme.aut.cykkop.moblab.areachat.presenter.AuthPresenter;
import hu.bme.aut.cykkop.moblab.areachat.view.LoginActivity;
import hu.bme.aut.cykkop.moblab.areachat.view.NavigationActivity;
import hu.bme.aut.cykkop.moblab.areachat.view.RegisterActivity;
import hu.bme.aut.cykkop.moblab.areachat.view.SelectorActivity;

@Singleton
@Component(modules={AppModule.class})
public interface AppComponent {

    void inject(LoginActivity activity);
    void inject(NavigationActivity activity);
    void inject(RegisterActivity activity);
    void inject(SelectorActivity activity);

    AuthPresenter authPresenter();
    AuthInteractor authInteractor();

}
