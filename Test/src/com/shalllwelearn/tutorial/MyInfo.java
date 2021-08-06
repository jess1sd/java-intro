package com.shalllwelearn.tutorial;
public class MyInfo {
    
    private int myLuckyNumber = 10;
    private String myName;

    public MyInfo() {

    }

    public MyInfo(int luckyNumber, String myName) {
        this.myLuckyNumber = luckyNumber;
        this.myName = myName;
    }

    //access methods
    public int getMyLuckyNumber() {
        return myLuckyNumber;
    }
    public String getMyName() {
        return myName;
    }

}