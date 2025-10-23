package Rating_1200;
import java.util.Scanner;

public class PerfectTeam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int c = sc.nextInt();
            int m = sc.nextInt();
            int x = sc.nextInt();

            int a = Math.min(c,m);
            int b = (c+m+x)/3;

            System.out.println(Math.min(a,b));
        }
    }
}


//-> https://codeforces.com/problemset/problem/1221/C
