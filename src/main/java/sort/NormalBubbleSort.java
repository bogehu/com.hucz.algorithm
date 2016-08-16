package sort;

/**
 * Created by bogehu on 16/8/16.
 */
public class NormalBubbleSort {
    public static int[] bubbleSort(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if (list[i] > list[j]) {
                    int temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }

            }

        }
        return list;
    }
    public static void main(String[] args) {
        int[] array = {34, 25, 87, 9, 10, 56, 44, 87, 12, 624};
        bubbleSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+",");
        }
    }
}
