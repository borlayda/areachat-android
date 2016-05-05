package hu.bme.aut.cykkop.moblab.areachat.view;

import android.app.Fragment;

import java.util.List;

import hu.bme.aut.cykkop.moblab.areachat.model.Person;
import hu.bme.aut.cykkop.moblab.areachat.screen.PositionScreen;

/**
 * Created by ednibor on 4/24/16.
 */
public class MapFragment extends Fragment implements PositionScreen {
    @Override
    public List<Person> getPersonsInArea() {
        return null;
    }

    @Override
    public void navigateSelectedPerson() {

    }
}
