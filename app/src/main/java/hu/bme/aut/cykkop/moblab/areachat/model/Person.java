package hu.bme.aut.cykkop.moblab.areachat.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.Required;

/**
 * Created by badmin on 2016.04.21..
 */
public class Person extends RealmObject {

    @Required
    private String name;
    private RealmList<Speech> speeches;
    private Position position;

    public Person(String name, RealmList<Speech> speeches, Position position){
        this.name = name;
        this.speeches = speeches;
        this.position = position;
    }

    public Person(String name, Position position){
        this.name = name;
        this.position = position;
    }

    public Person(){
        this.name = null;
        this.speeches = new RealmList<>();
        this.position = new Position();
    }

    public String getName() {
        return name;
    }

    public RealmList<Speech> getSpeeches() {
        return speeches;
    }

    public Position getPosition() {
        return position;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpeeches(RealmList<Speech> speeches) {
        this.speeches = speeches;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public void addSpeech(Person person, RealmList<Message> speech) {
        Speech newSpeech = new Speech(person, speech);
        this.speeches.add(newSpeech);
    }

    public void addNewLine(Person person, String line){
        for (Speech speech : this.speeches){
            if (speech.getPerson().equals(person)){
                RealmList<Message> previousSpeech = speech.getMessages();
                previousSpeech.add(new Message(line));
                speech.setMessages(previousSpeech);
                return;
            }
        }
        RealmList<Message> newMessages = new RealmList<>();
        newMessages.add(new Message(line));
        Speech newSpeech = new Speech(person, newMessages);
        this.speeches.add(newSpeech);
    }

    public void updatePosition(Position position){
        this.position = position;
    }

}
