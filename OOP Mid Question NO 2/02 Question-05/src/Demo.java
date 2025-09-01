public class Demo {
    public static void main(String[] args){
        Figure[] f = new Figure[3];

        f[0] = new Square();
        f[1] = new Oval();
        f[2] = new Polygon();

        for(Figure t: f){
            t.render();
        }
    }
}
