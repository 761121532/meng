package com.example.demo.entity;

import java.util.Date;

public class next {
    String time;
    long timestamp;
    long number;
    int remain;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public int getRemain() {
        return remain;
    }

    public void setRemain(int remain) {
        this.remain = remain;
    }

    @Override
    public String toString() {
        return "next{" +
                "time=" + time +
                ", timestamp=" + timestamp +
                ", number=" + number +
                ", remain=" + remain +
                '}';
    }
}
