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
        return Name + " находится на месте: " + place.getPlace();
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

    public String getName() {
        return Name;
    }
}
