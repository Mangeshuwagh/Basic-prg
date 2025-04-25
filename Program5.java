
// Write program to input number and check number is perfect or not?
// 28 1=2+4+7+14

import java.util.Scanner;

public class Program5 {

    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);
        System.out.println("Enter the numer + 28 or 6");
        int number = cin.nextInt();
        int total = 0;

        // int tem = number;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {

                total += i;

            }
        }

        System.out.println(total);
        if (number == total) {
            System.out.println(" number is perfect ");

        } else {
            System.out.println(" numbers is not perfect ");
        }

    }
}
