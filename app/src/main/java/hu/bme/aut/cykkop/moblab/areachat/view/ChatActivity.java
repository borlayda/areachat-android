package hu.bme.aut.cykkop.moblab.areachat.view;

import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.List;

import hu.bme.aut.cykkop.moblab.areachat.R;
import hu.bme.aut.cykkop.moblab.areachat.screen.MessageScreen;

public class ChatActivity extends AppCompatActivity implements MessageScreen {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);
    }

    @Override
    public void getMessages() {

    }

    @Override
    public Message sendMessage() {
        return null;
    }
}
