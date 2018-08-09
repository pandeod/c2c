import java.util.*;
import java.io.StringWriter;
import java.io.PrintWriter;

class StackTraceEx{
    public static void main(String[] args) {
        method1();
      }
    
      public static void method1() {
        method11();
      }
    
      public static void method11() {
        method111();
      }
    
      public static void method111() {
        //throw new NullPointerException("Fictitious NullPointerException");
        //To display stack trace in console

        try{
            int x=10/0;
        }
        catch(Exception e){

            //to print stack trace
            StringWriter outError = new StringWriter();
            e.printStackTrace(new PrintWriter(outError));
            String errorString = outError.toString();
            System.out.println("::::::::: "+errorString+" ::::::::::");
        }
      }
}

/*output

::::::::: java.lang.ArithmeticException: / by zero
        at StackTraceEx.method111(StackTraceEx.java:23)
        at StackTraceEx.method11(StackTraceEx.java:15)
        at StackTraceEx.method1(StackTraceEx.java:11)
        at StackTraceEx.main(StackTraceEx.java:7)
 ::::::::::

*/
/*

Each stack frame has structure

public StackTraceElement(String declaringClass,
                         String methodName,
                         String fileName,
                         int lineNumber);

    relate it to output...

*/

//To create exception 
// throw new NullPointerException("Fictitious NullPointerException");
// throw new exception_name("Message for display");

//stack trace : list of methods from start of execution of program
//              to the point when exception is thrown 