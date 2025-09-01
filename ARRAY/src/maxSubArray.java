public class maxSubArray {
    public static void main(String [] args )
    {
        int [] arr ={2,-1,5,-3,4,-1,8};
        int r=arr.length;
        int max=Integer.MIN_VALUE;
        int currentSum;
        for(int i=0 ; i<r; i++)
        {
            for(int j = i; j < r ; j++)
            {
                currentSum=0;
                for(int k = i ; k <=j ; k++)
                {
                currentSum+=arr[k];

                }
                System.out.println(currentSum);
                if(max<currentSum)
                {
                    max=currentSum;
                }
            }
        }
System.out.println("maximum ARRAY SUM =" +max);

    }
}
