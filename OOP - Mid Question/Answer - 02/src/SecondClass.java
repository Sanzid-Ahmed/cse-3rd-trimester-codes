public class SecondClass {
    static int b;
    int y = initY();
    {
        System.out.println("SecondClass : instance block");
    }
    SecondClass(){
        b = 8;
        System.out.println("SecondClass: no - arg ctor");
    }
    SecondClass(int b){
        this.b = b;
        System.out.println("SecondClass: one - arg ctor, b = " + b);
    }
    static void display(){
        System.out.println("SecondClass: display(), b = " + b);
    }
    static{
        b = initB();
        System.out.println("SecondClass: static block");
    }
    static int initB(){
        System.out.println("SecondClass: static var b init");
        return 9;
    }
    int initY(){
        return 7;
    }
}
