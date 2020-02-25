public class TwoSums {



    public static void main(String[] args){

        int target = 9;
        int[] nums = new int[]{2,7,11,15};

        int[] result = twoSums(nums, target);

        System.out.println(result[0] +", "+result[1]);

    }

    private static int[] twoSums(int[] nums, int target) {
        int len = nums.length, bal = 0;
        int[] result = new int[2];
        for (int i = 0; i < len; i++) {
            bal = target - nums[i];
            for (int j = i+1; j < len; j++) {
                if (bal == nums[j]){
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }
}
