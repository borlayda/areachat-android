package hu.bme.aut.cykkop.moblab.areachat.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import javax.inject.Inject;

import hu.bme.aut.cykkop.moblab.areachat.R;
import hu.bme.aut.cykkop.moblab.areachat.presenter.AuthPresenter;
import hu.bme.aut.cykkop.moblab.areachat.presenter.RegisterPresenter;
import hu.bme.aut.cykkop.moblab.areachat.screen.AuthScreen;
import hu.bme.aut.cykkop.moblab.areachat.screen.RegisterScreen;

public class RegisterActivity extends AppCompatActivity implements RegisterScreen {

    @Inject
    protected RegisterPresenter presenter;

    @Override
    protected void onStart() {
        super.onStart();
        presenter.attachScreen(this);
    }

    @Override
    protected void onStop() {
        super.onStop();
        presenter.detachScreen();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button mRegisterButton = (Button) findViewById(R.id.register_action_button);
        mRegisterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.registerNewMember();
            }
        });
    }

    @Override
    public void navigateToLogin() {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }
}
