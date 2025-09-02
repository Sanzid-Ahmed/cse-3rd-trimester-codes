import javax.swing.plaf.basic.BasicTreeUI;

public class Main {
    public static void main(String[] args){
        double sum;
        Sphere sphere1 = new Sphere(2.5);
        Cone cone1 = new Cone(1.9, 8.9);
        Cylinder cylinder1 = new Cylinder(1.5, 6.5);
        Cone cone2 = new Cone(2.7, 5.7);
        Sphere sphere2 = new Sphere(3.5);

        sum = sphere1.findVolume() + cone1.findVolume() + cylinder1.findVolume() + cone2.findVolume() + sphere2.findVolume();
        
    }
}
