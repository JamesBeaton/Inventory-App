package com.example.test;

import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.filters.LargeTest;
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner;
import androidx.test.rule.ActivityTestRule;

import com.example.android.product.CatalogActivity;
import com.example.android.product.R;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;


@RunWith(AndroidJUnit4ClassRunner.class)
@LargeTest

public class AndroidTest extends AndroidFunc {

    @Rule
    public ActivityTestRule<CatalogActivity> activityRule =
            new ActivityTestRule<>(CatalogActivity.class);

    @Test
    public void checkStockEmptyText() {
        onView(withText("Unfortunately the stock room is empty")).check(ViewAssertions.matches(isDisplayed()));
    }

    @Test
    public void addStockButton() {
        onView(withId(R.id.fab)).check(ViewAssertions.matches(isDisplayed()));
    }

    @Test
    public void pushStockButton() {
        onView(withId(R.id.fab)).perform(ViewActions.click());
    }
}