package com.zt.subject;

import com.zt.observer.Observer;

/**
 * 主题
 */
public interface Subject {

    /**
     * 注册订阅
     */
    public void registerObserver(Observer observer);

    /**
     * 取消订阅
     * @param observer
     */
    public void removeObserver(Observer observer);


    /**
     * 通知所有观察者
     */
    public void notifyObservers();

}
