import javax.lang.model.element.Name;

public class Human implements IHuman {
    private String Name;
    APlace place;
    Human(String n, APlace p) {
        Name = n;
        place = p;
    }

    @Override
    public boolean equals(Object obj) {
        return place.getPlace()==obj;
    }

    void nostalgia(Planets p) {
        if(p == Planets.Moon)
            System.out.println("\n������ � �� ������ ������ - ������ " + Name);
    }

    boolean investigate(){
        if (equals("����")) {
            System.out.print("���, ����� �������� ����������� ��� � ��������!");
            System.out.println(" - ������ " + Name);
            return true;
        } else {
            System.out.print("��� ������ �����������");
            System.out.println(" - ������ " + Name);
            return false;
        }
    }

    public void walk(APlace h){
        place = h;
        System.out.println(Name + " ������� �� �����: " + place.getPlace());
    }

    public String getName() {
        return Name;
    }
}
