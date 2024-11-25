package pkginterface;

public class Circle implements Shape, Drawable, Rotatable{
    
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double calculateArea() {
        double pi = 3.14;
        double result = pi * radius * radius;
        return result;
    }

    @Override
    public void draw() {
        System.out.println("Hi, i'm drawing a circle");
    }

    @Override
    public void rotate() {
        System.out.println("Hi, i'm rotating a circle");
    }
}
