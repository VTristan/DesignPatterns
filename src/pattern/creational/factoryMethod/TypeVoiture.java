package pattern.creational.factoryMethod;

import java.util.function.Supplier;

public enum TypeVoiture {
	
	PEUGEOT(Peugeot::new),
	RENAULT(Renault::new);
	
	//L'enum prend en argument un Supplier de type Voiture.
	private final Supplier<Voiture> constructor;
	
	//constructeur
	private TypeVoiture(Supplier<Voiture> constructor) {
		this.constructor = constructor;
	}

	//getter
	public Supplier<Voiture> getConstructor(){
		return this.constructor;
	}
}
