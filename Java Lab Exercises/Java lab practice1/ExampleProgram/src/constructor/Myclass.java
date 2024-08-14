package constructor;

public class Myclass {
	 Myclass(String name){
	    	System.out.println("welcome "+ name);
	    }
	    Myclass(int a,int b){
	    	this("Sri");
	    	System.out.println("Sum "+ (a+b));
	    }
	    Myclass(int n){
	    	this(10,20);
	    	System.out.println("Sum"+ (n+n));
	    }
	    public static void main(String[] args) {
			Main obj1 = new Main(5);
}
}
