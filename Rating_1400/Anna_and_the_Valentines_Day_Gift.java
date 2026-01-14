package Rating_1400;

import java.util.*;

public class Anna_and_the_Valentines_Day_Gift {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0 ;i<n ;i++){
                arr[i] = sc.nextInt();
            }
            System.out.println(answer(arr, n, m));
        }
        
    }
    public static String answer(int[] arr, int n, int m){
        int totalDigit =0;
        int[] leading = new int[n]; // array to store no. of leading zeroes of each element

        for(int i=0 ;i<n ;i++){
            while(arr[i] % 10 == 0){
                leading[i]++;
                totalDigit++;
                arr[i] = arr[i] /10;
            }
            while(arr[i]>0){
                totalDigit++;
                arr[i] = arr[i]/10;
            }
        }

        Arrays.sort(leading);
        //for Anna counting the no. of digit alternatively

        // int c =0;
        for(int i=n-1 ;i>=0 ;i-=2){
            totalDigit -= leading[i];
        }

        if(totalDigit > m){
            return "Sasha";
        }else{
            return "Anna";
        }
    }
}

//-> https://codeforces.com/problemset/problem/1931/E