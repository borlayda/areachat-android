package hu.bme.aut.cykkop.moblab.areachat.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by badmin on 2016.05.06..
 */
public class Speech {

    private Person person;
    private List<Message> messages;

    public Speech(Person person, List<Message> messages){

        this.messages = messages;
        this.person = person;
    }

    public Speech(){
        this.messages = new ArrayList<>();
        this.person = new Person();
    }

    public Person getPerson() {
        return person;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }
}
