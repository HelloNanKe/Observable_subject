package com.zt.observer.impl;

import com.zt.display.DisplayElement;
import com.zt.observer.Observer;
import com.zt.subject.Subject;

public class CurrentConditionDisplay implements Observer, DisplayElement {

    private float tmp;
    private float humidity;
    private float pressure;
    private Subject weatherData;

    public CurrentConditionDisplay(Subject wetherData) {
        this.weatherData = wetherData;
        wetherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("CurrentConditionDisplay+display");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        System.out.println("调用CurrentConditionDisplay的updata:" + temp + ":" + humidity + ":" + pressure);
        this.tmp=temp;
        this.humidity=humidity;
        this.pressure=pressure;
        display();
    }


}
