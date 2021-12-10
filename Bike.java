public class Bike{


//instance variable 	
String brand = "Honda";
String colour = "Red";
int engineCC = 120;
int gearBox = 5;
double price = 85000.00;
String noPlate = "KA01QA1122";
boolean isdigital =true;

public void starting(){

	System.out.println("Use the key and press the self button");
	System.out.println("Bike started");
} 
public void riding(){

		System.out.println("wearing helmet and accelerate");
		System.out.println("Riding the bike");
}
public void stoping(){

    System.out.println("turn the key off");
	System.out.println("Stop the bike");
}
 
 public static void main(String[] args){

 	System.out.println("Main method started");

 	Bike bike1 = new Bike(); //object creation
 	System.out.println(bike1.brand);
 	System.out.println(bike1.colour);
 	System.out.println(bike1.engineCC);
 	System.out.println(bike1.gearBox);
 	System.out.println(bike1.noPlate);
 	System.out.println(bike1.price);
 	System.out.println(bike1.isdigital);

 	bike1.starting();
 	bike1.riding();
 	bike1.stoping();

 	System.out.println("Main method end");

 }


}  