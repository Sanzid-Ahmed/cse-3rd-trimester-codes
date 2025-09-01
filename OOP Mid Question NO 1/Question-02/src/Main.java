public class Main {
    public static void main(String[] args) {
        // set default value 10 to width, height and length
        Shape shape1 = new Shape();
        //set width = 5, height = 10, length = 0
        Shape shape2 = new Shape(5, 10);
        //set width = 3, height = 6, length = 9
        Shape shape3 = new Shape(3, 6, 9);
        // set width, height and length to shape3’s width, height and length respectively.
        Shape shape4 = new Shape(shape3);
    }
}