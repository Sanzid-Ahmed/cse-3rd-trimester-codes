public class Car extends Vehicle {
    private String modelName;
    // Invoke parent class constructor;
    Car(String brand, int serial, String modelName){
        super(brand, serial);
        this.modelName = modelName;
    }
    // Invoking overriding method;
    public boolean honk() {
        System.out.println("A vehicle horn is a sound-making device.");
        super.honk();
        return true;
    }
    public static void main(String[] args) {
        Car car1= new Car("Honda", 20245 , "Integra");
        car1.honk();
        System.out.println(car1.brand + " " +car1.modelName);
    }
}
