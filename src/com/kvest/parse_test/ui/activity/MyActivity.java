package com.kvest.parse_test.ui.activity;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import com.kvest.parse_test.R;
import com.parse.FindCallback;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseQuery;

import java.util.List;

public class MyActivity extends Activity {
    private static final String TAG = "KVEST_TAG";
    private EditText name;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        name = (EditText)findViewById(R.id.name);
        findViewById(R.id.add).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nameValue = name.getText().toString();
                if (!TextUtils.isEmpty(nameValue)) {
                    ParseObject user = new ParseObject("User");
                    user.put("user_id", System.currentTimeMillis());
                    user.put("name", nameValue);
                    user.put("gender", 1);
                    user.saveInBackground();
                }
            }
        });

        findViewById(R.id.get_all).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ParseQuery<ParseObject> query = ParseQuery.getQuery("User");
                query.orderByDescending("user_id");
                query.findInBackground(new FindCallback<ParseObject>() {
                    @Override
                    public void done(List<ParseObject> parseObjects, ParseException e) {
                        if (e == null) {
                            Log.d(TAG, "Retrieved " + parseObjects.size() + " scores");
                            for (ParseObject object : parseObjects) {
                                Log.d(TAG, object.get("user_id") + ": " + object.get("name"));
                            }
                        } else {
                            Log.d(TAG, "Error: " + e.getMessage());
                        }
                    }
                });
            }
        });
    }
}
