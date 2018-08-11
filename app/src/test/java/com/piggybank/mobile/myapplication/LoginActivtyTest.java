package com.piggybank.mobile.myapplication;

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

    @Before
    public void setUp() {
        setupActivity(LoginActivity.class);
    }

    @Test
    public void shouldGetTrue() {

        assertThat(9).isBetween(3, 14);

    }

}
