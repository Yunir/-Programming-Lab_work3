/**
 * Created by Yunicoed on 04.12.2016.
 */
public class Human {
    String Name;
    Place place = new Place("�������");
    Human(String n, Place p) {
        Name = n;
        place = p;
    }

    void nostalgia() {
        System.out.println();
        if(place.decorOfPlace.planet == Planets.Moon)
            System.out.println("������ � �� ������ ������ - ������ " + Name);
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
