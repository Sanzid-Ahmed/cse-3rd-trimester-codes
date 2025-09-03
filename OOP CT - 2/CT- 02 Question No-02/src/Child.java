public class Child extends Main{
    static{
        System.out.println("D");
    }
    Child(){
        System.out.println("F");
    }
    {
        System.out.println("E");
    }
}
