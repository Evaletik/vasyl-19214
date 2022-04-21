package cw1;

import java.util.Random;

public class ex6 {
	public static void main(String[] args) {
		Random x = new Random(), y = new Random(), z = new Random(),k = new Random(),m = new Random();
		int a = x.nextInt(20);
		System.out.println( "X=" + a );
		int b = y.nextInt(20);
		System.out.println( "Y=" + b );
		int c = z.nextInt(20);
		System.out.println( "Z=" + c );
		int d = k.nextInt(20);
		System.out.println( "K=" + d );
		int e = m.nextInt(20);
		System.out.println( "M=" + e );
		int suma = (a+b+c+d+e);
		System.out.println( "Suma =  " + suma );
		if (suma % 2 == 0) {
			System.out.println( suma + " jest liczba parzysta" );
		}else {
			System.out.println( suma + " jest nieparzysta ");
		}
	}
}
