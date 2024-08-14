package maha;

public class Method {
void myMethod(String name) {
	System.out.println("Welcome " + name);
}
void myMethod(int a,int b) {
	System.out.println("Sum : "+(a+b));
}
	void myMethod(int n) {
		System.out.println("Sum : "+(n+n));
	
}
public static void main(String[] args) {
	Method obj=new Method();
	obj.myMethod(5);
	obj.myMethod("Sri");
	obj.myMethod(10,20);
	}
}
