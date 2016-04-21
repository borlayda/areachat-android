package hu.bme.aut.cykkop.moblab.areachat.model;

import java.util.List;
import java.util.Map;

/**
 * Created by badmin on 2016.04.21..
 */
public class Person {

    private String name;
    private Map<Person, List<String>> speeches;
    private Position position;

    Person(String name, Map<Person, List<String>> speeches, Position position){
        this.name = name;
        this.speeches = speeches;
        this.position = position;
    }

    Person(String name, Position position){
        this.name = name;
        this.position = position;
    }

}
