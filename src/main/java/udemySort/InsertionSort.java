package udemySort;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] myUnsort = {89, 78, 90, 5, 78, 23, 1, 27, 0, -23};
        int[] toSort = myUnsort.clone();
        System.out.println(Arrays.toString(myUnsort));
        insertionSort(toSort);
        //System.out.println(Arrays.toString(bubbleSort(toSort)));
        System.out.println(Arrays.toString(toSort));
    }

    static int[] insertionSort(int[] arr){

        for(int firstUnsort = 1; firstUnsort <= arr.length; firstUnsort++){

            int element = arr[firstUnsort];
            int i;
            for(i = firstUnsort; i > 0 && arr[i-1] < element; i--){
                arr[i] = arr[i -1];

            }

            arr[i] = element;

        }
        return arr;
    }
}
