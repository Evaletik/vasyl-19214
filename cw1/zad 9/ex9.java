package cw1;

import java.util.Random;

public class ex9 {
	public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt(100);
        int b = random.nextInt(100);
        int c = random.nextInt(100);
        int d = random.nextInt(100);
        System.out.println("A = " + a);
        System.out.println("B = " + b);
        System.out.println("C = " + c);
        System.out.println("D = " + d);
        float x = ( (float)(a) / 5 );
        float y = ( (float)(b) / 5 );
        float z = ( (float)(c) / 5 );
        float o = ( (float)(d) / 5 );
        System.out.println( x );
        System.out.println( y );
        System.out.println( z );
        System.out.println( o );
	}
}
