
// 1. Write program to input two values using command line argument and perform its swapping?
import java.util.*;

public class Program1 {

    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);
        int a;
        int b;
        int c;
        System.out.println(" Enter the First  variale numbers ");
        a = cin.nextInt();
        System.out.println("Enter the Second number ");
        b = cin.nextInt();

        System.out.println("a= " + a + "b = " + b);
        c = a;
        a = b;
        b = c;

        System.out.println(" After Swapping the numbers \n a= " + a + "b = " + b);

    }
}
