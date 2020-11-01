package pattern.creational.factoryMethod;

public class Peugeot implements Voiture {
	static final String DESCRIPTION="Peugeot";

	@Override
	public String getDescription() {
		return DESCRIPTION;
	}

}
