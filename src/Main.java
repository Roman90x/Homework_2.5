
public abstract class Main {
    public static void main(String[] args) {
        System.out.println("");

        Car audi = new Car("AUDI", "A8 50 L TDI quattro", 3.0, TypeOfBody.SEDAN);
        Car bmw = new Car("BMW", "Z8", 3.0, TypeOfBody.COUPE);
        Car kia = new Car("Kia", "Sportage 4", 2.4, TypeOfBody.CROSSOVER);
        Car hyundai = new Car("Hyundai", "Avante", 1.6, TypeOfBody.SEDAN);

        Truck scania = new Truck("Scania", "R520", 16, CarryingCapacity.N1);
        Truck volvo = new Truck("Volvo", "FM13", 13, CarryingCapacity.N2);
        Truck man = new Truck("Man", "TGS 41.440", 12, CarryingCapacity.N3);
        Truck renault = new Truck("Renault", "K 520", 13, CarryingCapacity.N2);

        Bus liaz = new Bus("ЛиАЗ", "5292", 4.4, Capacity.LARGE);
        Bus yutong = new Bus("Yutong", "ZK6128HC", 9.7, Capacity.EXTRA_LARGE);
        Bus higer = new Bus("Higer", "KLQ6128LQ", 9.5, Capacity.MEDIUM);
        Bus mersedes = new Bus("Mercedes-Benz", "Sprinter", 2.2, Capacity.SMALL);

        printInfo(audi);
        printInfo(man);
        printInfo(mersedes);
    }

    private static void printInfo(Transport transport) {
        System.out.println(transport.getBrand() + transport.getModel());
        transport.printType();

    }

}