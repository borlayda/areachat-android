package hu.bme.aut.cykkop.moblab.areachat.presenter;

import javax.inject.Inject;
import javax.inject.Singleton;

import hu.bme.aut.cykkop.moblab.areachat.interactor.AuthInteractor;
import hu.bme.aut.cykkop.moblab.areachat.interactor.MessageInteractor;
import hu.bme.aut.cykkop.moblab.areachat.interactor.PersonInteractor;
import hu.bme.aut.cykkop.moblab.areachat.interactor.PositionInteractor;
import hu.bme.aut.cykkop.moblab.areachat.screen.MessageScreen;

/**
 * Created by mobsoft on 2016. 04. 08..
 */
@Singleton
public class MessagePresenter extends Presenter<MessageScreen> {

    @Inject
    protected MessageInteractor messageInteractor;

    @Inject
    public MessagePresenter(MessageInteractor messageInteractor) {
        this.messageInteractor = messageInteractor;
    }

    @Override
    public void attachScreen(MessageScreen screen) {
        super.attachScreen(screen);
    }

    @Override
    public void detachScreen() {
        super.detachScreen();
    }
}
