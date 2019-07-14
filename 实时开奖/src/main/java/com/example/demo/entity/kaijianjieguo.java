package com.example.demo.entity;

public class kaijianjieguo {
    boolean lastSuccess; //本次开奖结果  对或不对

    String anilam;//本次开奖的生肖

    String textForinput;//本次写入的值

    public boolean isLastSuccess() {
        return lastSuccess;
    }

    public void setLastSuccess(boolean lastSuccess) {
        this.lastSuccess = lastSuccess;
    }

    public String getAnilam() {
        return anilam;
    }

    public void setAnilam(String anilam) {
        this.anilam = anilam;
    }

    public String getTextForinput() {
        return textForinput;
    }

    public void setTextForinput(String textForinput) {
        this.textForinput = textForinput;
    }
}
