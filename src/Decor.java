public class Decor {
    Planets planet;

    void addFlowerToBunches(IBunch b, Flower f) {
        planet = f.BornLocation;
        b.add(f);
    }

    void showFlowersInTheBunch(IBunch b) {
        System.out.println("Вокруг были разбиты клумбы с цветами: ");
        for (int i = 0; i < b.getFlowers().size(); i++) {
            if(i!=0)System.out.print(", ");
            System.out.print(b.getFlowers().get(i).getType());
        }
        System.out.println();
    }
}
