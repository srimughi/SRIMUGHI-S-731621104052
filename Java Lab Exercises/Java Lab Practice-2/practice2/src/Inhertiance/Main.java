package Inhertiance;
class vehicle{
	void noOfEngine() {
		System.out.println("I have One Engine");
	}
}
class Twowheeler extends vehicle{
	void noOfWheels() {
		System.out.println("three Wheels");
	}
}
class Bike extends Twowheeler{
	void brandName() {
		System.out.println("Brand is Royal Enfield");
	}
}
class Scooty extends Twowheeler{
	void brandName() {
		System.out.println("Brand is Duke");
	}
}
public class Main {
	public static void main(String[] args) {
		Bike bike=new Bike();
		bike.noOfEngine();
		bike.noOfWheels();
		bike.brandName();
		Scooty scooty=new Scooty();
		scooty.noOfEngine();
		scooty.noOfWheels();
		scooty.brandName();
		
	}

}
