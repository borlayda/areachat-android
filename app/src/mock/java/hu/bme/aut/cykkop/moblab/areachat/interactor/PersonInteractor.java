package hu.bme.aut.cykkop.moblab.areachat.interactor;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import hu.bme.aut.cykkop.moblab.areachat.model.Position;
import hu.bme.aut.cykkop.moblab.areachat.model.Person;
/**
 * Created by mobsoft on 2016. 04. 08..
 */
@Module
public class PersonInteractor {

    @Inject
    public PersonInteractor() {
    }

    public List<Person> getPersons(BigDecimal longitude, BigDecimal latitude) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Paul", new Position((float)0.0, (float)0.0)));
        return persons;
    }
}
