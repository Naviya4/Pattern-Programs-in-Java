package Star_Patterns;

public class Downward_Triangle_Pattern {

    public static void Pattern(int n) {

        for (int i = n; i >= 1; i--) {       // Outer Loop - Controls the number of rows in the Triangle. (starting from n to 1)
            for (int j = 1; j <= i; j++) {  // Inner Loop - Prints the stars.
                System.out.print("*");
            }
            System.out.println();  // Move to the next line after each row
        }
    }

    public static void main(String[] args) {
        Pattern(5);
    }
}