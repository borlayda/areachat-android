package hu.bme.aut.cykkop.moblab.areachat.screen;

import java.util.List;

import hu.bme.aut.cykkop.moblab.areachat.model.Person;

/**
 * Created by ednibor on 4/24/16.
 */
public interface PositionScreen {
    public List<Person> getPersonsInArea();
    public void navigateSelectedPerson();
}
