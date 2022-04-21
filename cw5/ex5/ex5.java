package cw5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class ex5 {
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("tablice liczbEX1.txt");
		try (Scanner scanner = new Scanner(file)) {
			Random random = new Random();
			
			String numString = scanner.nextLine();
			String[] arr = numString.split(" ");
			int randNum = random.nextInt(10);
			
			System.out.println("Rand num: " + randNum);
			System.out.println("Numbers: " + numString);
			System.out.print("Numbers after multiply: ");
			
			for(int i=0; i<arr.length; i++) {
				int num = Integer.valueOf(arr[i]);
				System.out.print(num * randNum + " ");
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
