package keywordthis;

public class Main {
String name;
Main(String name){
	this(10,20);
	this.name=name;
	this.greeting();
	
}
Main(int a,int b){
	System.out.println("add:"+(a+b));
	
}
void greeting() {
	System.out.println("welcome"+name);
}
public static void main(String[] args) {
	Main obj=new Main("Sri");
}
}
