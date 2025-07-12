public class Cone extends Circle{
    private double slantHeight;
    
    public Cone(){
        this("", 0.0, 0.0);
    }
    
    public Cone(String color, double radius, double slantHeight){
        super(color, radius);
        this.slantHeight = slantHeight;
    }
    
    public double getSlantHeight(){
        return slantHeight;
    }
    
    public void setSlantHeight(double slantHeight){
        this.slantHeight = slantHeight;
    }
    
    @Override
    public String toString(){
        return super.toString() +  
        "\nSlant Height: " + this.slantHeight;
    }
    
    @Override
    public double findArea(){
        return (super.findArea()) + (Math.PI*this.getRadius()*this.slantHeight);
    }
}