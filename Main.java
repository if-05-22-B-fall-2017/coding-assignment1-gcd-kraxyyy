package erhart.lukas.gcd;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x = Integer.parseInt(s.nextLine());
		int y = Integer.parseInt(s.nextLine());
		
		while(y > 0) {
			int c = x % y;
			x = y;
			y = c;
		}
		
		System.out.println(x);
	}
}
