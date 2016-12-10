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
                + " с iq: "
                + getIq());
    }

    void grab(AThing t){
        inHands = t;
        System.out.println(this.getName() + " взял в руки объект " + inHands.getType());
    }

    void work() {
        System.out.println("Коротышка " + getName() + " начал работать. Место: "+ super.place.getPlace());
    }

    void punch(IHuman s, APlace p) {
        System.out.println(getName() + " ткнул " + s.getName() + " объектом " + inHands.getType());
        s.walk(p);
    }
}
