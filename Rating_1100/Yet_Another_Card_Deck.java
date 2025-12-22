import java.util.Scanner;

public class Yet_Another_Card_Deck {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
		int n = scanner.nextInt();
		int q = scanner.nextInt();

		int[] arr = new int[51];
		for(int i=0;i<51;i++){
			arr[i]=n+1;
		}

		for(int i=1; i <= n;i++){
			int color=scanner.nextInt();
			if(arr[color] == n+1){
				arr[color]=i;
			}
		}

		while(q-->0){
			int color=scanner.nextInt();
			int ans=arr[color];

			for(int i=1;i<=50;i++){
				if(arr[i]<ans){
					arr[i]++;
				}
			}

			arr[color]=1;
			System.out.print(ans+" ");
		}
    }
}

//-> https://codeforces.com/problemset/problem/1511/C