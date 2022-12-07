package pattern.creational.builder;
public enum Armor {

  CLOTHES("clothes"), LEATHER("leather"), CHAIN_MAIL("chain mail"), PLATE_MAIL("plate mail");

  @SuppressWarnings("unused")
private final String title;

  Armor(String title) {
    this.title = title;
  }
}
