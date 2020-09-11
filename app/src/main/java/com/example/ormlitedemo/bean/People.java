package com.example.ormlitedemo.bean;

import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * @Login Name win10
 * @Create by 张瀛煜 on 2020/9/11 at 17:13
 */
@DatabaseTable(tableName = "people")
public class People {
    @DatabaseField(generatedId = true)
    private int id;
    @DatabaseField(columnName = "time")
    private long time;
    @DatabaseField(columnName = "name")
    private String name ;

    @Override
    public String toString() {
        return "People{" +
                "id=" + id +
                ", time=" + time +
                ", name='" + name + '\'' +
                '}';
    }

    public People() {
    }

    public People(long time, String name) {
        this.time = time;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
