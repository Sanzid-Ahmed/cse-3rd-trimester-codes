class Vehicle {
    protected String brand;
    protected int serial;
    public Vehicle(String brand) {
        this.brand = brand;
    }
    public Vehicle(int serial) {
        this.serial = serial;
    }
    public Vehicle(String brand, int serial){
        this(brand);
        this.serial = serial;
    }
    public boolean honk() {
        System.out.println("Tuut, tuut!");
        return true;
    }
}