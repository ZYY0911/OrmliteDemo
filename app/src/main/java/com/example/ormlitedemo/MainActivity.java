package com.example.ormlitedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.ormlitedemo.bean.People;
import com.j256.ormlite.dao.Dao;

import java.sql.SQLException;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyHelper helper = new MyHelper(this);
        try {
            Dao<People, Integer> dao = helper.getDao(People.class);
            /**查询*/
            List<People> people = dao.queryForAll();
            Log.i("111", "onCreate: " + people.size());
            for (int i = 0; i < people.size(); i++) {
                Log.i("111", "onCreate: " + people.get(i).toString());
            }
            /**增加*/
            dao.create(new People(System.currentTimeMillis(), "zfdasfas"));
            /**删除*/
            dao.deleteById(1);
            List<People> people2 = dao.queryForAll();
            Log.i("111", "onCreate: " + people2.size());
            for (int i = 0; i < people2.size(); i++) {
                Log.i("111", "onCreate: " + people2.get(i).toString());
            }
            /**修改  先查 在改值 再存数据库*/
            People people1 = dao.queryForId(1);
            people1.setName("张三");
            dao.update(people1);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}