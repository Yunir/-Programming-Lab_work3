public class Flower {
    String Type = "��������";
    Planets BornLocation;
    Flower(String name, Planets p) {
        Type = name;
        BornLocation = p;
    }
    String getType() {
        return Type;
    }
}
