package pattern.creational.prototype;

public class Main {

	public static void main(String[] args) {
		
		var bobaFett = new Stormtrooper("Boba Fett");
		System.out.println(bobaFett.getName());
		
		var cloned = bobaFett.clone();
		cloned.setName();
		System.out.println(cloned.getName());
		
	}

}
