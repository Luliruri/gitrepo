1066C - Books Queries

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class book_queries_contest {
	static class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
        { 
            br = new BufferedReader(new
                     InputStreamReader(System.in)); 
        } 
  
        String next() 
        { 
            while (st == null || !st.hasMoreElements()) 
            { 
                try
                { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
  
        int nextInt() 
        { 
            return Integer.parseInt(next()); 
        } 
  
        long nextLong() 
        { 
            return Long.parseLong(next()); 
        } 
  
        double nextDouble() 
        { 
            return Double.parseDouble(next()); 
        } 
  
        String nextLine() 
        { 
            String str = ""; 
            try
            { 
                str = br.readLine(); 
            } 
            catch (IOException e) 
            { 
                e.printStackTrace(); 
            } 
            return str; 
        } 
    }	

	public static void main(String[] args) {
		// TODO Auto-generated method stub		  
		
		FastReader scn=new FastReader();
		HashMap<Integer,Integer> map=new HashMap<>();
		int l=0;
		int r=0;
		int q=scn.nextInt();
		for(int i=0;i<q;i++){
			char c=scn.next().charAt(0);
			int n=scn.nextInt();
			if(c=='L'){
				map.put(n,l);
				if(l==r){
					r+=1;
				}
				l-=1;
				
			}
			else if(c=='R'){
				map.put(n, r);
				if(l==r){
					l-=1;
				}
				r+=1;
			}
			else{
				int x=map.get(n);
				System.out.println(Math.min(Math.abs(l-x), Math.abs(r-x))-1);
			}
		}
		
	}

}