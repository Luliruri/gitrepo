import java.io.*;
import java.util.*;
public class VasyaChocolate {

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
		int[] input3 = new int[n];
		for (int i = 0; i < n; i++) {
			input3[i] = readInt();
		}
		return input3;
	}
	long[] readLongArray(int n) throws IOException{
		long[] input3 = new long[n];
		for (int i = 0; i < n; i++) {
			input3[i] = readLong();
		}
		return input3;
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
		int input = readInt();
		long[][] input2 = new long[n][4];
		for(int i = 0; i < input; i++) {
			for(int j = 0; j < 4; j++) {
				input2[i][j] = readInt();
			}
			out.println( (input2[i][0] / (input2[i][1]*input2[i][3]))*input2[i][2] + input2[i][0] / input2[i][3] );
		}
		
	}

}