package Main;

public class Variables {
	int b=20;//instance or object variables
	static int c= 30;
 public static void main(String[] args) {
	 int a=10;//local variables
	 System.out.println("Local variable : "+ a);
	 Variables obj = new Variables();
	 System.out.println(obj.b);
	 System.out.println(Variables.c);
	 
	 
 }
}
