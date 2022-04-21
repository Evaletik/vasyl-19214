import java.util.Scanner;

public class ex4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String zdanie = scanner.nextLine();
		
		System.out.print(isPalindrom(zdanie, reverseString(zdanie)));
	}
	
	public static String reverseString(String str) {
		char chars[] = str.toCharArray();
		String reserv = "";
		for(int i = chars.length - 1; i >= 0; i--) {
			reserv += chars[i];
		}
		return reserv;
	}
	
	public static boolean isPalindrom(String first, String second) {
		System.out.println(first.replaceAll("\s", "").toLowerCase());
		System.out.println("reversed: " + second.replaceAll("\s", "").toLowerCase());
		if(first.replaceAll("\s", "").toLowerCase().equals( second.replaceAll("\s", "").toLowerCase())) {
			return true;
		}
		return false;
	}
}
