package cw1;

import java.util.Random;

public class ex3 {
	public static void main(String[] args) {
		Random x = new Random();
		Random y = new Random();
		int a = x.nextInt(20);
		System.out.println( "X=" + a );
		int b = y.nextInt(20);
		System.out.println( "Y=" + b );
		
		if (a>b) {
			System.out.print( "pierwsza liczba jest wieksza od drugiej " );
		}else {
			System.out.print( "pierwsza liczba NIE jest wieksza od drugiej " );
		}
	}
}
