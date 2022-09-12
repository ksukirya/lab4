import java.util.*;

public class lab4 {
    public static int[] reverseArrray(int[] arr) {
        int pointerOne = 0;
        int pointerTwo = arr.length - 1;

        while (pointerOne < pointerTwo) {
            int temp = arr[pointerOne];
            arr[pointerOne] = arr[pointerTwo];
            arr[pointerTwo] = temp;
            pointerOne++;
            pointerTwo--;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 4, 7, 6, 1 };
        System.out.println(Arrays.toString(reverseArrray(arr)));

    }
}
