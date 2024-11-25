package abstractclass;

public abstract class Shape {
    
    protected double x; 
    protected double y;
    
    protected Shape() {
        
    }

    public Shape(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public abstract double calculateArea();
}
