import java.util.Random;

public class ex4 {
	public static void main(String[] args) {
		Random rdm = new Random();
		int x = rdm.nextInt(100)+1;
		int y = rdm.nextInt(10)+1;
		System.out.println(" Liczba X = " + x);
		System.out.println(" Liczba Y = " + y);
		String textTrue = x + " Jest podzielna przez " + y;
		String textFalse = x + " Nie jest podzielna przez " + y;
		String result = (x % y == 0) ? textTrue : textFalse;
		System.out.println(result);
	}
}
