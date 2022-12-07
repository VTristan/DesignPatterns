package pattern.creational.builder;
public enum HairType {

  BALD("bald"), SHORT("short"), CURLY("curly"), LONG_STRAIGHT("long straight"), LONG_CURLY(
      "long curly");

  @SuppressWarnings("unused")
private final String title;

  HairType(String title) {
    this.title = title;
  }
}