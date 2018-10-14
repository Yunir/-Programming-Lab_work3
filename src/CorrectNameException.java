/**
 * Created by Yunicoed on 19.12.2016.
 */
public class CorrectNameException extends Exception {
    private String exc;
    CorrectNameException(String s){
        super(s);
        exc = s;
    }

    public String getExc() {
        return exc;
    }
}
