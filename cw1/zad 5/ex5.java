package cw1;

import java.util.Random;

public class ex5 {
	public static void main(String[] args) {
		Random x = new Random(), y = new Random();
		int a = x.nextInt(20);
		System.out.println( "X=" + a );
		int b = y.nextInt(20);
		System.out.println( "Y=" + b );
		if (a % b != 0) {
			System.out.println( a + " jest niepodzielna przez " + b );
		}else {
			System.out.println( a + " jest podzielna przez " + b );
		}
	}
}
