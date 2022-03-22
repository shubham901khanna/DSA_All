package DesignPattern.ThreadSafeSingletonExample;

import DesignPattern.SingletonExample;

public class SafeExample {

    private static SafeExample se = null;

    private SafeExample() {
    }

    public static synchronized SafeExample getInstance() {
        if(se == null) {
            synchronized (SafeExample.class) {
                if (se == null) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    se = new SafeExample();
                }
            }
        }
        return se;
    }

    public static void main(String[] args) {
        SafeExample s1 = SafeExample.getInstance();
        SafeExample s2 = SafeExample.getInstance();

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}

