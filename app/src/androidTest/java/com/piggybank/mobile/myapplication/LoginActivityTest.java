package com.piggybank.mobile.myapplication;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.widget.Button;
import android.widget.EditText;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
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
    public void userShouldSeeHelloThenChangeItToEmailAddr() {
        onView(withId(R.id.hello)).check(matches(withText("Hello")));
        onView(withId(R.id.chng_hello)).check(matches(withText("Change Hello")));


        onView(withId(R.id.chng_hello)).perform(click());
        onView(withId(R.id.hello)).check(matches(withText("Hello user")));

        onView(withId(R.id.email)).perform(
                typeText("john@john.com"),
                closeSoftKeyboard());
        onView(withId(R.id.chng_hello_email)).perform(click());
        onView(withId(R.id.hello)).check(matches(withText("john@john.com")));


    }

}
