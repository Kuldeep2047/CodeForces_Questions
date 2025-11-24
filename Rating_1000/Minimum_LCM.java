import java.util.Scanner;

public class Minimum_LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while(t-- >0){
            long n = sc.nextLong();

            long a =1;
            long b = n-1;

            for(int f=2 ;f*f<=n ;f++){
                if(n% f ==0){
                    a = n/f;
                    b = n-a;

                    break;
                }
            }
            System.out.println(a+ " "+ b);
        }
    }
}
