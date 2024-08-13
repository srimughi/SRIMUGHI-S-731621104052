package sri;
class Employee{
	//variables
	int employeeId;
	String employeeName;
	float employeeSalary;
	//Constructors
	Employee(int employeeId,String employeeName,float employeeSalary){
	this.employeeId=employeeId;
	this.employeeName=employeeName;
	this.employeeSalary=employeeSalary;
	}
	//Methods declaration
	void display() {
		System.out.println("Employee ID : "+ employeeId);
		System.out.println("Employee Name: "+ employeeName);
		System.out.println("Employee Salary : "+ employeeSalary);	
	}
}

public class Main {
	public static void main(String[] args) {
		Employee emp1 = new Employee(101,"Sri",3000.0f);
		emp1.display();
		Employee emp2 = new Employee(102,"Krish",5000.00f);
		emp2.display();
	}
}
