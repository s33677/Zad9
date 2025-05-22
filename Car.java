class Car implements Comparable<Car> {
    private String model;
    private int year;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public String toString() {
        return model + " (" + year + ")";
    }

    @Override
    public int compareTo(Car other) {
        return Integer.compare(this.year, other.year);
    }
}
