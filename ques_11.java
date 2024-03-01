public class ques_11 {
    public void sortColors(int[] nums) {
        for(int i=0;i<nums.length-1;i++)
        {
            for(int j=0;j<nums.length-i-1;j++)
            {
                if(nums[j]>nums[j+1])
                {
                    int temp= nums[j+1];
                    nums[j+1]=nums[j];
                    nums[j]=temp;
                }
            }
        }
        for(int i=0;i<nums.length;i++)
        {
            System.out.println(nums[i]);
        }
    }
} 
