package com.example.learningandroid.BroadcastReceiver;

import android.app.IntentService;
import android.content.Intent;
import android.os.SystemClock;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class MyIntentService extends IntentService {

    private static final String TAG = "MyMessage";

    public MyIntentService() {
        super("MyIntentService");
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        Log.i(TAG, "The service has started");

//        Handler handler = new Handler();
//        handler.postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                Log.i(TAG, "Here");
//                Toast.makeText(MyIntentService.this, "Aeroplane mode on/off and task is completed", Toast.LENGTH_SHORT).show();
//            }
//        }, 5000);

        SystemClock.sleep(5000);
        Toast.makeText(MyIntentService.this, "Aeroplane mode on/off and task is completed", Toast.LENGTH_SHORT).show();
    }

}
