public class BeefBurger extends Burger{
    String flavor;
    int price;

    public BeefBurger(String name, String size, String flavor, int price){
        super(name, size);
        this.flavor = flavor;
        this.price = price;
    }

    @Override
    public void prepare() {
        super.prepare();
        System.out.println("Flavor: " + flavor + "\nPrice: " + price);
    }
}
