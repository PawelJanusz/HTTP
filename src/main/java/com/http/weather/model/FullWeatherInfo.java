package com.http.weather.model;

public class FullWeatherInfo {

    private MainWeatherInfo main;
    private int visibility;
    private Wind wind;

    public MainWeatherInfo getMain() {
        return main;
    }

    public Wind getWind() {
        return wind;
    }

    public void setMain(MainWeatherInfo main) {
        this.main = main;
    }

    @Override
    public String toString() {
        return "FullWeatherInfo{" +
                "main=" + main +
                '}';
    }
}
