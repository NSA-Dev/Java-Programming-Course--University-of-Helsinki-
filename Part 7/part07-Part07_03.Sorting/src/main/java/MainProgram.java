
import java.util.Arrays;
import jdk.internal.org.jline.terminal.TerminalBuilder;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};

        System.out.println("Smallest: "
                + MainProgram.smallest(array)
                + " Index: " + MainProgram.indexOfSmallest(array));

        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
    }

    public static int smallest(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        return min;
    }

    public static int indexOfSmallest(int[] array) {
        int min = array[0];
        int indexMin = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                indexMin = i;
            }
        }

        return indexMin;
    }

    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        int min = array[startIndex];
        int indexMin = startIndex;
        for (int i = startIndex; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                indexMin = i;
            }
        }

        return indexMin;
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];

        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void sort(int[] array) {
        //print before sort
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            swap(array, i, indexOfSmallestFrom(array, i));
            System.out.println(Arrays.toString(array));
        }
    }

}
