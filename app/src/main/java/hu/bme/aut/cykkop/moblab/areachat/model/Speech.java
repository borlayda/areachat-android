package hu.bme.aut.cykkop.moblab.areachat.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import io.realm.RealmList;
import io.realm.RealmObject;

/**
 * Created by badmin on 2016.05.06..
 */
public class Speech extends RealmObject {

    private Person person;
    private RealmList<Message> messages;

    public Speech(Person person, RealmList<Message> messages){

        this.messages = messages;
        this.person = person;
    }

    public Speech(){
        this.messages = new RealmList<>();
        this.person = new Person();
    }

    public Person getPerson() {
        return person;
    }

    public RealmList<Message> getMessages() {
        return messages;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void setMessages(RealmList<Message> messages) {
        this.messages = messages;
    }
}
