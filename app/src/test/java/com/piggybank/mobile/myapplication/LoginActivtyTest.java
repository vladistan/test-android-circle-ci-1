package com.piggybank.mobile.myapplication;

import android.app.Notification;
import android.widget.Button;
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

    @Before
    public void setUp() {
        mainActivity = setupActivity(LoginActivity.class);
    }

    @Test
    public void shouldGetTrue() {

        assertThat(9).isBetween(3, 14);
    }

    @Test
    public void shouldHaveLabelHello() {

        TextView helloLabel = mainActivity.findViewById(R.id.hello);
        assertThat(helloLabel.getText()).isEqualTo("Hello");
    }

    @Test
    public void changeGreeting() {

        Button chgHelloBtn = mainActivity.findViewById(R.id.chng_hello);
        assertThat(chgHelloBtn.getText()).isEqualTo("Change");


    }

}
