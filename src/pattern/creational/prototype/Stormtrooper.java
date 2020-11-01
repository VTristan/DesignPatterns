package pattern.creational.prototype;

import java.util.Random;

public class Stormtrooper implements Cloneable{
	private String name;
	private Random random;

	public String getName() {
		return name;
	}

	public void setName() {
		this.name = new String()+generateLetter()+generateNumber()+generateLetter()+generateNumber();
	}

	public Stormtrooper(String name) {
		this.name = name;
		random = new Random();
	}

	public Stormtrooper clone() {
		try {
			return (Stormtrooper) super.clone();
		} catch (CloneNotSupportedException e) {
			throw new InternalError();
		}
	}
	
	public int generateNumber() {
		return random.nextInt(100);
	}
	
	public char generateLetter() {
		return (char)(random.nextInt(26) + 'A');
	}

}
