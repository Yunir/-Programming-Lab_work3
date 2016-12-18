public class Fairytale {
    public static void main(String[] args) {
        System.out.println();
        Place plainMoon = new Place("поле на Луне");
        Place hill = new Place("холм");

        Shorty worker_1 = new Shorty("Димитрий", 143, 99, plainMoon);
        Shorty worker_2 = new Shorty("Володя", 124, 129, plainMoon);
        Shorty worker_Ficks = new Shorty("Фикс", 154, 181, plainMoon);
        Shorty dontKnow = new Shorty("Незнайка", 154, 181, plainMoon);
        Thing showel = new Thing("метла");

        worker_1.work();
        worker_2.work(); System.out.println();

        worker_Ficks.grab(showel);
        worker_Ficks.punch(dontKnow, hill);
        worker_Ficks.walk(hill); System.out.println();

        Bunches bunch = new Bunches();
        Place house = new Place("дом с верандой");
        Flower margar = new Flower("маргаритки", Planets.Moon);
        Flower siren = new Flower("сирени", Planets.Moon);
        Flower anut = new Flower("анютины глазки", Planets.Moon);
        Flower nastur = new Flower("настурции", Planets.Moon);
        Flower astrs = new Flower("астры", Planets.Moon);
        Decor decoration = new Decor();
        decoration.addFlowerToBunches(bunch, margar);
        decoration.addFlowerToBunches(bunch, siren);
        decoration.addFlowerToBunches(bunch, anut);
        decoration.addFlowerToBunches(bunch, nastur);
        decoration.addFlowerToBunches(bunch, astrs);

        if( dontKnow.investigate() ) {
            dontKnow.walk(house);
            decoration.showFlowersInTheBunch(bunch);
            dontKnow.nostalgia(Planets.Moon);
        }

        System.out.println("\nОбзор объектов, участвующие в игре: ");
        System.out.println(worker_1.toString());
        System.out.println(worker_2.toString());
        System.out.println(worker_Ficks.toString());
        System.out.println(dontKnow.toString());
        System.out.println("Цветы у веранды: " + bunch.toString());
    }
}
