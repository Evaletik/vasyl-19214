package cw1;

import java.util.Random;

public class ex2 {
	public static void main(String[] args) {
		Random x = new Random();
		int y = x.nextInt(8);
		System.out.println( "X=" + y );
		if (y>=3 && y<=5) {
			System.out.print( "liczba X zawiera sie w przedziale (3,5) " );
		}else {
			System.out.print( "liczba X nie zawiera sie w przedziale (3,5) " );
		}
	}
}
