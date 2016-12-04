import java.util.ArrayList;

public class Bunches implements IBunch {
    private ArrayList<Flower> Flowers = new ArrayList<Flower>();

    public void add(Flower f) {
        Flowers.add(f);
    }

    public ArrayList<Flower> getFlowers() {
        return Flowers;
    }
}
