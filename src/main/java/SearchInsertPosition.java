public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        System.out.println(searchInsert(arr,7));
    }
    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while(left <= right){

            int pivot = left +(right - left)/2;

            if(nums[pivot] == target){
                return pivot;
            }else if(nums[pivot] < target){
                left = pivot + 1;
            }else{
                right = pivot - 1;
            }

        }

        if(nums[right] < target) return right + 1;
        else return right;

    }
}
