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

import com.example.ioana.myloginapplication.model.GitHub;
import com.example.ioana.myloginapplication.model.LoginData;

import okhttp3.Credentials;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText password = (EditText) findViewById(R.id.password);
        final EditText userName = (EditText) findViewById(R.id.username);

        final SharedPreferences myPreferences = PreferenceManager.getDefaultSharedPreferences(this);

        Button button = (Button) findViewById(R.id.button);
        if (!myPreferences.getBoolean("logged_in", false))
        {
            // returneaza false daca getBoolean e true
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Call<LoginData> loginCall = GitHub.Service.Get().checkAuth(Credentials.basic(userName.getText().toString(),password.getText().toString()));

                    loginCall.enqueue(new Callback<LoginData>() {
                        @Override
                        public void onResponse(Call<LoginData> call, Response<LoginData> response) {
                            if (response.isSuccessful()) {
                                myPreferences.edit().putBoolean("logged_in",true).apply();
                                Intent loginIntent = new Intent(LoginActivity.this, ProfileActivity.class);
                                startActivity(loginIntent);
                                finish();
                            }
                            else {
                                Toast.makeText(LoginActivity.this, "Auth error", Toast.LENGTH_SHORT).show();
                            }

                        }

                        @Override
                        public void onFailure(Call<LoginData> call, Throwable t) {
                            Toast.makeText(LoginActivity.this, "Dubios error", Toast.LENGTH_SHORT).show();
                        }
                    });
                    if (password.getText().toString().equals("bla")) {


                        }/*
                    if (password.getText().toString().equals("bla")) {
                        myPreferences.edit().putBoolean("logged_in",true).apply();
                        Intent loginIntent = new Intent(LoginActivity.this, RepositoriesActivity.class);
                        loginIntent.putExtra("password", "bla");
                        startActivity(loginIntent);
                        finish();

                    }*/




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
