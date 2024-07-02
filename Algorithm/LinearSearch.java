package Algorithm;

public class LinearSearch {

    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; // Retorna o índice do elemento encontrado
            }
        }
        return -1; // Retorna -1 se o elemento não for encontrado
    }

    public static void main(String[] args) {
        int[] array = { 10, 20, 30, 40, 50 };
        int target = 30;

        int result = linearSearch(array, target);

        if (result != -1) {
            System.out.println("Elemento encontrado no índice: " + result);
        } else {
            System.out.println("Elemento não encontrado no array.");
        }
    }
}