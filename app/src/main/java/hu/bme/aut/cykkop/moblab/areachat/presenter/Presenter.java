package hu.bme.aut.cykkop.moblab.areachat.presenter;

/**
 * Created by ednibor on 4/24/16.
 */
public abstract class Presenter<S> {
    protected S screen;

    public void attachScreen(S screen) {
        this.screen = screen;
    }

    public void detachScreen() {
        this.screen = null;
    }
}
