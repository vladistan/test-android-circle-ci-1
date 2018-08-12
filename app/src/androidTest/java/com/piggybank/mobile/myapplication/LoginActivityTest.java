package com.piggybank.mobile.myapplication;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(AndroidJUnit4.class)
public class LoginActivityTest {

    @Rule
    public ActivityTestRule<LoginActivity> mActivtyRule = new ActivityTestRule<>(LoginActivity.class);

    @Test
    public void shouldBeTrue() throws Exception
    {
        assertEquals( 1, 2);
    }

}
