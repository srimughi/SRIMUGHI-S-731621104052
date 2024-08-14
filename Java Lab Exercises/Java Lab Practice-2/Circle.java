import java.util.Scanner;
public class Circle {
 private double radius;
public Circle(double radius) {
        this.radius = radius;
    }
 public double getRadius() {
        return radius;
    }
public void setRadius(double radius) {
        this.radius = radius;
    }
public double getArea() {
        return Math.PI * radius * radius;
    }
public double getCircumference() {
        return 2 * Math.PI * radius;
    }
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter the radius of the circle: ");
double radius = sc.nextDouble();
Circle myCircle = new Circle(radius);
System.out.println("Area of the circle is " + myCircle.getArea());
System.out.println("Circumference of the circle is " + myCircle.getCircumference());
System.out.print("Enter a new radius for the circle: ");
radius = sc.nextDouble();
myCircle.setRadius(radius);
System.out.println("\nArea of the circle with new radius is " + myCircle.getArea());
System.out.println("Circumference of the circle with new radius is " + myCircle.getCircumference());
sc.close();
    }
}
