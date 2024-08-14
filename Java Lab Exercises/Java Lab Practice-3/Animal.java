import java.util.Scanner;
public class Animal {
    public void makeSound(String animalType) {
        switch (animalType.toLowerCase()) {
            case "dog":
                System.out.println("The dog barks.");
                break;
            case "cat":
                System.out.println("The cat meows.");
                break;
            case "cow":
                System.out.println("The cow moos.");
                break;
            default:
                System.out.println("The animal makes a sound.");
                break;
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the type of animal: ");
        String animalType = sc.nextLine(); 
        Animal myAnimal = new Animal();
        myAnimal.makeSound(animalType);
        sc.close();
    }
}
