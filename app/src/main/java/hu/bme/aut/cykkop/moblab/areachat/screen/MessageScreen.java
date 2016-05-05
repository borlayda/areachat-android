package hu.bme.aut.cykkop.moblab.areachat.screen;

import android.os.Message;

import java.util.List;

/**
 * Created by ednibor on 4/24/16.
 */
public interface MessageScreen {
    public List<Message> getMessages();
    public void sendMessage();
}
