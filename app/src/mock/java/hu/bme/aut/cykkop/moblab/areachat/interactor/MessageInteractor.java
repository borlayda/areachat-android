package hu.bme.aut.cykkop.moblab.areachat.interactor;

import android.widget.Toast;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import hu.bme.aut.cykkop.moblab.areachat.R;
import hu.bme.aut.cykkop.moblab.areachat.model.Message;
import hu.bme.aut.cykkop.moblab.areachat.model.Person;
import hu.bme.aut.cykkop.moblab.areachat.view.ChatActivity;
import io.swagger.client.api.LoginApi;
import io.swagger.client.api.MessageApi;
import io.swagger.client.model.MessageList;
import io.swagger.client.model.MyString;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.GsonConverterFactory;
import retrofit2.Response;
import retrofit2.Retrofit;

/**
 * Created by mobsoft on 2016. 04. 08..
 */
@Module
public class MessageInteractor {

    List<Message> messages;

    @Inject
    public MessageInteractor() {
    }

    public void getMessages(String username) {

    }

    public void sendMessage(String username, final Person person, Message message) {

    }
}
