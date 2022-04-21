import java.util.Scanner;

public class ex2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Podaj imie i nazwisko");
		System.out.print("Imie: ");
		String name = scan.next();
		System.out.print("Nazwisko: ");
		String surname = scan.next();
		System.out.print(name.toUpperCase());
		System.out.println(" " + surname.toUpperCase());
		
	}
}
