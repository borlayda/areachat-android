package hu.bme.aut.cykkop.moblab.areachat.model;

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
    private Map<Person, Map<Date, String>> speeches;
    private Position position;

    Person(String name, Map<Person, Map<Date, String>> speeches, Position position){
        this.name = name;
        this.speeches = speeches;
        this.position = position;
    }

    Person(String name, Position position){
        this.name = name;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public Map<Person, Map<Date, String>> getSpeeches() {
        return speeches;
    }

    public Position getPosition() {
        return position;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpeeches(Map<Person, Map<Date, String>> speeches) {
        this.speeches = speeches;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public void addSpeech(Person person, Map<Date, String> speech) {
        this.speeches.put(person, speech);
    }

    public void addNewLine(Person person, String line){
        if (this.speeches.containsKey(person)){
            Map<Date, String> previousSpeech = this.speeches.get(person);
            previousSpeech.put(new Date(), line);
        } else {
            Map<Date, String> newLine = new HashMap<>();
            newLine.put(new Date(), line);
            this.speeches.put(person, newLine);
        }
    }

    public void updatePosition(Position position){
        this.position = position;
    }

}
