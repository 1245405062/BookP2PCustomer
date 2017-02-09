package com.example.zjr.bookp2pcustomer;

import android.util.Log;

/**
 * Created by zjr on 2017/2/6.
 */

public class signupThread extends Thread {
    private User user;

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public void run() {
        try {
            NetUtils.signup(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
        super.run();
    }
}
