import java.io.*;
1065A - Vasya and Chocolate

import java.util.*;
public class _Solution {

	static final boolean ONLINE_JUDGE = System.getProperty("ONLINE_JUDGE")!=null;
	public static void main(String[] args) {
		new _Solution().run();
	}
	
	BufferedReader in; PrintWriter out; StringTokenizer tok;
	
	void init() throws FileNotFoundException{
		if(ONLINE_JUDGE) {
			in = new BufferedReader(new InputStreamReader(System.in));
					out = new PrintWriter(System.out);
		} else {
			in = new BufferedReader(new FileReader("input.txt"));
			out = new PrintWriter("output.txt");
		}
		tok = new StringTokenizer("");
	}
	void run() {
		try {
			long timeStart = System.currentTimeMillis();
			init();
			solve();
			out.close();
			long timeEnd = System.currentTimeMillis();
			System.err.println("Time = " + (timeEnd - timeStart));
		} catch(Exception e){
			e.printStackTrace();
			System.exit(-1);
		}
	}
	
	String readLine() throws IOException{
		return in.readLine();
	}
	String delimiter = " ";
	String readString() throws IOException{
		while(!tok.hasMoreTokens()) {
			String nextLine = readLine();
			if(null == nextLine) return null;
			tok = new StringTokenizer(nextLine);
		}
		return tok.nextToken(delimiter);
	}
	
	int readInt() throws IOException{
		return Integer.parseInt(readString());
	}
	
	long readLong() throws IOException{
		return Long.parseLong(readString());
	}
	
	int[] readIntArray(int n) throws IOException{
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = readInt();
		}
		return a;
	}
	long[] readLongArray(int n) throws IOException{
		long[] a = new long[n];
		for (int i = 0; i < n; i++) {
			a[i] = readLong();
		}
		return a;
	}
	
	boolean isSimple(int x) {
		boolean ans = true;
		for(int i = 2; i < Math.sqrt(x); i++) {
			if(x % i == 0) {
				ans = false;
				break;
			}
		}
		return ans;
	}
	
	void solve() throws IOException{
		int n = readInt();
		long[][] m = new long[n][4];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < 4; j++) {
				m[i][j] = readInt();
			}
			out.println( (m[i][0] / (m[i][1]*m[i][3]))*m[i][2] + m[i][0] / m[i][3] );
		}
		
	}

}