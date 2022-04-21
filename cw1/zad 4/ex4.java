package cw1;

import java.util.Random;

public class ex4 {
	public static void main(String[] args) {
		Random x = new Random(), y = new Random(), z = new Random();
		int a = x.nextInt(20);
		System.out.println( "X=" + a );
		int b = y.nextInt(20);
		System.out.println( "Y=" + b );
		int c = z.nextInt(20);
		System.out.println( "Z=" + c );
		float srd = ( (float)(a+b+c) / 3 );
		System.out.println( "srednia = " + srd );
	}
}
