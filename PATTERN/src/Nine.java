public class Nine {
    public static void main(String [] args )
    {
        int i,j;
        for (i=1 ; i<=5 ; i++)
        {   int num=1;
            for(j=1;j<=i;j++)
            {
                int rem=num%2;
                num++;
                System.out.print(rem);
            }
            System.out.println();
        }
    }
}
