package hu.bme.aut.cykkop.moblab.areachat.interactor;

import hu.bme.aut.cykkop.moblab.areachat.model.Person;

/**
 * Created by badmin on 2016.05.05..
 */
public interface DataInteractor {

    public Person getPerson(String name);
    public void savePerson(Person person);

}
