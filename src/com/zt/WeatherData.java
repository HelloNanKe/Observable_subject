package com.zt;

import com.zt.observer.Observer;
import com.zt.subject.Subject;

import java.util.ArrayList;
import java.util.List;

/**
 * 主题，数据来源
 */
public class WeatherData implements Subject {

    /**
     * 订阅者
     */
    private List<Observer> observers;

    /**
     * 温度
     */
    private float temp;

    /**
     * 湿度
     */
    private float humidity;

    /**
     * 气压
     */
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int pointIndex = observers.indexOf(observer);
        if (pointIndex > 0) {
            observers.remove(pointIndex);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temp, humidity, pressure);
        }
    }

    public void meareChanged() {
        notifyObservers();
    }

    public void setData(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        meareChanged();
    }
}
