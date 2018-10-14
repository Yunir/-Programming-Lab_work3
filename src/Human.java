import javax.lang.model.element.Name;

class Human implements IHuman, IStandardFunc {
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
        try {
            if (place==null) throw new ExistException();
        } catch (ExistException e) {
            e.printStackTrace();
            place = new Place("неизвестно");
        } finally {
            return Name + " находится на месте: " + place.getPlace();
        }
    }

    void nostalgia(Planets p) {
        if(p == Planets.Moon)
            System.out.println("\nСкучаю я по земным цветам - сказал " + Name);
    }

    boolean investigate(){
        if (place.getPlace()=="холм") {
            System.out.print("Вау, какой красивый двухэтажный дом с верандой!");
            System.out.println(" - сказал " + Name);
            return true;
        } else {
            System.out.print("Тут ничего интересного");
            System.out.println(" - сказал " + Name);
            return false;
        }
    }

    public void walk(APlace h){
        place = h;
        System.out.println(Name + " пошагал на место: " + place.getPlace());
    }

    public String getName(){
        try {
            if(haveName()) return Name;
            else {
                throw new CorrectNameException("имени нет");
            }
        } catch (ExistException e) {
            return e.getExc();
        } catch (CorrectNameException exc) {
            exc.printStackTrace();
            return "безымянный";
        }
    }

    public boolean haveName() throws ExistException{
        if (Name==null)throw new ExistException("Поле Имя");
        return Name.equals("")?false:true;
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
