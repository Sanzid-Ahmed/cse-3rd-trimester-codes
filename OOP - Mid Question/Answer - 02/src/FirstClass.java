public class FirstClass {
    int a = initA();
    static int x = 10;
    FirstClass(){
        this(SecondClass.b);
        System.out.println("FirstClass : no-arg ctor");
    }
    FirstClass(int a){
        System.out.println("FirstClass : one - arg ctor, a = " + a);
    }
    static{
        System.out.println("FirstClass : static block");
    }

    public static void main(String[] args){
        System.out.println("MAIN : start");
        FirstClass f1 = new FirstClass();
        FirstClass f2 = new FirstClass(SecondClass.b);
        f1.display();
        SecondClass.display();
        SecondClass s = new SecondClass();
        s.display();
        System.out.println("MAIN: end");
    }
    final void display(){
        System.out.println("FirstClass : display() , a = " + a + ", x = " + x);
    }
    static{
        System.out.println("FirstClass : static bloc again");
    }
    int initA(){
        return 2;
    }
}
