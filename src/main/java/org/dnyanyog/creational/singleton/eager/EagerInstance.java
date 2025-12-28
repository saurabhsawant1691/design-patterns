package org.dnyanyog.creational.singleton.eager;

class Singleton {
	private static Singleton instance = new Singleton();
	
	private Singleton() {System.out.println("Single instance created.");};
	
	public static Singleton getInstance() {
		if(instance == null) {
			System.out.println("Creating First instance.");
			instance = new Singleton();
		}
		System.out.println("Fetching instance.");
		return instance;
	}

}

public class EagerInstance {
	
	public static void main(String[] args) {
		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		
		System.out.println("Are both intances the same? " + (singleton1 == singleton2));
	}
}
