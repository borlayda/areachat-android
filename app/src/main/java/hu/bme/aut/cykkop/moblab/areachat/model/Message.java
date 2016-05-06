package hu.bme.aut.cykkop.moblab.areachat.model;

import java.util.Date;

/**
 * Created by badmin on 2016.05.05..
 */
public class Message{

    private String id;
    private Date timestamp;
    private String message;

    public Message(String message){
        this.timestamp = new Date();
        this.message = message;
        this.id = timestamp.toString()+this.message;
    }

    public Message(){
        this.timestamp = new Date();
        this.message = null;
        this.id = timestamp.toString()+this.message;
    }

    public String getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
