
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
    public static void main(String args[] ) throws Exception {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        Solution obj=new Solution();
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();
            int []arr=new int[n];
            for( i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
            obj.arrayUpdate(arr,k,n);
        }
    }
}
class Solution{
           int min;
           int count=0;
       public void arrayUpdate(int [] arr,int k,int n)
       {
           min=arr[0];
           for(int i=0;i<n;i++)
           {
               if(arr[i]<min)
               min=arr[i];
           }
           while(min!=k)
           {
               min=min+1;
               count++;
           }
           System.out.println(count);
       }
       }
        // Write your code here
