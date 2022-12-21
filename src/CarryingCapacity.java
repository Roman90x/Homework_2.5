public enum CarryingCapacity {

    N1(0d,3.5),
    N2(3.5,12d),
    N3(12d, null);

    private final Double from;
    private final Double to;

    CarryingCapacity(Double from, Double to) {
        this.from = from;
        this.to = to;
    }

    public Double getFrom() {
        return from;
    }

    public Double getTo() {
        return to;
    }
}
