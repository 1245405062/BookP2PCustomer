package com.example.zjr.bookp2pcustomer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    ListView listView;
    ArrayAdapter adapter;
    List<String> lists;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lists=new ArrayList<>();
        lists.add("SignUp");
        lists.add("Login");
        lists.add("DeleteUser");
        lists.add("Photo");
        listView= (ListView) findViewById(R.id.list_main);
        adapter=new ArrayAdapter(MainActivity.this,android.R.layout.simple_list_item_1,lists);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent();
                switch (position){
                    case 0:
                        intent.setClass(MainActivity.this,SignupActivity.class);
                        startActivity(intent);
                        break;
                    case 1:
                        intent.setClass(MainActivity.this,LoginActivity.class);
                        startActivity(intent);
                        break;
                    case 2:

                        break;
                    case 3:
                        intent.setClass(MainActivity.this,LoginActivity.class);
                        startActivity(intent);
                        break;
                    default:

                        break;

                }
            }
        });
    }

}
