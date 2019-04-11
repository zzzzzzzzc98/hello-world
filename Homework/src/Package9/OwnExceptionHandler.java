package Package9;

public class OwnExceptionHandler {
    public static void main(String[] args) {
        OwnExceptionSource es = new OwnExceptionSource();
        try{
            es.a();
            System.out.println("in try block");
        }catch(Exception e) {
        	System.out.println("in catch block");
        	e.printStackTrace();
        }finally{
			System.out.println("in finally block");
        }
        System.out.println("after exception");
    }
}
