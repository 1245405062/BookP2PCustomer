package com.example.zjr.bookp2pcustomer;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by zjr on 2017/2/6.
 */

public class SignupActivity extends Activity {
    private Button btn_signup;
    private EditText edt_username,edt_password,edt_phonenum;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);
        btn_signup= (Button) findViewById(R.id.btn_sure);
        edt_username= (EditText) findViewById(R.id.edt_username);
        edt_password= (EditText) findViewById(R.id.edt_password);
        edt_phonenum= (EditText) findViewById(R.id.edt_phonenum);
        btn_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username=edt_username.getText().toString();
                String password=edt_password.getText().toString();
                String phonenum=edt_phonenum.getText().toString();
                User user=new User();
                user.setUsername(username);
                user.setPassword(password);
                user.setPhonenum(phonenum);
                signupThread thread=new signupThread();
                thread.setUser(user);
                thread.start();
            }
        });
    }
}
