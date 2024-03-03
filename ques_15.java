public class ques_15
{
    public  int dominantIndex(int[] nums) {
       int n =nums.length;
       int max=0;
       int k=0;
      for(int i=0;i<n;i++)
      {
          if(nums[i]>max)
          {
              max=nums[i];
            k=i;
          }
      }
     
      int m=max/2;
      for(int i=0;i<n;i++){
            if(nums[i]==max)
            {
                continue;
            }
          if(nums[i]>m){
              return -1;
          }
      }
      return k;
    }
    
} 
