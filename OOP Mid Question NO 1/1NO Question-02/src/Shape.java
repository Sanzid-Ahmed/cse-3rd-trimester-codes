public class Shape {
    int width;
    int height;
    int length;

    public Shape(){
        width = 10;
        height = 10;
        length = 10;
    }

    public Shape(int width, int height){
        this.width = width;
        this.height = height;
        length = 0;
    }

    public Shape(int width, int height, int length){
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public Shape(Shape shape0){
        this.width = shape0.width;
        this.height = shape0.height;
        this.length = shape0.length;
    }

}
