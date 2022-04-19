package com.bridge.bird;



abstract public class Bird {
        String id;
        String name;
        String color;

        abstract void incCount();//increment
        abstract int getCount();//toGetCount


    @Override
    public String toString() {
        return "Bird{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}


