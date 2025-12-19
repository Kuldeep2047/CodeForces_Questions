import java.util.*;

public class Maximum_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0 ;i<n ;i++){
                arr[i] = sc.nextInt();
            }
            answer(arr, k);
        }
        
    }

    public static void answer(int[] arr ,int k){
        int n = arr.length;
        Arrays.sort(arr);

        // Prefix sum nikala
        long[] pref = new long[n + 1];
        for(int i=0;i <n; i++) {
            pref[i+ 1] = pref[i]+ arr[i];
        }

        long totalSum = pref[n];
        long ans = 0;

        
        for(int x = 0; x <= k; x++){
            int removeMin = 2*x;
            int removeMax = k-x;

            if(removeMin + removeMax > n){
                continue;
            }

            long removedSum = pref[removeMin] +(pref[n] - pref[n -removeMax]);

            ans = Math.max(ans, totalSum - removedSum);
        }

        System.out.println(ans);
    }
}

//-> https://codeforces.com/problemset/problem/1832/B