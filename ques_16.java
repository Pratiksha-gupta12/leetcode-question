public class ques_16 {
    public boolean isPowerOfThree(int n) {
      while(n<3 && n!=1)
      {
          return false;
      }
      while(n>1)
      {
          if(n%3 !=0)
          {
              return false;
          }
          n=n/3;
      }
      return true;
        
        
    }
} 
