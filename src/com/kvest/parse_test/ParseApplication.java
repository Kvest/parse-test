package com.kvest.parse_test;

import android.app.Application;
import com.kvest.parse_test.ui.activity.MyActivity;
import com.parse.Parse;
import com.parse.PushService;

/**
 * Created with IntelliJ IDEA.
 * User: Kvest
 * Date: 16.03.14
 * Time: 16:22
 * To change this template use File | Settings | File Templates.
 */
public class ParseApplication extends Application {
    private static final String PARSE_APPLICATION_ID = "GGfOcYqVQGdTWcKcbY3PndHyzQYcS4W8isrqeyZt";
    private static final String PARSE_CLIENT_KEY = "nvlD6tIpbjZoMbMqAvX3Ryly8tRYQ2GqWAByb5f6";

    @Override
    public void onCreate() {
        super.onCreate();

        //init parse
        Parse.initialize(this, PARSE_APPLICATION_ID, PARSE_CLIENT_KEY);
        PushService.setDefaultPushCallback(this, MyActivity.class);
    }
}
