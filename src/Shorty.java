class Shorty extends Human {
    private int height;
    private int iq;
    private AThing inHands;

    private int getIq() {
        return iq;
    }

    Shorty(String n, int h, int intel, APlace p) {
        super(n, p);
        height = h;
        iq = intel;
    }

    @Override
    public String toString() {
        return (super.toString()
                + " � iq: "
                + getIq());
    }

    void grab(AThing t){
        inHands = t;
        System.out.println(this.getName() + " ���� � ���� ������ " + inHands.getType());
    }

    void work() {
        System.out.println("��������� " + getName() + " ����� ��������. �����: "+ super.place.getPlace());
    }

    void punch(IHuman s, APlace p) {
        System.out.println(getName() + " ����� " + s.getName() + " �������� " + inHands.getType());
        s.walk(p);
    }
}
