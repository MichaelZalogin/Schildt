package Exercise8;

public class SortArrays {
    public static int[] sortirovka1(int[] array) {
        int a;
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    index = j;
                }
            }
            if (i != index) {
                a = array[i];
                array[i] = min;
                array[index] = a;
            }
        }
        return array;
    }

    public static void bubbleSort(int[] array) {
        for (int a = 1; a < array.length; a++) {
            for (int b = array.length - 1; b >= a; b--) {
                if (array[b - 1] > array[b]) {
                    int t = array[b - 1];
                    array[b - 1] = array[b];
                    array[b] = t;
                }
            }
        }
    }


    public static void main(String[] args) {
        int[] array1 = {4, 5, 8, 2, 86, 432, 2334, 5436, 32, 213, 645};
        int[] array2 = {4, 7, 3, 54, -67, 53, -67, 543, 233, 678, 443, -432, -322};
        sortirovka1(array1);
        bubbleSort(array2);
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();
        for (int a : array2) {
            System.out.print(a + " ");
        }
    }
}