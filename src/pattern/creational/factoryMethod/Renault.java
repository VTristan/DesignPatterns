package pattern.creational.factoryMethod;

public class Renault implements Voiture {
	static final String DESCRIPTION="Renault";

	@Override
	public String getDescription() {
		return DESCRIPTION;
	}

}
