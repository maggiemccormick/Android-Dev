package com.mccormick.tapcounter;

public class Counter {

    // DATA MEMBERS
    private Integer mCount;

    // CONSTRUCTOR
    public Counter(){
        mCount = 0;
    }

    // SETTER AND GETTER
    public void addCount(){
        mCount++;
    }
    public Integer getCount(){
        return mCount;
    }
}
