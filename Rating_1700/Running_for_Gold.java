package Rating_1700;

import java.util.Scanner;

public class Running_for_Gold {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            int[][] arr = new int[n][5];
            for(int i=0 ;i<n ;i++){
                for(int j=0 ;j<5 ;j++){
                    arr[i][j] = sc.nextInt();
                }
            }

            int cand =0;
            for(int i=1 ;i<n ;i++){
                if(isSuperior(arr[i], arr[cand])){
                    cand = i;
                }
            }

            int f=0;
            for(int i=0 ;i<n ;i++){
                if(i != cand){
                    if(isSuperior(arr[i], arr[cand])){
                        f =1;
                        break;
                    }
                }
            }
            if(f == 1){
                System.out.println(-1);
            }else{
                System.out.println(cand+1);
            }

        }
    }

    //returns true if athlete a is superior to athlete b
    public static boolean isSuperior(int[] a, int [] b){
        int c =0;
        for(int i=0 ;i<5 ;i++){
            if(a[i]<b[i]){
                c++;
            }
        }
        if(c>=3){
            return true;
        }
        return false;
    }
}

//-> https://codeforces.com/group/ibNhxWfOek/contest/341358/problem/B