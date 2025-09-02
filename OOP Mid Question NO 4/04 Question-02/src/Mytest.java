class Myparent {
    private int p;

//    Mark place.
    Myparent(int k){
        this.p = k;
    }
//     Mark place.
    Myparent(){}

    public final int myfunction(){
        return p*p;
    }
    public void set_p(int Q){p = Q;}
    // Write your code here
    public int getP(){
        return p;
    }
}
class Mychild extends Myparent{
//    Mark place
    public Mychild(int K){ super(K); }
//      Mark place
    public Mychild(){}
//    public final int myfunction(){
//        return p*p+1;
//    }
    // write your code of myroot() that finds the square
    //   root of p in class Myparent
    public double myroot(){
        return Math.sqrt(getP());
    }
    // write other necessary codes here
}

public class Mytest {
    public static void main(String[] args) {
        Myparent c1, c2;
        c1 = new Mychild(2);
        c2 = new Mychild();
        c2.set_p(2);
        int x = c2. myfunction ();
        double y = ((Mychild) c1).myroot(); // find square root of p in class Myparent
        System.out.println("x = " + x + ", y = " + y);
    }
}