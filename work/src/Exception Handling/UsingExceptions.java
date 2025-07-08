public class UsingExceptions {// Fig. 11.5: UsingExceptions.java
    public static void main(String[] args) { // try...catch...finally exception handling mechanism.
        try {
            throwException();// exception thrown by throwException
        } catch (Exception exception){ 
            System.err.println("Exception handled in main");}
        doesNotThrowException();}
    // demonstrate try...catch...finally
    public static void throwException() throws Exception {
        try{ // throw an exception and immediately catch it
            System.out.println("Method throwException");
            throw new Exception();
        } catch (Exception exception){ // catch exception thrown in try 
            System.err.println("Exception handled in method throwException");
            throw exception;
        } finally{ // executes regardless of what occurs in try...catch
            System.err.println("Finally executed in throwException");}}
        // code here would not be reached; would cause compilation errors
    // demonstrate finally when no exception occurs
    public static void doesNotThrowException() {
        try{ // try block does not throw an exception
            System.out.println("Method doesNotThrowException");
        } catch (Exception exception){ // does not execute
            System.err.println(exception);
        } finally{ // executes regardless of what occurs in try...catch
            System.err.println("Finally executed in doesNotThrowException");}
        System.out.println("End of method doesNotThrowException");}} // end class UsingExceptions