/**
 * Created by Yunicoed on 04.12.2016.
 */
public class Decor {
    Planets planet;

    Bunches b;
    Decor () {
        b = new Bunches();
    }

    void addFlowerToBunches(Flower f) {
        planet = f.BornLocation;

        b.add(f);
    }

    void showFlowersInTheBunch() {
        System.out.println("Вокруг были разбиты клумбы с цветами: ");
        for (int i = 0; i < b.getFlowers().size(); i++) {
            if(i!=0)System.out.print(", ");
            System.out.print(b.getFlowers().get(i).getType());
        }
        System.out.println();
    }
}
