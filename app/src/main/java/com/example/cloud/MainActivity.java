package com.example.cloud;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
//        TextView tv=findViewById(R.id.myText);
//
//        Intent intent= getIntent();
//        User user=(User) intent.getSerializableExtra("user");
//        tv.setText("名字："+user.getUname());
    }
}
