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
		int input=0;
		int input2=0;
		int input3=scn.nextInt();
		for(int i=0;i<input3;i++){
			char char1=scn.next().charAt(0);
			int input4=scn.nextInt();
			if(char1=='L'){
				map.put(n,=input);
				if(input==input2){
					input2+=input;
				}
				input-=1;
				
			}
			else if(char1=='R'){
				map.put(n, input2);
				if(input==input2){
					input-=1;
				}
				input2+=1;
			}
			else{
				int x=map.get(input4);
				System.out.println(Math.min(Math.abs(input-x), Math.abs(input2-x))-1);
			}
		}
		
	}

}