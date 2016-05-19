package hu.bme.aut.cykkop.moblab.areachat.view;

import android.os.Bundle;
import android.support.v4.app.Fragment;

import com.google.android.gms.maps.SupportMapFragment;

import java.util.List;

import hu.bme.aut.cykkop.moblab.areachat.model.Person;
import hu.bme.aut.cykkop.moblab.areachat.screen.PositionScreen;

/**
 * Created by ednibor on 4/24/16.
 */
public class PersonMapFragment extends SupportMapFragment implements PositionScreen {

    private static final String ARG_SECTION_NUMBER = "section_number";
    private static final String GOOGLE_MAPS_API_KEY = "AIzaSyBGf4OZXl9xRDoQ6sqoRyhjP-YGvmV7410";

    @Override
    public List<Person> getPersonsInArea() {
        return null;
    }

    @Override
    public void navigateSelectedPerson() {

    }

    public static Fragment newInstance(int sectionNumber) {
        PersonMapFragment fragment = new PersonMapFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }
}
