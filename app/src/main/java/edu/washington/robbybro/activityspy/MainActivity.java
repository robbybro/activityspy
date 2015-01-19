package edu.washington.robbybro.activityspy;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i("ActivitySpy", "onCreate event fired");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        Log.i("ActivitySpy", "onStart event fired");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.i("ActivitySpy", "onResume event fired");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.i("ActivitySpy", "onPause event fired");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.i("ActivitySpy", "onStop event fired");
        super.onStop();
    }

    @Override
    protected void onRestart() {
        Log.i("ActivitySpy", "onRestart event fired");
        super.onRestart();
    }

    @Override
    protected void onDestroy() {
        Log.i("ActivitySpy", "onDestroy event fired");
        Log.e("ActivitySpy", "We're going down, Captain!");
        super.onDestroy();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
