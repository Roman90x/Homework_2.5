public class Truck extends Transport {

    private CarryingCapacity carryingCapacity;
    public Truck(String brand, String model, double engineVolume,CarryingCapacity carryingCapacity) {
        super(brand, model, engineVolume);
        this.carryingCapacity = carryingCapacity;
    }

    public CarryingCapacity getCarryingCapacity() {
        return carryingCapacity;
    }

    public void setCarryingCapacity(CarryingCapacity carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }

    @Override
    public void printType() {
        if (carryingCapacity == null) {
            System.out.println("Данных по авто не достаточно");
        } else {
            System.out.println(carryingCapacity);
        }
    }

}

