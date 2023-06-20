import java.util.Scanner;

public class SoalNo1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan sebuah angka: ");

        if (input.hasNextInt()) {
            int angka = input.nextInt();

            if (angka % 5 == 0) {
                System.out.println(angka + " adalah merupakan kelipatan 5.");
            } else {
                System.out.println(angka + " bukan kelipatan 5.");
            }
        } else {
            System.out.println("Input yang dimasukkan bukan angka.");
        }

        input.close();
    }
}
