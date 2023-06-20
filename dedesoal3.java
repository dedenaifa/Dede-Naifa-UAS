import java.util.Scanner;

public class dedesoal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int HitungKelipatan5 = 0;

        System.out.println("Masukkan 10 angka:");

        for (int i = 1; i <= 10; i++) {
            System.out.print("Angka ke-" + i + ": ");
            int angka = input.nextInt();

            if (angka % 5 == 0) {
                HitungKelipatan5++;
            }
        }

        System.out.println("Banyak angka kelipatan 5: " + HitungKelipatan5);
    }
}
