package hu.bme.aut.cykkop.moblab.areachat.view;

import android.app.Activity;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

import java.util.List;

import javax.inject.Inject;

import hu.bme.aut.cykkop.moblab.areachat.R;
import hu.bme.aut.cykkop.moblab.areachat.model.Message;
import hu.bme.aut.cykkop.moblab.areachat.model.Person;
import hu.bme.aut.cykkop.moblab.areachat.model.Position;
import hu.bme.aut.cykkop.moblab.areachat.presenter.MessagePresenter;
import hu.bme.aut.cykkop.moblab.areachat.screen.MessageScreen;

public class ChatActivity extends Activity implements MessageScreen {

    private List<Message> messages;
    @Inject
    public MessagePresenter presenter;

    private String speechTarget;
    private String username;

    private ListView messageList;
    private EditText messageText;
    private ImageButton sendButton;

    @Override
    protected void onStart() {
        super.onStart();
        presenter.attachScreen(this);
    }

    @Override
    protected void onStop() {
        super.onStop();
        presenter.detachScreen();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        Bundle mybundle = getIntent().getExtras();
        speechTarget = mybundle.getString("person");
        username = mybundle.getString("username");

        messageList = (ListView) findViewById(R.id.listView);
        messageText = (EditText) findViewById(R.id.messageText);
        sendButton = (ImageButton) findViewById(R.id.sendButton);
        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.sendMessage(username, new Person(speechTarget, new Position((float) 0.0, (float) 0.0)), new Message(messageText.getText().toString()));
            }
        });
    }

    @Override
    public void getMessages() {
    }

    @Override
    public android.os.Message sendMessage() {
        return null;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

}
