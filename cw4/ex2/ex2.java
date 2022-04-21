import java.util.Random;

public class ex2 {
	public static void main(String[] args) {
		Random rand = new Random();
		int rozmiar = 100;
		int arr[] = new int [rozmiar];
		
		for(int j = 4; j <rozmiar ; j++) {
			arr[j] = rand.nextInt(100)+1;
			if (j % 4 == 0) {
			System.out.println("index " + j + ": "+  arr[j] + " ");
			}
		}
	}
}