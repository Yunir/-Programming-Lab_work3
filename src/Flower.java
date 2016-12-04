/**
 * Created by Yunicoed on 04.12.2016.
 */
public class Flower {
    String Type = "травушка";
    Planets BornLocation;
    Flower(String name, Planets p) {
        Type = name;
        BornLocation = p;
    }
    String getType() {
        return Type;
    }
}
