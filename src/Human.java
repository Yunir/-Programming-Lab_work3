public class Human {
    String Name;
    APlace place;
    Human(String n, APlace p) {
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

    void walk(APlace h){
        place = h;
        System.out.println(Name + " ������� �� �����: " + place.getPlace());
    }
}
