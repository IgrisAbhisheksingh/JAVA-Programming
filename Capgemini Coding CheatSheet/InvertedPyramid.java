public class InvertedPyramid {



        public static void main(String [] args)
        {
            int x=5;
            for(int i =1 ; i<=5 ; i++  )
            {
                for( int j =1 ; j<i ; j++)
                {
                    System.out.print(" ");
                }
                for(int k=i ; k <=x ; k++)
                {
                    System.out.print(" *");
                }
                System.out.println();
            }
        }







}
