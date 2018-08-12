package com.piggybank.mobile.myapplication;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import static org.robolectric.Robolectric.setupActivity;
import static org.assertj.core.api.Assertions.*;


@RunWith(RobolectricTestRunner.class)
@Config(constants = BuildConfig.class, sdk = 27)
public class LoginActivtyTest {

    private LoginActivity mainActivity;
    private TextView helloLabel;
    private Button chgHelloBtn;

    @Before
    public void setUp() {
        mainActivity = setupActivity(LoginActivity.class);
        helloLabel = mainActivity.findViewById(R.id.hello);
        chgHelloBtn = mainActivity.findViewById(R.id.chng_hello);
    }

    @Test
    public void shouldGetTrue() {

        assertThat(9).isBetween(3, 14);
    }

    @Test
    public void shouldHaveLabelHello() {

        assertThat(helloLabel.getText()).isEqualTo("Hello");
    }

    @Test
    public void shouldHaveChangeHelloButton() {

        assertThat(chgHelloBtn.getText()).isEqualTo("Change Hello");


    }

    @Test
    public void shouldChangeHelloLabelWhenChangeBtnIsClicked() {
        chgHelloBtn.performClick();
        assertThat(helloLabel.getText()).isEqualTo("Hello user");
    }

    @Test
    public void shouldSayHelloToEmailAddr() {
        EditText emailField = mainActivity.findViewById(R.id.email);
        emailField.setText("bob@bob.com");

        Button chgHelloEmail = mainActivity.findViewById(R.id.chng_hello_email);
        chgHelloEmail.performClick();
        assertThat(helloLabel.getText()).isEqualTo("bob@bob.com");
    }

}
