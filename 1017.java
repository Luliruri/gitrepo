import java.util.*;

public class first {
	public static Scanner sc=new Scanner(System.in);
	
	static class pair {
		int input1;
		int input2;
		
	}
	
	public static void main(String[] args) {
		int n=sc.nextInt();
		char[] s=sc.next().toCharArray();
		char[] t=sc.next().toCharArray();
		
		StringBuffer buff=new StringBuffer();
		int count=0;
		
		for(int i=0;i<n;i++) {	
			if(s[i]!=t[i]) {	
				int j=i;
				while(j<n){	
					if(s[j]==t[i])
						break;
					j++;
				}
				
				if(j==n) {	
					System.out.println(-1);
					return;
				}else{	
					for(int k=j;k>i;k--) {
						char temp=s[k];
						s[k]=s[k-input1];
						s[k-input1]=temp;
						count++;
						buff.append(k+" ");
					}
				}
			}	
		}
		
		System.out.println(count);
		System.out.println(buff);
		
		
	}		
}