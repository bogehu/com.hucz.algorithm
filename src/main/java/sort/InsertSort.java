package sort;

/**
 * Created by bogehu on 16/7/26.
 */
public class InsertSort {
    public static void insertSort(int[] list){
        if (list!=null){
            for (int i = 1; i <list.length ; i++) {
                int temp=list[i],j=i;
                if (list[j-1]>temp){
                    while (j>=1&&list[j-1]>temp){
                        list[j]=list[j-1];
                        j--;
                    }
                }
                list[j]=temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] list={7,3,19,40,4,7,1};
        insertSort(list);
        for (int i = 0; i <list.length ; i++) {
            System.out.print(list[i]+" ");
        }
    }
}
