package Star_Patterns;

public class Pyramid_Pattern {

    public static void Pattern1(int n) {
        for (int i = 1; i <= n; i++) {      // Outer Loop - Controls the number of rows in the pyramid.
            // Printing leading spaces
            for (int j = i; j < n; j++) {  // Inner Loop 1 - Prints the spaces before the stars to align the stars in the center.
                System.out.print(" ");
            }
            // Printing stars
            for (int k = 1; k <= i; k++) {  // Inner Loop 2 - Prints the stars.
                System.out.print("* ");
            }
            // Move to the next line after each row
            System.out.println();
        }
    }

    public static void Pattern2(int n) {
        for (int i = 1; i <= n; i++) {
            // Printing leading spaces
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            // Printing stars
            for (int k = 1; k <= (2 * i - 1); k++) { // The number of stars increases by 2 for each subsequent row.
                System.out.print("*");
            }
            // Move to the next line after each row
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Pattern1(5);
        Pattern2(7);
    }
}