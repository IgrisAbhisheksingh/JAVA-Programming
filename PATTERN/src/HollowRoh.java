public class HollowRoh {
    public static void main(String [] args )
    {
        int row=5,column=10;
        for (int i =1; i<= row; i++ )
        {
            for(int k=1 ; k<=row-i ; k++)
            {
                System.out.print(" ");
            }
            for (int j =1 ; j<= column ; j++)
            {
                if (i == 1 || i == row || j == 1 || j == column) {
                    System.out.print("*");
                }
             else

                {

                        System.out.print(" ");
                    
                }
            }
            System.out.println();
        }
    }
}


