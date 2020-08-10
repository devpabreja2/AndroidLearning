package com.example.learningandroid.BroadcastReceiver;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.learningandroid.R;

public class BroadcastReceiverActivity extends AppCompatActivity {

    private static final String TAG = "MyMessage";

    BroadcastReceiver mReceiver  = new MyBroadcastReceiver();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_broadcast_receiver);
    }

    public void onclick(View view) {
        IntentFilter intentFilter = new IntentFilter(Intent.ACTION_AIRPLANE_MODE_CHANGED);
        this.registerReceiver(mReceiver, intentFilter);

        Log.i(TAG, "Added Receiver");
    }

}