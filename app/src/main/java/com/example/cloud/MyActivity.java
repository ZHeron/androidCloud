package com.example.cloud;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.io.Serializable;

public class MyActivity extends AppCompatActivity implements View.OnClickListener, SeekBar.OnSeekBarChangeListener {
//    private String username;
//    private String TAG="MyActivity";
//    private Button loginBtn;
//    private Button registerBtn;

    //改变图片
    private Button changeBtn;
    private SeekBar seekBar;
    private ImageView imView;
    private int[] images;

    //列表

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.image_view);
//        loginBtn=findViewById(R.id.login);
//        registerBtn=findViewById(R.id.register);
//        loginBtn.setOnClickListener(this);

        //改变图片
        changeBtn=findViewById(R.id.changeBtn);
        seekBar=findViewById(R.id.seekBar);
        imView=findViewById(R.id.imView);
        changeBtn.setOnClickListener(this);
        seekBar.setOnSeekBarChangeListener(this);
        images=new int[]{R.drawable.a,R.drawable.b,R.drawable.c};

    }

    public void test(View view){
//        Toast.makeText(this, "点击按钮！", Toast.LENGTH_SHORT).show();
        Intent intent =new Intent();
        User user=new User();
        user.setUname("lisi");
        user.setAge(15);
        intent.putExtra("uname","lisi");
        intent.putExtra("age","15");
        //传对象
        intent.putExtra("user",(Serializable)user);
        //跳转
//        intent.setClass(MyActivity.this,MainActivity.class);
        intent.setAction("android.intent.action.main");
        intent.addCategory("android.intent.category.DEFAULT");
        startActivity(intent);
    }

    private void chageImage(){
        int m=(int)(Math.random()*3);
        imView.setImageResource(images[m]);
    }
    @Override
    public void onClick(View v) {
//        int m=0;
//        m++;
//        Log.i(TAG,"中国人！");
        switch(v.getId()){
            case R.id.changeBtn:
                chageImage();
                break;

        }

    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        switch (seekBar.getId()){
            case R.id.seekBar:
                if(progress==3){
                    chageImage();
                }else{
                    imView.setImageResource(images[progress]);
                }

        }
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}
