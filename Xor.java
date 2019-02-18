package spoj.com;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Xor {

	public static void main(String[] args) {

		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
			int p;
			int q;
			int ki;
			p = Integer.parseInt(in.readLine());
			q = Integer.parseInt(in.readLine());
			ki = xor(p, q);
			out.println(ki);
			out.flush();
		}
		catch (Exception e) {
			System.out.println("Exception occurred");
		}

	}

	public static int xor(int p, int q) {
		int ki = 0;
		boolean a;
		boolean b;
		a = (p == 1) ? true : false;
		b = (q == 1) ? true : false;
		// A XOR B = (A OR B) AND (NOT (A AND B))
		ki = ((a || b) && (!(a && b))) ? 1 : 0;
		return ki;
	}

}
