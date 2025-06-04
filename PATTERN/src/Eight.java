import java.util.*;
public class Eight {
    public static void main(String [] args )
    {
        int i,j,num=1;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of Rows : ");
        int n=sc.nextInt();
        for (i=1 ; i<=n ; i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
        sc.close();
    }
}
