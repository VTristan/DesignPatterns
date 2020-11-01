package pattern.creational.factoryMethod;

public class VoitureFactory {
	
	public static Voiture getVoiture(TypeVoiture type) {
		/*Sans utiliser de Supplier.*/
		if (type.name().toUpperCase() == "PEUGEOT") {
			return new Peugeot();
		} else if (type.name().toUpperCase() == "RENAULT") {
			return new Renault();
		} else {
			return null;
		}
		
		/*En utilisant le Supplier.*/
		//return type.getConstructor().get();
		
	}
}
