package cw5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ex8 {
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("tablice liczbEX4.txt");
		try (Scanner scanner = new Scanner(file)) {
			System.out.println( scanner.nextLine() );
		}
	}
}
