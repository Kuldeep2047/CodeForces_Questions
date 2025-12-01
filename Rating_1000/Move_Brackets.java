import java.util.Scanner;

public class Move_Brackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            String s = sc.next();

            int ans = 0;
            int sum =0;

            for(int i=0 ;i<n ;i++){
                if(s.charAt(i) == ')'){
                    sum--;
                }else{
                    sum++;
                }

                if(sum < 0){
                    ans++;
                    sum =0;
                }
            }
            System.out.println(ans);

        }
    }
}


//->  https://codeforces.com/problemset/problem/1374/C