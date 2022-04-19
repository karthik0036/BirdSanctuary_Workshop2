package com.bridge.bird;

public class Parrot extends Bird {

    int count=0;

    public  Parrot() {
        this.id = "2";
        this.name = "Parrot";
        this.color = "green";
    }

    @Override
    void incCount() {
        count++;
    }

    @Override
    public int getCount() {
        return count;
    }
}
