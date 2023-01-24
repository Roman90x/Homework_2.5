public enum TypeOfBody {
    SEDAN("Седан"),
    HATCHBACK("Хетчбек"),
    COUPE("Купе"),
    UNIVERSAL("Универсал"),
    SUV("Внедорожник"),
    CROSSOVER("Кроссовер"),
    VAN("Фургон"),
    PICKUP("Пикап"),
    MINIVAN("Минивэн");


    private final String name;

    TypeOfBody(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
