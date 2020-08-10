package com.example.learningandroid.Threads;

import android.os.Handler;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

import com.example.learningandroid.R;

public class ThreadsActivity extends AppCompatActivity {
    private static final String TAG = "ThreadsActivity";
    private Button buttonStartThread;
    private volatile boolean stopThread = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_threads);
        buttonStartThread = findViewById(R.id.button_start_thread);
    }
    public void startThread(View view) {
        stopThread = false;
        ExampleRunnable runnable = new ExampleRunnable(10);
        new Thread(runnable).start();
        /*
        ExampleThread thread = new ExampleThread(10);
        thread.start();
        */
        /*
        new Thread(new Runnable() {
            @Override
            public void run() {
                //work
            }
        }).start();
        */
    }
    public void stopThread(View view) {
        stopThread = true;
    }
    class ExampleThread extends Thread {
        int seconds;
        ExampleThread(int seconds) {
            this.seconds = seconds;
        }
        @Override
        public void run() {
            for (int i = 0; i < seconds; i++) {
                Log.d(TAG, "startThread: " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    class ExampleRunnable implements Runnable {
        int seconds;
        ExampleRunnable(int seconds) {
            this.seconds = seconds;
        }
        @Override
        public void run() {
            for (int i = 0; i < seconds; i++) {
                if (stopThread)
                    return;
                if (i == 5) {

                    Handler threadHandler = new Handler(Looper.getMainLooper());
                    threadHandler.post(new Runnable() {
                        @Override
                        public void run() {
                            buttonStartThread.setText("50%");
                        }
                    });


//                    buttonStartThread.post(new Runnable() {
//                        @Override
//                        public void run() {
//                            buttonStartThread.setText("50%");
//                        }
//                    });
//


//                    runOnUiThread(new Runnable() {
//                        @Override
//                        public void run() {
//                            buttonStartThread.setText("50%");
//                        }
//                    });

                }
                Log.d(TAG, "startThread: " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
