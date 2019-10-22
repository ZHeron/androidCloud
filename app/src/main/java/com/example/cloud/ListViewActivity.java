package com.example.cloud;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class ListViewActivity extends AppCompatActivity {
    private ListView lv;
    private List<User> users;
    private UserAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);
        lv = findViewById(R.id.lv);
        //列表数据
        List<String> data = new ArrayList<>();
        data.add("zhangsan");
        data.add("liis");
        data.add("zhangsan");
        data.add("liis");
        data.add("zhangsan");
        data.add("liis");
        data.add("zhangsan");
        data.add("liis");
        data.add("zhangsan");
        data.add("liis");
        data.add("zhangsan");
        data.add("liis");
        data.add("zhangsan");
        data.add("liis");
        data.add("zhangsan");
        data.add("liis");
//        data.add("zhangsan");
//        data.add("liis");
//        //系统自带listview样例
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, data);
        //自写listview样例
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.list_view_sample, data);
        //列表数据
        users = new ArrayList<>();
        for(int i=0;i<100;i++){
            User u=new User();
            u.setUname("张三"+i+"");
            u.setAge(i);
            users.add(u);
        }
        adapter=new UserAdapter(this,R.layout.user_list,users);
        lv.setAdapter(adapter);
    }
    public void delete(View v){
        users.remove(0);
        adapter.notifyDataSetChanged();
    }
}
