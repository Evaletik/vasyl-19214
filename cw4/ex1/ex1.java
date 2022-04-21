import java.util.Random;

public class ex1 {
	public static void main(String[] args) {
		Random random = new Random();
		int rozmiar = 10;
		int arr[] = new int [rozmiar];
		for(int i = 0; i <rozmiar ; i++) {
			arr[i] = random.nextInt(50)+1;
			System.out.println("przed: " + arr[i] + " |  po dzieleniu przez 2: " + (float)arr[i] / (float)2 );
		}
	}
}
