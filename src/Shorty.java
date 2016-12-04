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
        System.out.println(getName() + " взял в руки объект " + inHands.getType());
    }

    void work() {
        System.out.println("Коротышка " + getName() + " начал работать. Место: "+ super.place.getPlace());
    }

    void punch(IHuman s, APlace p) {
        System.out.println(getName() + " ткнул " + s.getName() + " объектом " + inHands.getType());
        s.walk(p);
    }
}
