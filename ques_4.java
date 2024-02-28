import java.util.Arrays;

public class ques_4 {
    public int maxWidthOfVerticalArea(int[][] points) {

        int []arr=new int[points.length];

        for(int i=0;i<points.length;i++)
        {
            arr[i]=points[i][0];
        }

        Arrays.sort(arr);

        int result=0;

        for(int i=1;i<arr.length;i++)
        {
            result= Math.max(result,arr[i]-arr[i-1]);
        }
        return result;
        
    }
}
