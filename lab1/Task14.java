public class Task14 {
    public static void cycleSwap(int[] array) {
        if (array.length <= 1) return;
        
        int last = array[array.length - 1];
        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = last;
    }

    // Метод для циклічного зсуву масиву на задану кількість позицій вправо
    public static void cycleSwap(int[] array, int shift) {
        if (array.length <= 1) return;
        
        shift = shift % array.length; // Обрізаємо зсув, якщо він більший за довжину масиву
        
        for (int s = 0; s < shift; s++) {
            int last = array[array.length - 1];
            for (int i = array.length - 1; i > 0; i--) {
                array[i] = array[i - 1];
            }
            array[0] = last;
        }
    }

    // Метод для друку масиву
    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array1 = {1, 3, 2, 7, 4};
        int[] array2 = {1, 3, 2, 7, 4};

        System.out.println("Original array:");
        printArray(array1);

        // Виклик методу для циклічного зсуву на 1 позицію
        cycleSwap(array1);
        System.out.println("Array after cyclic shift by 1:");
        printArray(array1);

        // Виклик методу для циклічного зсуву на задану кількість позицій
        int shiftAmount = 3;
        cycleSwap(array2, shiftAmount);
        System.out.println("Array after cyclic shift by " + shiftAmount + " positions:");
        printArray(array2);
    }
}
