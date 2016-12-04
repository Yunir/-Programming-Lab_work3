import java.util.ArrayList;

public class Bunches {
    private ArrayList<Flower> Flowers = new ArrayList<Flower>();

    public void add(Flower f) {
        Flowers.add(f);
    }

    protected ArrayList<Flower> getFlowers() {
        return Flowers;
    }
}
