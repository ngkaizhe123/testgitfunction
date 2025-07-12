public abstract class GeometricObject{
    protected String color;
    
    protected GeometricObject(){
        this(null);
    }
    
    protected GeometricObject(String color){
        this.color = color;
    }
    
    public String getColor(){
        return color;
    }
    
    public void setColor(String color){
        this.color = color;
    }
    
    public String toString(){
        return "Color: " + color;
    }
    
    abstract double findArea();
}