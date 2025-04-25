
// Write program to input number using Scanner class and reverse it?

import java.util.*;

public class Program2 {
    public static void main(String[] args) {
        int number1;
        Scanner cin = new Scanner(System.in);
        System.out.print(" Enter the number: eg = 12344566\n");
        number1 = cin.nextInt();

        int reverse = 0;
        int rev = 0; // Initialize rev to 0
        while (number1 != 0) {
            int rem = number1 % 10;
            // System.out.println(rem);

            rev = rev * 10 + rem; // first multiplication after addition after the store
            // System.out.println("?" + rev);

            number1 /= 10;
            reverse = rev;
        }
        System.out.println(reverse);

    }

}
