public class Main {
    static{
        System.out.println("A");
    }
    {
        System.out.println("B");
    }

    public static void main(String[] args) {
        Child child = new Child();
    }
    static {
        System.out.println("C");
    }
}
