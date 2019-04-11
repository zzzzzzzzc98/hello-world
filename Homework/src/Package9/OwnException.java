package Package9;

public class OwnException extends Exception {
    public OwnException() {
        this("My Own Exception happened! ");
    }

    public OwnException(String msg) {
        super(msg);
    }
}
