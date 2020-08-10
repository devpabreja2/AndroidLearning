package com.example.learningandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.learningandroid.Activity.FirstActivity;
import com.example.learningandroid.BottomSheet.BottomSheetActivity;
import com.example.learningandroid.BroadcastReceiver.BroadcastReceiverActivity;
import com.example.learningandroid.ContentProvider.ContentProviderActivity;
import com.example.learningandroid.Dagger.DaggerActivity;
import com.example.learningandroid.Fragments.FragmentActivity;
import com.example.learningandroid.Intents.WorkoutActivity;
import com.example.learningandroid.OkHttp.OkHttpActivity;
import com.example.learningandroid.RecyclerView.RecyclerViewActivity;
import com.example.learningandroid.Retrofit.RetrofitActivity;
import com.example.learningandroid.RxJava.RxJavaActivity;
import com.example.learningandroid.SQLite.SQLiteActivity;
import com.example.learningandroid.SharedPreferences.SharedPreferencesActivity;
import com.example.learningandroid.Storage.StorageActivity;
import com.example.learningandroid.Threads.ThreadsActivity;
import com.example.learningandroid.ViewPager.ViewPagerActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onActivityClick(View view) {
        Intent intent = new Intent(this, FirstActivity.class);
        startActivity(intent);
    }

    public void onIntentClick(View view) {
        Intent intent = new Intent(this, WorkoutActivity.class);
        startActivity(intent);
    }

    public void onFragmentClick(View view) {
        Intent intent = new Intent(this, FragmentActivity.class);
        startActivity(intent);
    }

    public void onBroadcastClick(View view) {
        Intent intent = new Intent(this, BroadcastReceiverActivity.class);
        startActivity(intent);
    }

    public void onContentProviderClick(View view) {
        Intent intent = new Intent(this, ContentProviderActivity.class);
        startActivity(intent);
    }

    public void onOkHttpClick(View view) {
        Intent intent = new Intent(this, OkHttpActivity.class);
        startActivity(intent);
    }

    public void onRetrofitClick(View view) {
        Intent intent = new Intent(this, RetrofitActivity.class);
        startActivity(intent);
    }

    public void onViewPagerClick(View view) {
        Intent intent = new Intent(this, ViewPagerActivity.class);
        startActivity(intent);
    }

    public void onRecyclerViewClick(View view) {
        Intent intent = new Intent(this, RecyclerViewActivity.class);
        startActivity(intent);
    }

    public void onBottomSheetClick(View view) {
        Intent intent = new Intent(this, BottomSheetActivity.class);
        startActivity(intent);
    }

    public void onThreadsClick(View view) {
        Intent intent = new Intent(this, ThreadsActivity.class);
        startActivity(intent);
    }

    public void onRxJavaClick(View view) {
        Intent intent = new Intent(this, RxJavaActivity.class);
        startActivity(intent);
    }

    public void onStorageClick(View view) {
        Intent intent = new Intent(this, StorageActivity.class);
        startActivity(intent);
    }

    public void onSharedPreferencesClick(View view) {
        Intent intent = new Intent(this, SharedPreferencesActivity.class);
        startActivity(intent);
    }

    public void onSQLiteClick(View view) {
        Intent intent = new Intent(this, SQLiteActivity.class);
        startActivity(intent);
    }

    public void onDaggerClick(View view) {
        Intent intent = new Intent(this, DaggerActivity.class);
        startActivity(intent);
    }
}
