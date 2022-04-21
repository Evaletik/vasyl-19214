package cw5;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class ex3 {
	public static void main(String[] args) throws IOException {
		Random rand = new Random();
		int wierszy = 2;
		int kolumny = 3;
		int arr[][] = new int [wierszy][kolumny];
		
		int wierszy1 = 3;
		int kolumny1 = 2;
		int arr1[][] = new int [wierszy1][kolumny1];
		
		for(int i=0; i<wierszy; i++) {
			for(int j = 0; j <kolumny ; j++) {
				arr[i][j] = rand.nextInt(4)+1;
				System.out.print(arr[i][j] + " ");
			}
			System.out.print("\n");
		}
		System.out.print("\n");
		

		
		for(int i=0; i<wierszy1; i++) {
			for(int j = 0; j<kolumny1 ; j++) {
				arr1[i][j] = rand.nextInt(6)+1;
				System.out.print(arr1[i][j] + " ");
			}
			System.out.print("\n");
		}
		
		int [][] res = new int [wierszy][kolumny1];
		
		for(int i=0; i<res.length; i++) {
			for(int j = 0; j<res[i].length ; j++) {
				for(int k=0; k<res[i].length+1; k++) {
//					System.out.println(res[i][j] + "+=" + arr[i][k] + "*" + arr1[k][j] );
					res[i][j]+=arr[i][k]*arr1[k][j];
					
				}
			}
		}
		System.out.print("\n");
		
		for(int i=0; i<wierszy; i++) {
			for(int j = 0; j<wierszy ; j++) {
					System.out.print( res[i][j]+" ");
			}
			System.out.print("\n");
		}
		
		try {
			FileWriter plik = new FileWriter("tablice liczbEX3.txt");
			plik.write(wierszy + "x" + kolumny+"\n");
			
			for(int i=0; i<wierszy; i++) {
				for(int j = 0; j <kolumny ; j++) {
				plik.write(String.valueOf(arr[i][j] ));
				plik.write(" ");
				}
			plik.write("\n");
			}
			plik.write("\n");
			plik.write(wierszy1 + "x" + kolumny1+"\n");
			for(int i=0; i<wierszy1; i++) {
				for(int j = 0; j <kolumny1 ; j++) {
				plik.write(String.valueOf(arr1[i][j] ));
				plik.write(" ");
				}
			plik.write("\n");
			}
			plik.write("\n");
			plik.write(wierszy + "x" + kolumny1+"\n");
			for(int i=0; i<wierszy; i++) {
				for(int j = 0; j <kolumny1 ; j++) {
				plik.write(String.valueOf(res[i][j] ));
				plik.write(" ");
				}
			plik.write("\n");
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
