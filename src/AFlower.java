abstract public class AFlower {
    private String Type = "��������";
    Planets BornLocation;
    AFlower(String name, Planets p) {
        Type = name;
        BornLocation = p;
    }
    String getType() {
        return Type;
    }
}
