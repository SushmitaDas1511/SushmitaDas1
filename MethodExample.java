public class MethodExample
{
    public static void main(String[] args) 
    {
        System.out.println("About to encounter a method.");

        // method call
        myMethod();
        myName();

        System.out.println("Method was executed successfully!");
    }
    // method definition
    private static void myMethod()
    {
        System.out.println("Printing from inside myMethod()!");
    }
    private static void myName()
    {
        System.out.println("Sushmita");
    }
}