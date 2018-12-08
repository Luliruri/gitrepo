1065C - Make It Equal

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		InputReader in = new InputReader(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		Task solver = new Task();
		solver.solve(1, in, out);
		out.close();
	}

	static class Task {
		public void solve(int testNumber, InputReader in, PrintWriter out) {
			int n = in.nextInt();
			int k = in.nextInt();
			int[] v = new int[200001];
			int low = 200001;
			int high = 0;
			int[] hs = new int[n];
			for (int i = 0; i < n; i++) {
				hs[i] = in.nextInt();
			}
			Arrays.sort(hs);
			low = hs[0];
			high = hs[n - 1];
			if (low == high) {
				out.println(0);
				return;
			}
			for (int i = 1; i <= low; i++) {
				v[i] = n;
			}
			int cur = low;
			for (int i = 1; i < n; i++) {
				if (hs[i] > cur) {
					for (int j = cur + 1; j <= hs[i]; j++) {
						v[j] = (n - i);
					}
					cur = hs[i];
				}
			}
			long sum = 0;
			int count = 0;
			for (int i = high; i >= low; i--) {
				if (i == low && sum > 0) {
					count++;
					break;
				}
				if (sum + v[i] > k) {
					sum = v[i];
					count++;
				} else {
					sum += v[i];
					if (i == low) {
						count++;
					}
				}
			}
			out.println(count);
		}
	}

	static class InputReader {
		public BufferedReader reader;
		public StringTokenizer tokenizer;

		public InputReader(InputStream stream) {
			reader = new BufferedReader(new InputStreamReader(stream), 32768);
			tokenizer = null;
		}

		public String next() {
			while (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					tokenizer = new StringTokenizer(reader.readLine());
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			return tokenizer.nextToken();
		}

		public int nextInt() {
			return Integer.parseInt(next());
		}

		public Long nextLong() {
			return Long.parseLong(next());
		}

		public Double nextDouble() {
			return Double.parseDouble(next());
		}
	}