
// 8. Write program to input number and check number is Armstrong or not?

import java.util.*;

public class program8 {

    public static void main(String[] args) {

        // eg 153 =
        // System.out.println(" Enter the number ");
        // Scanner cin = new Scanner(System.in);

        // int number = cin.nextInt();
        int number = 370;
        int temp = number;

        int count = 0;

        while (number != 0) {
            count++;
            number /= 10;

        }
        number = temp;
        int sum = 0;
        while (number != 0) {

            int rem = number % 10;
            sum += Math.pow(rem, count);
            number /= 10;
        }
        if (temp == sum) {
            System.out.println(" number is amstrong " + sum);

        } else {
            System.out.println(" number is not amstrong ");
        }
    }

}
