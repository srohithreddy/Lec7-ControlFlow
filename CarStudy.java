package coreJava;

class Car {
	 
 	String name;
 	String color;
 	int year;
 	int maxspeed;
 	void accelerate() {
 		System.out.println("Car is acceleraring");
 		
 	}

}

public class CarStudy {
 
 public static void main(String[]args) {
	 Car polo =new Car();
	 System.out.println(polo.name);
	 System.out.println(polo.color);
	 System.out.println(polo.year);
	 System.out.println(polo.maxspeed);
	 
	 polo.name ="polo";
	 polo.color="Red";
	 polo.year=2016;
	 polo.maxspeed=120;
	 
	 System.out.println(polo.name);
	 System.out.println(polo.color);
	 System.out.println(polo.year);
	 System.out.println(polo.maxspeed);
	 
	 
	 
	 
 }
}