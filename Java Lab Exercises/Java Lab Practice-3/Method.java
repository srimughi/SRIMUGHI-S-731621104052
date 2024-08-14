import java.util.*;
class Vehicle {
     void drive() {
        System.out.println("She is driving a Car");
    }
 }
class Car extends Vehicle {
      void moves() {
         System.out.println("Repairing a car");
   }
}
public class Method{
       public static void main(String[] args){
          Car car = new Car();
          car.drive();
          car.moves();
      }
   }
