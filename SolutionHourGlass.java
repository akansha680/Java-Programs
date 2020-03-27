import java.util.*;
class HourGlass
{
    static int Hrg(int [][]arr)
    {
        int max_sum=Integer.MIN_VALUE;
		
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
               int sum=(arr[i][j] + arr[i][j + 1] +  
                       arr[i][j + 2]) + (arr[i + 1][j + 1]) +  
                       (arr[i + 2][j] + arr[i + 2][j + 1] +  
                       arr[i + 2][j + 2]); 
					   max_sum = Math.max(max_sum, sum); 

            }

        }
		return max_sum;
             }
}
class SolutionHourGlass
{
    public static void main(String []args)
    {
        HourGlass obj=new HourGlass();
        Scanner sc=new Scanner(System.in);
        int [][]arr=new int[6][6];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
            arr[i][j]=sc.nextInt();
        }
        }
        int sum=obj.Hrg(arr);
        System.out.println(sum);
    }
}