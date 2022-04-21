import java.util.Random;

public class ex2 {
	public static void main(String[] args) {
		Random liczba = new Random();
		int x = liczba.nextInt(100)+1;
		for (int i=2; i<=9; i++) {
			if (x % i ==0 ) {
				System.out.println( x + " Jest podzielna przez " + i);
			}
		}
	}
}
