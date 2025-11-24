package Rating_1500;

import java.util.Scanner;

public class Block_Sequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i= 0 ;i<n ;i++){
                arr[i] = sc.nextInt();
            }
            System.out.println(answer(arr));
        }
    }
    public static int answer(int[] arr){
        int n = arr.length;
        int[] dp = new int[n+1];

        for(int i=n-1 ;i>=0 ;i--){
            //delete
            dp[i] = dp[i+1]+1;

            //keep
            int j = i+ arr[i]+1;

            if(j<=n){
                dp[i] = Math.min(dp[i], dp[j]);
            }
        }
        return dp[0];
    }
}
