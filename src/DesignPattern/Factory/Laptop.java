package DesignPattern.Factory;

public class Laptop implements Computer{
    private String ram;
    private String cpu;
    private boolean isGraphicsEnabled;

    public Laptop(String ram, String cpu, boolean isGraphicsEnabled) {
        this.ram = ram;
        this.cpu = cpu;
        this.isGraphicsEnabled = isGraphicsEnabled;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "ram='" + ram + '\'' +
                ", cpu='" + cpu + '\'' +
                ", isGraphicsEnabled=" + isGraphicsEnabled +
                '}';
    }

    @Override
    public String ram() {
        return this.ram;
    }

    @Override
    public String cpu() {
        return this.cpu;
    }

    @Override
    public boolean isGraphicsEnabled() {
        return this.isGraphicsEnabled;
    }
}
