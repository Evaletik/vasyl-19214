import java.util.Scanner;

public class ex7 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i = 0; i < n; i++) {
            System.out.print(fibo(i) + " ");
        }
	}
	public static int fibo(int n) {
		if (n<=1) {
			return n;
		}else 
		{
			return fibo(n-1) + fibo(n-2);
		}
	}
}
