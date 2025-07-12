public class Circle extends GeometricObject{
    private double radius;
    
    public Circle(){
        super();
        this.radius = 1.0;
    }
    
    public Circle(String color, double radius){
        super(color);
        this.radius = radius;
    }
    
    public double getRadius(){
        return radius;
    }
    
    public void setRadius(double radius){
        this.radius = radius;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\nRadius: " + this.radius;
    }
    
    @Override
    public double findArea(){
        return Math.PI * radius * radius;
    }
}