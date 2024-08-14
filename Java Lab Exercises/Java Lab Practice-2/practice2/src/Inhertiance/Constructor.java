package Inhertiance;
class C{
	C(){
		this(5);
		System.out.println("Welcome");
	}
	C(int a){
		super();
		System.out.println("Welcome 1");
	}
}
class D extends C{
	D(){
		super(5);
		System.out.println("Hello");
		
	}
	D(int c){
	   System.out.println("Hello1");
	}
}
public class Constructor {
	public static void main(String[] args) {
		D b = new D(5);
	}

}
