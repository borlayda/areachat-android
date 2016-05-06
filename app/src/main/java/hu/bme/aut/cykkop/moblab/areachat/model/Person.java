package hu.bme.aut.cykkop.moblab.areachat.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.realm.RealmObject;
import io.realm.annotations.Required;

/**
 * Created by badmin on 2016.04.21..
 */
public class Person extends RealmObject {

    @Required
    private String name;
    private Map<Person, List<Message>> speeches;
    private Position position;

    public Person(String name, Map<Person, List<Message>> speeches, Position position){
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
        this.speeches = new HashMap<>();
        this.position = new Position();
    }

    public String getName() {
        return name;
    }

    public Map<Person, List<Message>> getSpeeches() {
        return speeches;
    }

    public Position getPosition() {
        return position;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpeeches(Map<Person, List<Message>> speeches) {
        this.speeches = speeches;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public void addSpeech(Person person, List<Message> speech) {
        this.speeches.put(person, speech);
    }

    public void addNewLine(Person person, String line){
        if (this.speeches.containsKey(person)){
            List<Message> previousSpeech = this.speeches.get(person);
            previousSpeech.add(new Message(line));
        } else {
            List<Message> newLine = new ArrayList<>();
            newLine.add(new Message(line));
            this.speeches.put(person, newLine);
        }
    }

    public void updatePosition(Position position){
        this.position = position;
    }

}
