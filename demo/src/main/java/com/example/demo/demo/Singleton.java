package com.example.demo.demo;

public class Singleton {
    //synchronized修饰static,类加锁synchronized(类.class)
    //对象加锁
    private volatile static Singleton uniqueInstance;
    private Singleton() {
    }
    public static Singleton getUniqueInstance() {
        //先判断对象是否已经实例过，没有实例化过才进入加锁代码
        if (uniqueInstance == null) {
            //类对象加锁
            synchronized (Singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }

    //单例模式之饿汉模式
    private static Singleton singleton = new Singleton();
    //将构造方法改为private Singleton(){}
    public static Singleton getInstance(){
        return singleton;
    }
    //单例模式之懒汉模式
    private static Singleton singletonl = null;
    //将构造方法改为private Singleton()
    public static Singleton getSingletonl(){
        if(singletonl == null){
            singletonl = new Singleton();
        }
        return singletonl;
    }

}
