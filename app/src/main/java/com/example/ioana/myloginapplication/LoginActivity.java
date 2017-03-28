package com.example.ioana.myloginapplication;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText password = (EditText) findViewById(R.id.password);

        final SharedPreferences myPreferences = PreferenceManager.getDefaultSharedPreferences(this);

        Button button = (Button) findViewById(R.id.button);
        if (!myPreferences.getBoolean("logged_in", false))
        {
            // returneaza false daca getBoolean e true
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(LoginActivity.this, "Magic button has been pressed", Toast.LENGTH_SHORT).show();

                        if (password.getText().toString().equals("bla")) {
                            myPreferences.edit().putBoolean("logged_in",true).apply();
                            Intent loginIntent = new Intent(LoginActivity.this, ProfileActivity.class);
                            loginIntent.putExtra("password", "bla");
                            startActivity(loginIntent);
                            finish();

                        }



                }
            });
        }
        else {
            Intent loginIntent = new Intent(LoginActivity.this, ProfileActivity.class);
            loginIntent.putExtra("password", "bla");
            startActivity(loginIntent);
            finish();
        }
    }

}
