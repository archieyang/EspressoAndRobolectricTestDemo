package me.codethink.testdemo;

import android.widget.TextView;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by archie on 15/5/27.
 */
@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class, emulateSdk = 21)
public class MainActivityUnitTest {
    private MainActivity activity;

    @Before
    public void setUp() throws Exception {
        activity = Robolectric.setupActivity(MainActivity.class);
    }

    @Test
    public void testHelloWorld() throws Exception {
        TextView helloWorldTextView = (TextView) activity.findViewById(R.id.textview_id);
        assertThat(helloWorldTextView.getText().toString()).isEqualTo("Hello world!");
    }

}