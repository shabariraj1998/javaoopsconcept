package OOPsConcepts;

import java.io.*;

	class Area{
		void rect() throws IOException {
			InputStreamReader is = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(is);
			int len,b;
			len =Integer.parseInt(br.readLine());
			b = Integer.parseInt(br.readLine());
			int arearec = len*b;
			System.out.println("The area of Rectangle is :"+arearec);
		}
		void circle(int r) {
			
		}
	}

public class MethodOverloading {
	public static void main(String[]args) {
		
	}
}
