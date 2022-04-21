import java.util.Random;

public class ex3 {
	public static void main(String[] args) {
		Random rand = new Random();
		int rozmiar = 20;
		int arr[] = new int [rozmiar];
		
		for(int j = 0; j <rozmiar ; j++) {
			arr[j] = rand.nextInt(100)+1;
			if (arr[j]>50) {
				System.out.print(arr[j] + " ");
			}
		}
	}
}