package hu.bme.aut.cykkop.moblab.areachat.view;

import android.os.Bundle;
import android.support.v4.app.Fragment;

import java.util.List;

import hu.bme.aut.cykkop.moblab.areachat.model.Person;
import hu.bme.aut.cykkop.moblab.areachat.screen.PositionScreen;

/**
 * Created by ednibor on 4/24/16.
 */
public class MapFragment extends Fragment implements PositionScreen {

    private static final String ARG_SECTION_NUMBER = "section_number";

    @Override
    public List<Person> getPersonsInArea() {
        return null;
    }

    @Override
    public void navigateSelectedPerson() {

    }

    public static MapFragment newInstance(int sectionNumber) {
        MapFragment fragment = new MapFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }
}
