package DesignPattern.ThreadSafeSingletonExample;

public class MyThread implements Runnable{
    public void run() {

        SafeExample se = SafeExample.getInstance();

        System.out.println(Thread.currentThread().getName() + se.hashCode());

    }
}
