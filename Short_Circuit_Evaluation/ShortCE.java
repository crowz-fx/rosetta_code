/**
 * Task - https://rosettacode.org/wiki/Short-circuit_evaluation
 * 
 * @author Lui Crowie
 */
public class ShortCE {

    public static void main(String[] args) {
        printFunctionCalls(0, true, true);
        printFunctionCalls(1, true, true);

        printFunctionCalls(0, true, false);
        printFunctionCalls(1, true, false);

        printFunctionCalls(0, false, true);
        printFunctionCalls(1, false, true);

        printFunctionCalls(0, false, false);
        printFunctionCalls(1, false, false);
    }

    /**
     * 0 = OR
     * 1 = AND
     */
    public static void printFunctionCalls(int operation, boolean a, boolean b) {
        if(operation == 1) {
            // OR
            System.out.println("" + a + "" + " OR " + b + " = " + (a(a) || b(b)) + "\n");
        } else {
            System.out.println("" + a + "" + " AND " + b + " = " + (a(a) && b(b)) + "\n");
        } 
    }

    public static boolean a(boolean a) {
        System.out.println("a");
        return a;
    }

    public static boolean b(boolean b) {
        System.out.println("b");
        return b;
    }
}