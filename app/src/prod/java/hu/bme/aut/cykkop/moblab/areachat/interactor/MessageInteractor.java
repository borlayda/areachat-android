package hu.bme.aut.cykkop.moblab.areachat.interactor;

import javax.inject.Inject;

import dagger.Module;
import hu.bme.aut.cykkop.moblab.areachat.model.Message;
import hu.bme.aut.cykkop.moblab.areachat.model.Person;
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

    private Retrofit retrofit;
    private MessageApi messageApi;

    @Inject
    public MessageInteractor() {
        retrofit = new Retrofit.Builder()
                .baseUrl("http://localhost:5000/v1/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        messageApi = retrofit.create(MessageApi.class);
    }

    public void getMessages(String username) {
        Call<MessageList> messagesRequest = messageApi.messageGet(username);
        messagesRequest.enqueue(new Callback<MessageList>() {

            @Override
            public void onResponse(Response<MessageList> response) {

            }

            @Override
            public void onFailure(Throwable t) {

            }
        });
    }

    public void sendMessage(String username, final Person person, Message message) {
        Call<MyString> messagesRequest = messageApi.messagePost(username, person.getName(), message.getMessage());
        messagesRequest.enqueue(new Callback<MyString>() {
            @Override
            public void onResponse(Response<MyString> response) {

            }

            @Override
            public void onFailure(Throwable t) {

            }
        });
    }
}
