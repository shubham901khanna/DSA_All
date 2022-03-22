package DesignPattern.Factory;



public class PC  implements Computer{

    private String ram;
    private String cpu;

    public PC(String ram, String cpu, boolean isGraphicsEnabled) {
        this.ram = ram;
        this.cpu = cpu;
        this.isGraphicsEnabled = isGraphicsEnabled;
    }

    private boolean isGraphicsEnabled;

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

    @Override
    public String toString() {
        return "PC{" +
                "ram='" + ram + '\'' +
                ", cpu='" + cpu + '\'' +
                ", isGraphicsEnabled=" + isGraphicsEnabled +
                '}';
    }
}
