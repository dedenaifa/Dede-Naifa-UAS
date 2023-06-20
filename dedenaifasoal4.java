import java.util.Scanner;

public class dedenaifasoal4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hitung = 0;

        System.out.println("Masukkan 10 teks:");

        for (int i = 0; i < 10; i++) {
            String text = input.nextLine();
            if (text.length() == 5) {
                hitung++;
            }
        }

        System.out.println("Jumlah teks dengan panjang 5 karakter: " + hitung);
    }
}
