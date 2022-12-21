public class Car extends Transport{

    private TypeOfBody typeOfBody;
    public Car(String brand, String model, double engineVolume,TypeOfBody typeOfBody) {
        super(brand, model, engineVolume);
        this.typeOfBody = typeOfBody;
    }

    public TypeOfBody getTypeOfBody() {
        return typeOfBody;
    }

    public void setTypeOfBody(TypeOfBody typeOfBody) {
        this.typeOfBody = typeOfBody;
    }

    @Override
    public void printType() {
        if (typeOfBody == null) {
            System.out.println("Данных по авто не достаточно");
        } else {
            System.out.println("Тип кузова "+ getTypeOfBody());
        }
    }
}
