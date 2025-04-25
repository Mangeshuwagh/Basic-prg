import java.util.*;

public class program7 {
    public static void main(String[] args) {

        // System.out.println(" Enter the number user throw ");
        // Scanner cin = new Scanner(System.in);

        // int number = cin.nextInt();
        int number = 123454321;

        int rev = 0;

        int tem = number;
        // System.out.println(tem);
        while (number != 0) {

            int rem = number % 10;
            rev = rev * 10 + rem;
            number /= 10;

        }
        // System.out.println(rev);
        if (tem == rev) {
            System.out.println(" number is Pallindrom ");

        } else {
            System.out.println("number is not pallindrom ");
        }
    }

}
