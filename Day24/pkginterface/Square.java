package pkginterface;

public class Square implements Shape, Drawable{
    
    private double side;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }
    
    @Override
    public double calculateArea() {
        double result = side * side;
        return result;
    }

    @Override
    public void draw() {
        System.out.println("Hi, i'm drawing a Square");
    }
}
