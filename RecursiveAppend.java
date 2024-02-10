/*************************************************************************
 *  Compilation:  javac RecursiveAppend.java
 *  Execution:    java RecursiveAppend
 *
 *  @author: Daniela Riano Castano dr982
 *
 *************************************************************************/

public class RecursiveAppend {

    // Returns the original string appended to the original string n times 
    public static String appendNTimes (String original, int n) {

	// WRITE YOUR CODE HERE
    if (n==0){
        return original;
    }
    return original + appendNTimes(original, n - 1);
    }

    public static void main (String[] args) {

	// WRITE TEST CASES HERE to test your method
    String original = args[0];
    int n = Integer.parseInt(args[1]);

    System.out.println(appendNTimes(original, n));

    }
}
