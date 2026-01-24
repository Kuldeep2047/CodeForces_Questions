package Rating_1400;

import java.util.Scanner;

public class Grouping_Increases {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0 ;i<n ;i++){
                arr[i] = sc.nextInt();
            }
            System.out.println(answer(arr));
        }
    }
    public static int answer(int[] arr){
        int n = arr.length;
        int x = Integer.MAX_VALUE;
        int y = Integer.MAX_VALUE;
        int ans =0;

        for(int i=0 ;i<n ;i++){

            //keep x<y
            if(x>y){
                int temp = y;
                y = x;
                x = temp;
            }

            if(arr[i]<=x){
                x = arr[i]; //first sequence
            }
            else if(arr[i]<=y){
                y = arr[i]; //second sequence
            }
            else{
                x = arr[i];
                ans++;
            }
        }
        return ans;
    }
}

//-> https://codeforces.com/problemset/problem/1919/C