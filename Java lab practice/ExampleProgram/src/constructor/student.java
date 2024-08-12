package constructor;
import java.util.Scanner;
	public class student {
	    private int regno;
	    private String stuName;
	    private int[] marks;
	    private int sum;
	    private int avg;
	    public student(int regno, String stuName, int numOfSubjects) {
	        this.regno = regno;
	        this.stuName = stuName;
	        this.marks = new int[numOfSubjects];
	    }
	    public void getMarks() {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter marks for " + marks.length + " subjects:");
	        for(int i = 0; i < marks.length; i++) {
	            marks[i] = sc.nextInt();
	        }
	    }
	    public void calculateGrade() {
	        sum = 0;
	        for(int mark : marks) {
	            sum += mark;
	        }
	        avg = sum / marks.length;
	        System.out.println("Average: " + avg);        
	        if(avg >= 90) {
	            System.out.println("Grade: A");
	        } else if(avg >= 80) {
	            System.out.println("Grade: B");
	        } else {
	            System.out.println("Grade: C");
	        }
	    }
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter student registration number: ");
	        int regno = sc.nextInt();
	        sc.nextLine();  
	        System.out.print("Enter student name: ");
	        String stuName = sc.nextLine();
	        System.out.print("Enter number of subjects: ");
	        int numOfSubjects = sc.nextInt();
	       
	        student student = new student(regno, stuName, numOfSubjects);
	        student.getMarks();
	        student.calculateGrade();
	    }
	}

