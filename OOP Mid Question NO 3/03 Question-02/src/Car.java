public class Car extends Vehicle {
    private String modelName;

    // Invoke parent class constructor;
    Car(String brand, String modelName){
        super(brand);
        this.modelName = modelName;
    }
    // Invoking overriding method;
    @Override
    public void honk(){
        System.out.println("A vehicle horn is a sound-making device.");
        super.honk();
    }

    public static void main(String[] args) {
        Car myCar = new Car("Ford", "Mustang");
        myCar.honk();
        System.out.println(myCar.brand + " " + myCar.modelName);
    }
}