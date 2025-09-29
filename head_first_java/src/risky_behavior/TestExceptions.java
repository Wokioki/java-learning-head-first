package risky_behavior;


public class TestExceptions {
    public static void main(String[] args) {

        String test = "No";
        try {
            System.out.println("Start of try");
            doRisky(test);
            System.out.println("End of try");
        } catch (ScaryException se){
            System.out.println("Scary exception");
        } finally {
            System.out.println("Finally");
        }
        System.out.println("End of main");
    }
    static void doRisky(String test) throws ScaryException {
        System.out.println("Start of risky method");
        if("yes".equals(test)){
            throw new ScaryException();
        }
        System.out.println("End of risky method");
        return;
    }
}

class ScaryException extends Exception {
    public ScaryException() {
        super("Something scary happened!");
    }
}
