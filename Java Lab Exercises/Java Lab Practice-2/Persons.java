public class Persons {
    public static void main(String[] args) {
        Person person1 = new Person("Sri", 21);
        Person person2 = new Person("yalini", 8);
        System.out.println(person1.getName() + " is " + person1.getAge() + " years old.");
        System.out.println(person2.getName() + " is " + person2.getAge() + " years old.\n");
        person1.setAge(23);
        person2.setName("Yalini");
        person2.setAge(10);
        System.out.println("Set new age and name:");
        System.out.println(person1.getName() + " is now " + person1.getAge() + " years old.");
        System.out.println(person2.getName() + " is now " + person2.getAge() + " years old.");
    }
} 
