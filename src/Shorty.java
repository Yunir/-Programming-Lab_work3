public class Shorty extends Human {
    int height;
    int iq;
    AThing inHands;

    Shorty(String n, int h, int intel, APlace p) {
        super(n, p);
        height = h;
        iq = intel;
    }

    void grab(AThing t){
        inHands = t;
        System.out.println(getName() + " ���� � ���� ������ " + inHands.getType());
    }

    void work() {
        System.out.println("��������� " + getName() + " ����� ��������. �����: "+ super.place.getPlace());
    }

    void punch(IHuman s, APlace p) {
        System.out.println(getName() + " ����� " + s.getName() + " �������� " + inHands.getType());
        s.walk(p);
    }
}
