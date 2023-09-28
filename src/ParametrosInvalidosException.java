import org.w3c.dom.ls.LSOutput;

public class ParametrosInvalidosException extends Exception {

    public String msg(){
        return "Enter a valid number! Don't use dot or comma.";
    }
}
