import java.util.*;
public class Ultaloop {

    public static void main(String[] args) {

        int n = 5;
        int row = 1;
        int star1 = 1;
        int star2 = 1;
        int space = n + 2;

        while (row <= n) {

            // star1
            int s1 = 0;
            while (s1 < star1) {
                System.out.print("* ");
                s1++;
            }

            // spaces
            int sp = 0;
            while (sp < space) {
                System.out.print("  ");
                sp++;
            }

            // star2

            int s2 = (row < 5) ? 0 : 1;

            while (s2 < star2) {
                System.out.print("* ");
                s2++;
            }

            // next row preparation
            star1++;
            star2++;
            space -= 2;
            row++;
            System.out.println();
        }
    }
}
