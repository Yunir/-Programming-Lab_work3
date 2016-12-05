public class Shorty extends Human {
    int height;
    int iq;
    int magic_iq;
    AThing inHands;

    @Override
    public int hashCode() {
        return 100+this.iq;
    }

    Shorty(String n, int h, int intel, APlace p) {
        super(n, p);
        height = h;
        iq = intel;
        magic_iq = this.hashCode();
    }

    @Override
    public String toString() {
        return super.getName() + " с iq " + this.iq;
    }

    void grab(AThing t){
        inHands = t;
        System.out.println(this.toString() + " взял в руки объект " + inHands.getType());
    }

    void work() {
        System.out.println("Коротышка " + getName() + " начал работать. Место: "+ super.place.getPlace());
    }

    void punch(IHuman s, APlace p) {
        System.out.println(getName() + " ткнул " + s.getName() + " объектом " + inHands.getType());
        s.walk(p);
    }
}
