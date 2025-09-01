class MainBurger {
    public static void main(String[] args) {
        Burger beefBurger = new BeefBurger ("Double Decker", "Large","Spicy", 400);
        beefBurger.prepare();
        Burger veggieBurger = new VeggieBurger ("Mushroom Delight", "Small", "Sweet",
                300);
        veggieBurger.prepare();
    }
}