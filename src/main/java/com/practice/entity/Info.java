package com.practice.entity;

public class Info {
    private int id;
    private String destinations;
    private String lastMinuteOne;
    private String getLastMinuteTwo;

    public Info() {
    }

    public Info(int id, String destinations, String lastMinuteOne, String getLastMinuteTwo) {
        this.id = id;
        this.destinations = destinations;
        this.lastMinuteOne = lastMinuteOne;
        this.getLastMinuteTwo = getLastMinuteTwo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDestinations() {
        return destinations;
    }

    public void setDestinations(String destinations) {
        this.destinations = destinations;
    }

    public String getLastMinuteOne() {
        return lastMinuteOne;
    }

    public void setLastMinuteOne(String lastMinuteOne) {
        this.lastMinuteOne = lastMinuteOne;
    }

    public String getGetLastMinuteTwo() {
        return getLastMinuteTwo;
    }

    public void setGetLastMinuteTwo(String getLastMinuteTwo) {
        this.getLastMinuteTwo = getLastMinuteTwo;
    }
}
