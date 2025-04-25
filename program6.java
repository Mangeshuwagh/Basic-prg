public class program6 {

    public static void main(String[] args) {
        int number = 1204;
        boolean f = false;

        while (number != 0) {

            int check = number % 10;
            if (check == 0) {

                f = true;
                System.out.println(number);
            }
            number /= 10;

        }
        if (f) {
            System.out.println(" number is duck ");

        } else {
            System.out.println(" number is not duck ");
        }
    }

}
