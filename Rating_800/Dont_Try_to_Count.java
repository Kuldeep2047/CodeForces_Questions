import java.util.*;

public class Dont_Try_to_Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            String x = sc.next();

            String s = sc.next();

            int c =-1;
            String curr = x;
            for(int i= 0 ; i<10 ;i++){
                if(curr.contains(s)){
                    // c++;
                    c= i;
                    break;

                }
                curr = curr + curr;
            }

            System.out.println(c);

        }

    }
}
