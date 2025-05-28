 import java.util.*;

 class AreaofCircle{
    public static void main(String [] args)
    {
        
        Scanner  area = new Scanner(System.in);
        System.out.print("enter radius : ");
        int a =area.nextInt();
        System.out.println("the area of circle = "+(3.14*a*a));
        area.close();
        
    }
 }
