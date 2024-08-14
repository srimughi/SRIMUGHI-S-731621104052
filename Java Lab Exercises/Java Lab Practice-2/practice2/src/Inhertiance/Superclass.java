package Inhertiance;
class A{
	int a=15;
	A(String name){
		System.out.println("Hii "+name);
	}
	void myMethod1() {
		System.out.println("Super method");
	}
}
class B extends A{
	B(){
		super("Sri");
	}
	void myMethod2() {
		System.out.println("variable : "+super.a);
		super.myMethod1();
	}
}
public class Superclass {
	public static void main(String[] args) {
		B b=new B();
		b.myMethod2();
	}
}
