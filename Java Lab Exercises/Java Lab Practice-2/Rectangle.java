public class Rectangle {
private double width;
private double height;
public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
public double getWidth() {
        return width;
    }
public void setWidth(double width) {
        this.width = width;
    }
public double getHeight() {
        return height;
    }
public void setHeight(double height) {
        this.height = height;
    }
    public double getArea() {
        return width * height;
    }
public double getPerimeter() {
        return 2 * (width + height);
    }
public static void main(String[] args) {
        Rectangle re = new Rectangle(5, 11);
System.out.println("Area of Rectangle is " + re.getArea());
System.out.println("Perimeter of Rectangle is " + re.getPerimeter());
        re.setWidth(4);
        re.setHeight(14);
System.out.println("\nArea of Rectangle is now " + re.getArea());
System.out.println("Perimeter of Rectangle is now " + re.getPerimeter());
    }
}
