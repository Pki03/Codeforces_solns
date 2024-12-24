import java.util.Scanner;

public class l_lcm_easy {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long k = sc.nextLong();

            if (n == 3) {
                System.out.println("1 1 1");
            } else if (n % 4 == 0) {
                System.out.println((n / 2) + " " + (n / 4) + " " + (n / 4));
            } else if (n % 2 == 0) {
                System.out.println(((n / 2) - 1) + " " + ((n / 2) - 1) + " 2");
            } else {
                System.out.println((n / 2) + " " + (n / 2) + " 1");
            }
        }

        sc.close();
    }
}
