public class Dog {
private String name;
private String breed;
    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
    public static void main(String[] args) {
        Dog obj1 = new Dog("Alex", "Rosy");
        Dog obj2 = new Dog("Champ", "Bibu");
        System.out.println(obj1.getName() + " is a " + obj1.getBreed() + ".");
        System.out.println(obj2.getName() + " is a " + obj2.getBreed() + ".");
        System.out.println("\nSet the new Breed of obj1 and new name of obj2:\n");
        obj1.setBreed("Chimni");
        obj2.setName("Candy");
        System.out.println(obj1.getName() + " is now a " + obj1.getBreed() + ".");
        System.out.println(obj2.getName() + " is now a " + obj2.getBreed() + ".");
    }
}
