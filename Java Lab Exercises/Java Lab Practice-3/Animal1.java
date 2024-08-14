public class Animal1 {
public static class Animal {
public void move() {
System.out.println("The animal moves.");
        }
    }
    public static class Cheetah extends Animal {
        @Override
public void move() {
System.out.println("The cheetah runs swiftly.");
        }
    }
public static void main(String[] args) {
        Animal animal = new Animal();
        animal.move();
        Cheetah cheetah = new Cheetah();
        cheetah.move(); 
    }
}
