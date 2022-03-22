package DesignPattern.Factory;

public class ClientTest {
    public static void main(String[] args) {
        Computer pc = FactoryComputer.getComputer(ComputerType.PC, "16 GB", "4", true);
        System.out.println("PC Config :" + pc);
        Computer server = FactoryComputer.getComputer(ComputerType.Server,"20 gb","12",true);
        System.out.println("Server Config: " + server);

    }
}


