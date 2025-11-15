import java.util.*;

public class Olya_and_Game_with_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while(t-- > 0){
            long n = sc.nextLong();
            List<Long> sec = new ArrayList<>();
            long min = Long.MAX_VALUE;

            for (int i = 0; i < n; i++) {
                long m = sc.nextLong();
                long[] arr = new long[(int) m];
                for (int j = 0; j < m; j++) arr[j] = sc.nextLong();
                Arrays.sort(arr);
                sec.add(arr[1]);
                min = Math.min(min, arr[0]);
            }

            Collections.sort(sec);
            long sum = 0;
            for (long x : sec) sum += x;

            long ans = min + sum - sec.get(0);
            System.out.println(ans);
        }
    }
}
