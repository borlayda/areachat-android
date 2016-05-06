package hu.bme.aut.cykkop.moblab.areachat.mock;

import android.content.Context;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

import hu.bme.aut.cykkop.moblab.areachat.interactor.DataInteractor;
import hu.bme.aut.cykkop.moblab.areachat.model.Person;
import hu.bme.aut.cykkop.moblab.areachat.model.Position;
import io.realm.Realm;
import io.realm.RealmConfiguration;
import io.realm.RealmResults;

/**
 * Created by badmin on 2016.05.05..
 */

@Singleton
public class MockDataInteractorImpl implements DataInteractor {


    @Inject
    public MockDataInteractorImpl(Context context) {

    }

    @Override
    public Person getPerson(String name) {
        return new Person(
                new String("Test User2"),
                null,
                new Position((float)47.3, (float)19.5)
        );
    }

    @Override
    public void savePerson(Person person) {

    }

    @Override
    public List<Person> getPersonsInArea(float longitude, float latitude) {
        List<Person> retVal = new ArrayList<>();
        return retVal;
    }
}
