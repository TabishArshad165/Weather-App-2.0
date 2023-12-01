package com.example.weatherapp20;

public class rv_structure {
    String hour;
    String temp;
    String picPath;

    public rv_structure(String hour, String temp, String picPath) {
        this.hour = hour;
        this.temp = temp;
        this.picPath = picPath;
    }

    public String getHour() {
        return hour;
    }

    public String getTemp() {
        return temp;
    }

    public String getPicPath() {
        return picPath;
    }

}
