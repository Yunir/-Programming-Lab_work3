public class Human {
    String Name;
    Place place = new Place("�������");
    Human(String n, Place p) {
        Name = n;
        place = p;
    }

    void nostalgia(Planets p) {
        if(p == Planets.Moon)
            System.out.println("\n������ � �� ������ ������ - ������ " + Name);
    }

    boolean investigate(){
        if (place.getPlace().equals("����")) {
            System.out.print("���, ����� �������� ����������� ��� � ��������!");
            System.out.println(" - ������ " + Name);
            return true;
        } else {
            System.out.print("-��� ������ �����������");
            System.out.println(" - ������ " + Name);
            return false;
        }
    }

    void walk(Place h){
        place = h;
        System.out.println(Name + " ������� �� �����: " + place.getPlace());
    }
}
