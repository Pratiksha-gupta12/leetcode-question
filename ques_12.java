 // 1st Method 

// public class ques_12 {
//     public double myPow(double x, int n) {
//         if(n==0)
//         {
//             return 1;
//         }
//         else if(x==0)
//         {
//             return 0;
//         }
//         else if(n<0)
//         {
//             n=-n;
//             x=1/x;
//         }

//         if(n%2==0)
//         {
//             return myPow(x,n/2)* myPow(x,n/2);
//         }
//         else
//         {
//             return myPow(x,n/2)* myPow(x,n/2) * x;
//         }
//     }
// }

//2nd Method

class ques_12 {
    public double myPow(double x, int n) {
        return Math.pow(x, n);
    }
} 
