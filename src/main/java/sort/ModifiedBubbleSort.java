package sort;

/**
 * Created by bogehu on 16/8/16.
 */
public class ModifiedBubbleSort {
    public static void bubbleSort(int[] list){
        boolean needNextPass=true;
        for (int k = 0; k <list.length&&needNextPass ; k++) {
            //if the array is already sorted ,then the next pass is not needed.
           needNextPass=false;
            for (int i = 0; i <list.length-k ; i++) {
               if (list[i]>list[i+1]){
                   int temp = list[i];
                   list[i] = list[i+1];
                   list[i+1] = temp;
                   needNextPass=true;
               }
            }
        }
    }
}
