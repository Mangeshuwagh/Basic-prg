
// Write a program to input number and print its table?

import java.util.*;

public class Program4 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter the one number and we print the table ");
        int number = cin.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(" " + number * i);
        }
    }
}
