package cw5;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class ex2 {
	public static void main(String[] args) throws IOException {
		Random rand = new Random();
		int wierszy = 3;
		int kolumny = 5;
		int arr[][] = new int [wierszy][kolumny];
		
		for(int i=0; i<wierszy; i++) {
			for(int j = 0; j <kolumny ; j++) {
				arr[i][j] = rand.nextInt(30)+10;
				System.out.print(arr[i][j] + " ");
			}
			System.out.print("\n");
		}
		System.out.println();
		System.out.println("Nr albumu: 19214");
		System.out.println();
		for(int i=0; i<wierszy; i++) {
			for(int j = 0; j <kolumny ; j++) {
				System.out.print(arr[i][j] + "+14=" + (arr[i][j]+ 14) + " ");
			}
			System.out.print("\n");
		}
		System.out.println();
		for(int i=0; i<wierszy; i++) {
			for(int j = 0; j <kolumny ; j++) {
				System.out.print(arr[i][j] + 14 +  " ");
			}
			System.out.print("\n");
		}
		System.out.println();
		try {
			FileWriter plik = new FileWriter("tablice liczbEX2.txt");
			for(int i=0; i<wierszy; i++) {
				for(int j = 0; j <kolumny ; j++) {
				plik.write(String.valueOf(arr[i][j] + 14));
				plik.write(" ");
				}
			plik.write("\n");
			}
			plik.close();
			System.out.println("ZAPISANO");
		} catch (IOException e) {
			System.out.println("Blad, nie mozna utworzyc plik");
			e.printStackTrace();
		}
		
		
	}
}
