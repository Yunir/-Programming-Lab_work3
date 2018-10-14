/**
 * Created by Yunicoed on 19.12.2016.
 */
public class ExistException extends NullPointerException {
    private String trouble  = " не проинициализировано";
    ExistException(){
        trouble = "Не проинициализированная сущность";
    }

    ExistException(String s){
        super(s);
        trouble = s + trouble;
    }

    ExistException(String s, String ss){
        super(s);
        trouble = s + ss;
    }


    public String getExc() {
        return trouble;
    }
}
