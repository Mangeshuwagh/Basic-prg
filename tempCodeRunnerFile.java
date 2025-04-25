// 3. Write program to character from keyboard and check character is alphabet digit or special
// symbols?

import java.util.Scanner;

public class tempCodeRunnerFile {

    public static void main(String[] args) {

        System.out.println(" Enter the Charaters : ");
        char ch;
        Scanner cin = new Scanner(System.in);
        ch = cin.nextLine().charAt(0);
        System.out.println("show the Charaters: " + ch);
        if (ch >= 'A' || ch <= 'Z' && ch >= 'a' || ch <= 'z') {
            System.out.println(" Charter is the alphaber");

        } else if (ch >= '0' || ch <= '9') {
            System.out.println("charter is the  numbers " + ch);

        } else {
            System.out.println("Special Symbol: " + ch);
        }

    }

}
