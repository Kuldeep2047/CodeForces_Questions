import java.util.Scanner;

public class Nenes_Game {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 

        while(t-- > 0) {
            int k = sc.nextInt(); 
            int q = sc.nextInt(); 

            int[] a = new int[k];
            for (int i=0; i<k; i++){
                a[i] = sc.nextInt();
            }

            
            int first = a[0];

            for(int i = 0; i < q; i++){
                int n = sc.nextInt();
                
                int ans = Math.min(n, first - 1);
                System.out.print(ans + " ");
            }
            System.out.println();
        }
    }
}
