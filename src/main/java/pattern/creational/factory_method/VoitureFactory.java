package pattern.creational.factory_method;

public class VoitureFactory {
	
	public static Voiture getVoiture(TypeVoiture type) {
		/*Sans utiliser de Supplier.*/
		if (type.name().equalsIgnoreCase("PEUGEOT")) {
			return new Peugeot();
		} else if (type.name().equalsIgnoreCase("RENAULT")) {
			return new Renault();
		} else {
			return null;
		}
		
		/*En utilisant le Supplier.*/
		//return type.getConstructor().get();
		
	}
}
