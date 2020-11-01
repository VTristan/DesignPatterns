package pattern.creational.factoryMethod;

public class Main {

	public static void main(String[] args) {
		Voiture peugeot = VoitureFactory.getVoiture(TypeVoiture.PEUGEOT);
		Voiture renault = VoitureFactory.getVoiture(TypeVoiture.RENAULT);

		System.out.println(peugeot.getDescription());
		System.out.println(renault.getDescription());
	}
}
