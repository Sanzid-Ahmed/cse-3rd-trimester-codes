public class Override2 extends Base{
    Override2(int a, double b){
        super(a, b);
    }

    Override2(Base ob){
        super(ob);
    }

    void show(){
        double sum = 0;
        sum = a + getB();
        System.out.println(sum);
    }
}
