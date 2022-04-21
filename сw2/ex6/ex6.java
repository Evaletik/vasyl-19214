import java.util.Scanner;

public class ex6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int liczba = scan.nextInt();
		switch (liczba) {
		case 1: 
			System.err.println("Jeden");
			break;		
		case 2:
			System.err.println("Dwa");
			break;	
		case 3:
			System.err.println("Trzy");
			break;	
		case 4:
			System.err.println("Cztery");
			break;
		case 5:
			System.err.println("Piec");
			break;	
		default:
			throw new AssertionError();
		}
	}
}
