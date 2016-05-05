package hu.bme.aut.cykkop.moblab.areachat.interactor;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

import hu.bme.aut.cykkop.moblab.areachat.model.Person;
import io.realm.Realm;
import io.realm.RealmConfiguration;
import io.realm.RealmResults;

/**
 * Created by badmin on 2016.05.05..
 */

@Singleton
public class DataInteractorImpl implements DataInteractor {

    private Realm realm;

    @Inject
    public DataInteractorImpl(Context context) {
        RealmConfiguration realmConfig = new RealmConfiguration.Builder(context).build();
        realm = Realm.getInstance(realmConfig);
    }

    @Override
    public Person getPerson(String name) {
        Person realmPerson = realm.where(Person.class).equalTo("name", name).findFirst();
        return realmPerson;
    }

    @Override
    public void savePerson(Person person) {
        realm.beginTransaction();
        realm.copyToRealm(person);
        realm.commitTransaction();
    }
}
