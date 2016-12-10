class Decor implements IStandardFunc {
    private Planets planet;

    void addFlowerToBunches(IBunch b, AFlower f) {
        planet = f.BornLocation;
        b.add(f);
    }

    void showFlowersInTheBunch(IBunch b) {
        System.out.println("Вокруг были разбиты клумбы с цветами с планеты " + planet.toString() + ": ");
        System.out.print(b.toString());
        System.out.println();
    }
}
