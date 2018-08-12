package com.piggybank.mobile.myapplication;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.assertEquals;

@RunWith(AndroidJUnit4.class)
public class LoginActivityTest {

    @Rule
    public ActivityTestRule<LoginActivity> mActivtyRule = new ActivityTestRule<>(LoginActivity.class);

    @Test
    public void shouldBeTrue() throws Exception
    {
        assertEquals( 1, 1);
    }

    @Test
    public void shouldHaveHelloLabel() {
        onView(withId(R.id.hello)).check(matches(withText("Hello")));
    }

}
