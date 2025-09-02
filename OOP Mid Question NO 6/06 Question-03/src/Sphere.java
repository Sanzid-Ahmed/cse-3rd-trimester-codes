public class Sphere extends Myobject{
    public double findVolume(){
        return (4/3) * (Math.PI * (getR()* getR() * getR()));
    }

    public Sphere(double r){
        super(r);
    }
}
