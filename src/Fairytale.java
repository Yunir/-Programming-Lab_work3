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

        Place house = new Place("дом с верандой");
        Flower margar = new Flower("маргаритки", Planets.Moon);
        Flower siren = new Flower("сирени", Planets.Moon);
        Flower anut = new Flower("анютины глазки", Planets.Moon);
        Flower nastur = new Flower("настурции", Planets.Moon);
        Flower astrs = new Flower("астры", Planets.Moon);
        house.decorOfPlace.addFlowerToBunches(margar);
        house.decorOfPlace.addFlowerToBunches(siren);
        house.decorOfPlace.addFlowerToBunches(anut);
        house.decorOfPlace.addFlowerToBunches(nastur);
        house.decorOfPlace.addFlowerToBunches(astrs);

        if( dontKnow.investigate() ) {
            dontKnow.walk(house);
            house.decorOfPlace.showFlowersInTheBunch();
            dontKnow.nostalgia();
        }

    }
}
