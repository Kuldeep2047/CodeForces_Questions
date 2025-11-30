import java.util.*;

//-> https://codeforces.com/problemset/problem/1610/B

public class Kalindrome_Array {
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

    public static String answer(int[] arr){
        int n = arr.length;
        int i=0;
        int j = n-1;
        while(i<j){
            if(arr[i] != arr[j]){

                //ab check karenge ki arr[i] or arr[j] ko remove kerke palindrome hoga ya nhi
                if(isBecomePalindrome(arr, arr[i]) || isBecomePalindrome(arr, arr[j])){
                    return "YES";
                }else{
                    return "NO";
                }
            }
            i++;
            j--;
        }
        return "YES";       
    }

    public static boolean isBecomePalindrome(int[] arr, int num){
        List<Integer> ll = new ArrayList<>();
        for(int i=0 ;i< arr.length; i++){
            if(arr[i] != num){
                ll.add(arr[i]);
            }
        }

        //now check palindrome
        int i=0 , j= ll.size()-1;
        while(i<j){
            if(!ll.get(i).equals(ll.get(j))){
                return false;
            }
            i++;
            j--;
        }
        return true;

    }
}
