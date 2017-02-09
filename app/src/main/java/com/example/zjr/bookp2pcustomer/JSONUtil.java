package com.example.zjr.bookp2pcustomer;

import android.util.Log;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by zjr on 2017/1/20.
 */

public class JSONUtil {
    public String packageJson(User user){
        String str=null;
        try {
            JSONObject jsonObject=new JSONObject();
            jsonObject.put("username",user.getUsername());
            jsonObject.put("password",user.getPassword());
            jsonObject.put("nickname",user.getNickname());
            jsonObject.put("phonenum",user.getPhonenum());
            str=jsonObject.toString();
            Log.i("zjr",str);

        } catch (JSONException e) {
            e.printStackTrace();
        }
        return str;
    }
}
