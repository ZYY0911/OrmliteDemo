package com.example.ormlitedemo;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.ormlitedemo.bean.News;
import com.example.ormlitedemo.bean.People;
import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

import java.sql.SQLException;

/**
 * @Login Name win10
 * @Create by 张瀛煜 on 2020/9/11 at 17:25
 */
public class MyHelper extends OrmLiteSqliteOpenHelper {
    public MyHelper(Context context) {
        super(context, "de.db", null, 2);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase, ConnectionSource connectionSource) {
        try {
            TableUtils.createTable(connectionSource, People.class);
            TableUtils.createTableIfNotExists(connectionSource, News.class);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, ConnectionSource connectionSource, int i, int i1) {
        try {
            TableUtils.dropTable(connectionSource, People.class, true);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
