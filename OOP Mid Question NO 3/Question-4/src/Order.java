class PizzaShop {
    private int pizza_price=320;
    private int drink_price=40;
    private int fries_price=100;

    PizzaShop(){
        System.out.println("Welcome to pizza shop");
    }
    public void order(int pizza, int drink){
        System.out.println("You ordered "+ pizza +  " pizzas," + drink + " 4 drinks");
        System.out.println("Total bill: " + (pizza_price*pizza + drink_price*drink));
    }
    public void order(int pizza, int drink, int fries){
        System.out.println("You ordered "+ pizza +  " pizzas," + drink + " drinks, " + fries + " fries");
        System.out.println("Total bill: " + (pizza_price*pizza + drink_price*drink + fries_price*fries));
    }
    public void order(int pizza){
        System.out.println("You ordered "+ pizza +  " pizzas");
        System.out.println("Total bill: " + pizza_price*pizza);
    }
}
class Order{
    public static void main(String[] args) {
        PizzaShop p=new PizzaShop();
        p.order(2,4);
        p.order(1,2,1);
        p.order(3);
    }
}