package hu.bme.aut.cykkop.moblab.areachat.view;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.google.android.gms.analytics.HitBuilders;
import com.google.android.gms.analytics.Tracker;

import javax.inject.Inject;

import hu.bme.aut.cykkop.moblab.areachat.MainApplication;
import hu.bme.aut.cykkop.moblab.areachat.R;
import hu.bme.aut.cykkop.moblab.areachat.presenter.AuthPresenter;
import hu.bme.aut.cykkop.moblab.areachat.presenter.RegisterPresenter;
import hu.bme.aut.cykkop.moblab.areachat.screen.AuthScreen;
import hu.bme.aut.cykkop.moblab.areachat.screen.RegisterScreen;

public class RegisterActivity extends Activity implements RegisterScreen {

    @Inject
    protected RegisterPresenter presenter;

    private AutoCompleteTextView mUserNameView;
    private EditText mPasswordView;
    private AutoCompleteTextView mEmailView;
    private RadioGroup mGenderGroup;
    private Button mRegisterButton;
    private RadioButton radbut;
    private Tracker mTracker;

    @Override
    protected void onResume() {
        super.onResume();
        mTracker.setScreenName("Image~LoginActivity");
        mTracker.send(new HitBuilders.EventBuilder()
                .setCategory("Action")
                .setAction("Share")
                .build());

    }


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
        ((MainApplication) getApplication()).getAppComponent().inject(this);
        MainApplication application = (MainApplication) getApplication();
        mTracker = application.getDefaultTracker();
        setContentView(R.layout.activity_register);
        // Set up the login form.
        mUserNameView = (AutoCompleteTextView) findViewById(R.id.username);
        mPasswordView = (EditText) findViewById(R.id.password);
        mEmailView = (AutoCompleteTextView) findViewById(R.id.email);
        mGenderGroup = (RadioGroup) findViewById(R.id.gender);
        mRegisterButton = (Button) findViewById(R.id.register_action_button);
        mRegisterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                radbut = (RadioButton)findViewById(mGenderGroup.getCheckedRadioButtonId());
                presenter.registerNewMember(mUserNameView.getText().toString(),
                        mPasswordView.getText().toString(),
                        mEmailView.getText().toString(),
                        radbut.getText().toString());
            }
        });

    }

    @Override
    public void navigateToLogin() {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }
}
