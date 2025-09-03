public class Override extends Base{
    int c;
    public Override (int a, double b, int c){
        super(a, b);
        this.c = c;
    }

    void show(){
        double sum = 0;
        sum = a + getB() + c;
        System.out.println("Sum = " + sum);
    }
}
