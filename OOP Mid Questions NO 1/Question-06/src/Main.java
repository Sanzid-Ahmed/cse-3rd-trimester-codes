public class Main {
    public static void main(String[]
                                    args) {
        Box b1= new Box();
        b1.width=1;
        b1.height=2;
        b1.depth=3;
        Box b2 = b1;
        b1=null;
        b2.print();
    }
}