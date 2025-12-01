import java.util.Scanner;

public class Reverse_a_Substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        
        int f = 1;

        for(int i=0 ;i<n-1 ;i++){
            if(s.charAt(i)> s.charAt(i+1)){
                System.out.println("YES");
                System.out.println((i+1) + " " + (i+2));
                f= 0;
                break;
            }
        }

        if(f==1){
            System.out.println("NO");
        }
    }
}


//->  https://codeforces.com/problemset/problem/1155/A