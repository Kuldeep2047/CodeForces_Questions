import java.util.Scanner;

public class Swap_and_Delete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            String s = sc.next();
            answer(s);
        }
    }

    public static void answer(String s) {
        // TODO Auto-generated method stub
        int z =0;

        for(char c : s.toCharArray()) {
            if (c == '0'){
                z++;
            }
        }

        int ones = s.length() - z;
        int ans = 0;

        for(int i =0 ;i<s.length() ;i++) {
            char c = s.charAt(i);
            if(c == '0') {
                if(ones == 0){
                    break;
                }
                ones--;
            } 
            else{
                if(z == 0){
                    break;
                }
                z--;
            }
            ans++;
        }

        System.out.println(s.length() - ans);
    }
}
