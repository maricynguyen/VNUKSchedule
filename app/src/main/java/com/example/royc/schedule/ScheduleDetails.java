package com.example.royc.schedule;

import java.util.Date;

/**
 * Created by dande on 10/29/2017.
 */

public class ScheduleDetails {
    private int id;
    private String room;
    private String lecturers;
    Date date = new Date();
    Date time = new Date();


    public ScheduleDetails() {
        this.id = id;
        this.room = room;
        this.lecturers = lecturers;
        this.date = date;
        this.time = time;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getLecturers() {
        return lecturers;
    }

    public void setLecturers(String lecturers) {
        this.lecturers = lecturers;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
