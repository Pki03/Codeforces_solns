import java.util.*;

public class meximization {

    public static void solve(Scanner sc) {
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[101];

        // Reading input and counting occurrences
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[a[i]]++;
        }

        // Print each number once, in order
        for (int i = 0; i <= 100; i++) {
            if (b[i] > 0) {
                System.out.print(i + " ");
                b[i]--;
            }
        }

        // Print remaining duplicates
        for (int i = 0; i <= 100; i++) {
            for (int j = 0; j < b[i]; j++) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  // Number of test cases
        while (t-- > 0) {
            solve(sc);
        }
        sc.close(); // Close scanner after all input is processed
    }
}
