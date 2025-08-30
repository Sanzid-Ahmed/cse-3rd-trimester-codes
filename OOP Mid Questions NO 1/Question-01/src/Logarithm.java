public class Logarithm {
//    double b;
    int b;
    double x;

    public Logarithm(int b, double x){
        this.b = b;
        this.x = x;
    }

//===========================================================================================
    public Logarithm(Logarithm log1){
        this.b = log1.b;
        this.x = log1.x;
    }
//Direct pass the object then we can assign value by this.b = passedObjectName.b;
//===========================================================================================
    public Logarithm(){
        this.b = 0;
        this.x = 0;
    }

    public double myfunc(){
        return Math.log(x) / Math.log(b);
    }
}
