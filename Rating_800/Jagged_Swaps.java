import java.util.*;

public class Jagged_Swaps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();

            int[] arr = new int[n];
            for(int i=0 ;i< n;i++){
                arr[i] = sc.nextInt();
            }
            answer(arr);
        }
    }

    public static void answer(int[] arr) {
        // TODO Auto-generated method stub
        if(arr[0] != 1){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }
    }
}
