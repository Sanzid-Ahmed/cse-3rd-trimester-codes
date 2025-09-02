public class MyTest {
    public static void main(String[] args){
        FoodItem fish = new Fish("small");
        FoodItem vege = new Vegetable("Cauliflower");

        ((Fish)fish).setparameter();
        System.out.println(((Fish)fish).getprice(3));

        ((Vegetable)vege).setparameter();
        System.out.println(((Vegetable)vege).getprice(2));
    }
}
