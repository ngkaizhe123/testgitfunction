public class Main
{
  public static void main(String[] args) {
    GeometricObject circle = new Circle("Blue", 2.3);
    GeometricObject cone = new Cone("Yellow", 3.4, 6.0);

    print(circle);
    print(cone);
  }

  private static void print(GeometricObject obj) {
        System.out.println(obj.toString() + "\nThe area is " + obj.findArea() + "\n");  
  }
}