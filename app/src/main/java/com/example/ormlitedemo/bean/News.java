package com.example.ormlitedemo.bean;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * @Login Name win10
 * @Create by 张瀛煜 on 2020/9/11 at 17:51
 */
@DatabaseTable(tableName = "news")
public class News {
    @DatabaseField(generatedId = true)
    private int id;
    @DatabaseField(columnName = "name")
    private String name;
    @DatabaseField(columnName = "week")
    private int week;
    @DatabaseField(columnName = "msg")
    private String mag;

    public News() {
    }

    public News( String name, int week, String mag) {
        this.name = name;
        this.week = week;
        this.mag = mag;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeek() {
        return week;
    }

    public void setWeek(int week) {
        this.week = week;
    }

    public String getMag() {
        return mag;
    }

    public void setMag(String mag) {
        this.mag = mag;
    }
}
