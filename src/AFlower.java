abstract class AFlower {
    private String Type = "травушка";
    Planets BornLocation;
    AFlower(String name, Planets p) {
        Type = name;
        BornLocation = p;
    }
    String getType() {
        return Type;
    }
}
