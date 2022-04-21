package cw3;

import java.util.Random;
import java.util.Scanner;

public class ex6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int num = scanner.nextInt();
		for(int i = 0; i <= 10; i++) {
			int randNum = random.nextInt(50)+10;
			if(randNum - num > 0) {
				System.out.println("Random number: " + randNum + " | "  + randNum + " - " + num + "   Wynik: " + "+" + (randNum - num) );
			} else {
				System.out.println("Random number: " + randNum + " | "  + randNum + " - " + num + "   Wynik: " + (randNum - num) );
			}
		}
	}
}
