public class Smartphone extends ElectronicDevice{
    String model;
    String operatingSystem;
    private String IMEI;

    Smartphone(String brand, double price, String model, String operatingSystem, String IMEI){
        super(brand, price);
        this.model = model;
        this.operatingSystem = operatingSystem;
        this.IMEI = IMEI;
    }

    @Override
    public void displayInfo(){
        //if I do not give public then it is giving Error!!
        /*
        1. You cannot reduce the visibility of an overridden method.
            =>  Parent method is public → Child method must be public.
            =>  Parent method is protected → Child method can be protected or public, not default or private.

        2. Reason: Java wants to guarantee that anywhere the parent method is accessible, the overridden method in the child is at least equally accessible
        */
        super.displayInfo();
        System.out.println("Model: " + model);
        System.out.println("Operating system" + operatingSystem);
    }

    String getIMEI(){
        return IMEI;
    }
}
