public class Logarithm {
    int b;
    double x;

    Logarithm(int b, double x){
        this.b = b;
        this.x = x;
    }

    Logarithm(Logarithm log1){
        this.b = log1.b;
        this.x = log1.x;
    }

    Logarithm(){}

    double myfunc(){
        return Math.log(x) / Math.log(b);
    }
}
