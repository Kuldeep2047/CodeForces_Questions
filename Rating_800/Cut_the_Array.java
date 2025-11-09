import java.util.*;

public class Cut_the_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int test = 0; test < t; test++) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            int[] prefix = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                prefix[i] = (prefix[i - 1] + a[i - 1]) % 3;
            }
            boolean found = false;
            int ansL = 0, ansR = 0;
            for (int l = 1; l <= n - 2 && !found; l++) {
                for (int r = l + 1; r <= n - 1 && !found; r++) {
                    int s1 = prefix[l];
                    int s2 = (prefix[r] - prefix[l] + 3) % 3;
                    int s3 = (prefix[n] - prefix[r] + 3) % 3;
                    boolean allSame = (s1 == s2 && s2 == s3);
                    boolean allDiff = (s1 != s2 && s1 != s3 && s2 != s3);
                    if (allSame || allDiff) {
                        found = true;
                        ansL = l;
                        ansR = r;
                    }
                }
            }
            if (found) {
                System.out.println(ansL + " " + ansR);
            } else {
                System.out.println("0 0");
            }
        }
    }
}
