package com.kvest.parse_test.ui.activity;

import android.app.Activity;
import android.os.Bundle;
import com.kvest.parse_test.R;
import com.parse.ParseObject;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        ParseObject user = new ParseObject("User");
        user.put("user_id", System.currentTimeMillis());
        user.put("name", "test");
        user.put("gender", 1);
        user.saveInBackground();
    }
}
