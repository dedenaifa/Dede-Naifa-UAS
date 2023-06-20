import java.util.Scanner;

public class dedenaifasoal02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan sebuah teks: ");
        String teks = scanner.nextLine();

        int panjangTeks = 0;
        for (char karakter : teks.toCharArray()) {
            panjangTeks++;
        }

        if (panjangTeks == 5) {
            System.out.println("Panjang teks adalah 5 karakter.");
        } else {
            System.out.println("Panjang teks bukan 5 karakter.");
        }
    }
}
