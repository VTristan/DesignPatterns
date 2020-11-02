package pattern.creational.builder;

public class Main {

	public static void main(String[] args) {
		var mage = new Hero.Builder(Profession.MAGE, "Gandalf")
		.withArmor(Armor.LEATHER)
		.withHairColor(HairColor.BLACK)
		.withWeapon(Weapon.WARHAMMER).build();
		
		System.out.println(mage.toString());
	}

}
