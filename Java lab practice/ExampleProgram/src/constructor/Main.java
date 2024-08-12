package constructor;

import maha.Method;

public class Main {
    Main(String name){
    	System.out.println("welcome "+ name);
    }
    Main(int a,int b){
    	System.out.println("Sum "+ (a+b));
    }
    Main(int n){
    	System.out.println("Sum"+ (n+n));
    }
    public static void main(String[] args) {
		Main obj1 = new Main("Sri");
		Main obj2 = new Main(10,20);
		Main obj3 = new Main(5);
	}
    
}
