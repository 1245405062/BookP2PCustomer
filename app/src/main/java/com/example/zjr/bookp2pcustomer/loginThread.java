package com.example.zjr.bookp2pcustomer;

/**
 * Created by zjr on 2017/2/6.
 */

public class loginThread extends Thread{
    private String username;
    private String password;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public void run() {
        super.run();
        try {
            NetUtils.login(username,password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
