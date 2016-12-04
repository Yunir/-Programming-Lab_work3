/**
 * Created by Yunicoed on 04.12.2016.
 */
public class Shorty extends Human {
    int height;
    int iq;
    Thing inHands = new Thing("ничего");

    Shorty(String n, int h, int intel, Place p) {
        super(n, p);
        height = h;
        iq = intel;
    }

    void grab(Thing t){
        inHands = t;
        System.out.println(getName() + " взял в руки объект " + inHands.getType());
    }

    void work() {
        System.out.println("Коротышка " + getName() + " начал работать. Место: "+ super.place.getPlace());
    }

    void punch(Shorty s, Place p) {
        System.out.println(getName() + " ткнул " + s.getName() + " объектом " + inHands.getType());
        s.walk(p);
    }

    private String getName() {
        return super.Name;
    }
}
