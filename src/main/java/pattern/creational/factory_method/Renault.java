package pattern.creational.factory_method;

public class Renault implements Voiture {
	static final String DESCRIPTION="Renault";

	@Override
	public String getDescription() {
		return DESCRIPTION;
	}

}
