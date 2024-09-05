package Star_Patterns;

public class Left_Triangle_Pattern {

    public static void Pattern(int n) {
        for(int i = 1; i <= n; i++) {   // Outer Loop - Controls the number of rows in the Left Triangle.
           for(int j = n; j > i; j--){  // Inner Loop 1 - Prints the leading spaces before the stars.
               System.out.print(" ");
           }
           for (int k = 1; k <= i; k++) {  // Inner Loop 2 - Prints the stars.
               System.out.print("*");
           }
           System.out.println();  // Move to the next line after each row
        }
    }

    public static void main(String[] args) {
        Pattern(5);
    }
}