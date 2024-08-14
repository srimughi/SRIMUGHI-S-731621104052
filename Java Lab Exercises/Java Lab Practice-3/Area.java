import java.util.*;
class Shape {
     void print() {
        System.out.println("Area of the Rectangle");
    }
    Shape(int a, int b){
       System.out.println("Rectangle :" + (a*b));
    }
 }
class Rectangle extends Shape {
      Rectangle(){
      super(5,10);
      }
      void calculate() {
         System.out.println("Calculated");
   }
}
public class Area{
       public static void main(String[] args){
          Rectangle rect = new Rectangle();
          rect.calculate();
          rect.print();
      }
   }
