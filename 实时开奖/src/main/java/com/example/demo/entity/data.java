package com.example.demo.entity;


public class data {
    String time;
    long timestamp;
    long number;
    String data;
    String preNumColor;
    String preNumSx;

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

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getPreNumColor() {
        return preNumColor;
    }

    public void setPreNumColor(String preNumColor) {
        this.preNumColor = preNumColor;
    }

    public String getPreNumSx() {
        return preNumSx;
    }

    public void setPreNumSx(String preNumSx) {
        this.preNumSx = preNumSx;
    }

    @Override
    public String toString() {
        return "data{" +
                "time=" + time +
                ", timestamp=" + timestamp +
                ", number=" + number +
                ", data='" + data + '\'' +
                ", preNumColor='" + preNumColor + '\'' +
                ", preNumSx='" + preNumSx + '\'' +
                '}';
    }
}
