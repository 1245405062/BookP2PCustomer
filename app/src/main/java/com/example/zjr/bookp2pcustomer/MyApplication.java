package com.example.zjr.bookp2pcustomer;

import android.app.Application;

/**
 * Created by zjr on 2017/2/9.
 */

public class MyApplication extends Application {
    private String token;

    public void setToken(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }
}
