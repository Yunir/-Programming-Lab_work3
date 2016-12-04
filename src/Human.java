public class Human {
    String Name;
    APlace place;
    Human(String n, APlace p) {
        Name = n;
        place = p;
    }

    void nostalgia(Planets p) {
        if(p == Planets.Moon)
            System.out.println("\nСкучаю я по земным цветам - сказал " + Name);
    }

    boolean investigate(){
        if (place.getPlace().equals("холм")) {
            System.out.print("Вау, какой красивый двухэтажный дом с верандой!");
            System.out.println(" - сказал " + Name);
            return true;
        } else {
            System.out.print("-Тут ничего интересного");
            System.out.println(" - сказал " + Name);
            return false;
        }
    }

    void walk(APlace h){
        place = h;
        System.out.println(Name + " пошагал на место: " + place.getPlace());
    }
}
