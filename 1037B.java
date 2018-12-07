1037B

import java.util.*;
public class 1037B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int s  = sc.nextInt();
		int[] arr = new int[n];
		
		
				
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
			
		}
		Arrays.sort(arr);
		
		if(arr[n/2]==s){
			System.out.println(0);
		}
		else if(arr[n/2]>s){
			long ans = 0;
			for(int i=0;i<=n/2;i++){
				if(arr[i]>s){
					ans+=arr[i]-s;
				}
			}
			System.out.println(ans);
		}else{
			long ans = 0;
			for(int i=n/2;i<n;i++){
				if(arr[i]<s){
					ans+=s-arr[i];
				}
			}
			System.out.println(ans);
		}
		
		

	}

}