package udemySort;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] myUnsort = {89, 78, 90, 5, 78, 23, 1, 27, 0, -23};
        int[] toSort = myUnsort.clone();
        System.out.println(Arrays.toString(myUnsort));
        bubbleSort(toSort);
        //System.out.println(Arrays.toString(bubbleSort(toSort)));
        System.out.println(Arrays.toString(toSort));

    }

    static void swap(int[] arr, int index1, int index2){

        if(index1 == index2){
            return;
        }

        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    static int[] bubbleSort(int[] arr){


        int sorted = arr.length;

        while(sorted > 0){

            for(int unSorted = 0; unSorted < sorted - 1; unSorted++){
                if(arr[unSorted] < arr[unSorted+1]) {
                    swap(arr,unSorted,unSorted+1);
                }
            }
            sorted--;
        }

        return arr;
    }


}
