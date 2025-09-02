public class Cone extends Cylinder{
    public double findVolume(){
        return 1/3 * (Math.PI * (getR() * getR()) * getH());
    }

    public Cone(double r, double h){
        super(r, h);
    }
}
