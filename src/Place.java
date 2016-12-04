/**
 * Created by Yunicoed on 04.12.2016.
 */
public class Place {
    String PlaceS;
    Decor decorOfPlace;
    Place(String s) {
        PlaceS = s;
        decorOfPlace = new Decor();
    }


    String getPlace() {
        return PlaceS;
    }
}
