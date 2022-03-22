package DesignPattern.Factory;

public class FactoryComputer {
    private FactoryComputer() {

    }

    public static Computer getComputer(ComputerType computerType, String ram, String cpu, boolean isGraphicsEnabled) {

        switch (computerType) {
            case PC:
                return new PC(ram, cpu, isGraphicsEnabled);

            case Server:
            return  new Server(ram,cpu,isGraphicsEnabled);

            case Laptop:

            return new Laptop(ram,cpu,isGraphicsEnabled);

            default:
                throw new RuntimeException("Invalid Exception");
        }
    }


}
