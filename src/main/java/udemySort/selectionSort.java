package udemySort;

import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int[] myUnsort = {89, 78, 90, 5, 78, 23, 1, 27, 0, -23};
        int[] toSort = myUnsort.clone();
        System.out.println(Arrays.toString(myUnsort));
        selectionSort(toSort);
        //System.out.println(Arrays.toString(bubbleSort(toSort)));
        System.out.println(Arrays.toString(toSort));

    }
    static void swap(int[] arr, int i, int j){
        if(i == j) return;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int[] selectionSort(int[] arr){

        int len = arr.length;
        int start = 0;

        for(int lastUnsort = arr.length - 1; lastUnsort > 0; lastUnsort--){
            int largest = 0;

            for(int i = 1; i <= lastUnsort; i++){
                if(arr[largest] < arr[i]){
                    largest = i;
                }
            }

            swap(arr,largest,lastUnsort);
        }

        return arr;
    }
}
