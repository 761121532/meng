package com.example.demo.entity;

public class code {
    int code;
    wflhc wflhc;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public com.example.demo.entity.wflhc getWflhc() {
        return wflhc;
    }

    public void setWflhc(com.example.demo.entity.wflhc wflhc) {
        this.wflhc = wflhc;
    }

    @Override
    public String toString() {
        return "code{" +
                "code=" + code +
                ", wflhc=" + wflhc +
                '}';
    }
}
