import java.util.HashMap;
import java.util.Map;

public class AA {
    public static void main(String[] args) {
        int[] all = {-2,1,-3,4,-1,2,1,-5,4};

        System.out.println(maxSubArray(all));


    }

    public static int maxSubArray(int[] nums) {

        int count = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){

            int temp = 0;
            for(int j = i; j < nums.length; j++){

                temp += nums[j];
                if(temp > count){
                    count = temp;
                }
            }

        }

        return count;

    }


    public boolean containsNearbyDuplicate(int[] nums, int k) {

        Map<Integer,Integer> ints = new HashMap<>();

        for(int each: nums)


    }

}
