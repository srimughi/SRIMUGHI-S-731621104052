public class Main {
public static class Employee {
        private double salary;
        public Employee(double salary) {
            this.salary = salary;
        }
        public void work() {
            System.out.println("Present of Employee");
        }
        public double getSalary() {
            return salary;
        }
    }
    public static class HRManager extends Employee {
        public HRManager(double salary) {
            super(salary);
        }
        @Override
        public void work() {
            System.out.println("Presence of HR Manager");
        }
        public void addEmployee() {
            System.out.println("Adding employee");
        }
    }
    public static void main(String[] args) {
        Employee emp = new Employee(40000);
        HRManager mgr = new HRManager(70000);
        emp.work();
        System.out.println("Employee salary: " + emp.getSalary());
        mgr.work();
        System.out.println("Manager salary: " + mgr.getSalary());
        mgr.addEmployee();
    }
}
