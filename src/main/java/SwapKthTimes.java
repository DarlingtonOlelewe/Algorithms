import java.util.Arrays;

public class SwapKthTimes {
    public static void main(String[] args) {
        int[] a = {1,3,4,5,6,8,9,3,45,67,89,1,23,56,7,90,23};
        int [] check = {1,2,3,4,5,6,7,8,9,10,11,12};
//        System.out.println(Arrays.toString(rotate(a,3)));

        System.out.println(Arrays.toString(rotateArr(check,3)));
    }
    public static int[] rotat(int[] nums, int k) {

        if(k > nums.length) k = k % nums.length;

        while(k > 0){

            for(int i = 1; i<nums.length; i+=2){
                int a = nums[i - 1];
                nums[i - 1] = nums[i];
                nums[i] = a;
            }

            k--;
        }
        return nums;
    }



    public void rotate(int[] nums, int k) {

        if(k > nums.length) k = k % nums.length;
        int len = nums.length - 1;
        while(k > 0){
            int temp = nums[len];
            for(int i = len -1; i>=0; i--){

                nums[i+1] = nums[i];

            }

            nums[0] = temp;

            k--;
        }
    }



    public static int[] rotateArr(int[] nums, int k){
        int len = nums.length;
        k = k % len;

        int[] newArr = new int[len];
        int count = 0;
        for(int i = len - k; i < len; i++ , count++){
            newArr[count] = nums[i];
        }

        for(int i = 0; i < len - k; i++,count++){
            newArr[count] = nums[i];
        }

        return newArr;
    }

    public static int[] rotateA(int[] nums, int k){
        int len = nums.length;
        k = k % len;

        int[] newArr = nums.clone();
        int count = 0;
        for(int i = len - k; i < len; i++ , count++){
            nums[count] = newArr[i];
        }

        for(int i = 0; i < len - k; i++,count++){
            nums[count] = newArr[i];
        }

        return nums;
    }
}
