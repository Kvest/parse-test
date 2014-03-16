package com.kvest.parse_test;

import android.app.Application;
import com.parse.Parse;

/**
 * Created with IntelliJ IDEA.
 * User: Kvest
 * Date: 16.03.14
 * Time: 16:22
 * To change this template use File | Settings | File Templates.
 */
public class ParseApplication extends Application {
    private static final String PARSE_APPLICATION_ID = "";
    private static final String PARSE_CLIENT_KEY = "";

    @Override
    public void onCreate() {
        super.onCreate();

        //init parse
        Parse.initialize(this, PARSE_APPLICATION_ID, PARSE_CLIENT_KEY);
    }
}
