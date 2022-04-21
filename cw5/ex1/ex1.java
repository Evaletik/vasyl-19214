package cw5;


import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;


public class ex1 {
	public static void main(String[] args) throws IOException {
		Random rand = new Random();
		int rozmiar = 10;
		int arr[] = new int [rozmiar];
		
		for(int j = 0; j <rozmiar ; j++) {
			arr[j] = rand.nextInt(100)+1;
			System.out.print(arr[j] + " ");
		}
		System.out.println();
		try {
			FileWriter plik = new FileWriter("tablice liczbEX1.txt");
			for(int j = 0; j <rozmiar ; j++) {
				plik.write(String.valueOf(arr[j]));
				plik.write(" ");
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
