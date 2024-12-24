import java.util.Scanner;

public class napoleon_cake {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int t = s.nextInt(); // Read number of test cases
        while (t-- > 0) {
            int n = s.nextInt(); // Read number of layers for this test case
            int[] cream = new int[n];
            for (int i = 0; i < n; i++) {
                cream[i] = s.nextInt(); // Read the cream amounts
            }

            int[] ans = new int[n];
            int c = 0; // The number of layers drenched by cream

            // Process layers from top to bottom
            for (int i = n - 1; i >= 0; i--) {
                c=Math.max(c,cream[i]); // Add cream poured on this layer
                if (c > 0) {
                    ans[i] = 1; // This layer is drenched
                    c--; // One unit of cream has drenched this layer
                }
            }

            // Output the results for the current test case
            for (int i = 0; i < n; i++) {
                System.out.print(ans[i] + " ");
            }
            System.out.println();
        }
    }
}
