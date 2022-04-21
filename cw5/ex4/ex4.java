package cw5;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ex4 {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {			
			int X = scanner.nextInt();
			int Y = scanner.nextInt();
			
			
			for(int j = X; j <=Y ; j++) {
				if(j % 2 == 0) {
					System.out.print(j + " ");
				}
			}
			System.out.println();
			try {
				FileWriter plik = new FileWriter("tablice liczbEX4.txt");
				for(int j = X; j <=Y ; j++) {
					if(j % 2 == 0) {
					plik.write(String.valueOf(j));
					plik.write(" ");
					}
				}
				plik.write("\n");
				plik.close();
				System.out.println("ZAPISANO");
			} catch (IOException e) {
				System.out.println("Blad, nie mozna utworzyc plik");
				e.printStackTrace();
			}
		}
	}
}
