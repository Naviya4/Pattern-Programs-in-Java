package Star_Patterns;

public class Reversed_Pyramid_Pattern {

    public static void Pattern(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k <= n; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Pattern(5);
    }
}