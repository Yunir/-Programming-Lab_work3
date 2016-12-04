public class Fairytale {
    public static void main(String[] args) {
        System.out.println();
        Place plainMoon = new Place("���� �� ����");
        Place hill = new Place("����");

        Shorty worker_1 = new Shorty("��������", 143, 99, plainMoon);
        Shorty worker_2 = new Shorty("������", 124, 129, plainMoon);
        Shorty worker_Ficks = new Shorty("����", 154, 181, plainMoon);
        Shorty dontKnow = new Shorty("��������", 154, 181, plainMoon);
        Thing showel = new Thing("�����");

        worker_1.work();
        worker_2.work(); System.out.println();

        worker_Ficks.grab(showel);
        worker_Ficks.punch(dontKnow, hill);
        worker_Ficks.walk(hill); System.out.println();

        Place house = new Place("��� � ��������");
        Flower margar = new Flower("����������", Planets.Moon);
        Flower siren = new Flower("������", Planets.Moon);
        Flower anut = new Flower("������� ������", Planets.Moon);
        Flower nastur = new Flower("���������", Planets.Moon);
        Flower astrs = new Flower("�����", Planets.Moon);
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
