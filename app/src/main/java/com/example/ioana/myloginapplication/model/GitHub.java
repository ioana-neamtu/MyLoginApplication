package com.example.ioana.myloginapplication.model;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Header;

/**
 * Created by ioana on 06.04.2017.
 */

public interface GitHub {
    @GET("/")
    Call<LoginData> checkAuth(@Header("Authorization") String auth);

    class Service {
        private static GitHub sInstace;

        public static GitHub Get() {
            if (sInstace == null) {
                sInstace = new Retrofit.Builder()
                        .baseUrl("https://api.github.com").addConverterFactory(GsonConverterFactory.create())
                        .build().create(GitHub.class);
            }
            return sInstace;
        }
    }
}
