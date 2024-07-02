package Algorithm;

public class BinarySearch {
    public static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Verifica se o elemento do meio é o alvo
            if (array[mid] == target) {
                return mid; // Elemento encontrado
            }

            // Se o elemento do meio é maior que o alvo, ajuste o ponteiro high
            if (array[mid] > target) {
                high = mid - 1;
            } else {
                // Se o elemento do meio é menor que o alvo, ajuste o ponteiro low
                low = mid + 1;
            }
        }

        return -1; // Elemento não encontrado
    }

    public static void main(String[] args) {
        int[] sortedArray = { 2, 3, 4, 10, 40 };
        int target = 10;
        int result = binarySearch(sortedArray, target);

        if (result == -1) {
            System.out.println("Elemento não encontrado.");
        } else {
            System.out.println("Elemento encontrado no índice: " + result);
        }
    }
}
