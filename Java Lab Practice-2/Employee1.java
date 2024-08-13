import java.util.Scanner;
class Employee {
    private String name;
    private String jobTitle;
    private double salary;
    public Employee(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }
public String getName() {
        return name;
    }
public void setName(String name) {
        this.name = name;
    }
public String getJobTitle() {
        return jobTitle;
    }
public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
public double getSalary() {
        return salary;
    }
public void setSalary(double salary) {
        this.salary = salary;
    }
public void applyRaise(double percentage) {
        if (percentage > 0) {
            salary += salary * (percentage / 100);
        } else {
            System.out.println("Raise percentage must be positive.");
        }
    }
public String toString() {
    return "Name: " + name + "\n" +
           "Job Title: " + jobTitle + "\n" +
           "Salary: $" + salary;
}
}
public class Employee1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter employee name: ");
        String name = sc.nextLine();
        System.out.print("Enter job title: ");
        String jobTitle = sc.nextLine();
        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();
        sc.nextLine(); 
        Employee employee = new Employee(name, jobTitle, salary);
        System.out.println("\nEmployee Details:");
        System.out.println(employee);
        System.out.print("\nEnter raise percentage: ");
        double raisePercentage = sc.nextDouble();
employee.applyRaise(raisePercentage);
        System.out.println("\nUpdated Employee Details:");
        System.out.println(employee);
        sc.close();
    }
}
