package com.bridge.bird;

public class Peacock extends Bird {

    int count=0;

    public  Peacock() {
        this.id = "1";
        this.name = "Peacock";
        this.color = "blue";
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
