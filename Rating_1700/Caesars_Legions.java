package Rating_1700;

import java.util.Scanner;

public class Caesars_Legions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int k1 = sc.nextInt();
        int k2 = sc.nextInt();
        answer(n1, n2, k1, k2);
    }

    public static void answer(int n1, int n2, int k1, int k2){
        //dp[i][j][last][cnt]
        long[][][][] dp = new long[n1+1][n2+1][2][11];
        int MOD = 100000000;

        //base case
        if(n1>=1){
            dp[1][0][0][1] = 1;
        }
        if(n2>=1){
            dp[0][1][1][1] = 1;
        }

        for(int i=0 ;i<=n1 ;i++){
            for(int j=0 ;j<=n2 ;j++){
                for(int last =0 ;last<=1 ;last++){
                    int maxCnt= (last == 0 ? k1 : k2);
                    for(int cnt=1 ;cnt<=maxCnt; cnt++){
                        if(dp[i][j][last][cnt] == 0){
                            continue;
                        }

                        //add footmen 
                        if(i<n1){
                            int newCnt = (last == 0 ? cnt+1 :1);
                            if(newCnt <= k1){
                                dp[i+1][j][0][newCnt] = (dp[i + 1][j][0][newCnt] + dp[i][j][last][cnt]) % MOD;
                            }
                        }

                        //add horsemen
                        if(j<n2){
                            int newCnt = (last == 1 ? cnt+1 :1);
                            if(newCnt <= k2){
                                dp[i][j + 1][1][newCnt] = (dp[i][j + 1][1][newCnt] + dp[i][j][last][cnt]) % MOD;
                            }
                        }
                    }
                }
            }
        }
        long ans = 0;
        for (int last = 0; last < 2; last++) {
            int maxCnt = (last == 0 ? k1 : k2);
            for (int cnt = 1; cnt <= maxCnt; cnt++) {
                ans = (ans + dp[n1][n2][last][cnt]) % MOD;
            }
        }
        System.out.println(ans);
    }
}


//-> https://codeforces.com/contest/118/problem/D