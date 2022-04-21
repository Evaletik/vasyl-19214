import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int cegiel = N;
        for(int i = 1; ; i++) {
            if(cegiel >= 0) {
                int patlu = i;
                if(cegiel <= patlu) {
                    System.out.print(cegiel + " ");
                    System.out.print("\nWygral Patlu");
                    break;
                }
                
                System.out.print(patlu + " ");
                cegiel -= i;
                int motu = i * 2;
                if(cegiel <= motu) {
                    System.out.print(cegiel);
                    System.out.print("\nWygral Motu ");
                    break;
                }
                System.out.print(motu + "\n");
                cegiel -= motu;
            }
        }
    }
}
