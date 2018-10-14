import java.nio.charset.StandardCharsets;

public class Fairytale {
    public static void main(String[] args) {
        System.out.println();
        Place plainMoon = new Place("поле на Луне");
        Place hill = new Place("холм");

        Shorty worker_Ficks = new Shorty("Фикс", 154, 1, plainMoon, 20);
        Shorty dontKnow = new Shorty("Незнайка", 154, 11, plainMoon, 0);
        Thing showel = new Thing("метла");

        new Shorty("Еремей", 151, 7, plainMoon, 5) {
            public void StandartReaction() {
                this.tryToWork();
            }
        }.StandartReaction();
        new Shorty("Димитрий", 143, 9, plainMoon, 11){}.tryToWork();
        Shorty worker = new Shorty("Володя", 124, 10, plainMoon, 1) {
            @Override
            void tryToWork() {
                super.tryToWork();
                System.out.println("Работа кипит!");
            }
        };
        worker.tryToWork();
        System.out.println();

        worker_Ficks.grab(showel);
        worker_Ficks.punch(dontKnow, hill);
        worker_Ficks.walk(hill);
        dontKnow.punch(worker_Ficks, hill);
        dontKnow.punch(dontKnow, hill);
        System.out.println();

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

        if (dontKnow.investigate()) {
            dontKnow.walk(house);
            decoration.showFlowersInTheBunch(bunch);
            dontKnow.nostalgia(Planets.Moon);
        }
    }
    static private class Flower extends AFlower {
        Flower(String name, Planets p) {
            super(name, p);
        }
    }
}
