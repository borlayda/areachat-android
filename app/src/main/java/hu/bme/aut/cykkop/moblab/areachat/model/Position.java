package hu.bme.aut.cykkop.moblab.areachat.model;

import io.realm.RealmObject;

/**
 * Created by badmin on 2016.04.21..
 */
public class Position extends RealmObject {

    private float longitude;
    private float latitude;

    Position(float longitude, float latitude){
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }
}
