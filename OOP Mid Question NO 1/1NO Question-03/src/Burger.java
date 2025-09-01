class Burger {
    private String name;
    private String size;
    public Burger(String name, String size) {
        this.name = name;
        this.size = size;
    }
    // always print the base message
    public void prepare() {
        System.out.println("Preparing " + name + " " + size + " burger");
    }
}