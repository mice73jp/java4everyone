package javaStudy;

public class Car {
	private String name = "";
	
	public Car(String name) {
		this.name = name;
	}
	
	public String MyName() {
		return this.name;
	}
	
	public void HelloWorld() {
		System.out.println("Hello World, I'm "+this.MyName());
	}
}
