package hu.bme.aut.cykkop.moblab.areachat.presenter;

import javax.inject.Inject;

import dagger.Module;
import hu.bme.aut.cykkop.moblab.areachat.interactor.PersonInteractor;
import hu.bme.aut.cykkop.moblab.areachat.screen.PersonScreen;

/**
 * Created by mobsoft on 2016. 04. 08..
 */
@Module
public class PersonPresenter extends Presenter<PersonScreen> {

    @Inject
    protected PersonInteractor personInteractor;

    @Inject
    public PersonPresenter(PersonInteractor personInteractor) {
        this.personInteractor = personInteractor;
    }

    @Override
    public void attachScreen(PersonScreen screen) {
        super.attachScreen(screen);
    }

    @Override
    public void detachScreen() {
        super.detachScreen();
    }
}
