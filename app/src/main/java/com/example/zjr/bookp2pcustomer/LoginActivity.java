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

public class LoginActivity extends Activity {
    EditText edt_username,edt_password;
    Button btn_login;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        edt_username= (EditText) findViewById(R.id.edt_username);
        edt_password= (EditText) findViewById(R.id.edt_password);
        btn_login= (Button) findViewById(R.id.btn_login);
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginThread thread=new loginThread();
                thread.setUsername(edt_username.getText().toString());
                thread.setPassword(edt_password.getText().toString());
                thread.start();
            }
        });
    }
}
