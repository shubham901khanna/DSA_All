package DesignPattern;

public class SingletonExample {
    // Eager Initilization

    private static final SingletonExample se = new SingletonExample();

    private SingletonExample(){
    }

    public   static SingletonExample getInstance() {
        return se;
    }

    // static block initilization
   /* static {
        if(se == null) {
            se = new SingletonExample();
        }

    }*/

    // Lazy Initilization

    public static void main(String[] args) {
        SingletonExample s1 = SingletonExample.getInstance();
        SingletonExample s2 = SingletonExample.getInstance();

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}
