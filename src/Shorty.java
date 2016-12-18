class Shorty extends Human {
    private int height;
    private int iq;
    private int strenght;
    private AThing inHands;

    private int getIq() {
        int normalized = 0;
        try {
            normalized = (int)(height/iq);
        } catch (ArithmeticException e) {
            normalized = 1;
        } finally {
            return normalized;
        }
    }

    Shorty(String n, int h, int intel, APlace p, int strenght) {
        super(n, p);
        height = h;
        iq = intel;
        this.strenght = strenght;
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


    void punch(IHuman s, APlace p) {

            class Hit {
                private int countOfHitting;
                Hit (int i) {
                    countOfHitting = i;
                }
                void punchIt() {
                    try {
                    if(getName().equals(s.getName())) throw new FairytaleException("Коротышка " + getName() + " не может ударить себя, руки коротки!");
                    if(countOfHitting<1) System.out.println(getName() + " не смог ударить " + s.getName());
                    else if(countOfHitting<10) System.out.println(getName() + " слабо ударил " + s.getName());
                    else if(countOfHitting>9) {
                        System.out.println(getName() + " ткнул " + s.getName() + " объектом " + inHands.getType());
                        s.walk(p);
                    }
                    else System.out.println(getName() + " бездействует");
                } catch(FairytaleException e) {
                        System.out.println(e.toString());
                    }
            }
        }
        Hit RealSuperPunch = new Hit(strenght);
        RealSuperPunch.punchIt();
    }

    Skill ShortySkill = new Skill(strenght);
    void tryToWork() {
        ShortySkill.work(super.place.getPlace());
    }

    class Skill {
        boolean abilityToWork;
        Skill(int power) {
            if(power > 9) abilityToWork = true;
            else abilityToWork = false;
        }

        void work(String p) {
            if (abilityToWork) System.out.println("Коротышка " + getName() + " начал работать. Место: "+ p);
            else System.out.println("Коротышка "+ getName() + " не способен работать");
        }
    }
}
