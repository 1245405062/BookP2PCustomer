package com.example.zjr.bookp2pcustomer;

import android.util.Log;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by zjr on 2017/2/6.
 */

public class NetUtils {
    private static String SIGNUPURL = "http://bookp2p.imwork.net:10142/BooksServer/user";
    private static String LOGINURL="http://bookp2p.imwork.net:10142/BooksServer/login";
    private static String PHOTOURL="http://bookp2p.imwork.net:10142/BooksServer/user/photo";
    public static void signup(User user)throws Exception{
        /*
         * 使用POST方法请求注册操作
         * url地址不加任何后缀
         * 如果注册成功会在result中返回JSON格式的code为201，message为注册成功
         * 如果注册不成功，会在result中返回JSON格式的code为409（某个值已存在，如用户名）或400（验证错误，数据不符合规范）
         */
        URL url = new URL(SIGNUPURL);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setDoOutput(true);
        connection.setDoInput(true);
        connection.setRequestMethod("POST");
        JSONUtil util=new JSONUtil();
        String str=util.packageJson(user);
        OutputStreamWriter writer=new OutputStreamWriter(connection.getOutputStream(),"utf-8");
        writer.write(str);
        writer.flush();
        int code=connection.getResponseCode();
        Log.i("zjr",code+":");
        BufferedReader reader=new BufferedReader(new InputStreamReader(connection.getInputStream(),"utf-8"));
        String line,result="";
        while ((line = reader.readLine()) != null) {
            result=result+line;
        }
        Log.i("zjr",result);
    }
    public static void login(String username,String password) throws Exception{
        /*
         * 使用GET方法请求登录操作
         * url地址后加username和password
         * 如果登录成功会在result中返回JSON格式的code为201
         * message为Token令牌，作其他操作时提交令牌即可获得权限，令牌有时限
         */
        String loginurl=LOGINURL+"?username="+username+"&password="+password;
        Log.i("zjr",loginurl);
        URL url = new URL(loginurl);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setDoOutput(true);
        connection.setDoInput(true);
        connection.setRequestMethod("GET");
        int code=connection.getResponseCode();
        Log.i("zjr",code+":");
        BufferedReader reader=new BufferedReader(new InputStreamReader(connection.getInputStream(),"utf-8"));
        String line,result="";
        while ((line = reader.readLine()) != null) {
            result=result+line;
        }
        Log.i("zjr",result);
    }
}
