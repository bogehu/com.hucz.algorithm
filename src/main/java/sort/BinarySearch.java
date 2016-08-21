package sort;

/**
 * Created by bogehu on 16/8/18.
 */
public class BinarySearch {
    //Use binary search to find the key in the list
    public static int binarySearch(int[] list,int key){
        int low=0;
        int high=list.length-1;
        while (high>low){
            int mid=(low+high)/2;
            if (key<list[mid])
                high=mid-1;
            else if(key==list[mid])
                return mid;
            else
                low=mid+1;
        }
        return -low-1;
        //return -low-1;means KEY NOT FOUND,并且给出关键字应该插入的地方.
    }

    public static void main(String[] args) {
      int[] list={2,4,7,9,19,88,100} ;
        System.out.println(binarySearch(list,88));
    }
}
