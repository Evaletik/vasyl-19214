package cw1;

import java.util.Random;

public class ex8 {
	public static void main(String[] args) {
		Random x = new Random(), y = new Random(), z = new Random();
		int a = x.nextInt(20);
		System.out.println( "X=" + a );
		int b = y.nextInt(20);
		System.out.println( "Y=" + b );
		int c = z.nextInt(20);
		System.out.println( "Z=" + c );
		
		if (a>b && b>c) {
			System.out.println( a + " " + b + " " + c );
		} else if (a>b && b<c && a>c) {
			System.out.println( a + " " + c + " " + b );
		}else if (b>a&& a>c ) {
			System.out.println( b + " " + a + " " + c );
		}else if (b>a && a<c && b>c) {
			System.out.println( b + " " + c + " " + a );
		}else if (c>a && a>b ) {
			System.out.println( c + " " + a + " " + b );
		}else if (c>a && a<b && c>b) {
			System.out.println( c + " " + b + " " + a );
		}
	}
}
