public class ques_9 {
    public int maximumProduct(int[] nums) {

        Arrays.sort(nums);
       int C1= nums[0]*nums[1]*nums[nums.length-1];
       int C2= nums[nums.length-1] * nums[nums.length-2]*nums[nums.length-3];

       int maxP = Integer.max(C1,C2);
       return maxP;
    }

    @Override
    public String toString() {
        return "tut_9 []";
    }
   
}