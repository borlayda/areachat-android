package hu.bme.aut.cykkop.moblab.areachat.model;

import io.realm.RealmObject;
import io.realm.annotations.Required;

/**
 * Created by badmin on 2016.05.05..
 */
public class Message extends RealmObject{

    @Required
    private long id;
    private String message;

    public Message(long id, String message){
        this.id = id;
        this.message = message;
    }

    public long getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
