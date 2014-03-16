package com.kvest.parse_test.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created with IntelliJ IDEA.
 * User: Kvest
 * Date: 16.03.14
 * Time: 20:48
 * To change this template use File | Settings | File Templates.
 */
public class MyCustomReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d("KVEST_TAG", "!!!!!!!!!!!!!!");
        String channel = intent.getExtras().getString("com.parse.Channel");
        Log.d("KVEST_TAG", "channel=[" + channel + "]");
        String data = intent.getExtras().getString("com.parse.Data");
        Log.d("KVEST_TAG", "data=[" + data + "]");
    }
}
