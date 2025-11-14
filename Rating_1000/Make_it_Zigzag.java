import java.util.Scanner;

public class Make_it_Zigzag {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int test = 0; test < t; test++) {
            int n = sc.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }
            long[] M = new long[n];
            M[0] = a[0];
            for (int i = 1; i < n; i++) {
                M[i] = Math.max(M[i - 1], a[i]);
            }
            long[] U = new long[n];
            for (int i = 0; i < n; i++) {
                U[i] = M[i];
            }
            for (int i = 0; i < n - 1; i++) {
                if ((i + 1) % 2 == 1) { 
                    U[i] = Math.min(U[i], M[i + 1] - 1);
                } else {
                    U[i + 1] = Math.min(U[i + 1], M[i] - 1);
                }
            }
            long cost = 0;
            for (int i = 0; i < n; i++) {
                cost += Math.max(0, a[i] - U[i]);
            }
            System.out.println(cost);
        }
    }
}
