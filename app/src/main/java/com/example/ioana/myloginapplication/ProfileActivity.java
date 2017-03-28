package com.example.ioana.myloginapplication;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class ProfileActivity extends AppCompatActivity {
    private static final String TAG = "ProfileActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        final SharedPreferences myPreferences = PreferenceManager.getDefaultSharedPreferences(this);

        Intent loginIntent = getIntent();
        String pass = loginIntent.getStringExtra("password").toString();
        Log.d(TAG, "onCreate() called with: savedInstanceState = [" + savedInstanceState + "]" + pass);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.options_menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        if(item.getItemId() == R.id.sign_out_option) {
            final SharedPreferences myPreferences = PreferenceManager.getDefaultSharedPreferences(this);
            myPreferences.edit().putBoolean("logged_in", false).apply();
            Intent loginIntent = new Intent(ProfileActivity.this, LoginActivity.class);
            //loginIntent.putExtra("password", "bla");
            startActivity(loginIntent);
            finish();
        }
        return true;
    }
}
