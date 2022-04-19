package com.bridge.bird;

public class Duck extends Bird {

     int count=0;

    public  Duck() {
        this.id = "3";
        this.name = "Duck";
        this.color = "White";
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
