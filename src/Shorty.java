/**
 * Created by Yunicoed on 04.12.2016.
 */
public class Shorty extends Human {
    int height;
    int iq;
    Thing inHands = new Thing("������");

    Shorty(String n, int h, int intel, Place p) {
        super(n, p);
        height = h;
        iq = intel;
    }

    void grab(Thing t){
        inHands = t;
        System.out.println(getName() + " ���� � ���� ������ " + inHands.getType());
    }

    void work() {
        System.out.println("��������� " + getName() + " ����� ��������. �����: "+ super.place.getPlace());
    }

    void punch(Shorty s, Place p) {
        System.out.println(getName() + " ����� " + s.getName() + " �������� " + inHands.getType());
        s.walk(p);
    }

    private String getName() {
        return super.Name;
    }
}
