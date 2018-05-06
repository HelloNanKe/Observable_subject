package com.zt.observer;

/**
 * 观察者
 */
public interface Observer {

    /**
     *
     * @param temp 温度
     * @param humidity 湿度
     * @param pressure 气压
     */
    public void update(float temp,float humidity,float pressure);

}
