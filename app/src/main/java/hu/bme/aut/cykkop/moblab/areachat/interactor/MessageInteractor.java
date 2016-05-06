package hu.bme.aut.cykkop.moblab.areachat.interactor;

import android.os.Message;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by mobsoft on 2016. 04. 08..
 */
@Module
public class MessageInteractor {

    @Inject
    public MessageInteractor() {
    }

    public List<Message> getMessages() {
        return new ArrayList<>();
    }

    public void sendMessage(Message message) {

    }
}
