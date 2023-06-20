import java.util.Arrays;

public class dedenaifasoal05 {
    public static class SearchArray {
        public static int[] findIndexes(int[] array, int target) {
            int count = 0;

            // Menghitung jumlah kemunculan angka target dalam array
            for (int num : array) {
                if (num == target) {
                    count++;
                }
            }

            // Membuat array hasil dengan ukuran yang sesuai
            int[] indexes = new int[count];
            int index = 0;

            // Menyimpan indeks angka target dalam array
            for (int i = 0; i < array.length; i++) {
                if (array[i] == target) {
                    indexes[index++] = i;
                }
            }

            return indexes;
        }

        public static void main(String[] args) {
            int[] numbers = {2, 5, 8, 2, 9, 5, 1};
            int targetNumber = 5;

            int[] result = findIndexes(numbers, targetNumber);

            System.out.println("Angka " + targetNumber + " ditemukan pada indeks: " + Arrays.toString(result));
        }
    }
}
