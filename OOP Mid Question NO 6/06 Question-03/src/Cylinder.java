public class Cylinder extends Myobject{
    private double h;

    public double findVolume(){
        return Math.PI * (getR() * getR()) * h;
    }

    double getH(){
        return h;
    }

    public Cylinder(double r, double h){
        super(r);
        this.h = h;
    }
}
