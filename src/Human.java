import javax.lang.model.element.Name;

public class Human implements IHuman, IStandardFunc {
    private String Name;
    APlace place;
    Human(String n, APlace p) {
        Name = n;
        place = p;
    }

    @Override
    public int hashCode() {
        return super.hashCode()+Name.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        boolean comp = obj.hashCode()== this.hashCode() ? true : false;
        return comp;
    }

    @Override
    public String toString() {
        return Name + " ��������� �� �����: " + place.getPlace();
    }

    void nostalgia(Planets p) {
        if(p == Planets.Moon)
            System.out.println("\n������ � �� ������ ������ - ������ " + Name);
    }

    boolean investigate(){
        if (place.getPlace()=="����") {
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
